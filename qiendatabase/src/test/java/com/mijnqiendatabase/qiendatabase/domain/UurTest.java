package com.mijnqiendatabase.qiendatabase.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

public class UurTest {

		private Uur uur;
		public UurTest() {
			this.uur = new Uur();
		}
		
		@Test
		public void testGetandSetVoorWaarde() {
			this.uur.setWaarde("gewerkt");
			Assert.assertEquals("gewerkt", this.uur.getWaarde());
		}
		
		@Test
		public void testGetandSetVoorAantal() {
			this.uur.setAantal(1);
			Assert.assertEquals(1, this.uur.getAantal());
		}
		@Test
		public void testGetandSetVoorfactuurDatum() {
			this.uur.setFactuurDatum(LocalDate.of(2018, 5, 6));
			Assert.assertEquals(LocalDate.of(2018, 5, 6), this.uur.getFactuurDatum());
		}

		@Test
		public void testGetandSetVoorAccordStatus() {
			this.uur.setAccordStatus(AccordOptie.GOEDGEKEURD);
			Assert.assertEquals(AccordOptie.GOEDGEKEURD, this.uur.getAccordStatus());
		}
		
}
