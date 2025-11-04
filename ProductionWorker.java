public class ProductionWorker extends Employee {
    private int shift;
    private double payRate;
    final static int DAY_SHIFT = 1;
    final static int NIGHT_SHIFT = 2;

    /**
     * 
     * @param n  the production workers name
     * @param num  the production workers employee number
     * @param date  the hire date of the production worker
     * @param sh  the shift of the production worker
     * @param rate the paye rate of the production worker
     */
    public ProductionWorker(String n, String num, 
            String date, int sh, double rate){
        super(n,num,date);
        this.shift = sh;
        this.payRate = rate;
    }

    /**
     * default constructor for production worker.
     */
    public ProductionWorker(){
        super("","","");
    }

    /**
     * 
     * @param s the shift number corrospending with day (1) or night (2)
     */
    public void setShift(int s){
        this.shift = s;
    }

    /**
     * 
     * @param p payrate of production worker to be set.
     */
    public void setPayRate(double p){ 
        this.payRate = p;
    }

    /**
     * 
     * @return the shift the production worker is working
     */
    public int getShift(){
        return this.shift;
    }

    /**
     * 
     * @return the pay rate of the production worker
     * 
     */
    public double getPayRateI(){
        return this.payRate;
    }

    /**
     * @return a formatted string of the information stored in the production worker.
     */
    @Override
    public String toString(){
        return super.toString() +
            "\n Shift " + shift +
            "\n Hourly Pay Rate: $" + payRate;
    }


}


