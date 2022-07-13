package lk.ijse.spring.entity;

public class Payment {
    private String payId;
    private double dailyRate;
    private double monthlyRate;
    private double freeKm;
    private double extraKm;

    public Payment() {
    }

    public Payment(String payId, double dailyRate, double monthlyRate, double freeKm, double extraKm) {
        this.payId = payId;
        this.dailyRate = dailyRate;
        this.monthlyRate = monthlyRate;
        this.freeKm = freeKm;
        this.extraKm = extraKm;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(double monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    public double getFreeKm() {
        return freeKm;
    }

    public void setFreeKm(double freeKm) {
        this.freeKm = freeKm;
    }

    public double getExtraKm() {
        return extraKm;
    }

    public void setExtraKm(double extraKm) {
        this.extraKm = extraKm;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "payId='" + payId + '\'' +
                ", dailyRate=" + dailyRate +
                ", monthlyRate=" + monthlyRate +
                ", freeKm=" + freeKm +
                ", extraKm=" + extraKm +
                '}';
    }
}
