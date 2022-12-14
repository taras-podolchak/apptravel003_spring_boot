package com.apptravel003_spring_boot.adapters.firebase.daos;

import com.apptravel003_spring_boot.adapters.firebase.entities.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Random;

//@SpringBootTest
class UserRepositoryTest {

    //@Autowired
    UserRepository userRepository;

    //@Test
    public void testCreateActivity() {
        Integer[] arrCodPostal = new Integer[]{
                28001, 28002, 28003, 28004, 28005, 28006, 28007, 28008, 28009, 28010,
                28011, 28012, 28013, 28014, 28015, 28016, 28017, 28018, 28019, 28020,
                28021, 28022, 28023, 28024, 28025, 28026, 28027, 28028, 28029, 28030,
                28031, 28032, 28033, 28034, 28035, 28036, 28037, 28038, 28039, 28040,
                28041, 28042, 28043, 28044, 28045, 28046, 28047, 28048, 28049, 28050,
                28051, 28052, 28053, 28054, 28055, 28070, 28071, 28080, 28082, 28083,
                28085, 28086, 28087
        };

        String[] arrName = new String[]{
                "Martin", "Lucia", "Hugo", "Martina", "Mateo", "Sofia", "Leo", "Maria", "Lucas", "Valeria", "Manuel", "Julia", "Daniel", "Paula", "Alejandro", "Emma", "Pablo", "Daniela", "Enzo", "Carla", "Alvaro", "Alma", "Mario", "Olivia", "Adrian", "Sara", "Diego", "Carmen", "Thiago", "Vega", "Bruno", "Mia", "Oliver", "Lara", "David", "Alba", "Alex", "Noa", "Marco", "Lola", "Gonzalo", "Valentina", "Marcos", "Chloe", "Nicolas", "Claudia", "Antonio", "Jimena", "Izan", "Aitana", "Miguel", "Laia", "Javier", "Vera", "Luca", "Abril", "Liam", "Alejandra", "Gael", "Ana", "Marc", "Triana", "Dylan", "Candela", "Juan", "Adriana", "Angel", "Manuela", "Carlos", "Elena", "Jose", "Carlota", "Gabriel", "Ines", "Sergio", "Blanca", "Eric", "Marina", "Jorge", "Marta", "Dario", "Lia", "Adam", "Victoria", "Samuel", "Nora", "Hector", "Zoe", "Rodrigo", "Rocio", "Iker", "Alicia", "Pau", "Clara", "Jesus", "Gala", "Guillermo", "Luna", "Jaime", "Ariadna", "Luis", "Irene", "Ian", "Laura", "Francisco", "Celia", "Noah", "Eva", "Aaron", "Amira", "Victor", "India", "Mohamed", "Leire", "Rafael", "Africa", "Pedro", "Ona", "Amir", "Angela", "Unai", "Gabriela", "Julen", "Mar", "Ruben", "Iria", "Santiago", "Andrea", "Ivan", "Isabel", "Erik", "Mara", "Nil", "Ainhoa", "Pol", "Ainara", "Saul", "Julieta", "Neizan", "Elsa", "Jan", "Iris", "Marti", "Aina", "Matias", "Jana", "Raul", "Nerea", "Alberto", "Leyre", "Aitor", "Naia", "Joel", "Nahia", "Rayan", "Cayetana", "Ander", "Lina", "Axel", "Cloe", "Alan", "Diana", "Alonso", "Elia", "Fernando", "Helena", "Asier", "Nour", "Isaac", "Yasmin", "Andres", "Maia", "Fabio", "Cristina", "Biel", "Natalia", "Ignacio", "Macarena", "Luka", "Adara", "Max", "Aurora", "Arnau", "Carolina", "Ismael", "Violeta", "Aday", "Fatima", "Aleix", "Isabella", "Jon", "Arlet", "Nico", "Aroa", "Youssef", "Camila", "Elias", "Berta", "Kai", "Elisa"};

        String[] arrSurname = new String[]{
                "Rodriguez", "Gonzalez", "Fernandez", "Lopez", "Martinez", "Sanchez", "Perez", "Gomez", "Martin", "Jimenez", "Hernandez", "Ruiz", "Diaz", "Moreno", "Mu??oz", "Alvarez", "Romero", "Gutierrez", "Alonso", "Navarro", "Torres", "Dominguez", "Ramos", "Vazquez", "Ramirez", "Gil", "Serrano", "Morales", "Molina", "Blanco", "Suarez", "Castro", "Ortega", "Delgado", "Ortiz", "Marin", "Rubio", "Nu??ez", "Sanz", "Medina", "Iglesias", "Castillo", "Cortes", "Garrido", "Santos", "Guerrero", "Lozano", "Cano", "Mendez", "Cruz", "Prieto", "Flores", "Herrera", "Pe??a", "Leon", "Marquez", "Cabrera", "Gallego", "Calvo", "Vidal", "Campos", "Reyes", "Vega", "Fuentes", "Carrasco", "Diez", "Aguilar", "Caballero", "Nieto", "Santana", "Pascual", "Herrero", "Vargas", "Gimenez", "Montero", "Hidalgo", "Lorenzo", "Santiago", "Iba??ez", "Duran", "Benitez", "Ferrer", "Arias", "Mora", "Carmona", "Vicente", "Rojas", "Soto", "Crespo", "Roman", "Pastor", "Velasco", "Parra", "Saez", "Moya", "Bravo", "Soler", "Gallardo", "Rivera",};

        String[] arrSecondSurname = new String[]{
                "Rodriguez", "Gonzalez", "Fernandez", "Lopez", "Martinez", "Sanchez", "Perez", "Gomez", "Martin", "Jimenez", "Hernandez", "Ruiz", "Diaz", "Moreno", "Mu??oz", "Alvarez", "Romero", "Gutierrez", "Alonso", "Navarro", "Torres", "Dominguez", "Ramos", "Vazquez", "Ramirez", "Gil", "Serrano", "Morales", "Molina", "Blanco", "Suarez", "Castro", "Ortega", "Delgado", "Ortiz", "Marin", "Rubio", "Nu??ez", "Sanz", "Medina", "Iglesias", "Castillo", "Cortes", "Garrido", "Santos", "Guerrero", "Lozano", "Cano", "Mendez", "Cruz", "Prieto", "Flores", "Herrera", "Pe??a", "Leon", "Marquez", "Cabrera", "Gallego", "Calvo", "Vidal", "Campos", "Reyes", "Vega", "Fuentes", "Carrasco", "Diez", "Aguilar", "Caballero", "Nieto", "Santana", "Pascual", "Herrero", "Vargas", "Gimenez", "Montero", "Hidalgo", "Lorenzo", "Santiago", "Iba??ez", "Duran", "Benitez", "Ferrer", "Arias", "Mora", "Carmona", "Vicente", "Rojas", "Soto", "Crespo", "Roman", "Pastor", "Velasco", "Parra", "Saez", "Moya", "Bravo", "Soler", "Gallardo", "Rivera",};

        String[] arrNickname = new String[]{
                "Ojazos", "Papi", "Papito", "Ricura", "Caramelito", "Pastelito", "Cuerpazo", "Playboy", "Hoyuelos", "Ricitos", "Moreno", "Rubio",
                "Negrito", "Perla", "Flaco", "Bomb??n", "Hermoso", "Bonito", "Adonis", "Caraguapa", "Chati", "Chulo", "Boquita", "Guapo", "Fortach??n", "Musculitos", "Pib??n", "Bello", "Bebecito", "Lindo", "Gatito", "Vida", "Coraz??n", "Bollito", "Dulzura", "Monino", "Regalito", "Ternura", "Quesito", "Bolita", "Pollito", "Chispita", "Pich??n", "Pimpollo", "Petit", "Suisse", "Pepinillo", "Flor", "Titi", "Zarig??ella", "Chatungo", "Chorbo", "Jefe", "Semental", "Misif??", "Soldado", "Pelusa", "Mofletillos", "Tibur??n", "Cocodrilo", "Loquito", "Cuchi", "Gnomo", "Pich??n", "Pichurrita", "Churro", "Pocholito", "Pulguita", "Mochi", "Salchichita", "Currupipi", "Chichip??n", "Chichinabo", "Monito", "Solete", "Enano", "Peque", "Chiqui", "Churri", "Peluchito", "Cari", "Tesoro", "Pr??ncipe", "Bichito", "Cari??o", "Cielo", "Amor", "Leoncito", "Cachorrito", "Renacuajo", "Osito", "Pajarito", "Juguet??n", "Travieso", "Delicia", "Fierecilla", "Sabrosura", "Se??or", "Culete", "Canijo", "Mu??eco", "Mordisquitos", "Pollote", "Zorro", "Jefecito", "Tarz??n", "Superm??n", "Juguetito", "Pele??n",
        };

        String[] arrDoors = new String[]{
                "A", "B", "C", "D", "E", "F"
        };

        String[] arrAddress = new String[]{
                "Paseo de las Acacias", "Calle Acero", "Calle Afrodita", "Calle de Agatha Christie", "Calle del ??gora", "Calle Aguado", "Calle Agustina de Arag??n", "Calle Alarc??n", "Calle Alberiza", "Calle Alcalde Antonio Pariente Cuesta", "Calle Alcalde Jos?? Huete L??pez", "Calle Alegranza", "Calle de Alemania", "Calle Alfonso VI", "Calle la Amarguilla", "Glorieta de las Amazonas", "Calle Amelia Earhart", "Calle de Ana Frank", "Avenida de Andaluc??a", "Plaza de Antonio Machado", "Calle Antonio Van de Pere", "Calle A??over de Tajo", "Calle Apolo", "Calle Ap??stol Santiago", "Calle Aprisco", "Calle Aquiles", "Calle Arag??n", "Calle Aranjuez", "Avenida de las Arboledas", "Vereda de las Arboledas", "Calle Arcadia", "Calle de los Arenalejos", "Calle de Arist??teles", "Calle Arquitectos", "Calle Artemisa", "Calle Arturo Duperier", "Calle Atenas", "Calle Atenea", "Calle Atl??ntida", "Calle Aurora Boreal", "Calle Austria", "Plaza de Autos", "Calle Baco", "Calle de las Bahamas", "Camino Bajo de Ciempozuelos", "Glorieta de Beatriz Galindo", "Calle de B??lgica", "Calle de Benelux", "Avenida Benito Daza de Vald??s", "Calle Blasco de Garay", "Paseo Bolitas de Air??n", "Calle de Bolivia", "Calle Bonn", "Calle Borox", "Calle de Brasil", "Calle Bret??n de los Herreros", "Calle Bruselas", "Calle Buzanca", "Calle Cabrera", "Calle Caceras", "Calle C??diz", "Calle Cambroneras", "Calle Camilo Jos?? Cela", "Calle Camino de Pinto", "Plaza Campo Olivar", "Plaza C??novas del Castillo", "Calle Cantabria", "Avenida de las Canteras", "Glorieta Carmen Amaya", "Calle del Carmen", "Calle de Carmen Conde", "Calle Carmen Mart??n Gaite", "Calle Carpinteros", "Camino de la Carrehuela", "Camino de los Carros", "Calle Casandra", "Calle Castilla La Mancha", "Plaza de Castilla", "Calle Castilla-Le??n", "Acceso a Centro Penitenciario Madrid III", "Calle de Ceres", "Calle Cervantes", "Calle Ceuta y Melilla", "Calle Chamber??", "Calle Charles Darwin", "Calle de Chequia", "Calle Chile", "Calle Chinch??n", "Calle Chipre", "Calle de Cibeles", "Camino de Ciempozuelos", "Calle Circunvalaci??n Sur", "Calle de Clara Campoamor", "Calle Colegio", "Calle Colmenar", "Calle de Colombia", "Pasaje de Col??n", "Calle Comunidad de Baleares", "Calle Comunidad de Canarias", "Paseo Comunidad de Madrid", "Calle Comunidad de Murcia", "Calle Comunidad de Navarra", "Ronda de las Comunidades", "Glorieta Concepci??n Arenal", "Calle Concha Espina", "Avenida Conde Duque", "Plaza del Conde", "Plaza de la Constituci??n", "Travesia del Cordero", "Avenida de C??rdoba", "Calle Corf??", "Calle Corita", "Calle de Creta", "Calle Cristo de la Salud", "Calle Crono", "Avenida de la Cruz", "Calle Cruz de Medallas", "Calle de Cuba", "Calle Dal??", "Calle Delf??n", "Calle Delfos", "Pasaje del Descubrimiento de Am??rica", "Calle Diamante", "Calle de Diana", "Calle Diego de Almagro", "Glorieta Dinamarca", "Calle Doctor Barraquer", "Calle Doctor Benito", "Calle Doctor Castel??", "Calle Doctor Fleming", "Calle Doctor Jim??nez D??az", "Calle Doctor la Calle", "Calle Doctor Mata", "Calle Doctor Patarroyo", "Calle Doctor Severo Ochoa", "Calle Doctor Vallejo N??jera", "Calle Don Ram??n Areces", "Calle Dragonera", "Calle Dubl??n", "Plaza Duque de Ahumada", "Calle Duque de Lerma", "Calle Duquesas", "Calle de Ecuador", "Calle de Edipo", "Finca El Espartal", "Calle El Salvador", "Calle de Electra", "Calle Eloy Gonzalo", "Calle Eloy L??pez de Lerena", "Calle Emilia Pardo Baz??n", "Calle Enrique III", "Paseo de Enrique Tierno Galv??n", "Camino de las Entregas", "Calle Eolo", "Calle Eras de la Cruz", "Avenida Ermita de Santiago", "Calle de Eros", "Calle Escultores", "Calle de Eslovaquia", "Calle Esmirna", "Avenida de Espa??a", "Plaza Esparto", "Calle del Espinillo", "Calle Esquilo", "Calle Esquivias", "Paseo de la Estaci??n", "Calle de Estonia", "Calle Estrella", "Calle Estrella de Elola", "Calle Estribo", "Pasaje del Estribo", "Glorieta Eulalia Abaitua", "Calle Eur??dice", "Calle Eur??pides", "Avenida de Europa", "Calle Extremadura", "Camino del Extremo", "Calle los Faroles", "Calle de Fauno", "Calle de Febo", "Plaza Federico Garc??a Lorca", "Calle de Federico Mar??n", "Calle Felipe II", "Calle Felipe III", "Glorieta Fern??n Caballero", "Calle Fernando VI", "Avenida del Ferrocarril", "Lugar Fibrolit", "Calle Finlandia", "Calle de las Flores", "Calle Formentera", "Calle Fortuny", "Calle de Francia", "Calle Francisco Bayeu", "Calle Fuente de la Teja", "Calle Fuente Vieja", "Calle Fuentecilla", "Calle Fuentenueva", "Calle Fuerteventura", "Calle de Gabriela Mistral", "Calle Galatea", "Calle Galicia", "Calle Gaspar Bravo de Sobremonte", "Calle General Dab??n", "Calle General Martitegui", "Calle de Gloria Fuertes", "Calle Godollo", "Calle Gomera", "Calle Goya", "Camino de G??zquez", "Calle Gran Canaria", "Calle de Granada", "Calle la Granilla", "Calle de Grecia", "Calle Greco", "Calle Gregorio Mara????n", "Calle Gregorio Prieto", "Calle de Greta Garbo", "Calle Gri????n", "Calle de la Guardia Civil", "Glorieta Guardia Civil Fernando Trapero", "Glorieta Guardia Civil Raul Centeno", "Calle Guardias J??venes", "Calle de Guatemala", "Calle Hait??", "Calle de Heracles", "Calle de H??rcules", "Calle Herencia", "Plaza del Hermano Ram??n Quiroga", "Calle Hern??n Cort??s", "Calle Hernando de Soto", "Calle de las Hesp??rides", "Calle Hierro", "Avenida de Hispanoam??rica", "Calle de Holanda", "Calle de Homero", "Camino Hondo", "Calle de Honduras", "Avenida del Hotel", "Paseo de los Hoteles", "Calle de Huelva", "Calle Hungr??a", "Calle Infantas", "Calle Inglaterra", "Calle Inmaculada", "Glorieta de Irene Fern??ndez", "Calle Iris", "Calle Irlanda", "Calle Isaac Peral", "Calle Isla Graciosa", "Calle Islas Bermudas", "Calle ??taca", "Calle de Italia", "Calle Ja??n", "Calle Jamaica", "Calle de Jano", "Calle Joan Mir??", "Calle Jos?? Mar??a Pem??n", "Glorieta Josefina Carabias", "Calle Juan de la Cierva", "Calle Juan Gris", "Glorieta de Juliana Eybeck", "Paseo Juncarejo", "Calle Juno", "Calle J??piter", "Calle La Palma", "Calle Lanzarote", "Calle la Lastra", "Calle Leonardo Torres Quevedo", "Calle Letonia", "Calle Libertad", "Calle de Lil?? ??lvarez", "Calle Lisboa", "Glorieta de Lituania", "Calle Londres", "Calle Los Carros", "Calle Los Verdiales", "Camino la Losa", "Calle Luis Planelles", "Calle la Luna", "Calle Luxemburgo", "Avenida de Madrid", "Calle Maestro Garc??a Morcillo", "Avenida del Majuelo", "Calle de M??laga", "Calle Mallorca", "Calle Manuel Viola", "Avenida Mar Adri??tico", "Calle Mar Caribe", "Avenida del Mar Egeo", "Avenida del Mar Mediterr??neo", "Calle Marat??n", "Calle Mar??a Callas", "Calle de Mar??a Curie", "Calle de Mar??a Moliner", "Glorieta Mar??a Montessori", "Calle Mar??a Zambrano", "Glorieta de Mariana Pineda", "Calle Marqu??s de Alca??ices", "Calle Marqu??s de Au????n", "Calle Marqu??s de Gaviria", "Glorieta Marqu??s de Vallejo", "Calle Marquesa de Villa Antonia", "Calle Marte", "Calle Matadero", "Calle de M??jico", "Calle Menfis", "Calle Menorca", "Calle de Mercurio", "Calle Miguel ??ngel", "Calle Miguel Hern??ndez", "Calle Miguel Servet", "Calle Minaya", "Calle Minerva", "Calle Mirador", "Calle Mirasierra", "Calle Miravalles", "Plaza de las Monjas", "Avenida de las Morcilleras", "Calle Murillo", "Calle Narciso Monturiol", "Calle Narv??ez", "Calle Negritas", "Calle Neptuno", "Calle de Nicaragua", "Calle Nicasio Fraile", "Calle de Noruega", "Plaza de Nuestra Se??ora del Rosario", "Calle N????ez de Balboa", "Calle Oca??a", "Calle del Olimpo", "Calle Oliva", "Avenida del Olivar", "Calle Orestes", "Calle Orfeo", "Calle Osa Mayor", "Calle Osa Menor", "Calle Pablo Picasso", "Calle de Panam??", "Calle de Paraguay", "Plaza del Para??so", "Calle Par??s", "Calle Parla", "Paseo P??rroco Don Lorenzo", "Calle la Patrona", "Calle Pavillo", "Calle Pedro de Valdivia", "Calle de Peralejo", "Calle de Per??", "Calle del Pilar", "Calle P??ndaro", "Calle Pintor Rosales", "Calle Pintores", "Plaza de la Pi??a", "Calle de P??o Baroja", "Calle Pizarro", "Calle Plat??n", "Calle de Plut??n", "Avenida Pocillos", "Camino de los Pocillos", "Calle Polifemo", "Glorieta de Polonia", "Calle del Portillo", "Camino del Portillo", "Calle de Portugal", "Calle Poseid??n", "Calle del Postiguillo", "Calle Pozo Chico", "Glorieta Pozo San Pedro", "Calle Practicante D Ram??n Mac??as", "Paseo del Prado", "Pasaje del Prado", "Ronda del Prado", "Calle Principado de Asturias", "Calle de Puerto Rico", "Calle Rafael", "Paseo de la Rambla", "Calle Ram??rez de Arellano", "Calle Real", "Calle Relug", "Calle Rep??blica Argentina", "Calle Rep??blica Dominicana", "Callejon del Rey", "Avenida Reyes Cat??licos", "Calle R??o Ebro", "Calle R??o Guadalquivir", "Calle R??o Henares", "Calle R??o Jarama", "Calle R??o J??car", "Calle R??o Manzanares", "Calle R??o Tajo", "Calle la Rioja", "Calle Roma", "Plaza del Romano", "Calle Rosa Luxemburgo", "Calle Rosal??a de Castro", "Calle del Rosario", "Calle Ruiz de Alda", "Autovia R-4", "Calle Saelices", "Camino de las Salinas", "Calle San Ant??n", "Calle San Gregorio", "Calle San Isidro", "Calle San Jos??", "Calle San Mart??n de la Vega", "Camino San Mart??n de la Vega", "Calle de San Nicol??s", "Avenida de San Roque", "Ronda de San Sebasti??n", "Calle San Vicente de Pa??l", "Calle Santiago Rusi??ol", "Calle de Saturno", "Calle de S??neca", "Calle Sese??a", "Calle de Sevilla", "Glorieta de las Sirenas", "Pasaje del Sol", "Calle Solano", "Calle Sor Justa Dom??nguez", "Calle Sorolla", "Glorieta de Suecia", "Avenida del Sur", "Calle Tae??a", "Calle Taranc??n", "Calle Tebas", "Calle Tener??as", "Calle Tenerife", "Calle de Teresa de Calcuta", "Glorieta de Teresa de Jes??s", "Calle la Tijerilla", "Calle Tinto Enrique", "Calle Tirso de Molina", "Calle Tiziano", "Calle Toledo", "Callejon de la Torre", "Camino de Torrej??n", "Calle Torrej??n de Velasco", "Calle Torrevieja", "Calle de las Trabajadoras de Cotton", "Calle Trigo", "Calle de Ulises", "Glorieta del Universo", "Calle de Uruguay", "Calle las Vacas", "Calle Valdemeca", "Cuesta Valderremata", "Camino Valdesanchuela", "Calle Valencia", "Calle Vel??zquez", "Calle Venezuela", "Camino Ventanilla", "Calle de Venus", "Calle Veracruz", "Camino de los Verdiales", "Calle Vereda de la Solana", "Calle Vesta", "Calle Vicente Aleixandre", "Calle Vicente Blasco Ib????ez", "Glorieta de Victoria Kent", "Cuesta de la Villa", "Calle Villaconejos", "Calle de la Vi??a", "Calle Virgen de Bego??a", "Calle Virgen de la Almudena", "Calle Virgen de la Fuencisla", "Calle Virgen de la Paloma", "Calle Virgen de Loreto", "Calle Virgen de Lourdes", "Calle Virgen del Mar", "Calle Virgen del Roc??o", "Calle de Virgilio", "Calle de Vulcano", "Avenida de los Yeseros", "Calle Yuncos", "Calle Yuste", "Calle de Zeus", "Calle Zuloaga",
        };

        long offset = Timestamp.valueOf("2018-01-01 00:00:00").getTime();
        long end = Timestamp.valueOf("2020-11-24 00:00:00").getTime();
        long diffAlt = end - offset + 1;

        long offset1 = Timestamp.valueOf("2020-11-24 00:00:00").getTime();
        long end1 = Timestamp.valueOf("2022-11-24 00:00:00").getTime();
        long diffAltBaja = end1 - offset1 + 1;

        Random randomPhone = new Random();
        int low = 100000;
        int high = 999999;


        for (int i = 0; i < 21; i++) {
            int result = randomPhone.nextInt(high - low) + low;
            String phone = "655" + result;

            Timestamp rand1 = new Timestamp(offset + (long) (Math.random() * diffAlt));
            Timestamp rand2 = new Timestamp(offset + (long) (Math.random() * diffAltBaja));

            String name = arrName[(int) (Math.random() * 97 + 1)];
            String surname = arrSurname[(int) (Math.random() * 97 + 1)];
            UserEntity.UserEntityBuilder userEntityBuilder = UserEntity.builder()
                    .typeUser(2)
                    .statusUser((int) (Math.random() * 3 + 1))
                    .name(name)
                    .nickname(arrNickname[(int) (Math.random() * 97 + 1)])
                    .surname(surname)
                    .secondSurname(arrSecondSurname[(int) (Math.random() * 97 + 1)])
                    .preferActivity(Arrays.asList((int) (Math.random() * 3 + 1), (int) (Math.random() * 3 + 1)))
                    .phoneNumber(Integer.valueOf(phone))
                    .email(name + "." + surname + "@gmail.com")
                    .country("Madrid")
                    .address(arrAddress[(int) (Math.random() * 475 + 1)] + ", " + (int) (Math.random() * 15 + 1) + " " + (arrDoors[(int) (Math.random() * 4 + 1)]))
                    .location("Madrid")
                    .postalCode(arrCodPostal[(int) (Math.random() * 60 + 1)])
                    .documentType((int) (Math.random() * 2 + 1))
                    .documentNumber((arrName[(int) (Math.random() * 97 + 1)]).toUpperCase().charAt(0) + " " + (result))
                    .nationality("Espa??ol")
                    .photoUser("/col" + i + "b.jpg")
                    .photoOrganization("/col" + i + "a.jpg")
                    .entryDate(rand1)
                    .leavingDate(rand2)
                    .legalConditions(true)
                    .rememberPassword(true);

            //userRepository.save(userEntityBuilder.build()).block();
            //System.out.println(userEntityBuilder);
        }




 /*       for (String name :arrSurname) {
            System.out.print(name.toUpperCase().charAt(0)+name.substring(1,name.length()).toLowerCase()+",");
        }

        userRepository.findAll().doOnNext(element -> {
            System.out.println(element);
        });
     /*   userRepository
                .findAll()
                .filter(userEntity -> userEntity.getName().equals("Test"))
                .doOnNext(userEntity -> {
                    assertEquals("Test", userEntity.getName());
                    assertEquals("Test", userEntity.getNickname());
                    assertEquals("Test", userEntity.getSurname());
                    assertEquals("Test", userEntity.getSecondSurname());
                    assertEquals("Test", userEntity.getEmail());

                    userRepository.deleteById(userEntity.getId_doc()).block();
                });
    }*/
    }
}

