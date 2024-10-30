import java.util.*;
public class Principal_class {
//segun el proyecto tendermos las siguientes clases para operar        
//premisas, inversion inicial,proyeccion de ventas
//depreciacion, estado de resultados , proyeccion de costos
//valance general, flujo de efectivo, punto de equilibrio
//razones financieras
//comenzamos con este main  para entrar a cada clase 
public static void main(String[] args) {
Scanner lec=new Scanner(System.in);
int clase;
System.out.println("menu\n 1=Premisa, 2=inversion inicial\n 3=proyeccion de ventas 4=depreciacion \n 5=estado de resultados 6=proyeccion de costos\n 7=valance general  8=flujo de efectivo\n 9=punto de equilibrio 10=razones financieras ");
clase=lec.nextInt();
premisas obj1=new premisas();
switch (clase) {
    case 1:
        obj1.cargaPremisas();
        break;

    default:
        break;
}
}
}
