package io.github.svagtlys.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @RequestMapping(value="")
    public static String listSkills(){
        return "<html>" +
                "   <body>" +
                "       <h1>Skills Tracker</h1>" +
                "       <h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "       <ol>" +
                "           <li>Java</li>" +
                "           <li>Python</li>" +
                "           <li>C++</li>" +
                "       </ol>" +
                "   </body>" +
                "</html>";
    }

    @RequestMapping(value="form", method={RequestMethod.GET})
    public static String askFavoriteSkills(){
        return "<html>" +
                "   <body>" +
                "       <form action='form/results' method='post'>" +
                "           <label>" +
                "               Name: <br />" +
                "               <input type='text' name='name'> <br />" +
                "           </label>" +
                "           <label>" +
                "               My favorite language: <br />" +
                "               <select name='lang1'>" +
                "                   <option value='Java'>Java</option>" +
                "                   <option value='Python'>Python</option>" +
                "                   <option value='C++'>C++</option>" +
                "               </select> <br />" +
                "           </label>" +
                "           <label>" +
                "               My second favorite language: <br />" +
                "               <select name='lang2'>" +
                "                   <option value='Java'>Java</option>" +
                "                   <option value='Python'>Python</option>" +
                "                   <option value='C++'>C++</option>" +
                "               </select> <br />" +
                "           </label>" +
                "           <label>" +
                "               My third favorite language: <br />" +
                "               <select name='lang3'>" +
                "                   <option value='Java'>Java</option>" +
                "                   <option value='Python'>Python</option>" +
                "                   <option value='C++'>C++</option>" +
                "               </select> <br />" +
                "           </label> <br />" +
                "           <input type='submit' value='Submit'>" +
                "       </form>" +
                "   </body>" +
                "</html>";
    }

    @RequestMapping(value="form/results", method = {RequestMethod.POST})
    public static String displayFavoriteSkills(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3){
        return "<html>" +
                "   <body>" +
                "       <h1>" + name + "</h1>" +
                "       <ol>" +
                "           <li>" + lang1 + "</li>" +
                "           <li>" + lang2 + "</li>" +
                "           <li>" + lang3 + "</li>" +
                "       </ol>" +
                "   </body>" +
                "</html>";
    }

}
