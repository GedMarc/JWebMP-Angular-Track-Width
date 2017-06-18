package za.co.mmagon.jwebswing.plugins.angulartrackwidth;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * Allows for elements to do auto focus
 *
 * @author Marc Magon
 * @since 16 Jun 2017
 */
@PluginInformation(pluginName = "Angular Auto Focus",
        pluginDescription = "Allows your auto focus components using Angular",
        pluginUniqueName = "jwebswing-angular-auto-focus",
        pluginVersion = "1.0.0",
        pluginCategories = "angular,auto focus,focus,ui,web ui, framework",
        pluginSubtitle = "Allows your auto focus components using Angular",
        pluginSourceUrl = "https://www.akveo.com/products.html",
        pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-Auto-Focus/wiki",
        pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-Auto-Focus",
        pluginIconUrl = "",
        pluginIconImageUrl = "",
        pluginOriginalHomepage = "https://www.akveo.com/products.html",
        pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularAutoFocus.jar/download"
)
@ComponentInformation(name = "Angular Auto Focus",
        description = "Allows your auto focus components using Angular",
        url = "https://www.akveo.com/products.html")
public class AngularTrackWidthPageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

    /*
     * Constructs a new AngularTrackWidthPageConfigurator
     */
    public AngularTrackWidthPageConfigurator()
    {
        //Nothing needed
    }

    @Override
    public Page configure(Page page)
    {
        if (!page.isConfigured())
        {
            JQueryPageConfigurator.setRequired(page.getBody(), true);
            AngularPageConfigurator.setRequired(page.getBody(), true);
            page.getAngular().getAngularDirectives().add(new AngularTrackWidthDirective());
        }
        return page;
    }
}
