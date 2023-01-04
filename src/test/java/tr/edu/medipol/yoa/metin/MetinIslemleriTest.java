package tr.edu.medipol.yoa.metin;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBosluklariTemizle() {
	
		String orjinalMetin="uc tas hos    ho saf ....";
		
		String sonuc =MetinIslemleri.bosluklariTemizle(orjinalMetin);
		
		assertEquals("uctashoshosaf....",sonuc);
		
		
	}

}
