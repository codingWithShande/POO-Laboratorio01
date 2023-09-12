**1.** Construya una clase de nombre **Arquitecto** que tiene los siguientes atributos: `código,
nombres, condición de contrato (Estable, contratado), especialidad (Estructuras, Recursos
Hidricos, Ingenieria Vial), Tipo de Supervisión (Obras o Vías), Numero de Obras Asignadas`.
Construya su constructor que actualizará los datos de los atributos. Para esta clase desarrolle
los métodos y que permitan hacer lo siguiente: 
 El sueldo base se calcula de la
siguiente tabla:

> | Condición de Contrato | SUELDO BASE | Supervisión de Obras | Supervisión de Vías |
> |-----------------------|------------|----------------------|---------------------|
> | Estable                           | 4000           | 6000                             |                                       |
> | Contratado                   | 2000           | 4500                              |                                       |

 La bonificación es un porcentaje de su
sueldo base en base a su especialidad
tal y como se muestra en la siguiente
tabla:

> | Especialidad         | % de Bonificación |
> |----------------------|-------------------|
> | Estructuras          | 16%               |
> | Recursos Hídricos   | 18%               |
> | Ingeniería Vial     | 22%               |

 Los descuentos serán del 15% para el AFP y 8% para el SNP
 Método para el cálculo del monto de movilidad de
acuerdo al número de obras asignadas
 Indique las instrucciones para el sueldo Neto y el
sueldo Bruto

> | Número de Obras | Monto |
> |-----------------|-------|
> | < 17            | 300   |
> | >= 18           | 600   |

**Construya el aplicativo con los objetos necesarios para utilizar la funcionalidad de la clase
implementada y mostrar la información de sus atributos y sus métodos.**





**2.** Construya una clase de nombre **Jefe** que tiene los siguientes atributos:` nombres, sexo y DNI,
Cargo (Gerente y Subgerente), Área (Contabilidad, Tecnologías de Información y
Planificación), años de antigüedad`. Construya su constructor y desarrolle los métodos que
permitan hacer lo siguiente:
 El sueldo base se calcula
de la siguiente tabla

> | Cargo       | Contabilidad | Tecnologías de Información | Planificación |
> |-------------|--------------|-----------------------------|--------------|
> | Gerente     | 6000         | 8000                        | 7000         |
> | Subgerente  | 5000         | 7000                        | 6000         |

 La bonificación será de 2000 soles cualquiera que sea su categoría y área.
 Los descuentos serán del 15% para el AFP y 8% para el SNP
 El sueldo bruto se calcula de: Sueldo Base + Bonificación
 Esta clase tendrá un método propio que asignara un monto
de movilidad de acuerdo al cargo

> | Cargo      | Monto |
> |------------|-------|
> | Gerente    | 700   |
> | Subgerente | 400   |

 Descuentos que se calcula de la siguiente tabla:
 Sueldo Neto que se calcula de la siguiente
fórmula:

> | Años de Antigüedad | % de Descuento sobre el sueldo bruto |
> |--------------------|--------------------------------------|
> | < 7 años           | 5%                                   |
> | >= 8 años          | 4%                                   |

***Sueldo Neto = Sueldo Bruto – Descuentos + Movilidad***
Construya el aplicativo con los objetos necesarios para utilizar la funcionalidad de la clase
implementada y mostrar la información de sus atributos y sus métodos.





**3.** Construya una **clase** que permita guardar de una universidad guarda la información de sus
docentes como: `Código, nombres, categoría (Principal, Asociado, Auxiliar). Estudios de
Postgrado (ninguno, Maestría, Doctorado, Ambas) años de antigüedad, horas de clase,
sueldo bruto, % de bonificación por Estudios de Posgrado, % de bonificación por años de
antigüedad, monto de AFP, monto por un seguro de salud y sueldo neto`. La Universidad paga
a sus Docentes por cada hora trabajada según su categoría, así como los porcentajes de
bonificación también según su categoría y años de antigüedad son aplicables al sueldo bruto.
***Pago parcial = (numero de hora)*(pago por hora).***
En el siguiente cuadro se establecen los pagos por horas y las bonificaciones
correspondientes por cada categoría en base al pago parcial:

> | Categoría  | Pago por Hora | Estudios de Postgrado (% de Bonificación) | Bonificación por Años de Antigüedad |
> |------------|---------------|--------------------------------------------|------------------------------------|
> | Principal  | 25.00         | Con Doctorado: 20%                         | Con Doctorado < 7 años: 25%        |
> |            |               | Con Maestría: 17%                          | Con Doctorado >= 8 años: 5%       |
> |            |               | Ambas: 25%                                 | Con Maestría < 7 años: 17%         |
> |            |               |                                            | Con Maestría >= 8 años: 7%        |
> | Asociado   | 18.00         | Con Doctorado: 15%                         | Con Doctorado < 7 años: 20%        |
> |            |               | Con Maestría: 10%                          | Con Doctorado >= 8 años: 4%       |
> |            |               | Ambas: 20%                                 | Con Maestría < 7 años: 10%         |
> |            |               |                                            | Con Maestría >= 8 años: 6%        |
> | Auxiliar   | 15.00         | Con Doctorado: 12%                         | Con Doctorado < 7 años: 17%        |
> |            |               | Con Maestría: 8%                           | Con Doctorado >= 8 años: 2%       |
> |            |               | Ambas: 17%                                 | Con Maestría < 7 años: 8%          |
> |            |               |                                            | Con Maestría >= 8 años: 5%        |
****Si no cuenta con ninguno de los grados no recibe bonificación.***

 El sueldo bruto se calcula de la siguiente manera:
Sueldo Bruto= pago parcial + bonif. por Postgrado + bonif. por años de antiguedad
Además considere atributos de valores comunes para todos los docentes como descuento por
AFP del 13%, y por un seguro de salud de 5% de su sueldo bruto.
Construya el aplicativo con los objetos necesarios para utilizar la funcionalidad de la clase
implementada.
