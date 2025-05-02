package abctech.interview.tasks.controller;

import abctech.interview.tasks.entity.Account;
import abctech.interview.tasks.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("abc")
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/list")
    public String listAccounts(Model theModel) {
        // get the Accounts from db
        List<Account> theAccounts = accountService.findAll();

        // add to the spring model
        theModel.addAttribute("Accounts", theAccounts);

        return "Accounts/list-Accounts";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        // create model attribute to bind form data
        Account theAccount = new Account();

        theModel.addAttribute("Account", theAccount);

        return "Accounts/Account-form";
    }

    @PostMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("AccountId") int theId,
                                    Model theModel) {

        // get the Account from the service
        Account theAccount = accountService.findById(theId);

        // set Account as a model attribute to pre-populate the form
        theModel.addAttribute("Account", theAccount);

        // send over to our form
        return "Accounts/Account-form";
    }

    @PostMapping("/save")
    public String saveAccount(@ModelAttribute("Account") Account theAccount) {

        // save the Account
        accountService.save(theAccount);

        // use a redirect to prevent duplicate submissions
        return "redirect:/Accounts/list";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("AccountId") int theId) {

        // delete the Account
        accountService.deleteById(theId);

        // redirect to /Accounts/list
        return "redirect:/Accounts/list";

    }
}
