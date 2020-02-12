import com.google.inject.Inject;
import com.iroselle.cstats.sponge.MetricsLite2;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = "exampleplugin", name = "ExamplePlugin", version = "1.0")
public class ExamplePlugin {

    // The metricsFactory parameter gets injected using @Inject :)
    // Check out https://docs.spongepowered.org/master/en/plugin/injection.html if you don't know what @Inject does
    @Inject
    public ExamplePlugin(MetricsLite2.Factory metricsFactory) {
        metricsFactory.make();
    }

}
