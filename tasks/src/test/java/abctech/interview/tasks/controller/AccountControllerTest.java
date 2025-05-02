package abctech.interview.tasks.controller;

import abctech.interview.tasks.service.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AccountControllerTest {
    AccountController controller;
    AccountService accountService;

    @BeforeEach
    void setupBeforeEach() {
        accountService = Mockito.mock(AccountService.class);
        controller = new AccountController(accountService);
    }

    @Test
    void testIsIbanValid() {
        Assertions.assertTrue(controller.isIbanValid("HR15648"));
        Assertions.assertFalse(controller.isIbanValid("H15648"));
    }
}
