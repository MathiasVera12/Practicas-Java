public class EjercicioAutos {
    public static void main(String[] args) {
        Automoviles auto = new Automoviles("auto", "Sedàn","Azul Platino");
        /*auto.setMarca("Chevrolet");;
        auto.setModelo("Sedán");
        auto.setColor("Azul platino");
        auto.setCilindraje(250.25);*/

        Automoviles toyota = new Automoviles("toyota", "Agya", "Negro mate");
        /*toyota.setMarca("Toyota");
        toyota.setModelo("Agya");
        toyota.setColor("Negro mate");
        toyota.setCilindraje(250.25);*/

        Automoviles kia = new Automoviles("Kia", "Sportage", "Rojo Fuego");
        /*kia.setMarca("Kia");
        kia.setModelo("Sportage");
        kia.setColor("Rojo fuego");
        kia.setCilindraje(250.25);*/

        System.out.println(auto.detallesAuto());
        System.out.println(auto.velocidad(3000));
        System.out.println(auto.matricula(5,2,2004));

        System.out.println(toyota.detallesAuto());
        System.out.println(toyota.velocidad(5000));
        System.out.println(auto.matricula(23,8,2012));

        System.out.println(kia.detallesAuto());
        System.out.println(kia.velocidad(2000));
        System.out.println(auto.matricula(15,6,2007));


        //Sobrecarga de metodos
        System.out.println(auto.combustiblekm(502.00f,264.00f));
        System.out.println(auto.combustiblekm(502,264));
    }
}

