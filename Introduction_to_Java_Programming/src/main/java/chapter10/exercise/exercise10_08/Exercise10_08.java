/*
 * Exercise 10.8
 *  (Financial: the Tax class) Programming Exercise 8.12 writes a program for
 *  computing taxes using arrays. Design a class named Tax to contain the follow-
 *  ing instance data fields:
 *
 *  ■ int filingStatus: One of the four tax-filing statuses: 0—single filer,
 *    1—married filing jointly or qualifying widow(er), 2—married filing separately,
 *    and 3—head of household. Use the public static constants SINGLE_FILER
 *    (0), MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1), MARRIED_
 *    SEPARATELY (2), HEAD_OF_HOUSEHOLD (3) to represent the statuses
 *  ■ int[][] brackets: Stores the tax brackets for each filing status.
 *  ■ double[] rates: Stores the tax rates for each bracket.
 *  ■ double taxableIncome: Stores the taxable income.
 *
 *  Provide the getter and setter methods for each data field and the getTax()
 *  method that returns the tax. Also, provide a no-arg constructor and the construc-
 *  tor Tax(filingStatus, brackets, rates, taxableIncome).
 *
 *  Draw the UML diagram for the class and then implement the class. Write a test
 *  program that uses the Tax class to print the 2001 and 2009 tax tables for taxable
 *  income from $50,000 to $60,000 with intervals of $1,000 for all four statuses.
 *  The tax rates for the year 2009 were given in Table 3.2. The tax rates for 2001
 *  are shown in Table 10.1.
 */
package chapter10.exercise.exercise10_08;

/**
 *
 * @author emaph
 */
public class Exercise10_08 {

    public static void main(String[] args) {

        Tax tax2001 = createTax2001(0, 50000);
        printTable(tax2001, "2001");

        Tax tax2002 = createTax2002(0, 50000);
        printTable(tax2002, "2002");

        Tax tax2009 = createTax2009(0, 50000);
        printTable(tax2009, "2009");
    }

    static Tax createTax2001(int filingStatus, double taxableIncome) {
        double[] rates = {0.15, 0.275, 0.305, 0.355, 0.391};
        int[][] brackets = {
            {27050, 65550, 136750, 297350},  // Single filer
            {45200, 109250, 166500, 297350}, // Married jointly
            {22600, 54620, 83250, 148675},   // Married separately
            {36250, 93650, 151650, 297350}   // Head of household
        };

        Tax tax = new Tax(filingStatus, brackets, rates, taxableIncome);
        return tax;
    }

    static Tax createTax2009(int filingStatus, double taxableIncome) {
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950},  // Single filer
            {16700, 67900, 137050, 20885, 372950}, // Married jointly
                                                   // −or qualifying widow(er)
            {8350, 33950, 68525, 104425, 186475},  // Married separately
            {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        Tax tax = new Tax(filingStatus, brackets, rates, taxableIncome);
        return tax;
    }

    static Tax createTax2002(int filingStatux, double taxableIncome) {
        double[] rates = {0.1, 0.15, 0.27, 0.30, 0.35, 0.386};
        int[][] brackets = {
            {6000, 27950, 67700, 141250, 307050}, // Single filer
            {12000 , 46700, 112850, 171950, 307050}, // married filing jointly
            {6000, 23350, 56425, 85975, 153525}, // married filing separately
            {10000, 37450, 96700, 156600, 307050} // head of household
        };

        Tax tax = new Tax(filingStatux, brackets, rates, taxableIncome);
        return tax;
    }

    static void printTable(Tax tax, String year) {
        System.out.println(year + " Tax Table");
        System.out.println("taxable\tSingle\tMarried\tMarried\t Head of");
        System.out.println("Income\tSingle\tJoint\tSeparate\t a House");
        for (int taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) {
          tax.setTaxableIncome(taxableIncome);
          tax.setFilingStatus(Tax.SINGLE);
          int taxForStatusSingle = (int)tax.findTax();
          tax.setFilingStatus(Tax.JOINTLY);
          int taxForStatusJoint = (int)tax.findTax();
          tax.setFilingStatus(Tax.SEPARATELY);
          int taxForStatusSeparate = (int)tax.findTax();
          tax.setFilingStatus(Tax.HOUSEHOLD);
          int taxForStatusHouse = (int)tax.findTax();
          System.out.println(taxableIncome + "\t" + taxForStatusSingle + "\t" +
            taxForStatusJoint + "\t" + taxForStatusSeparate + "\t " +
            taxForStatusHouse);
        }
        System.out.println();
    }
}

/*
15%     Up to $27,050       Up to $45,200       Up to $22,600       Up to $36,250
27.5%   $27,051–$65,550     $45,201–$109,250    $22,601–$54,625     $36,251–$93,650
30.5%   $65,551–$136,750    $109,251–$166,500   $54,626–$83,250     $93,651–$151,650
35.5%   $136,751–$297,350   $166,501–$297,350   $83,251–$148,675    $151,651–$297,350
39.1%   $297,351 or more    $297,351 or more    $ 148,676 or more   $297,351 or more
*/

/*
2001 Tax Table
taxable	Single	Married	Married	 Head of
Income	Single	Joint	Separate	 a House
50000	10368	8100	10925	 9218
51000	10643	8375	11200	 9493
52000	10918	8650	11475	 9768
53000	11193	8925	11750	 10043
54000	11468	9200	12025	 10318
55000	11743	9475	12311	 10593
56000	12018	9750	12616	 10868
57000	12293	10025	12921	 11143
58000	12568	10300	13226	 11418
59000	12843	10575	13531	 11693
60000	13118	10850	13836	 11968

2002 Tax Table
taxable	Single	Married	Married	 Head of
Income	Single	Joint	Separate	 a House
50000	9846	7296	10398	 8506
51000	10116	7566	10668	 8776
52000	10386	7836	10938	 9046
53000	10656	8106	11208	 9316
54000	10926	8376	11478	 9586
55000	11196	8646	11748	 9856
56000	11466	8916	12018	 10126
57000	11736	9186	12305	 10396
58000	12006	9456	12605	 10666
59000	12276	9726	12905	 10936
60000	12546	9996	13205	 11206
*/
