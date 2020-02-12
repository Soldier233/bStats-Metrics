import net.md_5.bungee.api.plugin.Plugin;
import com.iroselle.cstats.bungeecord.Metrics;

public class ExamplePlugin extends Plugin {

    @Override
    public void onEnable() {
        // All you have to do is adding the following two lines in your onEnable method.
        Metrics metrics = new Metrics(this);

        // Optional: Add custom charts
        metrics.addCustomChart(new Metrics.SimplePie("chart_id", () -> "My value"));
    }

}
