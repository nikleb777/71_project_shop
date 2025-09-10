package app.exception;

public class CustomerNotFoundException extends Exception{
    public CustomerNotFoundException(int id) {
        super(String.format("Покупатель с индетифекатором %d не найден", id));
    }
}
