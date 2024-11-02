package co.edu.itc.programacion.ejemplos.dominio;

public class Check {
    private String usuario;
    private boolean checkeado;

    public String getUsuario() {
        return usuario;
    }

    public boolean isCheckeado() {
        return checkeado;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setCheckeado(boolean checkeado) {
        this.checkeado = checkeado;
    }

    @Override
    public String toString() {
        return "Check{" +
                "usuario='" + usuario + '\'' +
                ", checkeado=" + checkeado +
                '}';
    }
}
