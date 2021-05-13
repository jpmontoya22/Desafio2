package dominio;

public class Vendedor extends Directo{
    private long ventasDelMes;
    private int salarioVendedor;


    public Vendedor(String nombre,int salario, int ventasDelMes){
        super(nombre,salario);
        this.ventasDelMes = ventasDelMes;
    }

    public long calcularComision (){

        if( salarioVendedor >= 2895000) {
            this.ventasDelMes = (long) ((ventasDelMes * 4.5) / 100);
        } else{ this.ventasDelMes = (ventasDelMes*5)/100;}

        return ventasDelMes;
    }

    @Override
    public long calcularSalario() {
        this.salarioVendedor = (int) (salarioVendedor + ventasDelMes);
        return salarioVendedor;
    }
}
