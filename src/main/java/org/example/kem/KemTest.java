package org.example.kem;

import javax.crypto.DecapsulateException;
import javax.crypto.KEM;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class KemTest {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, DecapsulateException {
        //receiver side

        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("X25519");
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        //share public key

        //sender side
        KEM kem1 = KEM.getInstance("DHKEM");
        KEM.Encapsulator sender = kem1.newEncapsulator(keyPair.getPublic());
        KEM.Encapsulated encapsulated = sender.encapsulate();
        SecretKey sharedSecret1 = encapsulated.key();
        //sendBytes(encapsulated.encapsulation());

        //receiver side
        KEM kem2 = KEM.getInstance("DHKEM");
        KEM.Decapsulator receiver = kem2.newDecapsulator(keyPair.getPrivate());
        SecretKey sharedSecret2 = receiver.decapsulate(encapsulated.encapsulation());

        //check the shared content
        assert Arrays.equals(sharedSecret1.getEncoded(), sharedSecret2.getEncoded());
    }
}
