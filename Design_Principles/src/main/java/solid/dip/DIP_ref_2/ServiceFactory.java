package solid.dip.DIP_ref_2;



public abstract class ServiceFactory{


    public I_PSWGeneratorServiceRef_2 createPSWgenerator() {
        
        I_PSWGeneratorServiceRef_2 concreteService = createPSWservice();
        return concreteService;
        /*
        I_PSWGeneratorServiceRef_2 concreteService;

         
        if(special)
            concreteService = new SpecialPSWGenerator_2();    
        else 
            concreteService = new PSWGeneratorRef_2();

        return concreteService;
        */
    }

    protected abstract I_PSWGeneratorServiceRef_2 createPSWservice();
}

