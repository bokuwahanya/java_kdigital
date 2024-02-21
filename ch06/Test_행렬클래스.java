
package com.ruby.java.ch06;

import java.util.Random;

/*
 * 클래스 메소드 구현 실습 목적
 */
class Matrix {
	
	int rows;
	int cols;
	int	data[];
	public Matrix(int rows, int cols) {
		this.rows = rows; this.cols = cols; // 파랑: 파라미터 변수 받기, 하늘: 변수 가져오기
		data = new int[rows * cols];
	}
	void getData() {
		// 난수로 입력
		Random rnd = new Random();
		for(int i = 0 ; i < data.length ; i++) {		
				data[i] = rnd.nextInt(30);
			}
	}
	Matrix addMatrix(Matrix X) { // 매개변수 주소를 받는다. addmatrix 는 Matrix x 라는 클래스 주소를  불러온다
		Matrix m = new Matrix(this.rows, this.cols);
		for(int i = 0 ; i < (rows * cols) ; i++)
			m.data[i]=X.data[i]+this.data[i]; 
		return m;
	}
	Matrix multiplyMatrix(Matrix X) {
		Matrix m = new Matrix(this.rows, X.cols);
		
		for(int i = 0; i < m.rows ; i++) {
			for(int j = 0; j < X.cols ; j++) {
				int sum = 0;
				for(int k = 0; k < this.cols; k++) {
					sum += this.data[i* this.cols+ k] * X.data[k * X.cols+ j];
				}
				m.data[i * X.cols + j]=sum;
			}
		}
		
		return m;	
	}
	
	Matrix transposeMatrix() {
		Matrix m = new Matrix(this.cols, this.rows);
		for(int i = 0; i < this.rows;i++) {
			for(int j = 0; j < m.rows; j++) {
				m.data[j * m.cols + i]=this.data[i * this.cols + j];
			}
		}
			
		return m;
	}
	
	void showMatrix(String str) {
			
			for(int i = 0; i < rows*cols ; i++) {
			System.out.print(this.data[i]);
			System.out.print("\t");
			
			if((i+1) % this.cols == 0) // J가 0부터 시작하면 나머지가 없을 때 0으로 나눠 떨어준다. 
				System.out.println();
			}
	
	}
}
public class Test_행렬클래스 {

	public static void main(String[] args) {
		/*
		 * 난수 생성으로 초기화
		 * A[3][4] = B[3][4] + C[3][4]; D[3][5] = B[3][4] * E[4][5];
		 * F[4][3] = B[3][4]의 전치 행렬
		 */
		
		
		Matrix B = new Matrix(3,4);
		Matrix C = new Matrix(3,4);
		Matrix A, D, F;
		Matrix E = new Matrix(4,5);

		System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
		B.getData();C.getData();E.getData();
		
		A = B.addMatrix(C); // retrun받은 A값 = 클래스=>Matrix(참조변수=>B. 메서드=>addMatrix(매개변수(인자)=> C))의  값이다.
							// 결국 노란색의 참조변수들로 주소값을 찾는데 각 주소값은 위에 설정된 클래스나, 메서드나, 매개변수를 지칭하고 
							// 실행시 매개변수 값을 시작으로 메서드 -> 클래스 식으로 이동하면서 값이 생성 된다.
		
		A.showMatrix("A[3][4]"); //showMatrix 라는 메서드를 불러온다. b는 참조변수 지만 위의 
//		B.showMatrix("B[3][4]");
//		C.showMatrix("C[3][4]");

																			 		// 생성자를 설정 함으로써 Matrix (참조변수) 즉 클래스의 주소를 찾아준다.
		
		System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
		
		D = B.multiplyMatrix(E);
		D.showMatrix("D[3][5]");
//		B.showMatrix("B[3][4]");
//		E.showMatrix("E[4][5]");
		
		System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
		F = B.transposeMatrix();
//		B.showMatrix("B[3][4]"); 
		F.showMatrix("F[4][3]");

	}
}

