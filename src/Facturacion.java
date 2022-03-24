import java.util.Scanner;

public class Facturacion {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("En que idioma quieres la aplicación:\n\t1.Español\n\t2.Valenciano\n\t3.Inglés");
        int idioma=sc.nextInt();
        sc.nextLine();
        if(idioma==1) {
            System.out.println("¿Cuántos productos has comprado (de 1 a 4)?");
            int cant = sc.nextInt();
            sc.nextLine();

            switch (cant) {
                case 1:
                    System.out.println("Indica que producto has comprado");
                    String nombrec1 = sc.nextLine();
                    System.out.println("Indica el precio del producto");
                    double prisec1 = sc.nextDouble();
                    sc.nextLine();
                    double priseBuenoc1 = 0;
                    double pIvac1 = prisec1 * 0.21;
                    priseBuenoc1 = prisec1 + pIvac1;
                    if (pIvac1 > 10) {
                        double descuentoc1 = priseBuenoc1 * (-0.15);
                        priseBuenoc1 += descuentoc1;
                    } else if (pIvac1 > 5) {
                        double descuentoc1 = priseBuenoc1 * (-0.1);
                        priseBuenoc1 += descuentoc1;
                    }
                    System.out.println("El precio final de tu producto " + nombrec1 + " es :" + priseBuenoc1);
                    break;
                case 2:
                    System.out.println("Indica que producto has comprado");
                    String nombrec2 = sc.nextLine();
                    System.out.println("Indica el precio del producto");
                    double prisec2 = sc.nextDouble();
                    sc.nextLine();
                    double priseBuenoc2 = 0;
                    double pIvac2 = prisec2 * 0.21;
                    priseBuenoc2 = prisec2 + pIvac2;
                    if (pIvac2 > 10) {
                        double descuentoc2 = priseBuenoc2 * (-0.15);
                        priseBuenoc2 += descuentoc2;
                    } else if (pIvac2 > 5) {
                        double descuentoc2 = priseBuenoc2 * (-0.1);
                        priseBuenoc2 += descuentoc2;
                    }
                    System.out.println("Indica que producto has comprado");
                    String nombre2c2 = sc.nextLine();
                    System.out.println("Indica el precio del producto");
                    double prise2c2 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno2c2 = 0;
                    double pIva2c2 = prise2c2 * 0.21;
                    priseBueno2c2 = prise2c2 + pIva2c2;
                    if (pIva2c2 > 10) {
                        double descuento2c2 = priseBueno2c2 * (-0.15);
                        priseBueno2c2 += descuento2c2;
                    } else if (pIva2c2 > 5) {
                        double descuento2c2 = priseBueno2c2 * (-0.1);
                        priseBueno2c2 += descuento2c2;
                    }
                    System.out.println("El precio final de tu producto " + nombrec2 + " es :" + priseBuenoc2);
                    System.out.println("El precio final de tu producto " + nombre2c2 + " es :" + priseBueno2c2);
                    break;
                case 3:
                    System.out.println("Indica que producto has comprado");
                    String nombrec3 = sc.nextLine();
                    System.out.println("Indica el precio del producto");
                    double prisec3 = sc.nextDouble();
                    sc.nextLine();
                    double priseBuenoc3 = 0;
                    double pIvac3 = prisec3 * 0.21;
                    priseBuenoc3 = prisec3 + pIvac3;
                    if (pIvac3 > 10) {
                        double descuentoc3 = priseBuenoc3 * (-0.15);
                        priseBuenoc3 += descuentoc3;
                    } else if (pIvac3 > 5) {
                        double descuentoc3 = priseBuenoc3 * (-0.1);
                        priseBuenoc3 += descuentoc3;
                    }
                    System.out.println("Indica que producto has comprado");
                    String nombre2c3 = sc.nextLine();
                    System.out.println("Indica el precio del producto");
                    double prise2c3 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno2c3 = 0;
                    double pIva2c3 = prise2c3 * 0.21;
                    priseBueno2c3 = prise2c3 + pIva2c3;
                    if (pIva2c3 > 10) {
                        double descuento2c3 = priseBueno2c3 * (-0.15);
                        priseBueno2c3 += descuento2c3;
                    } else if (pIva2c3 > 5) {
                        double descuento2c3 = priseBueno2c3 * (-0.1);
                        priseBueno2c3 += descuento2c3;
                    }
                    System.out.println("Indica que producto has comprado");
                    String nombre3c3 = sc.nextLine();
                    System.out.println("Indica el precio del producto");
                    double prise3c3 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno3c3 = 0;
                    double pIva3c3 = prise3c3 * 0.21;
                    priseBueno3c3 = prise3c3 + pIva3c3;
                    if (pIva3c3 > 10) {
                        double descuento3c3 = priseBueno3c3 * (-0.15);
                        priseBueno3c3 += descuento3c3;
                    } else if (pIva3c3 > 5) {
                        double descuento3c3 = priseBueno3c3 * (-0.1);
                        priseBueno3c3 += descuento3c3;
                    }

                    System.out.println("El precio final de tu producto " + nombrec3 + " es :" + priseBuenoc3);
                    System.out.println("El precio final de tu producto " + nombre2c3 + " es :" + priseBueno2c3);
                    System.out.println("El precio final de tu producto " + nombre3c3 + " es :" + priseBueno3c3);
                    break;
                case 4:
                    System.out.println("Indica que producto has comprado");
                    String nombrec4 = sc.nextLine();
                    System.out.println("Indica el precio del producto");
                    double prisec4 = sc.nextDouble();
                    sc.nextLine();
                    double priseBuenoc4 = 0;
                    double pIvac4 = prisec4 * 0.21;
                    priseBuenoc4 = prisec4 + pIvac4;
                    if (pIvac4 > 10) {
                        double descuentoc4 = priseBuenoc4 * (-0.15);
                        priseBuenoc4 += descuentoc4;
                    } else if (pIvac4 > 5) {
                        double descuentoc4 = priseBuenoc4 * (-0.1);
                        priseBuenoc4 += descuentoc4;
                    }
                    System.out.println("Indica que producto has comprado");
                    String nombre2c4 = sc.nextLine();
                    System.out.println("Indica el precio del producto");
                    double prise2c4 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno2c4 = 0;
                    double pIva2c4 = prise2c4 * 0.21;
                    priseBueno2c4 = prise2c4 + pIva2c4;
                    if (pIva2c4 > 10) {
                        double descuento2c4 = priseBueno2c4 * (-0.15);
                        priseBueno2c4 += descuento2c4;
                    } else if (pIva2c4 > 5) {
                        double descuento2c4 = priseBueno2c4 * (-0.1);
                        priseBueno2c4 += descuento2c4;
                    }
                    System.out.println("Indica que producto has comprado");
                    String nombre3c4 = sc.nextLine();
                    System.out.println("Indica el precio del producto");
                    double prise3c4 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno3c4 = 0;
                    double pIva3c4 = prise3c4 * 0.21;
                    priseBueno3c4 = prise3c4 + pIva3c4;
                    if (pIva3c4 > 10) {
                        double descuento3c4 = priseBueno3c4 * (-0.15);
                        priseBueno3c4 += descuento3c4;
                    } else if (pIva3c4 > 5) {
                        double descuento3c4 = priseBueno3c4 * (-0.1);
                        priseBueno3c4 += descuento3c4;
                    }
                    System.out.println("Indica que producto has comprado");
                    String nombre4c4 = sc.nextLine();
                    System.out.println("Indica el precio del producto");
                    double prise4c4 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno4c4 = 0;
                    double pIva4c4 = prise4c4 * 0.21;
                    priseBueno4c4 = prise4c4 + pIva4c4;
                    if (pIva4c4 > 10) {
                        double descuento4c4 = priseBueno4c4 * (-0.15);
                        priseBueno4c4 += descuento4c4;
                    } else if (pIva4c4 > 5) {
                        double descuento4c4 = priseBueno4c4 * (-0.1);
                        priseBueno4c4 += descuento4c4;
                    }

                    System.out.println("El precio final de tu producto " + nombrec4 + " es :" + priseBuenoc4);
                    System.out.println("El precio final de tu producto " + nombre2c4 + " es :" + priseBueno2c4);
                    System.out.println("El precio final de tu producto " + nombre3c4 + " es :" + priseBueno3c4);
                    System.out.println("El precio final de tu producto " + nombre4c4 + " es :" + priseBueno4c4);

                    break;

            }

        }else if(idioma == 2){
            System.out.println("Quants productes has comprat (d'1 a 4)?");
            int cant = sc.nextInt();
            sc.nextLine();

            switch (cant) {
                case 1:
                    System.out.println("Indica quin producte has comprat");
                    String nombrec1 = sc.nextLine();
                    System.out.println("Indica el preu del producte");
                    double prisec1 = sc.nextDouble();
                    sc.nextLine();
                    double priseBuenoc1 = 0;
                    double pIvac1 = prisec1 * 0.21;
                    priseBuenoc1 = prisec1 + pIvac1;
                    if (pIvac1 > 10) {
                        double descuentoc1 = priseBuenoc1 * (-0.15);
                        priseBuenoc1 += descuentoc1;
                    } else if (pIvac1 > 5) {
                        double descuentoc1 = priseBuenoc1 * (-0.1);
                        priseBuenoc1 += descuentoc1;
                    }
                    System.out.println("El preu final del teu producte " + nombrec1 + " es :" + priseBuenoc1);
                    break;
                case 2:
                    System.out.println("Indica quin producte has comprat");
                    String nombrec2 = sc.nextLine();
                    System.out.println("Indica el preu del producte");
                    double prisec2 = sc.nextDouble();
                    sc.nextLine();
                    double priseBuenoc2 = 0;
                    double pIvac2 = prisec2 * 0.21;
                    priseBuenoc2 = prisec2 + pIvac2;
                    if (pIvac2 > 10) {
                        double descuentoc2 = priseBuenoc2 * (-0.15);
                        priseBuenoc2 += descuentoc2;
                    } else if (pIvac2 > 5) {
                        double descuentoc2 = priseBuenoc2 * (-0.1);
                        priseBuenoc2 += descuentoc2;
                    }
                    System.out.println("Indica quin producte has comprat");
                    String nombre2c2 = sc.nextLine();
                    System.out.println("Indica el preu del producte");
                    double prise2c2 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno2c2 = 0;
                    double pIva2c2 = prise2c2 * 0.21;
                    priseBueno2c2 = prise2c2 + pIva2c2;
                    if (pIva2c2 > 10) {
                        double descuento2c2 = priseBueno2c2 * (-0.15);
                        priseBueno2c2 += descuento2c2;
                    } else if (pIva2c2 > 5) {
                        double descuento2c2 = priseBueno2c2 * (-0.1);
                        priseBueno2c2 += descuento2c2;
                    }
                    System.out.println("El preu final del teu producte " + nombrec2 + " es :" + priseBuenoc2);
                    System.out.println("El preu final del teu producte " + nombre2c2 + " es :" + priseBueno2c2);
                    break;
                case 3:
                    System.out.println("Indica quin producte has comprat");
                    String nombrec3 = sc.nextLine();
                    System.out.println("Indica el preu del producte");
                    double prisec3 = sc.nextDouble();
                    sc.nextLine();
                    double priseBuenoc3 = 0;
                    double pIvac3 = prisec3 * 0.21;
                    priseBuenoc3 = prisec3 + pIvac3;
                    if (pIvac3 > 10) {
                        double descuentoc3 = priseBuenoc3 * (-0.15);
                        priseBuenoc3 += descuentoc3;
                    } else if (pIvac3 > 5) {
                        double descuentoc3 = priseBuenoc3 * (-0.1);
                        priseBuenoc3 += descuentoc3;
                    }
                    System.out.println("Indica quin producte has comprat");
                    String nombre2c3 = sc.nextLine();
                    System.out.println("Indica el preu del producte");
                    double prise2c3 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno2c3 = 0;
                    double pIva2c3 = prise2c3 * 0.21;
                    priseBueno2c3 = prise2c3 + pIva2c3;
                    if (pIva2c3 > 10) {
                        double descuento2c3 = priseBueno2c3 * (-0.15);
                        priseBueno2c3 += descuento2c3;
                    } else if (pIva2c3 > 5) {
                        double descuento2c3 = priseBueno2c3 * (-0.1);
                        priseBueno2c3 += descuento2c3;
                    }
                    System.out.println("Indica quin producte has comprat");
                    String nombre3c3 = sc.nextLine();
                    System.out.println("Indica el preu del producte");
                    double prise3c3 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno3c3 = 0;
                    double pIva3c3 = prise3c3 * 0.21;
                    priseBueno3c3 = prise3c3 + pIva3c3;
                    if (pIva3c3 > 10) {
                        double descuento3c3 = priseBueno3c3 * (-0.15);
                        priseBueno3c3 += descuento3c3;
                    } else if (pIva3c3 > 5) {
                        double descuento3c3 = priseBueno3c3 * (-0.1);
                        priseBueno3c3 += descuento3c3;
                    }

                    System.out.println("El preu final del teu producte " + nombrec3 + " es :" + priseBuenoc3);
                    System.out.println("El preu final del teu producte " + nombre2c3 + " es :" + priseBueno2c3);
                    System.out.println("El preu final del teu producte " + nombre3c3 + " es :" + priseBueno3c3);
                    break;
                case 4:
                    System.out.println("Indica quin producte has comprat");
                    String nombrec4 = sc.nextLine();
                    System.out.println("Indica el preu del producte");
                    double prisec4 = sc.nextDouble();
                    sc.nextLine();
                    double priseBuenoc4 = 0;
                    double pIvac4 = prisec4 * 0.21;
                    priseBuenoc4 = prisec4 + pIvac4;
                    if (pIvac4 > 10) {
                        double descuentoc4 = priseBuenoc4 * (-0.15);
                        priseBuenoc4 += descuentoc4;
                    } else if (pIvac4 > 5) {
                        double descuentoc4 = priseBuenoc4 * (-0.1);
                        priseBuenoc4 += descuentoc4;
                    }
                    System.out.println("Indica quin producte has comprat");
                    String nombre2c4 = sc.nextLine();
                    System.out.println("Indica el preu del producte");
                    double prise2c4 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno2c4 = 0;
                    double pIva2c4 = prise2c4 * 0.21;
                    priseBueno2c4 = prise2c4 + pIva2c4;
                    if (pIva2c4 > 10) {
                        double descuento2c4 = priseBueno2c4 * (-0.15);
                        priseBueno2c4 += descuento2c4;
                    } else if (pIva2c4 > 5) {
                        double descuento2c4 = priseBueno2c4 * (-0.1);
                        priseBueno2c4 += descuento2c4;
                    }
                    System.out.println("Indica quin producte has comprat");
                    String nombre3c4 = sc.nextLine();
                    System.out.println("Indica el preu del producte");
                    double prise3c4 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno3c4 = 0;
                    double pIva3c4 = prise3c4 * 0.21;
                    priseBueno3c4 = prise3c4 + pIva3c4;
                    if (pIva3c4 > 10) {
                        double descuento3c4 = priseBueno3c4 * (-0.15);
                        priseBueno3c4 += descuento3c4;
                    } else if (pIva3c4 > 5) {
                        double descuento3c4 = priseBueno3c4 * (-0.1);
                        priseBueno3c4 += descuento3c4;
                    }
                    System.out.println("Indica quin producte has comprat");
                    String nombre4c4 = sc.nextLine();
                    System.out.println("Indica el preu del producte");
                    double prise4c4 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno4c4 = 0;
                    double pIva4c4 = prise4c4 * 0.21;
                    priseBueno4c4 = prise4c4 + pIva4c4;
                    if (pIva4c4 > 10) {
                        double descuento4c4 = priseBueno4c4 * (-0.15);
                        priseBueno4c4 += descuento4c4;
                    } else if (pIva4c4 > 5) {
                        double descuento4c4 = priseBueno4c4 * (-0.1);
                        priseBueno4c4 += descuento4c4;
                    }

                    System.out.println("El preu final del teu producte " + nombrec4 + " es :" + priseBuenoc4);
                    System.out.println("El preu final del teu producte " + nombre2c4 + " es :" + priseBueno2c4);
                    System.out.println("El preu final del teu producte " + nombre3c4 + " es :" + priseBueno3c4);
                    System.out.println("El preu final del teu producte " + nombre4c4 + " es :" + priseBueno4c4);

                    break;

            }
        }else{
            System.out.println("How many products have you bought (from 1 to 4)?");
            int cant = sc.nextInt();
            sc.nextLine();

            switch (cant) {
                case 1:
                    System.out.println("what product did you buy?");
                    String nombrec1 = sc.nextLine();
                    System.out.println("tell me the price of the product");
                    double prisec1 = sc.nextDouble();
                    sc.nextLine();
                    double priseBuenoc1 = 0;
                    double pIvac1 = prisec1 * 0.21;
                    priseBuenoc1 = prisec1 + pIvac1;
                    if (pIvac1 > 10) {
                        double descuentoc1 = priseBuenoc1 * (-0.15);
                        priseBuenoc1 += descuentoc1;
                    } else if (pIvac1 > 5) {
                        double descuentoc1 = priseBuenoc1 * (-0.1);
                        priseBuenoc1 += descuentoc1;
                    }
                    System.out.println("The final price of your product " + nombrec1 + " is :" + priseBuenoc1);
                    break;
                case 2:
                    System.out.println("what product did you buy?");
                    String nombrec2 = sc.nextLine();
                    System.out.println("tell me the price of the product");
                    double prisec2 = sc.nextDouble();
                    sc.nextLine();
                    double priseBuenoc2 = 0;
                    double pIvac2 = prisec2 * 0.21;
                    priseBuenoc2 = prisec2 + pIvac2;
                    if (pIvac2 > 10) {
                        double descuentoc2 = priseBuenoc2 * (-0.15);
                        priseBuenoc2 += descuentoc2;
                    } else if (pIvac2 > 5) {
                        double descuentoc2 = priseBuenoc2 * (-0.1);
                        priseBuenoc2 += descuentoc2;
                    }
                    System.out.println("what product did you buy?");
                    String nombre2c2 = sc.nextLine();
                    System.out.println("tell me the price of the product");
                    double prise2c2 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno2c2 = 0;
                    double pIva2c2 = prise2c2 * 0.21;
                    priseBueno2c2 = prise2c2 + pIva2c2;
                    if (pIva2c2 > 10) {
                        double descuento2c2 = priseBueno2c2 * (-0.15);
                        priseBueno2c2 += descuento2c2;
                    } else if (pIva2c2 > 5) {
                        double descuento2c2 = priseBueno2c2 * (-0.1);
                        priseBueno2c2 += descuento2c2;
                    }
                    System.out.println("The final price of your product " + nombrec2 + " is :" + priseBuenoc2);
                    System.out.println("The final price of your product " + nombre2c2 + " is :" + priseBueno2c2);
                    break;
                case 3:
                    System.out.println("what product did you buy?");
                    String nombrec3 = sc.nextLine();
                    System.out.println("tell me the price of the product");
                    double prisec3 = sc.nextDouble();
                    sc.nextLine();
                    double priseBuenoc3 = 0;
                    double pIvac3 = prisec3 * 0.21;
                    priseBuenoc3 = prisec3 + pIvac3;
                    if (pIvac3 > 10) {
                        double descuentoc3 = priseBuenoc3 * (-0.15);
                        priseBuenoc3 += descuentoc3;
                    } else if (pIvac3 > 5) {
                        double descuentoc3 = priseBuenoc3 * (-0.1);
                        priseBuenoc3 += descuentoc3;
                    }
                    System.out.println("what product did you buy?");
                    String nombre2c3 = sc.nextLine();
                    System.out.println("tell me the price of the product");
                    double prise2c3 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno2c3 = 0;
                    double pIva2c3 = prise2c3 * 0.21;
                    priseBueno2c3 = prise2c3 + pIva2c3;
                    if (pIva2c3 > 10) {
                        double descuento2c3 = priseBueno2c3 * (-0.15);
                        priseBueno2c3 += descuento2c3;
                    } else if (pIva2c3 > 5) {
                        double descuento2c3 = priseBueno2c3 * (-0.1);
                        priseBueno2c3 += descuento2c3;
                    }
                    System.out.println("what product did you buy?");
                    String nombre3c3 = sc.nextLine();
                    System.out.println("tell me the price of the product");
                    double prise3c3 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno3c3 = 0;
                    double pIva3c3 = prise3c3 * 0.21;
                    priseBueno3c3 = prise3c3 + pIva3c3;
                    if (pIva3c3 > 10) {
                        double descuento3c3 = priseBueno3c3 * (-0.15);
                        priseBueno3c3 += descuento3c3;
                    } else if (pIva3c3 > 5) {
                        double descuento3c3 = priseBueno3c3 * (-0.1);
                        priseBueno3c3 += descuento3c3;
                    }

                    System.out.println("The final price of your product " + nombrec3 + " is :" + priseBuenoc3);
                    System.out.println("The final price of your product " + nombre2c3 + " is :" + priseBueno2c3);
                    System.out.println("The final price of your product " + nombre3c3 + " is :" + priseBueno3c3);
                    break;
                case 4:
                    System.out.println("what product did you buy?");
                    String nombrec4 = sc.nextLine();
                    System.out.println("tell me the price of the product");
                    double prisec4 = sc.nextDouble();
                    sc.nextLine();
                    double priseBuenoc4 = 0;
                    double pIvac4 = prisec4 * 0.21;
                    priseBuenoc4 = prisec4 + pIvac4;
                    if (pIvac4 > 10) {
                        double descuentoc4 = priseBuenoc4 * (-0.15);
                        priseBuenoc4 += descuentoc4;
                    } else if (pIvac4 > 5) {
                        double descuentoc4 = priseBuenoc4 * (-0.1);
                        priseBuenoc4 += descuentoc4;
                    }
                    System.out.println("what product did you buy?");
                    String nombre2c4 = sc.nextLine();
                    System.out.println("tell me the price of the product");
                    double prise2c4 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno2c4 = 0;
                    double pIva2c4 = prise2c4 * 0.21;
                    priseBueno2c4 = prise2c4 + pIva2c4;
                    if (pIva2c4 > 10) {
                        double descuento2c4 = priseBueno2c4 * (-0.15);
                        priseBueno2c4 += descuento2c4;
                    } else if (pIva2c4 > 5) {
                        double descuento2c4 = priseBueno2c4 * (-0.1);
                        priseBueno2c4 += descuento2c4;
                    }
                    System.out.println("what product did you buy?");
                    String nombre3c4 = sc.nextLine();
                    System.out.println("tell me the price of the product");
                    double prise3c4 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno3c4 = 0;
                    double pIva3c4 = prise3c4 * 0.21;
                    priseBueno3c4 = prise3c4 + pIva3c4;
                    if (pIva3c4 > 10) {
                        double descuento3c4 = priseBueno3c4 * (-0.15);
                        priseBueno3c4 += descuento3c4;
                    } else if (pIva3c4 > 5) {
                        double descuento3c4 = priseBueno3c4 * (-0.1);
                        priseBueno3c4 += descuento3c4;
                    }
                    System.out.println("what product did you buy?");
                    String nombre4c4 = sc.nextLine();
                    System.out.println("tell me the price of the product");
                    double prise4c4 = sc.nextDouble();
                    sc.nextLine();
                    double priseBueno4c4 = 0;
                    double pIva4c4 = prise4c4 * 0.21;
                    priseBueno4c4 = prise4c4 + pIva4c4;
                    if (pIva4c4 > 10) {
                        double descuento4c4 = priseBueno4c4 * (-0.15);
                        priseBueno4c4 += descuento4c4;
                    } else if (pIva4c4 > 5) {
                        double descuento4c4 = priseBueno4c4 * (-0.1);
                        priseBueno4c4 += descuento4c4;
                    }

                    System.out.println("The final price of your product " + nombrec4 + " is :" + priseBuenoc4);
                    System.out.println("The final price of your product " + nombre2c4 + " is :" + priseBueno2c4);
                    System.out.println("The final price of your product " + nombre3c4 + " is :" + priseBueno3c4);
                    System.out.println("The final price of your product " + nombre4c4 + " is :" + priseBueno4c4);

                    break;

            }
        }

    }
}
