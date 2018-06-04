/*
 * Copyright (c) 1996, 2016, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package sun.applet.resources;

import java.util.ListResourceBundle;

public class MsgAppletViewer_de extends ListResourceBundle {

    public Object[][] getContents() {
        Object[][] temp = new Object[][] {
            {"textframe.button.dismiss", "Verwerfen"},
            {"appletviewer.tool.title", "Applet Viewer: {0}"},
            {"appletviewer.menu.applet", "Applet"},
            {"appletviewer.menuitem.restart", "Neu starten"},
            {"appletviewer.menuitem.reload", "Neu laden"},
            {"appletviewer.menuitem.stop", "Stoppen"},
            {"appletviewer.menuitem.save", "Speichern..."},
            {"appletviewer.menuitem.start", "Starten..."},
            {"appletviewer.menuitem.clone", "Klonen..."},
            {"appletviewer.menuitem.tag", "Tag..."},
            {"appletviewer.menuitem.info", "Informationen..."},
            {"appletviewer.menuitem.edit", "Bearbeiten"},
            {"appletviewer.menuitem.encoding", "Zeichencodierung"},
            {"appletviewer.menuitem.print", "Drucken..."},
            {"appletviewer.menuitem.props", "Eigenschaften..."},
            {"appletviewer.menuitem.close", "Schlie\u00DFen"},
            {"appletviewer.menuitem.quit", "Beenden"},
            {"appletviewer.label.hello", "Hallo..."},
            {"appletviewer.status.start", "Applet wird gestartet..."},
            {"appletviewer.appletsave.filedialogtitle","Applet in Datei serialisieren"},
            {"appletviewer.appletsave.err1", "{0} in {1} serialisieren"},
            {"appletviewer.appletsave.err2", "in appletSave: {0}"},
            {"appletviewer.applettag", "Angezeigtes Tag"},
            {"appletviewer.applettag.textframe", "Applet-HTML-Tag"},
            {"appletviewer.appletinfo.applet", "-- keine Applet-Informationen --"},
            {"appletviewer.appletinfo.param", "-- keine Parameterinformationen --"},
            {"appletviewer.appletinfo.textframe", "Applet-Informationen"},
            {"appletviewer.appletprint.fail", "Druck nicht erfolgreich."},
            {"appletviewer.appletprint.finish", "Druck abgeschlossen."},
            {"appletviewer.appletprint.cancel", "Druck abgebrochen."},
            {"appletviewer.appletencoding", "Zeichencodierung: {0}"},
            {"appletviewer.parse.warning.requiresname", "Warnung: F\u00FCr <param name=... value=...>-Tag ist ein \"name\"-Attribut erforderlich."},
            {"appletviewer.parse.warning.paramoutside", "Warnung: <param>-Tag au\u00DFerhalb von <applet> ... </applet>."},
            {"appletviewer.parse.warning.applet.requirescode", "Warnung: F\u00FCr <applet>-Tag ist ein \"code\"-Attribut erforderlich."},
            {"appletviewer.parse.warning.applet.requiresheight", "Warnung: F\u00FCr <applet>-Tag ist ein \"height\"-Attribut erforderlich."},
            {"appletviewer.parse.warning.applet.requireswidth", "Warnung: F\u00FCr <applet>-Tag ist ein \"width\"-Attribut erforderlich."},
            {"appletviewer.parse.warning.object.requirescode", "Warnung: F\u00FCr <object>-Tag ist ein \"code\"-Attribut erforderlich."},
            {"appletviewer.parse.warning.object.requiresheight", "Warnung: F\u00FCr <object>-Tag ist ein \"height\"-Attribut erforderlich."},
            {"appletviewer.parse.warning.object.requireswidth", "Warnung: F\u00FCr <object>-Tag ist ein \"width\"-Attribut erforderlich."},
            {"appletviewer.parse.warning.embed.requirescode", "Warnung: F\u00FCr <embed>-Tag ist ein \"code\"-Attribut erforderlich."},
            {"appletviewer.parse.warning.embed.requiresheight", "Warnung: F\u00FCr <embed>-Tag ist ein \"height\"-Attribut erforderlich."},
            {"appletviewer.parse.warning.embed.requireswidth", "Warnung: F\u00FCr <embed>-Tag ist ein \"width\"-Attribut erforderlich."},
            {"appletviewer.parse.warning.appnotLongersupported", "Warnung: <app>-Tag wird nicht mehr unterst\u00FCtzt. Verwenden Sie stattdessen <applet>:"},
            {"appletviewer.deprecated", "Warnung: Applet-API und AppletViewer sind veraltet."},
            {"appletviewer.usage", "Verwendung: appletviewer <Optionen> url(s)\n\nwobei die <Optionen> Folgendes umfassen:\n  -encoding <Codierung>    Zeichencodierung f\u00FCr HTML-Dateien angeben\n  -J<Laufzeitkennzeichen>        Argument an den Java-Interpreter \u00FCbergeben\n\nDie Option \"-J\" ist nicht standardm\u00E4\u00DFig und kann ohne vorherige Ank\u00FCndigung ge\u00E4ndert werden."},
            {"appletviewer.main.err.unsupportedopt", "Nicht unterst\u00FCtzte Option: {0}"},
            {"appletviewer.main.err.unrecognizedarg", "Unbekanntes Argument: {0}"},
            {"appletviewer.main.err.dupoption", "Doppelte Verwendung von Option: {0}"},
            {"appletviewer.main.err.inputfile", "Keine Eingabedateien angegeben."},
            {"appletviewer.main.err.badurl", "Ung\u00FCltige URL: {0} ( {1} )"},
            {"appletviewer.main.err.io", "I/O-Ausnahme beim Lesen von: {0}"},
            {"appletviewer.main.err.readablefile", "Stellen Sie sicher, dass {0} eine lesbare Datei ist."},
            {"appletviewer.main.err.correcturl", "Ist {0} die richtige URL?"},
            {"appletviewer.main.prop.store", "Benutzerspezifische Eigenschaften f\u00FCr AppletViewer"},
            {"appletviewer.main.err.prop.cantread", "Benutzereigenschaftendatei kann nicht gelesen werden: {0}"},
            {"appletviewer.main.err.prop.cantsave", "Benutzereigenschaftendatei kann nicht gespeichert werden: {0}"},
            {"appletviewer.main.warn.nosecmgr", "Warnung: Sicherheit wird deaktiviert."},
            {"appletviewer.main.debug.cantfinddebug", "Debugger kann nicht gefunden werden."},
            {"appletviewer.main.debug.cantfindmain", "Hauptmethode im Debugger kann nicht gefunden werden."},
            {"appletviewer.main.debug.exceptionindebug", "Ausnahme im Debugger."},
            {"appletviewer.main.debug.cantaccess", "Zugriff auf Debugger nicht m\u00F6glich."},
            {"appletviewer.main.nosecmgr", "Warnung: SecurityManager nicht installiert."},
            {"appletviewer.main.warning", "Warnung: Es wurden keine Applets gestartet. Stellen Sie sicher, dass die Eingabe ein <applet>-Tag enth\u00E4lt."},
            {"appletviewer.main.warn.prop.overwrite", "Warnung: Systemeigenschaft wird tempor\u00E4r aufgrund von Benutzeranforderung \u00FCberschrieben: Schl\u00FCssel: {0} Alter Wert: {1} Neuer Wert: {2}"},
            {"appletviewer.main.warn.cantreadprops", "Warnung: AppletViewer-Eigenschaftendatei kann nicht gelesen werden: {0} Standardwerte werden verwendet."},
            {"appletioexception.loadclass.throw.interrupted", "Laden der Klasse unterbrochen: {0}"},
            {"appletioexception.loadclass.throw.notloaded", "Klasse nicht geladen: {0}"},
            {"appletclassloader.loadcode.verbose", "\u00D6ffnen von Stream zu: {0}, um {1} abzurufen"},
            {"appletclassloader.filenotfound", "Datei nicht gefunden beim Suchen nach: {0}"},
            {"appletclassloader.fileformat", "Dateiformatausnahme beim Laden von: {0}"},
            {"appletclassloader.fileioexception", "I/O-Ausnahme beim Laden von: {0}"},
            {"appletclassloader.fileexception", "{0}-Ausnahme beim Laden von: {1}"},
            {"appletclassloader.filedeath", "{0} abgebrochen beim Laden von: {1}"},
            {"appletclassloader.fileerror", "{0}-Fehler beim Laden von: {1}"},
            {"appletclassloader.findclass.verbose.openstream", "\u00D6ffnen von Stream zu: {0}, um {1} abzurufen"},
            {"appletclassloader.getresource.verbose.forname", "AppletClassLoader.getResource f\u00FCr Name: {0}"},
            {"appletclassloader.getresource.verbose.found", "Ressource {0} als Systemressource gefunden"},
            {"appletclassloader.getresourceasstream.verbose", "Ressource {0} als Systemressource gefunden"},
            {"appletpanel.runloader.err", "Objekt oder Codeparameter."},
            {"appletpanel.runloader.exception", "Ausnahme beim Deserialisieren von {0}"},
            {"appletpanel.destroyed", "Applet zerst\u00F6rt."},
            {"appletpanel.loaded", "Applet geladen."},
            {"appletpanel.started", "Applet gestartet."},
            {"appletpanel.inited", "Applet initialisiert."},
            {"appletpanel.stopped", "Applet gestoppt."},
            {"appletpanel.disposed", "Applet verworfen."},
            {"appletpanel.nocode", "Bei APPLET-Tag fehlt CODE-Parameter."},
            {"appletpanel.notfound", "Laden: Klasse {0} nicht gefunden."},
            {"appletpanel.nocreate", "Laden: {0} kann nicht instanziiert werden."},
            {"appletpanel.noconstruct", "Laden: {0} ist nicht \"public\" oder hat keinen \"public\"-Constructor."},
            {"appletpanel.death", "abgebrochen"},
            {"appletpanel.exception", "Ausnahme: {0}."},
            {"appletpanel.exception2", "Ausnahme: {0}: {1}."},
            {"appletpanel.error", "Fehler: {0}."},
            {"appletpanel.error2", "Fehler: {0}: {1}."},
            {"appletpanel.notloaded", "Init.: Applet nicht geladen."},
            {"appletpanel.notinited", "Starten: Applet nicht initialisiert."},
            {"appletpanel.notstarted", "Stoppen: Applet nicht gestartet."},
            {"appletpanel.notstopped", "Zerst\u00F6ren: Applet nicht gestoppt."},
            {"appletpanel.notdestroyed", "Verwerfen: Applet nicht zerst\u00F6rt."},
            {"appletpanel.notdisposed", "Laden: Applet nicht verworfen."},
            {"appletpanel.bail", "Unterbrochen: Zur\u00FCckziehen."},
            {"appletpanel.filenotfound", "Datei nicht gefunden beim Suchen nach: {0}"},
            {"appletpanel.fileformat", "Dateiformatausnahme beim Laden von: {0}"},
            {"appletpanel.fileioexception", "I/O-Ausnahme beim Laden von: {0}"},
            {"appletpanel.fileexception", "{0}-Ausnahme beim Laden von: {1}"},
            {"appletpanel.filedeath", "{0} abgebrochen beim Laden von: {1}"},
            {"appletpanel.fileerror", "{0}-Fehler beim Laden von: {1}"},
            {"appletpanel.badattribute.exception", "HTML-Parsing: Falscher Wert f\u00FCr \"width/height\"-Attribut"},
            {"appletillegalargumentexception.objectinputstream", "AppletObjectInputStream erfordert Loader ungleich null"},
            {"appletprops.title", "AppletViewer-Eigenschaften"},
            {"appletprops.label.http.server", "HTTP-Proxyserver:"},
            {"appletprops.label.http.proxy", "HTTP-Proxyport:"},
            {"appletprops.label.network", "Netzwerkzugriff:"},
            {"appletprops.choice.network.item.none", "Keine"},
            {"appletprops.choice.network.item.applethost", "Applet-Host"},
            {"appletprops.choice.network.item.unrestricted", "Uneingeschr\u00E4nkt"},
            {"appletprops.label.class", "Klassenzugriff:"},
            {"appletprops.choice.class.item.restricted", "Eingeschr\u00E4nkt"},
            {"appletprops.choice.class.item.unrestricted", "Uneingeschr\u00E4nkt"},
            {"appletprops.label.unsignedapplet", "Nicht signierte Applets zulassen:"},
            {"appletprops.choice.unsignedapplet.no", "Nein"},
            {"appletprops.choice.unsignedapplet.yes", "Ja"},
            {"appletprops.button.apply", "Anwenden"},
            {"appletprops.button.cancel", "Abbrechen"},
            {"appletprops.button.reset", "Zur\u00FCcksetzen"},
            {"appletprops.apply.exception", "Eigenschaften konnten nicht gespeichert werden: {0}"},
            /* 4066432 */
            {"appletprops.title.invalidproxy", "Ung\u00FCltiger Eintrag"},
            {"appletprops.label.invalidproxy", "Proxyport muss ein positiver Ganzzahlwert sein."},
            {"appletprops.button.ok", "OK"},
            /* end 4066432 */
            {"appletprops.prop.store", "Benutzerspezifische Eigenschaften f\u00FCr AppletViewer"},
            {"appletsecurityexception.checkcreateclassloader", "Sicherheitsausnahme: Class Loader"},
            {"appletsecurityexception.checkaccess.thread", "Sicherheitsausnahme: Thread"},
            {"appletsecurityexception.checkaccess.threadgroup", "Sicherheitsausnahme: Threadgruppe: {0}"},
            {"appletsecurityexception.checkexit", "Sicherheitsausnahme: Beenden: {0}"},
            {"appletsecurityexception.checkexec", "Sicherheitsausnahme: Ausf\u00FChrung: {0}"},
            {"appletsecurityexception.checklink", "Sicherheitsausnahme: Link: {0}"},
            {"appletsecurityexception.checkpropsaccess", "Sicherheitsausnahme: Eigenschaften"},
            {"appletsecurityexception.checkpropsaccess.key", "Sicherheitsausnahme: Eigenschaftszugriff {0}"},
            {"appletsecurityexception.checkread.exception1", "Sicherheitsausnahme: {0}, {1}"},
            {"appletsecurityexception.checkread.exception2", "Sicherheitsausnahme: file.read: {0}"},
            {"appletsecurityexception.checkread", "Sicherheitsausnahme: file.read: {0} == {1}"},
            {"appletsecurityexception.checkwrite.exception", "Sicherheitsausnahme: {0}, {1}"},
            {"appletsecurityexception.checkwrite", "Sicherheitsausnahme: file.write: {0} == {1}"},
            {"appletsecurityexception.checkread.fd", "Sicherheitsausnahme: fd.read"},
            {"appletsecurityexception.checkwrite.fd", "Sicherheitsausnahme: fd.write"},
            {"appletsecurityexception.checklisten", "Sicherheitsausnahme: socket.listen: {0}"},
            {"appletsecurityexception.checkaccept", "Sicherheitsausnahme: socket.accept: {0}:{1}"},
            {"appletsecurityexception.checkconnect.networknone", "Sicherheitsausnahme: socket.connect: {0}->{1}"},
            {"appletsecurityexception.checkconnect.networkhost1", "Sicherheitsausnahme: Verbindung mit {0} mit Ursprung aus {1} konnte nicht hergestellt werden."},
            {"appletsecurityexception.checkconnect.networkhost2", "Sicherheitsausnahme: IP f\u00FCr Host {0} oder f\u00FCr {1} konnte nicht aufgel\u00F6st werden. "},
            {"appletsecurityexception.checkconnect.networkhost3", "Sicherheitsausnahme: IP f\u00FCr Host {0} konnte nicht aufgel\u00F6st werden. Siehe trustProxy-Eigenschaft."},
            {"appletsecurityexception.checkconnect", "Sicherheitsausnahme: Verbinden: {0}->{1}"},
            {"appletsecurityexception.checkpackageaccess", "Sicherheitsausnahme: Zugriff auf Package nicht m\u00F6glich: {0}"},
            {"appletsecurityexception.checkpackagedefinition", "Sicherheitsausnahme: Package kann nicht definiert werden: {0}"},
            {"appletsecurityexception.cannotsetfactory", "Sicherheitsausnahme: Factory kann nicht festgelegt werden"},
            {"appletsecurityexception.checkmemberaccess", "Sicherheitsausnahme: Mitgliedszugriff pr\u00FCfen"},
            {"appletsecurityexception.checkgetprintjob", "Sicherheitsausnahme: getPrintJob"},
            {"appletsecurityexception.checksystemclipboardaccess", "Sicherheitsausnahme: getSystemClipboard"},
            {"appletsecurityexception.checkawteventqueueaccess", "Sicherheitsausnahme: getEventQueue"},
            {"appletsecurityexception.checksecurityaccess", "Sicherheitsausnahme: Sicherheitsvorgang: {0}"},
            {"appletsecurityexception.getsecuritycontext.unknown", "Unbekannter Class Loader-Typ. Pr\u00FCfen auf getContext nicht m\u00F6glich"},
            {"appletsecurityexception.checkread.unknown", "Unbekannter Class Loader-Typ. Pr\u00FCfen auf checkRead {0} nicht m\u00F6glich"},
            {"appletsecurityexception.checkconnect.unknown", "Unbekannter Class Loader-Typ. Pr\u00FCfen auf checkConnect nicht m\u00F6glich"},
        };

        return temp;
    }
}