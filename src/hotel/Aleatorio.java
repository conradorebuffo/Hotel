package hotel;

import java.util.Random;

public class Aleatorio {

    String randomStringNom() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        return "Nombre" + sb.toString();
    }


//random.nextInt(max - min + 1) + min
    int randomInt() {
        Random random = new Random();
        return random.nextInt(3 - 1 + 1) + 1;
    }

    int randomIntCiudad() {
        Random random = new Random();
        return random.nextInt(3);
    }

    int randomIntDias() {
        Random random = new Random();
        return random.nextInt(15 - 1 + 1) + 1;
    }

    int randomIntImporte() {
        Random random = new Random();
        return random.nextInt(1500 - 200 + 1) + 200;
    }

    int randomIntTipoServicio() {
        Random random = new Random();
        return random.nextInt(4);
    }

    }
