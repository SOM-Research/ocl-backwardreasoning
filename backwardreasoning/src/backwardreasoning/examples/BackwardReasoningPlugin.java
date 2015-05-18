package backwardreasoning.examples;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import org.eclipse.ui.plugin.AbstractUIPlugin;
public class BackwardReasoningPlugin extends AbstractUIPlugin {

	// The plug-in ID
		public static final String PLUGIN_ID = "backwardreasoning"; //$NON-NLS-1$

		// The shared instance
		private static BackwardReasoningPlugin plugin;
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

}
