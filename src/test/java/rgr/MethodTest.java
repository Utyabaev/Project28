package rgr;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodTest {

	@Test
	public void test() {
		Calc c = new Calc();
		double actual = c.calc_bcards(
			/*�����*/	    0
			,
			/*������*/      0
			,
			/*������*/	    0
			,
			/*���������*/	0
			,
			/*����*/	    0
			,
			/*��� ������*/	0
			,
			/*�.�����*/	    0
		);
		/*�������� � ������������*/
		double expected = 0;
		System.out.print("��������: " + actual + " " + "���������: " + expected);
		assertTrue(actual == expected);
	}

}
