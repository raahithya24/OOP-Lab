class SecuritySystem {
    void authenticate() {
        System.out.println("Authenticating using basic password...");
    }
}

class FingerprintScanner extends SecuritySystem {
    void authenticate() {
        System.out.println("Authenticating using Fingerprint Scanner...");
    }
}

class FaceRecognition extends SecuritySystem {
    void authenticate() {
        System.out.println("Authenticating using Face Recognition...");
    }
}

public class Secure {
    public static void main(String[] args) {
        SecuritySystem basic = new SecuritySystem();
        SecuritySystem fingerprint = new FingerprintScanner();
        SecuritySystem face = new FaceRecognition();

        basic.authenticate();      
        fingerprint.authenticate(); 
        face.authenticate();       
    }
}
