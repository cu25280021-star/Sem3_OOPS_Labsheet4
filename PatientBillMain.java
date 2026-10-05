class PatientBill {
    private double doctorFee;
    private double medicineFee;
    private double roomFee;

    public void setDoctorFee(double doctorFee) {
        this.doctorFee = doctorFee;
    }

    public void setMedicineFee(double medicineFee) {
        this.medicineFee = medicineFee;
    }

    public void setRoomFee(double roomFee) {
        this.roomFee = roomFee;
    }

    public double calculateTotalBill() {
        return doctorFee + medicineFee + roomFee;
    }

    public void printBill() {
        System.out.println("--- Patient Bill Summary ---");
        System.out.println("Doctor Fee  : $" + doctorFee);
        System.out.println("Medicine Fee: $" + medicineFee);
        System.out.println("Room Fee    : $" + roomFee);
        System.out.println("Total Amount: $" + calculateTotalBill());
    }
}

public class PatientBillMain {
    public static void main(String[] args) {
        PatientBill bill = new PatientBill();
        bill.setDoctorFee(150.0);
        bill.setMedicineFee(80.50);
        bill.setRoomFee(200.0);

        bill.printBill();
    }
}