package your.group.controller;

import com.ecfront.dew.core.controller.CRUSController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import your.group.domain.Pet;
import your.group.service.PetService;

@RestController
@RequestMapping("pet/")
@Api(description = "宠物操作")
public class PetController implements CRUSController<PetService, Integer, Pet> {
}
