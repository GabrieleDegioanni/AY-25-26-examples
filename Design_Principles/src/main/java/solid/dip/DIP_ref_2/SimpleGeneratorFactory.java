package solid.dip.DIP_ref_2;

import solid.dip.DIP_ref_2.generators.PSWGeneratorRef_2;

public class SimpleGeneratorFactory extends ServiceFactory{

    @Override
    protected I_PSWGeneratorServiceRef_2 createPSWservice() {
        return new PSWGeneratorRef_2();
    }

}
