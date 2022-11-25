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
                "Rodriguez", "Gonzalez", "Fernandez", "Lopez", "Martinez", "Sanchez", "Perez", "Gomez", "Martin", "Jimenez", "Hernandez", "Ruiz", "Diaz", "Moreno", "Muñoz", "Alvarez", "Romero", "Gutierrez", "Alonso", "Navarro", "Torres", "Dominguez", "Ramos", "Vazquez", "Ramirez", "Gil", "Serrano", "Morales", "Molina", "Blanco", "Suarez", "Castro", "Ortega", "Delgado", "Ortiz", "Marin", "Rubio", "Nuñez", "Sanz", "Medina", "Iglesias", "Castillo", "Cortes", "Garrido", "Santos", "Guerrero", "Lozano", "Cano", "Mendez", "Cruz", "Prieto", "Flores", "Herrera", "Peña", "Leon", "Marquez", "Cabrera", "Gallego", "Calvo", "Vidal", "Campos", "Reyes", "Vega", "Fuentes", "Carrasco", "Diez", "Aguilar", "Caballero", "Nieto", "Santana", "Pascual", "Herrero", "Vargas", "Gimenez", "Montero", "Hidalgo", "Lorenzo", "Santiago", "Ibañez", "Duran", "Benitez", "Ferrer", "Arias", "Mora", "Carmona", "Vicente", "Rojas", "Soto", "Crespo", "Roman", "Pastor", "Velasco", "Parra", "Saez", "Moya", "Bravo", "Soler", "Gallardo", "Rivera",};

        String[] arrSecondSurname = new String[]{
                "Rodriguez", "Gonzalez", "Fernandez", "Lopez", "Martinez", "Sanchez", "Perez", "Gomez", "Martin", "Jimenez", "Hernandez", "Ruiz", "Diaz", "Moreno", "Muñoz", "Alvarez", "Romero", "Gutierrez", "Alonso", "Navarro", "Torres", "Dominguez", "Ramos", "Vazquez", "Ramirez", "Gil", "Serrano", "Morales", "Molina", "Blanco", "Suarez", "Castro", "Ortega", "Delgado", "Ortiz", "Marin", "Rubio", "Nuñez", "Sanz", "Medina", "Iglesias", "Castillo", "Cortes", "Garrido", "Santos", "Guerrero", "Lozano", "Cano", "Mendez", "Cruz", "Prieto", "Flores", "Herrera", "Peña", "Leon", "Marquez", "Cabrera", "Gallego", "Calvo", "Vidal", "Campos", "Reyes", "Vega", "Fuentes", "Carrasco", "Diez", "Aguilar", "Caballero", "Nieto", "Santana", "Pascual", "Herrero", "Vargas", "Gimenez", "Montero", "Hidalgo", "Lorenzo", "Santiago", "Ibañez", "Duran", "Benitez", "Ferrer", "Arias", "Mora", "Carmona", "Vicente", "Rojas", "Soto", "Crespo", "Roman", "Pastor", "Velasco", "Parra", "Saez", "Moya", "Bravo", "Soler", "Gallardo", "Rivera",};

        String[] arrNickname = new String[]{
                "Ojazos", "Papi", "Papito", "Ricura", "Caramelito", "Pastelito", "Cuerpazo", "Playboy", "Hoyuelos", "Ricitos", "Moreno", "Rubio",
                "Negrito", "Perla", "Flaco", "Bombón", "Hermoso", "Bonito", "Adonis", "Caraguapa", "Chati", "Chulo", "Boquita", "Guapo", "Fortachón", "Musculitos", "Pibón", "Bello", "Bebecito", "Lindo", "Gatito", "Vida", "Corazón", "Bollito", "Dulzura", "Monino", "Regalito", "Ternura", "Quesito", "Bolita", "Pollito", "Chispita", "Pichón", "Pimpollo", "Petit", "Suisse", "Pepinillo", "Flor", "Titi", "Zarigüella", "Chatungo", "Chorbo", "Jefe", "Semental", "Misifú", "Soldado", "Pelusa", "Mofletillos", "Tiburón", "Cocodrilo", "Loquito", "Cuchi", "Gnomo", "Pichín", "Pichurrita", "Churro", "Pocholito", "Pulguita", "Mochi", "Salchichita", "Currupipi", "Chichipán", "Chichinabo", "Monito", "Solete", "Enano", "Peque", "Chiqui", "Churri", "Peluchito", "Cari", "Tesoro", "Príncipe", "Bichito", "Cariño", "Cielo", "Amor", "Leoncito", "Cachorrito", "Renacuajo", "Osito", "Pajarito", "Juguetón", "Travieso", "Delicia", "Fierecilla", "Sabrosura", "Señor", "Culete", "Canijo", "Muñeco", "Mordisquitos", "Pollote", "Zorro", "Jefecito", "Tarzán", "Supermán", "Juguetito", "Peleón",
        };

        String[] arrDoors = new String[]{
                "A", "B", "C", "D", "E", "F"
        };

        String[] arrAddress = new String[]{
                "Paseo de las Acacias", "Calle Acero", "Calle Afrodita", "Calle de Agatha Christie", "Calle del Ágora", "Calle Aguado", "Calle Agustina de Aragón", "Calle Alarcón", "Calle Alberiza", "Calle Alcalde Antonio Pariente Cuesta", "Calle Alcalde José Huete López", "Calle Alegranza", "Calle de Alemania", "Calle Alfonso VI", "Calle la Amarguilla", "Glorieta de las Amazonas", "Calle Amelia Earhart", "Calle de Ana Frank", "Avenida de Andalucía", "Plaza de Antonio Machado", "Calle Antonio Van de Pere", "Calle Añover de Tajo", "Calle Apolo", "Calle Apóstol Santiago", "Calle Aprisco", "Calle Aquiles", "Calle Aragón", "Calle Aranjuez", "Avenida de las Arboledas", "Vereda de las Arboledas", "Calle Arcadia", "Calle de los Arenalejos", "Calle de Aristóteles", "Calle Arquitectos", "Calle Artemisa", "Calle Arturo Duperier", "Calle Atenas", "Calle Atenea", "Calle Atlántida", "Calle Aurora Boreal", "Calle Austria", "Plaza de Autos", "Calle Baco", "Calle de las Bahamas", "Camino Bajo de Ciempozuelos", "Glorieta de Beatriz Galindo", "Calle de Bélgica", "Calle de Benelux", "Avenida Benito Daza de Valdés", "Calle Blasco de Garay", "Paseo Bolitas de Airón", "Calle de Bolivia", "Calle Bonn", "Calle Borox", "Calle de Brasil", "Calle Bretón de los Herreros", "Calle Bruselas", "Calle Buzanca", "Calle Cabrera", "Calle Caceras", "Calle Cádiz", "Calle Cambroneras", "Calle Camilo José Cela", "Calle Camino de Pinto", "Plaza Campo Olivar", "Plaza Cánovas del Castillo", "Calle Cantabria", "Avenida de las Canteras", "Glorieta Carmen Amaya", "Calle del Carmen", "Calle de Carmen Conde", "Calle Carmen Martín Gaite", "Calle Carpinteros", "Camino de la Carrehuela", "Camino de los Carros", "Calle Casandra", "Calle Castilla La Mancha", "Plaza de Castilla", "Calle Castilla-León", "Acceso a Centro Penitenciario Madrid III", "Calle de Ceres", "Calle Cervantes", "Calle Ceuta y Melilla", "Calle Chamberí", "Calle Charles Darwin", "Calle de Chequia", "Calle Chile", "Calle Chinchón", "Calle Chipre", "Calle de Cibeles", "Camino de Ciempozuelos", "Calle Circunvalación Sur", "Calle de Clara Campoamor", "Calle Colegio", "Calle Colmenar", "Calle de Colombia", "Pasaje de Colón", "Calle Comunidad de Baleares", "Calle Comunidad de Canarias", "Paseo Comunidad de Madrid", "Calle Comunidad de Murcia", "Calle Comunidad de Navarra", "Ronda de las Comunidades", "Glorieta Concepción Arenal", "Calle Concha Espina", "Avenida Conde Duque", "Plaza del Conde", "Plaza de la Constitución", "Travesia del Cordero", "Avenida de Córdoba", "Calle Corfú", "Calle Corita", "Calle de Creta", "Calle Cristo de la Salud", "Calle Crono", "Avenida de la Cruz", "Calle Cruz de Medallas", "Calle de Cuba", "Calle Dalí", "Calle Delfín", "Calle Delfos", "Pasaje del Descubrimiento de América", "Calle Diamante", "Calle de Diana", "Calle Diego de Almagro", "Glorieta Dinamarca", "Calle Doctor Barraquer", "Calle Doctor Benito", "Calle Doctor Casteló", "Calle Doctor Fleming", "Calle Doctor Jiménez Díaz", "Calle Doctor la Calle", "Calle Doctor Mata", "Calle Doctor Patarroyo", "Calle Doctor Severo Ochoa", "Calle Doctor Vallejo Nájera", "Calle Don Ramón Areces", "Calle Dragonera", "Calle Dublín", "Plaza Duque de Ahumada", "Calle Duque de Lerma", "Calle Duquesas", "Calle de Ecuador", "Calle de Edipo", "Finca El Espartal", "Calle El Salvador", "Calle de Electra", "Calle Eloy Gonzalo", "Calle Eloy López de Lerena", "Calle Emilia Pardo Bazán", "Calle Enrique III", "Paseo de Enrique Tierno Galván", "Camino de las Entregas", "Calle Eolo", "Calle Eras de la Cruz", "Avenida Ermita de Santiago", "Calle de Eros", "Calle Escultores", "Calle de Eslovaquia", "Calle Esmirna", "Avenida de España", "Plaza Esparto", "Calle del Espinillo", "Calle Esquilo", "Calle Esquivias", "Paseo de la Estación", "Calle de Estonia", "Calle Estrella", "Calle Estrella de Elola", "Calle Estribo", "Pasaje del Estribo", "Glorieta Eulalia Abaitua", "Calle Eurídice", "Calle Eurípides", "Avenida de Europa", "Calle Extremadura", "Camino del Extremo", "Calle los Faroles", "Calle de Fauno", "Calle de Febo", "Plaza Federico García Lorca", "Calle de Federico Marín", "Calle Felipe II", "Calle Felipe III", "Glorieta Fernán Caballero", "Calle Fernando VI", "Avenida del Ferrocarril", "Lugar Fibrolit", "Calle Finlandia", "Calle de las Flores", "Calle Formentera", "Calle Fortuny", "Calle de Francia", "Calle Francisco Bayeu", "Calle Fuente de la Teja", "Calle Fuente Vieja", "Calle Fuentecilla", "Calle Fuentenueva", "Calle Fuerteventura", "Calle de Gabriela Mistral", "Calle Galatea", "Calle Galicia", "Calle Gaspar Bravo de Sobremonte", "Calle General Dabán", "Calle General Martitegui", "Calle de Gloria Fuertes", "Calle Godollo", "Calle Gomera", "Calle Goya", "Camino de Gózquez", "Calle Gran Canaria", "Calle de Granada", "Calle la Granilla", "Calle de Grecia", "Calle Greco", "Calle Gregorio Marañón", "Calle Gregorio Prieto", "Calle de Greta Garbo", "Calle Griñón", "Calle de la Guardia Civil", "Glorieta Guardia Civil Fernando Trapero", "Glorieta Guardia Civil Raul Centeno", "Calle Guardias Jóvenes", "Calle de Guatemala", "Calle Haití", "Calle de Heracles", "Calle de Hércules", "Calle Herencia", "Plaza del Hermano Ramón Quiroga", "Calle Hernán Cortés", "Calle Hernando de Soto", "Calle de las Hespérides", "Calle Hierro", "Avenida de Hispanoamérica", "Calle de Holanda", "Calle de Homero", "Camino Hondo", "Calle de Honduras", "Avenida del Hotel", "Paseo de los Hoteles", "Calle de Huelva", "Calle Hungría", "Calle Infantas", "Calle Inglaterra", "Calle Inmaculada", "Glorieta de Irene Fernández", "Calle Iris", "Calle Irlanda", "Calle Isaac Peral", "Calle Isla Graciosa", "Calle Islas Bermudas", "Calle Ítaca", "Calle de Italia", "Calle Jaén", "Calle Jamaica", "Calle de Jano", "Calle Joan Miró", "Calle José María Pemán", "Glorieta Josefina Carabias", "Calle Juan de la Cierva", "Calle Juan Gris", "Glorieta de Juliana Eybeck", "Paseo Juncarejo", "Calle Juno", "Calle Júpiter", "Calle La Palma", "Calle Lanzarote", "Calle la Lastra", "Calle Leonardo Torres Quevedo", "Calle Letonia", "Calle Libertad", "Calle de Lilí Álvarez", "Calle Lisboa", "Glorieta de Lituania", "Calle Londres", "Calle Los Carros", "Calle Los Verdiales", "Camino la Losa", "Calle Luis Planelles", "Calle la Luna", "Calle Luxemburgo", "Avenida de Madrid", "Calle Maestro García Morcillo", "Avenida del Majuelo", "Calle de Málaga", "Calle Mallorca", "Calle Manuel Viola", "Avenida Mar Adriático", "Calle Mar Caribe", "Avenida del Mar Egeo", "Avenida del Mar Mediterráneo", "Calle Maratón", "Calle María Callas", "Calle de María Curie", "Calle de María Moliner", "Glorieta María Montessori", "Calle María Zambrano", "Glorieta de Mariana Pineda", "Calle Marqués de Alcañices", "Calle Marqués de Auñón", "Calle Marqués de Gaviria", "Glorieta Marqués de Vallejo", "Calle Marquesa de Villa Antonia", "Calle Marte", "Calle Matadero", "Calle de Méjico", "Calle Menfis", "Calle Menorca", "Calle de Mercurio", "Calle Miguel Ángel", "Calle Miguel Hernández", "Calle Miguel Servet", "Calle Minaya", "Calle Minerva", "Calle Mirador", "Calle Mirasierra", "Calle Miravalles", "Plaza de las Monjas", "Avenida de las Morcilleras", "Calle Murillo", "Calle Narciso Monturiol", "Calle Narváez", "Calle Negritas", "Calle Neptuno", "Calle de Nicaragua", "Calle Nicasio Fraile", "Calle de Noruega", "Plaza de Nuestra Señora del Rosario", "Calle Núñez de Balboa", "Calle Ocaña", "Calle del Olimpo", "Calle Oliva", "Avenida del Olivar", "Calle Orestes", "Calle Orfeo", "Calle Osa Mayor", "Calle Osa Menor", "Calle Pablo Picasso", "Calle de Panamá", "Calle de Paraguay", "Plaza del Paraíso", "Calle París", "Calle Parla", "Paseo Párroco Don Lorenzo", "Calle la Patrona", "Calle Pavillo", "Calle Pedro de Valdivia", "Calle de Peralejo", "Calle de Perú", "Calle del Pilar", "Calle Píndaro", "Calle Pintor Rosales", "Calle Pintores", "Plaza de la Piña", "Calle de Pío Baroja", "Calle Pizarro", "Calle Platón", "Calle de Plutón", "Avenida Pocillos", "Camino de los Pocillos", "Calle Polifemo", "Glorieta de Polonia", "Calle del Portillo", "Camino del Portillo", "Calle de Portugal", "Calle Poseidón", "Calle del Postiguillo", "Calle Pozo Chico", "Glorieta Pozo San Pedro", "Calle Practicante D Ramón Macías", "Paseo del Prado", "Pasaje del Prado", "Ronda del Prado", "Calle Principado de Asturias", "Calle de Puerto Rico", "Calle Rafael", "Paseo de la Rambla", "Calle Ramírez de Arellano", "Calle Real", "Calle Relug", "Calle República Argentina", "Calle República Dominicana", "Callejon del Rey", "Avenida Reyes Católicos", "Calle Río Ebro", "Calle Río Guadalquivir", "Calle Río Henares", "Calle Río Jarama", "Calle Río Júcar", "Calle Río Manzanares", "Calle Río Tajo", "Calle la Rioja", "Calle Roma", "Plaza del Romano", "Calle Rosa Luxemburgo", "Calle Rosalía de Castro", "Calle del Rosario", "Calle Ruiz de Alda", "Autovia R-4", "Calle Saelices", "Camino de las Salinas", "Calle San Antón", "Calle San Gregorio", "Calle San Isidro", "Calle San José", "Calle San Martín de la Vega", "Camino San Martín de la Vega", "Calle de San Nicolás", "Avenida de San Roque", "Ronda de San Sebastián", "Calle San Vicente de Paúl", "Calle Santiago Rusiñol", "Calle de Saturno", "Calle de Séneca", "Calle Seseña", "Calle de Sevilla", "Glorieta de las Sirenas", "Pasaje del Sol", "Calle Solano", "Calle Sor Justa Domínguez", "Calle Sorolla", "Glorieta de Suecia", "Avenida del Sur", "Calle Taeña", "Calle Tarancón", "Calle Tebas", "Calle Tenerías", "Calle Tenerife", "Calle de Teresa de Calcuta", "Glorieta de Teresa de Jesús", "Calle la Tijerilla", "Calle Tinto Enrique", "Calle Tirso de Molina", "Calle Tiziano", "Calle Toledo", "Callejon de la Torre", "Camino de Torrejón", "Calle Torrejón de Velasco", "Calle Torrevieja", "Calle de las Trabajadoras de Cotton", "Calle Trigo", "Calle de Ulises", "Glorieta del Universo", "Calle de Uruguay", "Calle las Vacas", "Calle Valdemeca", "Cuesta Valderremata", "Camino Valdesanchuela", "Calle Valencia", "Calle Velázquez", "Calle Venezuela", "Camino Ventanilla", "Calle de Venus", "Calle Veracruz", "Camino de los Verdiales", "Calle Vereda de la Solana", "Calle Vesta", "Calle Vicente Aleixandre", "Calle Vicente Blasco Ibáñez", "Glorieta de Victoria Kent", "Cuesta de la Villa", "Calle Villaconejos", "Calle de la Viña", "Calle Virgen de Begoña", "Calle Virgen de la Almudena", "Calle Virgen de la Fuencisla", "Calle Virgen de la Paloma", "Calle Virgen de Loreto", "Calle Virgen de Lourdes", "Calle Virgen del Mar", "Calle Virgen del Rocío", "Calle de Virgilio", "Calle de Vulcano", "Avenida de los Yeseros", "Calle Yuncos", "Calle Yuste", "Calle de Zeus", "Calle Zuloaga",
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
                    .nationality("Español")
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

