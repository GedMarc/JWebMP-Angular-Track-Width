import com.jwebmp.core.base.angular.services.IAngularDirective;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angulartrackwidth.AngularTrackWidthDirective;
import com.jwebmp.plugins.angulartrackwidth.AngularTrackWidthPageConfigurator;

module com.jwebmp.plugins.angulartrackwidth {
	exports com.jwebmp.plugins.angulartrackwidth;

	requires com.jwebmp.core;
	provides IPageConfigurator with AngularTrackWidthPageConfigurator;
	provides IAngularDirective with AngularTrackWidthDirective;

}
