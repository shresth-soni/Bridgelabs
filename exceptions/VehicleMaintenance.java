class ServiceOverdueException extends Exception { public ServiceOverdueException(String m){super(m);} }
class InvalidMileageException extends Exception { public InvalidMileageException(String m){super(m);} }

public class VehicleMaintenance {
    public static void checkMaintenance(int mileage, boolean isOverdue) throws ServiceOverdueException, InvalidMileageException {
        if (mileage < 0) throw new InvalidMileageException("Invalid mileage input!");
        if (isOverdue) throw new ServiceOverdueException("Service overdue! Please visit service center.");
        System.out.println("Vehicle is in good condition.");
    }

    public static void main(String[] args) {
        try {
            checkMaintenance(-500, true);
        } catch (InvalidMileageException | ServiceOverdueException e) {
            System.out.println(e.getMessage());
        }
    }
}
