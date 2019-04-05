package com.mijnqiendatabase.qiendatabase.domain;

import org.junit.Test;

import java.time.LocalDate;

import org.junit.Assert;

public class KostenTest {

	private Kosten kosten = new Kosten();
	
	@Test
	public void testGetAndSetForAantal() {
		
		this.kosten.setAantal(1);
		
		Assert.assertEquals(1, this.kosten.getAantal());
	}

	@Test
	public void testGetAndSetForBedrag() {
		
		this.kosten.setBedrag(6);
		
		Assert.assertEquals(6, this.kosten.getBedrag());
	}
	
	@Test
	public void testGetAndSetForFactuurnummer() {
		
		this.kosten.setFactuurnummer(10);
		
		Assert.assertEquals(10, this.kosten.getFactuurnummer());
	}
	
	@Test
	public void testGetAndSetForFactuurDatum() {
		
		this.kosten.setFactuurDatum(LocalDate.of(2019, 12, 4));
		
		Assert.assertEquals(LocalDate.of(2019, 12, 4), this.kosten.getFactuurDatum());
	}
	

	

}
