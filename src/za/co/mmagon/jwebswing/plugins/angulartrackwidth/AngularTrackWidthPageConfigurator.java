package za.co.mmagon.jwebswing.plugins.angulartrackwidth;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * Allows for elements to have an track width
 *
 * @author Marc Magon
 * @since 16 Jun 2017
 */
@PluginInformation(pluginName = "Angular Track Width",
        pluginDescription = "Adds a width tracker to the scope Angular",
        pluginUniqueName = "jwebswing-angular-track-width",
        pluginVersion = "1.0.0",
        pluginCategories = "angular,tracking,sizing,ui,web ui, framework",
        pluginSubtitle = "Adds a width tracker to the scope Angular",
        pluginSourceUrl = "https://www.akveo.com/products.html",
        pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-Track-Width/wiki",
        pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-Track-Width",
        pluginIconUrl = "",
        pluginIconImageUrl = "",
        pluginOriginalHomepage = "https://www.akveo.com/products.html",
        pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularTrackWidth.jar/download"
)
@ComponentInformation(name = "Angular Track Width",
        description = "Adds a width tracker to the scope Angular",
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
