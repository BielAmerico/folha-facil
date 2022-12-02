package br.com.folhafacil.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Service;

import br.com.folhafacil.TypeTax;

@Service
public class TaxCalculatorService {
	
	public BigDecimal calculateTax(TypeTax typeTax, BigDecimal baseSalary) {
		
		BigDecimal calculedTax = null;
		
		switch (typeTax) {
		case FGTS:
			calculedTax = this.calculateFGTS(baseSalary);
			break;
			
		case INSS:
			calculedTax = this.calculateINSS(baseSalary);
			break;

		default:
			calculedTax = new BigDecimal(0);
			break;
		}
		
		return calculedTax.setScale(2, RoundingMode.CEILING);
	}
	
	private BigDecimal calculateINSS(BigDecimal baseSalary) {		
		
		BigDecimal valueTax = new BigDecimal(0);
		
		Integer taxOne = 1212	;
		Integer taxTwo = 2427;
		Integer taxThree = 3641;
		Integer taxFour = 7087;
		
		if (baseSalary.intValue() <= taxOne) {
			BigDecimal porcentage = new BigDecimal(7.5).divide(new BigDecimal(100));
			valueTax = baseSalary.multiply(porcentage);
		} 
		else if (baseSalary.intValue() > taxOne && baseSalary.intValue() <= taxTwo) {
			BigDecimal porcentage = new BigDecimal(9).divide(new BigDecimal(100));
			valueTax = baseSalary.multiply(porcentage);
		}
		else if (baseSalary.intValue() > taxTwo &&  baseSalary.intValue() <= taxThree) {
			BigDecimal porcentage = new BigDecimal(12).divide(new BigDecimal(100));
			valueTax = baseSalary.multiply(porcentage);
		} 
		else if (baseSalary.intValue() > taxThree &&  baseSalary.intValue() <= taxFour) {
			BigDecimal porcentage = new BigDecimal(14).divide(new BigDecimal(100));
			valueTax = baseSalary.multiply(porcentage);
		}
		
		return valueTax;
	}

	private BigDecimal calculateFGTS(BigDecimal baseSalary) {
		BigDecimal porcentage = new BigDecimal(8).divide(new BigDecimal(100));
		return baseSalary.multiply(porcentage);
	}
	
}