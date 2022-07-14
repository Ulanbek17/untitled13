public class Grandpa {
    private int data;
    private String citi;

    public Grandpa(String citi, int data) {
        this.citi = citi;
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getCiti() {
        return citi;
    }

    public void setCiti(String citi) {
        this.citi = citi;
    }
    @Override
    public String toString(){
        return citi + ":"+ data;
    }
}
