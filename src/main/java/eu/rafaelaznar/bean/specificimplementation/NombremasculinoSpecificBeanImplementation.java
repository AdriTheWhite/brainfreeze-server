/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.rafaelaznar.bean.specificimplementation;

import com.google.gson.annotations.Expose;
import eu.rafaelaznar.bean.meta.publicinterface.MetaObjectBeanInterface;
import eu.rafaelaznar.bean.meta.publicinterface.MetaPropertyBeanInterface;
import eu.rafaelaznar.helper.EnumHelper;
import eu.rafaelaznar.helper.constant.RegexConstants;

@MetaObjectBeanInterface(
        TableName = "nombremasculino",
        SingularDescription = "Nombre Masculino",
        PluralDescription = "Nombres Masculinos",
        Type = EnumHelper.SourceType.Table
)
public class NombremasculinoSpecificBeanImplementation {

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Nombre",
            LongName = "Nombre",
            Description = "Nombre Masculino",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            RegexPattern = RegexConstants.capitalizedName,
            RegexHelp = RegexConstants.capitalizedName_Help,
            IsForeignKeyDescriptor = false,
            Width = 3,
            MaxLength = 100,
            IsVisible = false
    )
    private String nombreMasculino;

    public NombremasculinoSpecificBeanImplementation() {
    }

    public NombremasculinoSpecificBeanImplementation(String nombreMasculino) {
        this.nombreMasculino = nombreMasculino;
    }

    public String getNombreMasculino() {
        return nombreMasculino;
    }

    public void setNombreMasculino(String nombreMasculino) {
        this.nombreMasculino = nombreMasculino;
    }

}
