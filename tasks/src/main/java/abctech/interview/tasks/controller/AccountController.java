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
        // get the accounts from db
        List<Account> theAccounts = accountService.findAll();

        // add to the spring model
        theModel.addAttribute("accounts", theAccounts);

        return "accounts/list-accounts";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        // create model attribute to bind form data
        Account theAccount = new Account();

        theModel.addAttribute("account", theAccount);

        return "accounts/account-form";
    }

    @PostMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("accountId") int theId,
                                    Model theModel) {

        // get the accounts from the service
        Account theAccount = accountService.findById(theId);

        // set accounts as a model attribute to pre-populate the form
        theModel.addAttribute("account", theAccount);

        // send over to our form
        return "accounts/account-form";
    }

    @PostMapping("/save")
    public String saveAccount(@ModelAttribute("account") Account theAccount) {

        // save the Account
        accountService.save(theAccount);

        // use a redirect to prevent duplicate submissions
        return "redirect:/accounts/list";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("accountId") int theId) {

        // delete the accounts
        accountService.deleteById(theId);

        // redirect to /accounts/list
        return "redirect:/accounts/list";

    }
}
