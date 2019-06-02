	public class WeightedAvg {
		/*
		 * Computes the weighted test and assignment averages, as well as the master
		 * average
		 */
		public static void main(String[] args) {
	

			/*
			 * Designating constants for test and assignment scores; float point variables
			 * for weighted scores and averages
			 */
			final int TEST1 = 75, TEST2 = 95, TEST3 = 85, TEST4 = 55, TEST5 = 65, TEST6 = 70;
			final int ASSGN1 = 55, ASSGN2 = 65, ASSGN3 = 65, ASSGN4 = 60, ASSGN5 = 55, ASSGN6 = 50;
			double weightedtestavg, weightedassgnavg, masteravg;
			/* Code for computing weighted and master averages */
	

			weightedtestavg = ((TEST1 * 0.1) + (TEST2 * 0.2) + (TEST3 * 0.25) + (TEST4 * 0.25) + (TEST5 * 0.1)
					+ (TEST6 * 0.1));
			System.out.println("The weighted average of the test scores is: " + weightedtestavg);
	

			weightedassgnavg = ((ASSGN1 * 0.05) + (ASSGN2 * 0.1) + (ASSGN3 * 0.15) + (ASSGN4 * 0.25) + (ASSGN5 * 0.25)
					+ (ASSGN6 * 0.2));
			System.out.println("The weighted average of the assignment scores is: " + weightedassgnavg);
	

			masteravg = (weightedtestavg + weightedassgnavg) / 2;
			System.out.println("The master average is: " + masteravg);
		}
	

	}

