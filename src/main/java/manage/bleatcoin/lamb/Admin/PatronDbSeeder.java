package manage.bleatcoin.lamb.Admin;

import manage.bleatcoin.lamb.Admin.entities.Patron;
import manage.bleatcoin.lamb.Admin.PatronService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class PatronDbSeeder implements CommandLineRunner {

    @Autowired
    PatronService serv;

    @Override
    public void run(String... args) throws Exception {
        // --- Database seeding complete. Do nothing. ---
    }
}
