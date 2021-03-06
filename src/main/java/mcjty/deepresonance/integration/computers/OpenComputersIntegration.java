package mcjty.deepresonance.integration.computers;

import li.cil.oc.api.Driver;
import net.minecraftforge.fml.common.Optional;

public class OpenComputersIntegration {
    @Optional.Method(modid="OpenComputers")
    public static void initV10() {
        Driver.add(new TankDriver.OCDriver());
        Driver.add(new ValveDriver.OCDriver());
        Driver.add(new LaserDriver.OCDriver());
        Driver.add(new SmelterDriver.OCDriver());
        Driver.add(new CrystalizerDriver.OCDriver());
        Driver.add(new GeneratorControllerDriver.OCDriver());
        Driver.add(new PedestalDriver.OCDriver());
    }

    @Optional.Method(modid="opencomputers")
    public static void initV11() {
        Driver.add(new TankDriver.OCDriver());
        Driver.add(new ValveDriver.OCDriver());
        Driver.add(new LaserDriver.OCDriver());
        Driver.add(new SmelterDriver.OCDriver());
        Driver.add(new CrystalizerDriver.OCDriver());
        Driver.add(new GeneratorControllerDriver.OCDriver());
        Driver.add(new PedestalDriver.OCDriver());
    }
}
