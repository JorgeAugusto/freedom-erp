EXEDIR=${0%/*}
CMDENV="${EXEDIR}/freedomenv.sh"
FREEDOM_HOME=${EXEDIR}
FREEDOMMD="freedomcrm"
FREEDOMCL="org.freedom.modulos.crm.FreedomCRM"
CMDFREEDOM=`$CMDENV $FREEDOMMD $FREEDOMCL`
$CMDFREEDOM
