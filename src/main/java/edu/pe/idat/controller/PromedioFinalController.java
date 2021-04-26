package edu.pe.idat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
 
import edu.pe.idat.model.PromedioFinalForm;

@Controller
public class PromedioFinalController {

	@GetMapping("/promedionotas")
	public ModelAndView promedionotas() {

		ModelAndView modelView = new ModelAndView();
		modelView.addObject("promediofinalform", new PromedioFinalForm());
		modelView.addObject("visualizar", false);

		return modelView;

	}

	@PostMapping("/promedionotas")
	public String promedionotas(@ModelAttribute("promediofinalform") PromedioFinalForm promedioFinalForm, Model model) {

		Double valorEc1 = promedioFinalForm.getEvaC1() * 0.04;
		Double valorEc2 = promedioFinalForm.getEvaC2() * 0.12;
		Double valorEc3 = promedioFinalForm.getEvaC3() * 0.24;
		Double valorEc4 = promedioFinalForm.getEvaF() * 0.60;
		Double PromFinal = valorEc1 + valorEc2 + valorEc3 + valorEc4;

		String resultado = "DESAPROBADO";

		if (PromFinal >= 12.5) {

			resultado = "APROBADO";
		}

		model.addAttribute("visualizar", true);
		model.addAttribute("resultado",
				"Su promedio: " + String.format("%.2f", PromFinal) + " , usted se encuentra " + resultado);
		return "promedionotas";

	}
}