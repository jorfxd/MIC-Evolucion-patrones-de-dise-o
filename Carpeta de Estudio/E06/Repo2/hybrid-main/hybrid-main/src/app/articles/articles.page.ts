import { Component, EnvironmentInjector, inject } from '@angular/core';
import {IonToolbar, IonTitle, IonHeader, IonContent, IonCard, IonCardHeader, IonCardContent ,IonButton, IonButtons, IonBackButton} from '@ionic/angular/standalone';

@Component({
  selector: 'app-articles',
  templateUrl: './articles.page.html',
  styleUrls: ['./articles.page.scss'],
  standalone: true,
  imports: [IonToolbar, IonTitle, IonHeader, IonContent, IonCard, IonCardHeader, IonCardContent, IonButton, IonButtons, IonBackButton],
})

export class articles {
  
  public environmentInjector = inject(EnvironmentInjector);
  
  public index = 0

  aritculoInfo:any[] = [
    {"color":"blue", "imagen":"../../assets/images/lunar.png", "titulo":"¿Lunares por exposición solar?"},
    {"color":"white", "imagen":"../../assets/images/melasma.jpg", "titulo":"Melasma en la piel"},
    {"color":"blue", "imagen":"../../assets/images/fotoenvejecimiento.jpg", "titulo":"Fotoenvejecimiento,   ¿Qué es?"},
    {"color":"white", "imagen":"../../assets/images/quemaduras.jpg", "titulo":"Quemaduras solares"},
  ]

