package by.epamlab.exception;

public class DAOException extends Exception {

    public DAOException() {
        super();
    }

    public DAOException(Exception exception) {
        super(exception);        
    }

    public DAOException(String message) {
        super(message);        
    }
    
}
