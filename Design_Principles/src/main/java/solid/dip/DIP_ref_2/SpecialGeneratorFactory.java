package solid.dip.DIP_ref_2;

import solid.dip.DIP_ref_2.generators.SpecialPSWGenerator_2;

public class SpecialGeneratorFactory extends ServiceFactory{

    @Override
    protected I_PSWGeneratorServiceRef_2 createPSWservice() {
        return new SpecialPSWGenerator_2();
    }

}
