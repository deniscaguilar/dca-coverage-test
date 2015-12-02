package br.com.dca.coveragetest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathematicsOperation {

	private static final Logger log = LoggerFactory.getLogger(MathematicsOperation.class);

	public double add(double v1, double v2) {
		log.info("XXX");
		return v1 + v2;
	}

	public double subtract(double v1, double v2) {
		log.info("XXX");
		return v1 - v2;
	}

	public double multiply(double v1, double v2) {
		log.info("XXX");
		return v1 * v2;
	}

	public double divide(double v1, double v2) {
		log.info("XXX");
		return v1 / v2;
	}

}