  detalles:any[] = [
    [{"titulo":"Exposición al sol: cuáles son los lunares hay que vigilar",
      "texto":"Los lunares deben controlarse al menos una vez por año. Hay que tener presente ciertas características para analizar las lesiones de mayor riesgo: asimetría, bordes irregulares, varios colores, diámetro mayor a 6 milímetros (mm) y evolución o cambios en el tiempo.\n“El cáncer de piel se presenta de distintas maneras, no solamente los lunares con sus características de sospecha ya descritos, sino otras lesiones nuevas rojo-rosadas, que crecen, pican, se lastiman y no curan. En general se ubican en zonas expuestas al sol crónicamente”, explicó la especialista.\nEn esa línea determinó que los lunares se extirpan únicamente ante sospecha de malignidad, no se sacan por “prevención”."},
      {"titulo":"Cómo vigilar los lunares",
      "texto":"Una lesión puede considerarse sospechosa si presenta uno o varios de los criterios ABCDE o cualquier otra anomalía.\nAsimetría. Los lunares sanos son redondos y simétricos.\nBordes. Si es irregular, está mal definido o tiene ondulaciones debe ser chequeado por un profesional.\nColor. No deben tener más de un color ni ser blancos, rojos, azules o negros.\nDiámetro. Los sanos no miden más de 6 mm, similar a la goma de borrar de un lápiz.\nEvolución. No deben cambiar de forma, tamaño o color. Tampoco deben sangrar, endurecerse o picar."},],

    [{"titulo":"Síntomas del melasma",
      "texto":"Aparecen en la piel áreas irregulares, parcheadas, de color oscuro, generalmente en ambos lados de la cara. La pigmentación se produce con más frecuencia en el centro de la cara y en las mejillas, la frente, las sienes, el labio superior y la nariz. Algunas veces las placas aparecen solo en los lados de la cara. Con muy poca frecuencia, el melasma aparece en los antebrazos. Las placas no causan picor ni duelen, y solo son un problema estético."},
      {"titulo":"Diagnóstico del melasma",
      "texto":"Los médicos establecen el diagnóstico de melasma basándose en la exploración física de la piel.\nLos médicos pueden hacer una exploración mediante lámpara de Wood, para diferenciar la hiperpigmentación en la epidermis (las capas superiores de la piel) de los otros trastornos cutáneos."},
      {"titulo":"Tratamiento del melasma",
      "texto":"Los tratamientos aplicados a la piel son efectivos solo si la hiperpigmentación afecta las capas superiores de la piel. Las cremas blanqueantes de la piel que contienen hidroquinona, tretinoína o un corticoesteroide se pueden usar en combinación para ayudar a aclarar las manchas oscuras. Sin embargo, la hidroquinona debe utilizarse solo bajo control médico, ya que su uso a largo plazo puede a veces causar una forma permanente de hiperpigmentación. Se puede usar una crema que contenga ácido azelaico en lugar de hidroquinona o bien se puede combinar dicha crema con ácido azelaico con hidroquinona, con tretinoína o con ambas."},],
    
    [{"titulo":"Primero, hablemos de la luz del sol",
      "texto":"El sol es una parte esencial de la vida y contribuye a nuestro estado de ánimo y bienestar. Además, cumple una función esencial para la síntesis de vitamina D. Sin embargo, emite continuamente algo llamado radiación electromagnética. Aunque suene complicado, seguro que ya estás familiarizada con algunos de los tipos de radiación: ultravioleta A (UVA) y ultravioleta B (UVB). Estos dos tipos de radiación solar afectan a tu piel a corto y largo plazo."},
      {"titulo":"¿Qué es el fotoenvejecimiento?",
      "texto":"En ISDIN, hablamos mucho de fotoenvejecimiento. De hecho, nos consideramos expertos en la materia. Pero, ¿qué es exactamente? La pista te la dará el prefijo “foto-”, es decir, “relativo a la luz”. En este caso, la luz UV que emite el sol. “El fotoenvejecimiento o photoaging se refiere al proceso por el que la radiación solar acelera los signos de envejecimiento de la piel, como manchas solares y líneas de expresión,” – comparte la Dra. Aurora Garre, ISDIN Medical Director. Y acelera el envejecimiento mucho más que cualquier otro factor externo."},
      {"titulo":"¿Cómo es una piel dañada por el sol?",
      "texto":"Envejecer es un proceso natural (e inevitable). Nuestro cuerpo ralentiza la producción de elastina y colágeno a medida que pasan los años, provocando una pérdida de elasticidad en nuestra piel.\n¿Qué pasa cuando el daño solar entra en acción? Según la Dra. Garre, “la exposición solar puede provocar que los signos visibles de la edad aparezcan hasta 20 años antes”. Y, aunque las arrugas no son nada a lo que temer, seguramente tampoco quieras que aparezcan antes de tiempo."},],
  
    [{"titulo":"Tipos de quemaduras solares",
      "texto":"Esta es una de las épocas del año en la que más quemaduras solares en la piel se registran, ya que aumentan las visitas a playas o piscinas. Estas quemaduras se manifiestan con el enrojecimiento de la piel, molestias estomacales, dolor, inflamación, ardor, escalofríos o cefalea si la quemadura solar ha sido muy grave."},
      {"titulo":"Grados de quemadura solar",
      "texto":"Quemadura de primer grado: afecta a la epidermis, capa externa de la piel. Provoca enrojecimiento, tirantez, quemazón y dolor.\nQuemadura de segundo grado: afecta a la epidermis y a ciertas capas internas. Provoca enrojecimiento, dolor, inflamación y ampollas.\nQuemadura de tercer grado: afecta a las 3 capas de la piel, no suele ser dolorosa porque la transmisión de la sensación de calor se altera. Se aprecia en la piel un tono oscuro la mayoría de las veces y en otras ocasiones se aprecia un tono blanquecino."},
      {"titulo":"¿Cómo prevenir las quemaduras?",
      "texto":"Las protecciones más habituales para combatir las quemaduras solares son: Utilizar la crema solar, evitar la sobreexposición al sol, llevar gafas de sol que protejan los ojos de los rayos ultravioletas y reducir las franjas horarias donde la incidencia de los rayos solares es mayor."},
      {"titulo":"Tratamientos",
      "texto":"Si tienes una quemadura de sol o presentas síntomas atípicos pide cita online o visítanos. Un especialista evaluará la gravedad de la quemadura y pondrá el tratamiento que considere más adecuado para tratar tu piel."},],
  ]

  constructor() {}

  showArticle(numero: any){
    this.index = parseInt(numero)
  }

  regresar(){
    this.index = 0
  }
}