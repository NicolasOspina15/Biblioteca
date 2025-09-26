public class Libro {

    //ATRIBUTOS

    private int id;
    private String titulo;
    private String autor;
    private int cantidad;
    private int cantidad_total;

    //CONSTRUCTOR VACIO
    public Libro() {
    }

    //CONSTRUCTORES CON TODOS LOS PARAMETROS

    public Libro(int cantidad_total, int cantidad, String autor, int id, String titulo) {
        this.cantidad_total = cantidad_total;
        this.cantidad = cantidad;
        this.autor = autor;
        this.id = id;
        this.titulo = titulo;
    }

    //GETTER AND SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad_total() {
        return cantidad_total;
    }

    public void setCantidad_total(int cantidad_total) {
        this.cantidad_total = cantidad_total;
    }

    //METODO TOSTRING

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", cantidad=" + cantidad +
                ", cantidad_total=" + cantidad_total +
                '}';
    }
}
