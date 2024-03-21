package com.ruby.java.recursive;

import java.util.ArrayList;
import java.util.List;

enum Directions2 {N, NE, E, SE, S, SW, W, NW}
class Items {
	int x;
	int y;
	int dir;
	public Items(int x, int y, int d) {
		this.x = x; this.y = y; this.dir = d;
	}
	@Override
	public String toString() {
		return "x = " + x + ", y = " + y + ", dir = " + dir;
	}
}
class Offsets {
	int a;
	int b;
	public Offsets(int a, int b) {
		this.a = a; this.b = b;
	}
}
	class StackList {
	private List<Items> data; // 스택용 배열
	private int capacity; // 스택의 크기
	private int top; // 스택 포인터

	// --- 실행시 예외 : 스택이 비어있음 ---//
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	// --- 실행시 예외 : 스택이 가득 참 ---//
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
	}

	// --- 생성자(constructor) ---//
	public StackList(int maxlen) {
		top = 0;
		capacity = maxlen;
		try {
			data = new ArrayList<Items>(); // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			capacity = 0;
		}
	}

	// --- 스택에 x를 푸시 ---//
	public void push(Items p) throws OverflowIntStackException {
		if (isFull()) // 스택이 가득 참
			throw new OverflowIntStackException();
		data.add(p);top++;
	}

	// --- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
	public Items pop() throws EmptyIntStackException {
		if (isEmpty()) // 스택이 빔
			throw new EmptyIntStackException();
		return data.remove(--top);
	}

	// --- 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄) ---//
	public Items peek() throws EmptyIntStackException {
		if (isEmpty()) // 스택이 빔
			throw new EmptyIntStackException();
		return data.get(top - 1);
	}

	// --- 스택을 비움 ---//
	public void clear() {
		if(isEmpty())
			throw new EmptyIntStackException();
		top = 0;
	}

	// --- 스택에서 x를 찾아 인덱스(벌견하지 못하면 –1)를 반환 ---//
	public int indexOf(Items x) {
		for (int i = top - 1; i >= 0; i--) // 정상 쪽에서 선형검색
			if (data.get(i).equals(x))
				return i; // 검색 성공
		return -1; // 검색 실패
	}

	// --- 스택의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

	// --- 스택에 쌓여있는 데이터 갯수를 반환 ---//
	public int size() {
		return top;
	}

	// --- 스택이 비어있는가? ---//
	public boolean isEmpty() {
		return top <= 0;
	}

	// --- 스택이 가득 찼는가? ---//
	public boolean isFull() {
		return top >= capacity;
	}

	// --- 스택 안의 모든 데이터를 바닥 → 정상 순서로 표시 ---//
	public void dump() {
		if (isEmpty())
			System.out.println("스택이 비어있습니다.");
		else {
			for (int i = 0; i < top; i++)
				System.out.print(data.get(i) + " ");
			System.out.println();
		}
	}
}

	public class Test_MazingProblem_미로찾기 {

		static Offsets[] moves = new Offsets[8];//static을 선언하는 이유를 알아야 한다
		

		public static void path(int[][] maze, int[][] mark, int ix, int iy) {

			mark[1][1] = 1;
			StackList st = new StackList(50);
			Items temp = new Items(0, 0, 0);//N :: 0
			temp.x = 1;
			temp.y = 1;
			temp.dir = 2;//E:: 2
			mark[temp.x][temp.y] = 2;//미로 찾기 궤적은 2로 표시
			st.push(temp);

			while (!st.isEmpty()) // stack not empty
			{ // 와일 두개 => 밑의 와일문 브레이크 => 스택이 비엇을 때 끝나니깐 안비었을 때, 출구를 찾았을 때 와일문끝
				Items tmp = st.pop(); // unstack
				int i = tmp.x;
				int j = tmp.y;
				int d = tmp.dir;
				mark[tmp.x][tmp.y] = 1;//backtracking 궤적은 1로 표시
				st.push(new Items(i,j,d)); 
			
				while (d < 8) // moves forward
				{
					mark[1][1] = 2;
					int g = i + moves[d].a;
					int h = j + moves[d].b;
					
					//방향을 탐색한다. 
						// 가야될 길을 업데이트
					if ((g == ix) && (h == iy)) {// reached exit
													// output path
						mark[temp.x][temp.y] = 2;//출구 아웃

					}
					if ((maze[g][h] == 0) && (mark[g][h] == 0)) { // new position
						// 값을 넣는다. 혹은 다시 원래자리로 되돌아온다
						mark[g][h] = 2;
						st.push(new Items(i,j,d));
						i = g; j = h; d = 0; 
						
					} else{
						d++;
						// 길이 막혀 있으면 현자리에서 팝을 하고 재탐색.
					}
				}break;
			}
			System.out.println("no path in maze ");
		}
		static void showMatrix(int[][]d, int row, int col) {
			for (int i = 0; i <= row; i++) {
				for (int j = 0; j <= col; j++) {
					System.out.print(d[i][j] + " ");

				}
				System.out.println();
			}
		}
		public static void main(String[] args) {
			int[][] maze = new int[14][17]; //미로 그자체의 배열 건들면 미로가 사라짐
			int[][] mark = new int[14][17]; // 경로 기억 배열 푸시 팝을 한다. 

			int input[][] = { // 12 x 15
					{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 },
					{ 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 },
					{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
					{ 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
					{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
					{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
					{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
					{ 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
					{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 },
					{ 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 },
					{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 },
					{ 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 }};
			
			
			for (int ia = 0; ia < 8; ia++)
				moves[ia] = new Offsets(0, 0);//배열에 offsets 객체를 치환해야 한다.
			moves[0].a = -1;	moves[0].b = 0;
			moves[1].a = -1;	moves[1].b = 1;
			moves[2].a = 0;		moves[2].b = 1;
			moves[3].a = 1;		moves[3].b = 1;
			moves[4].a = 1;		moves[4].b = 0;
			moves[5].a = 1;		moves[5].b = -1;
			moves[6].a = 0;		moves[6].b = -1;
			moves[7].a = -1;	moves[7].b = -1;
			//Directions d;
			//d = Directions.N;
			//d = d + 1;//java는 지원안됨
			// moves라는 배열이 있는 것. 
			for (int i = 0; i < maze.length; i++) {
				for (int j = 0; j < maze[0].length; j++) {
					if( j == 0 || i == 0 || j == (maze[0].length-1) || i == (maze.length-1) ) {
					maze[i][j] = 1;  
					// input[][]을 maze[][]로 변환
					}else
					maze[i][j] = input[i-1][j-1];
				}
			}
			System.out.println("maze[12,15]::");
			showMatrix(maze, 13, 16);
		
			System.out.println("mark::");
			showMatrix(mark, 13, 16);
//
			path(maze, mark, 12, 15);
			System.out.println("mark::");
			showMatrix(mark, 13, 16);
		}
	}

