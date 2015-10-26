public class Konto {
    private int _saldo;
    
    public Konto() {
        _saldo = 50;
    }
    
    public boolean abziehen(int betrag) {
        if(_saldo >= betrag) {
            _saldo -= betrag;
            return true;
        }
        return false;
    }
    
    public void einzahlen(int betrag) {
        _saldo += betrag;
    }
}
