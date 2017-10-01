package by.bsu.airline.exception;

public class AircraftException extends Exception{
    public AircraftException(String message) {
                    super(message);
        }

    public AircraftException(String message, Throwable cause) {
            super(message, cause);
        }

    public AircraftException(Throwable cause) {
            super(cause);
    }

}
