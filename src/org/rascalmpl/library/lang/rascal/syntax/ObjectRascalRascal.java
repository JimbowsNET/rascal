package org.rascalmpl.library.lang.rascal.syntax;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.eclipse.imp.pdb.facts.type.TypeFactory;
import org.eclipse.imp.pdb.facts.IConstructor;
import org.eclipse.imp.pdb.facts.IValue;
import org.eclipse.imp.pdb.facts.IValueFactory;
import org.eclipse.imp.pdb.facts.exceptions.FactTypeUseException;
import org.eclipse.imp.pdb.facts.io.StandardTextReader;
import org.rascalmpl.parser.gtd.stack.*;
import org.rascalmpl.parser.gtd.stack.filter.*;
import org.rascalmpl.parser.gtd.stack.filter.follow.*;
import org.rascalmpl.parser.gtd.stack.filter.match.*;
import org.rascalmpl.parser.gtd.stack.filter.precede.*;
import org.rascalmpl.parser.gtd.preprocessing.ExpectBuilder;
import org.rascalmpl.parser.gtd.util.IntegerKeyedHashMap;
import org.rascalmpl.parser.gtd.util.IntegerList;
import org.rascalmpl.parser.gtd.util.IntegerMap;
import org.rascalmpl.values.ValueFactoryFactory;
import org.rascalmpl.values.uptr.Factory;

public class ObjectRascalRascal extends org.rascalmpl.library.lang.rascal.syntax.RascalRascal {
  protected final static IValueFactory VF = ValueFactoryFactory.getValueFactory();
  
  private static final IntegerMap _resultStoreIdMappings;
  private static final IntegerKeyedHashMap<IntegerList> _dontNest;
	
  protected static void _putDontNest(IntegerKeyedHashMap<IntegerList> result, int parentId, int childId) {
    IntegerList donts = result.get(childId);
    if (donts == null) {
      donts = new IntegerList();
      result.put(childId, donts);
    }
    donts.add(parentId);
  }
    
  protected int getResultStoreId(int parentId) {
    return _resultStoreIdMappings.get(parentId);
  }
    
  protected static IntegerKeyedHashMap<IntegerList> _initDontNest() {
    IntegerKeyedHashMap<IntegerList> result = org.rascalmpl.library.lang.rascal.syntax.RascalRascal._initDontNest(); 
    
    
    
    
    _putDontNest(result, 1354, 1364);
    
    _putDontNest(result, 1356, 1354);
    
    _putDontNest(result, 1404, 1434);
    
    _putDontNest(result, 5470, 5480);
    
    _putDontNest(result, 1344, 1374);
    
    _putDontNest(result, 1414, 1424);
    
    _putDontNest(result, 1296, 1294);
    
    _putDontNest(result, 5460, 5490);
    
    _putDontNest(result, 1266, 1304);
    
    _putDontNest(result, 1204, 1444);
    
    _putDontNest(result, 1314, 1324);
    
    _putDontNest(result, 1416, 1414);
    
    _putDontNest(result, 434, 432);
    
    _putDontNest(result, 1316, 1314);
    
    _putDontNest(result, 1336, 1334);
    
    _putDontNest(result, 1394, 1404);
    
    _putDontNest(result, 690, 1462);
    
    _putDontNest(result, 842, 1344);
    
    _putDontNest(result, 948, 1462);
    
    _putDontNest(result, 894, 1404);
    
    _putDontNest(result, 1206, 1462);
    
    _putDontNest(result, 1434, 1444);
    
    _putDontNest(result, 1416, 1462);
    
    _putDontNest(result, 1346, 1404);
    
    _putDontNest(result, 1150, 1274);
    
    _putDontNest(result, 4784, 5046);
    
    _putDontNest(result, 690, 1414);
    
    _putDontNest(result, 852, 1254);
    
    _putDontNest(result, 842, 1264);
    
    _putDontNest(result, 948, 1414);
    
    _putDontNest(result, 1234, 1304);
    
    _putDontNest(result, 876, 1374);
    
    _putDontNest(result, 1206, 1414);
    
    _putDontNest(result, 1134, 1374);
    
    _putDontNest(result, 1172, 1444);
    
    _putDontNest(result, 1144, 1344);
    
    _putDontNest(result, 248, 452);
    
    _putDontNest(result, 1304, 1334);
    
    _putDontNest(result, 424, 442);
    
    _putDontNest(result, 1284, 1314);
    
    _putDontNest(result, 1356, 1434);
    
    _putDontNest(result, 1374, 1384);
    
    _putDontNest(result, 1364, 1394);
    
    _putDontNest(result, 1134, 1274);
    
    _putDontNest(result, 4774, 5052);
    
    _putDontNest(result, 894, 1244);
    
    _putDontNest(result, 886, 1364);
    
    _putDontNest(result, 1034, 1314);
    
    _putDontNest(result, 1150, 1374);
    
    _putDontNest(result, 1314, 1404);
    
    _putDontNest(result, 1326, 1384);
    
    _putDontNest(result, 1316, 1394);
    
    _putDontNest(result, 1134, 1194);
    
    _putDontNest(result, 5904, 6000);
    
    _putDontNest(result, 876, 1214);
    
    _putDontNest(result, 770, 1224);
    
    _putDontNest(result, 894, 1324);
    
    _putDontNest(result, 1224, 1424);
    
    _putDontNest(result, 1254, 1462);
    
    _putDontNest(result, 1286, 1344);
    
    _putDontNest(result, 1296, 1374);
    
    _putDontNest(result, 1324, 1434);
    
    _putDontNest(result, 1306, 1364);
    
    _putDontNest(result, 1144, 1204);
    
    _putDontNest(result, 1150, 1194);
    
    _putDontNest(result, 4800, 5046);
    
    _putDontNest(result, 886, 1204);
    
    _putDontNest(result, 1294, 1384);
    
    _putDontNest(result, 1334, 1344);
    
    _putDontNest(result, 1284, 1394);
    
    _putDontNest(result, 1324, 1354);
    
    _putDontNest(result, 904, 1138);
    
    _putDontNest(result, 894, 1164);
    
    _putDontNest(result, 1170, 1304);
    
    _putDontNest(result, 770, 1384);
    
    _putDontNest(result, 886, 1284);
    
    _putDontNest(result, 1256, 1424);
    
    _putDontNest(result, 1236, 1444);
    
    _putDontNest(result, 1034, 1394);
    
    _putDontNest(result, 1150, 1294);
    
    _putDontNest(result, 422, 452);
    
    _putDontNest(result, 1034, 1254);
    
    _putDontNest(result, 894, 1180);
    
    _putDontNest(result, 852, 1334);
    
    _putDontNest(result, 876, 1294);
    
    _putDontNest(result, 1134, 1294);
    
    _putDontNest(result, 1254, 1414);
    
    _putDontNest(result, 1254, 1264);
    
    _putDontNest(result, 1194, 1204);
    
    _putDontNest(result, 1244, 1274);
    
    _putDontNest(result, 1304, 1414);
    
    _putDontNest(result, 1286, 1424);
    
    _putDontNest(result, 5804, 5804);
    
    _putDontNest(result, 852, 1144);
    
    _putDontNest(result, 904, 1180);
    
    _putDontNest(result, 712, 1234);
    
    _putDontNest(result, 1182, 1294);
    
    _putDontNest(result, 1172, 1284);
    
    _putDontNest(result, 1266, 1434);
    
    _putDontNest(result, 1234, 1244);
    
    _putDontNest(result, 1170, 1180);
    
    _putDontNest(result, 1336, 1462);
    
    _putDontNest(result, 5904, 6016);
    
    _putDontNest(result, 904, 1164);
    
    _putDontNest(result, 894, 1138);
    
    _putDontNest(result, 690, 1334);
    
    _putDontNest(result, 948, 1334);
    
    _putDontNest(result, 1276, 1404);
    
    _putDontNest(result, 1236, 1364);
    
    _putDontNest(result, 1246, 1374);
    
    _putDontNest(result, 1196, 1324);
    
    _putDontNest(result, 1234, 1354);
    
    _putDontNest(result, 1206, 1334);
    
    _putDontNest(result, 1194, 1314);
    
    _putDontNest(result, 1274, 1394);
    
    _putDontNest(result, 1224, 1344);
    
    _putDontNest(result, 1264, 1384);
    
    _putDontNest(result, 1164, 1194);
    
    _putDontNest(result, 1336, 1414);
    
    _putDontNest(result, 1306, 1444);
    
    _putDontNest(result, 4656, 5046);
    
    _putDontNest(result, 842, 1150);
    
    _putDontNest(result, 712, 1404);
    
    _putDontNest(result, 1214, 1294);
    
    _putDontNest(result, 1216, 1384);
    
    _putDontNest(result, 1226, 1394);
    
    _putDontNest(result, 1180, 1324);
    
    _putDontNest(result, 1234, 1434);
    
    _putDontNest(result, 1204, 1284);
    
    _putDontNest(result, 1180, 1194);
    
    _putDontNest(result, 1134, 1144);
    
    _putDontNest(result, 1224, 1254);
    
    _putDontNest(result, 1304, 1462);
    
    _putDontNest(result, 1334, 1424);
    
    _putDontNest(result, 904, 1314);
    
    _putDontNest(result, 1256, 1344);
    
    _putDontNest(result, 1266, 1354);
    
    _putDontNest(result, 1164, 1324);
    
    _putDontNest(result, 1244, 1404);
    
    _putDontNest(result, 1180, 1274);
    
    _putDontNest(result, 1384, 1462);
    
    _putDontNest(result, 904, 1244);
    
    _putDontNest(result, 712, 1170);
    
    _putDontNest(result, 886, 1444);
    
    _putDontNest(result, 842, 1424);
    
    _putDontNest(result, 852, 1414);
    
    _putDontNest(result, 1236, 1284);
    
    _putDontNest(result, 1194, 1394);
    
    _putDontNest(result, 1254, 1334);
    
    _putDontNest(result, 1274, 1314);
    
    _putDontNest(result, 1196, 1404);
    
    _putDontNest(result, 1276, 1324);
    
    _putDontNest(result, 1246, 1294);
    
    _putDontNest(result, 1170, 1244);
    
    _putDontNest(result, 1206, 1264);
    
    _putDontNest(result, 1172, 1234);
    
    _putDontNest(result, 1164, 1274);
    
    _putDontNest(result, 328, 442);
    
    _putDontNest(result, 1366, 1424);
    
    _putDontNest(result, 1172, 1364);
    
    _putDontNest(result, 1182, 1374);
    
    _putDontNest(result, 1170, 1354);
    
    _putDontNest(result, 310, 452);
    
    _putDontNest(result, 904, 1394);
    
    _putDontNest(result, 1244, 1324);
    
    _putDontNest(result, 1170, 1434);
    
    _putDontNest(result, 1164, 1404);
    
    _putDontNest(result, 1214, 1224);
    
    _putDontNest(result, 1196, 1274);
    
    _putDontNest(result, 1204, 1234);
    
    _putDontNest(result, 1354, 1444);
    
    _putDontNest(result, 398, 412);
    
    _putDontNest(result, 1384, 1414);
    
    _putDontNest(result, 948, 1224);
    
    _putDontNest(result, 1284, 1304);
    
    _putDontNest(result, 712, 1324);
    
    _putDontNest(result, 690, 1224);
    
    _putDontNest(result, 852, 1462);
    
    _putDontNest(result, 1204, 1364);
    
    _putDontNest(result, 1144, 1424);
    
    _putDontNest(result, 1180, 1404);
    
    _putDontNest(result, 1226, 1314);
    
    _putDontNest(result, 1214, 1374);
    
    _putDontNest(result, 1144, 1254);
    
    _putDontNest(result, 690, 1444);
    
    _putDontNest(result, 876, 1264);
    
    _putDontNest(result, 886, 1434);
    
    _putDontNest(result, 842, 1374);
    
    _putDontNest(result, 1206, 1444);
    
    _putDontNest(result, 1134, 1404);
    
    _putDontNest(result, 1172, 1414);
    
    _putDontNest(result, 1394, 1434);
    
    _putDontNest(result, 1346, 1354);
    
    _putDontNest(result, 1416, 1424);
    
    _putDontNest(result, 442, 422);
    
    _putDontNest(result, 1446, 1462);
    
    _putDontNest(result, 852, 1224);
    
    _putDontNest(result, 894, 1394);
    
    _putDontNest(result, 1150, 1404);
    
    _putDontNest(result, 1144, 1394);
    
    _putDontNest(result, 1204, 1462);
    
    _putDontNest(result, 1404, 1404);
    
    _putDontNest(result, 1294, 1294);
    
    _putDontNest(result, 1374, 1374);
    
    _putDontNest(result, 1414, 1414);
    
    _putDontNest(result, 1334, 1334);
    
    _putDontNest(result, 1364, 1364);
    
    _putDontNest(result, 1284, 1284);
    
    _putDontNest(result, 1444, 1444);
    
    _putDontNest(result, 1324, 1324);
    
    _putDontNest(result, 1134, 1224);
    
    _putDontNest(result, 1034, 1204);
    
    _putDontNest(result, 886, 1274);
    
    _putDontNest(result, 770, 1334);
    
    _putDontNest(result, 1236, 1304);
    
    _putDontNest(result, 712, 1138);
    
    _putDontNest(result, 1194, 1424);
    
    _putDontNest(result, 1204, 1414);
    
    _putDontNest(result, 1354, 1394);
    
    _putDontNest(result, 1306, 1314);
    
    _putDontNest(result, 1286, 1334);
    
    _putDontNest(result, 1344, 1384);
    
    _putDontNest(result, 1414, 1462);
    
    _putDontNest(result, 396, 432);
    
    _putDontNest(result, 1356, 1404);
    
    _putDontNest(result, 1150, 1224);
    
    _putDontNest(result, 894, 1234);
    
    _putDontNest(result, 886, 1354);
    
    _putDontNest(result, 852, 1384);
    
    _putDontNest(result, 876, 1344);
    
    _putDontNest(result, 1172, 1462);
    
    _putDontNest(result, 1346, 1434);
    
    _putDontNest(result, 5896, 6010);
    
    _putDontNest(result, 894, 1314);
    
    _putDontNest(result, 1204, 1304);
    
    _putDontNest(result, 1226, 1424);
    
    _putDontNest(result, 248, 422);
    
    _putDontNest(result, 1144, 1314);
    
    _putDontNest(result, 1236, 1414);
    
    _putDontNest(result, 1150, 1324);
    
    _putDontNest(result, 1284, 1364);
    
    _putDontNest(result, 1304, 1344);
    
    _putDontNest(result, 1294, 1374);
    
    _putDontNest(result, 1324, 1404);
    
    _putDontNest(result, 5896, 5994);
    
    _putDontNest(result, 886, 1194);
    
    _putDontNest(result, 842, 1294);
    
    _putDontNest(result, 1034, 1344);
    
    _putDontNest(result, 1254, 1444);
    
    _putDontNest(result, 1134, 1324);
    
    _putDontNest(result, 254, 432);
    
    _putDontNest(result, 1314, 1434);
    
    _putDontNest(result, 842, 1214);
    
    _putDontNest(result, 948, 1144);
    
    _putDontNest(result, 1172, 1304);
    
    _putDontNest(result, 690, 1144);
    
    _putDontNest(result, 1314, 1354);
    
    _putDontNest(result, 1326, 1374);
    
    _putDontNest(result, 1316, 1364);
    
    _putDontNest(result, 5460, 5460);
    
    _putDontNest(result, 5470, 5470);
    
    _putDontNest(result, 1336, 1344);
    
    _putDontNest(result, 770, 1254);
    
    _putDontNest(result, 894, 1170);
    
    _putDontNest(result, 1274, 1424);
    
    _putDontNest(result, 1236, 1462);
    
    _putDontNest(result, 1306, 1394);
    
    _putDontNest(result, 424, 452);
    
    _putDontNest(result, 1296, 1384);
    
    _putDontNest(result, 5794, 5804);
    
    _putDontNest(result, 4880, 5046);
    
    _putDontNest(result, 876, 1138);
    
    _putDontNest(result, 712, 1374);
    
    _putDontNest(result, 712, 1244);
    
    _putDontNest(result, 1216, 1354);
    
    _putDontNest(result, 1256, 1394);
    
    _putDontNest(result, 1264, 1434);
    
    _putDontNest(result, 1214, 1324);
    
    _putDontNest(result, 1180, 1294);
    
    _putDontNest(result, 1034, 1424);
    
    _putDontNest(result, 1164, 1180);
    
    _putDontNest(result, 1234, 1274);
    
    _putDontNest(result, 1134, 1150);
    
    _putDontNest(result, 4784, 4774);
    
    _putDontNest(result, 948, 1194);
    
    _putDontNest(result, 770, 1414);
    
    _putDontNest(result, 1266, 1384);
    
    _putDontNest(result, 1204, 1334);
    
    _putDontNest(result, 1244, 1374);
    
    _putDontNest(result, 1226, 1344);
    
    _putDontNest(result, 1164, 1294);
    
    _putDontNest(result, 1214, 1214);
    
    _putDontNest(result, 1180, 1180);
    
    _putDontNest(result, 1244, 1244);
    
    _putDontNest(result, 1254, 1254);
    
    _putDontNest(result, 1204, 1204);
    
    _putDontNest(result, 328, 452);
    
    _putDontNest(result, 1304, 1424);
    
    _putDontNest(result, 1316, 1444);
    
    _putDontNest(result, 1286, 1414);
    
    _putDontNest(result, 1334, 1462);
    
    _putDontNest(result, 316, 432);
    
    _putDontNest(result, 886, 1144);
    
    _putDontNest(result, 904, 1214);
    
    _putDontNest(result, 690, 1284);
    
    _putDontNest(result, 770, 1462);
    
    _putDontNest(result, 1182, 1324);
    
    _putDontNest(result, 1224, 1394);
    
    _putDontNest(result, 1254, 1364);
    
    _putDontNest(result, 1206, 1284);
    
    _putDontNest(result, 1274, 1344);
    
    _putDontNest(result, 1224, 1264);
    
    _putDontNest(result, 310, 442);
    
    _putDontNest(result, 1286, 1462);
    
    _putDontNest(result, 1334, 1414);
    
    _putDontNest(result, 904, 1324);
    
    _putDontNest(result, 1276, 1374);
    
    _putDontNest(result, 1246, 1404);
    
    _putDontNest(result, 1196, 1294);
    
    _putDontNest(result, 1234, 1384);
    
    _putDontNest(result, 1172, 1334);
    
    _putDontNest(result, 1264, 1354);
    
    _putDontNest(result, 1216, 1434);
    
    _putDontNest(result, 1172, 1204);
    
    _putDontNest(result, 1170, 1194);
    
    _putDontNest(result, 1284, 1444);
    
    _putDontNest(result, 1336, 1424);
    
    _putDontNest(result, 690, 1254);
    
    _putDontNest(result, 712, 1180);
    
    _putDontNest(result, 1244, 1294);
    
    _putDontNest(result, 1164, 1374);
    
    _putDontNest(result, 1170, 1274);
    
    _putDontNest(result, 1164, 1244);
    
    _putDontNest(result, 1206, 1254);
    
    _putDontNest(result, 432, 412);
    
    _putDontNest(result, 1366, 1414);
    
    _putDontNest(result, 712, 1294);
    
    _putDontNest(result, 712, 1164);
    
    _putDontNest(result, 948, 1384);
    
    _putDontNest(result, 1180, 1374);
    
    _putDontNest(result, 1256, 1314);
    
    _putDontNest(result, 1214, 1404);
    
    _putDontNest(result, 1180, 1244);
    
    _putDontNest(result, 4800, 4774);
    
    _putDontNest(result, 948, 1274);
    
    _putDontNest(result, 904, 1404);
    
    _putDontNest(result, 876, 1424);
    
    _putDontNest(result, 1196, 1374);
    
    _putDontNest(result, 1246, 1324);
    
    _putDontNest(result, 1276, 1294);
    
    _putDontNest(result, 1194, 1234);
    
    _putDontNest(result, 1196, 1244);
    
    _putDontNest(result, 1034, 1138);
    
    _putDontNest(result, 1384, 1424);
    
    _putDontNest(result, 1364, 1444);
    
    _putDontNest(result, 690, 1364);
    
    _putDontNest(result, 1286, 1304);
    
    _putDontNest(result, 1194, 1344);
    
    _putDontNest(result, 1224, 1314);
    
    _putDontNest(result, 1170, 1384);
    
    _putDontNest(result, 1236, 1334);
    
    _putDontNest(result, 1182, 1404);
    
    _putDontNest(result, 1254, 1284);
    
    _putDontNest(result, 770, 1304);
    
    _putDontNest(result, 1206, 1364);
    
    _putDontNest(result, 1234, 1194);
    
    _putDontNest(result, 1366, 1462);
    
    _putDontNest(result, 5980, 6000);
    
    _putDontNest(result, 852, 1274);
    
    _putDontNest(result, 842, 1244);
    
    _putDontNest(result, 876, 1394);
    
    _putDontNest(result, 1170, 1414);
    
    _putDontNest(result, 1164, 1424);
    
    _putDontNest(result, 1134, 1394);
    
    _putDontNest(result, 5436, 5470);
    
    _putDontNest(result, 1316, 1334);
    
    _putDontNest(result, 1344, 1354);
    
    _putDontNest(result, 1444, 1462);
    
    _putDontNest(result, 1384, 1394);
    
    _putDontNest(result, 1336, 1314);
    
    _putDontNest(result, 1356, 1374);
    
    _putDontNest(result, 1034, 1170);
    
    _putDontNest(result, 894, 1264);
    
    _putDontNest(result, 770, 1284);
    
    _putDontNest(result, 886, 1384);
    
    _putDontNest(result, 1254, 1304);
    
    _putDontNest(result, 852, 1354);
    
    _putDontNest(result, 1034, 1294);
    
    _putDontNest(result, 1180, 1424);
    
    _putDontNest(result, 1150, 1394);
    
    _putDontNest(result, 1144, 1404);
    
    _putDontNest(result, 1394, 1384);
    
    _putDontNest(result, 1326, 1324);
    
    _putDontNest(result, 1144, 1264);
    
    _putDontNest(result, 5044, 5052);
    
    _putDontNest(result, 876, 1234);
    
    _putDontNest(result, 770, 1204);
    
    _putDontNest(result, 852, 1434);
    
    _putDontNest(result, 894, 1344);
    
    _putDontNest(result, 842, 1404);
    
    _putDontNest(result, 1196, 1424);
    
    _putDontNest(result, 1284, 1334);
    
    _putDontNest(result, 398, 432);
    
    _putDontNest(result, 1346, 1384);
    
    _putDontNest(result, 1304, 1314);
    
    _putDontNest(result, 886, 1224);
    
    _putDontNest(result, 1170, 1462);
    
    _putDontNest(result, 1294, 1324);
    
    _putDontNest(result, 1344, 1434);
    
    _putDontNest(result, 1414, 1444);
    
    _putDontNest(result, 1374, 1404);
    
    _putDontNest(result, 842, 1180);
    
    _putDontNest(result, 770, 1364);
    
    _putDontNest(result, 1206, 1304);
    
    _putDontNest(result, 254, 422);
    
    _putDontNest(result, 1150, 1314);
    
    _putDontNest(result, 948, 1304);
    
    _putDontNest(result, 1034, 1374);
    
    _putDontNest(result, 1264, 1444);
    
    _putDontNest(result, 1234, 1414);
    
    _putDontNest(result, 1144, 1324);
    
    _putDontNest(result, 1326, 1404);
    
    _putDontNest(result, 1314, 1384);
    
    _putDontNest(result, 1306, 1344);
    
    _putDontNest(result, 690, 1304);
    
    _putDontNest(result, 1286, 1364);
    
    _putDontNest(result, 1034, 1234);
    
    _putDontNest(result, 1134, 1214);
    
    _putDontNest(result, 842, 1164);
    
    _putDontNest(result, 876, 1314);
    
    _putDontNest(result, 248, 432);
    
    _putDontNest(result, 1134, 1314);
    
    _putDontNest(result, 1266, 1462);
    
    _putDontNest(result, 1244, 1424);
    
    _putDontNest(result, 1296, 1354);
    
    _putDontNest(result, 1336, 1394);
    
    _putDontNest(result, 1150, 1214);
    
    _putDontNest(result, 876, 1170);
    
    _putDontNest(result, 904, 1150);
    
    _putDontNest(result, 1266, 1414);
    
    _putDontNest(result, 1324, 1374);
    
    _putDontNest(result, 442, 452);
    
    _putDontNest(result, 1294, 1404);
    
    _putDontNest(result, 1296, 1434);
    
    _putDontNest(result, 852, 1194);
    
    _putDontNest(result, 842, 1324);
    
    _putDontNest(result, 1216, 1444);
    
    _putDontNest(result, 1234, 1462);
    
    _putDontNest(result, 1276, 1424);
    
    _putDontNest(result, 1284, 1254);
    
    _putDontNest(result, 1334, 1364);
    
    _putDontNest(result, 1304, 1394);
    
    _putDontNest(result, 5452, 5470);
    
    _putDontNest(result, 5794, 5794);
    
    _putDontNest(result, 4800, 4800);
    
    _putDontNest(result, 690, 1314);
    
    _putDontNest(result, 1226, 1374);
    
    _putDontNest(result, 1256, 1404);
    
    _putDontNest(result, 1244, 1344);
    
    _putDontNest(result, 1216, 1364);
    
    _putDontNest(result, 1214, 1314);
    
    _putDontNest(result, 1224, 1234);
    
    _putDontNest(result, 1334, 1444);
    
    _putDontNest(result, 1316, 1462);
    
    _putDontNest(result, 886, 1150);
    
    _putDontNest(result, 690, 1204);
    
    _putDontNest(result, 904, 1294);
    
    _putDontNest(result, 1254, 1434);
    
    _putDontNest(result, 1274, 1264);
    
    _putDontNest(result, 1234, 1224);
    
    _putDontNest(result, 1216, 1274);
    
    _putDontNest(result, 1284, 1414);
    
    _putDontNest(result, 1306, 1424);
    
    _putDontNest(result, 4784, 4784);
    
    _putDontNest(result, 948, 1164);
    
    _putDontNest(result, 712, 1384);
    
    _putDontNest(result, 1276, 1344);
    
    _putDontNest(result, 852, 1304);
    
    _putDontNest(result, 1224, 1404);
    
    _putDontNest(result, 1254, 1354);
    
    _putDontNest(result, 1182, 1314);
    
    _putDontNest(result, 1264, 1274);
    
    _putDontNest(result, 1164, 1214);
    
    _putDontNest(result, 1226, 1264);
    
    _putDontNest(result, 1236, 1254);
    
    _putDontNest(result, 1284, 1462);
    
    _putDontNest(result, 948, 1180);
    
    _putDontNest(result, 770, 1444);
    
    _putDontNest(result, 1194, 1294);
    
    _putDontNest(result, 1246, 1394);
    
    _putDontNest(result, 1236, 1384);
    
    _putDontNest(result, 1274, 1374);
    
    _putDontNest(result, 1170, 1334);
    
    _putDontNest(result, 1264, 1364);
    
    _putDontNest(result, 1180, 1214);
    
    _putDontNest(result, 1286, 1444);
    
    _putDontNest(result, 1316, 1414);
    
    _putDontNest(result, 904, 1224);
    
    _putDontNest(result, 948, 1434);
    
    _putDontNest(result, 904, 1374);
    
    _putDontNest(result, 1180, 1344);
    
    _putDontNest(result, 1206, 1434);
    
    _putDontNest(result, 1194, 1264);
    
    _putDontNest(result, 1204, 1254);
    
    _putDontNest(result, 1364, 1414);
    
    _putDontNest(result, 1354, 1424);
    
    _putDontNest(result, 4800, 4784);
    
    _putDontNest(result, 5980, 6016);
    
    _putDontNest(result, 690, 1394);
    
    _putDontNest(result, 1204, 1384);
    
    _putDontNest(result, 1164, 1344);
    
    _putDontNest(result, 1226, 1294);
    
    _putDontNest(result, 1266, 1334);
    
    _putDontNest(result, 1214, 1394);
    
    _putDontNest(result, 1256, 1324);
    
    _putDontNest(result, 1216, 1284);
    
    _putDontNest(result, 1170, 1224);
    
    _putDontNest(result, 1182, 1244);
    
    _putDontNest(result, 770, 1138);
    
    _putDontNest(result, 1304, 1304);
    
    _putDontNest(result, 712, 1214);
    
    _putDontNest(result, 1246, 1314);
    
    _putDontNest(result, 1194, 1374);
    
    _putDontNest(result, 1264, 1284);
    
    _putDontNest(result, 1274, 1294);
    
    _putDontNest(result, 1172, 1254);
    
    _putDontNest(result, 1424, 1434);
    
    _putDontNest(result, 1366, 1444);
    
    _putDontNest(result, 4784, 4800);
    
    _putDontNest(result, 948, 1244);
    
    _putDontNest(result, 894, 1424);
    
    _putDontNest(result, 948, 1354);
    
    _putDontNest(result, 1172, 1384);
    
    _putDontNest(result, 1224, 1324);
    
    _putDontNest(result, 1234, 1334);
    
    _putDontNest(result, 1206, 1354);
    
    _putDontNest(result, 1196, 1344);
    
    _putDontNest(result, 1182, 1394);
    
    _putDontNest(result, 1214, 1244);
    
    _putDontNest(result, 328, 422);
    
    _putDontNest(result, 1364, 1462);
    
    _putDontNest(result, 5980, 5994);
    
    _putDontNest(result, 894, 1254);
    
    _putDontNest(result, 770, 1170);
    
    _putDontNest(result, 842, 1354);
    
    _putDontNest(result, 1384, 1404);
    
    _putDontNest(result, 1336, 1324);
    
    _putDontNest(result, 1314, 1334);
    
    _putDontNest(result, 1354, 1374);
    
    _putDontNest(result, 5460, 5480);
    
    _putDontNest(result, 5470, 5490);
    
    _putDontNest(result, 1344, 1364);
    
    _putDontNest(result, 424, 432);
    
    _putDontNest(result, 5980, 6010);
    
    _putDontNest(result, 842, 1274);
    
    _putDontNest(result, 852, 1244);
    
    _putDontNest(result, 1256, 1304);
    
    _putDontNest(result, 1182, 1424);
    
    _putDontNest(result, 1326, 1314);
    
    _putDontNest(result, 4784, 5052);
    
    _putDontNest(result, 5044, 5046);
    
    _putDontNest(result, 876, 1364);
    
    _putDontNest(result, 712, 1150);
    
    _putDontNest(result, 254, 452);
    
    _putDontNest(result, 1150, 1344);
    
    _putDontNest(result, 1170, 1444);
    
    _putDontNest(result, 1304, 1324);
    
    _putDontNest(result, 1366, 1434);
    
    _putDontNest(result, 434, 442);
    
    _putDontNest(result, 1424, 1444);
    
    _putDontNest(result, 1134, 1244);
    
    _putDontNest(result, 4774, 5046);
    
    _putDontNest(result, 690, 1424);
    
    _putDontNest(result, 1224, 1304);
    
    _putDontNest(result, 886, 1374);
    
    _putDontNest(result, 770, 1314);
    
    _putDontNest(result, 842, 1434);
    
    _putDontNest(result, 852, 1404);
    
    _putDontNest(result, 1214, 1424);
    
    _putDontNest(result, 1034, 1324);
    
    _putDontNest(result, 1144, 1374);
    
    _putDontNest(result, 1134, 1344);
    
    _putDontNest(result, 1374, 1394);
    
    _putDontNest(result, 1364, 1384);
    
    _putDontNest(result, 1426, 1462);
    
    _putDontNest(result, 1294, 1314);
    
    _putDontNest(result, 398, 422);
    
    _putDontNest(result, 1144, 1234);
    
    _putDontNest(result, 1150, 1244);
    
    _putDontNest(result, 852, 1164);
    
    _putDontNest(result, 770, 1234);
    
    _putDontNest(result, 876, 1204);
    
    _putDontNest(result, 1266, 1444);
    
    _putDontNest(result, 412, 452);
    
    _putDontNest(result, 1316, 1384);
    
    _putDontNest(result, 1326, 1394);
    
    _putDontNest(result, 1286, 1354);
    
    _putDontNest(result, 1334, 1434);
    
    _putDontNest(result, 4800, 5052);
    
    _putDontNest(result, 904, 1144);
    
    _putDontNest(result, 852, 1180);
    
    _putDontNest(result, 886, 1214);
    
    _putDontNest(result, 894, 1334);
    
    _putDontNest(result, 1216, 1414);
    
    _putDontNest(result, 1264, 1462);
    
    _putDontNest(result, 1246, 1424);
    
    _putDontNest(result, 396, 452);
    
    _putDontNest(result, 1336, 1404);
    
    _putDontNest(result, 1306, 1374);
    
    _putDontNest(result, 1296, 1364);
    
    _putDontNest(result, 842, 1194);
    
    _putDontNest(result, 886, 1294);
    
    _putDontNest(result, 770, 1394);
    
    _putDontNest(result, 852, 1324);
    
    _putDontNest(result, 1216, 1462);
    
    _putDontNest(result, 1264, 1414);
    
    _putDontNest(result, 1144, 1294);
    
    _putDontNest(result, 1234, 1444);
    
    _putDontNest(result, 1034, 1404);
    
    _putDontNest(result, 1284, 1384);
    
    _putDontNest(result, 1294, 1394);
    
    _putDontNest(result, 1134, 1180);
    
    _putDontNest(result, 1034, 1264);
    
    _putDontNest(result, 876, 1284);
    
    _putDontNest(result, 1304, 1404);
    
    _putDontNest(result, 1324, 1344);
    
    _putDontNest(result, 1334, 1354);
    
    _putDontNest(result, 1286, 1434);
    
    _putDontNest(result, 1150, 1180);
    
    _putDontNest(result, 1134, 1164);
    
    _putDontNest(result, 712, 1354);
    
    _putDontNest(result, 712, 1224);
    
    _putDontNest(result, 948, 1324);
    
    _putDontNest(result, 1144, 1304);
    
    _putDontNest(result, 1246, 1344);
    
    _putDontNest(result, 1254, 1384);
    
    _putDontNest(result, 886, 1304);
    
    _putDontNest(result, 1224, 1374);
    
    _putDontNest(result, 1170, 1284);
    
    _putDontNest(result, 1224, 1244);
    
    _putDontNest(result, 1194, 1214);
    
    _putDontNest(result, 1314, 1462);
    
    _putDontNest(result, 5904, 6030);
    
    _putDontNest(result, 948, 1214);
    
    _putDontNest(result, 842, 1144);
    
    _putDontNest(result, 1274, 1404);
    
    _putDontNest(result, 1234, 1364);
    
    _putDontNest(result, 1236, 1354);
    
    _putDontNest(result, 1276, 1394);
    
    _putDontNest(result, 1194, 1324);
    
    _putDontNest(result, 1196, 1314);
    
    _putDontNest(result, 4656, 5052);
    
    _putDontNest(result, 904, 1194);
    
    _putDontNest(result, 1226, 1404);
    
    _putDontNest(result, 1180, 1314);
    
    _putDontNest(result, 1236, 1434);
    
    _putDontNest(result, 1256, 1374);
    
    _putDontNest(result, 1234, 1254);
    
    _putDontNest(result, 1324, 1424);
    
    _putDontNest(result, 1296, 1444);
    
    _putDontNest(result, 4774, 4784);
    
    _putDontNest(result, 852, 1150);
    
    _putDontNest(result, 712, 1434);
    
    _putDontNest(result, 690, 1170);
    
    _putDontNest(result, 1266, 1364);
    
    _putDontNest(result, 1244, 1394);
    
    _putDontNest(result, 1164, 1314);
    
    _putDontNest(result, 1244, 1264);
    
    _putDontNest(result, 1254, 1274);
    
    _putDontNest(result, 1314, 1414);
    
    _putDontNest(result, 1234, 1284);
    
    _putDontNest(result, 1274, 1324);
    
    _putDontNest(result, 1204, 1434);
    
    _putDontNest(result, 1196, 1394);
    
    _putDontNest(result, 1276, 1314);
    
    _putDontNest(result, 1182, 1344);
    
    _putDontNest(result, 1194, 1404);
    
    _putDontNest(result, 1196, 1264);
    
    _putDontNest(result, 1356, 1424);
    
    _putDontNest(result, 904, 1274);
    
    _putDontNest(result, 948, 1404);
    
    _putDontNest(result, 894, 1462);
    
    _putDontNest(result, 876, 1444);
    
    _putDontNest(result, 1264, 1334);
    
    _putDontNest(result, 1170, 1364);
    
    _putDontNest(result, 1172, 1354);
    
    _putDontNest(result, 1224, 1294);
    
    _putDontNest(result, 1206, 1384);
    
    _putDontNest(result, 1172, 1224);
    
    _putDontNest(result, 1346, 1414);
    
    _putDontNest(result, 1394, 1462);
    
    _putDontNest(result, 4774, 4800);
    
    _putDontNest(result, 690, 1344);
    
    _putDontNest(result, 904, 1384);
    
    _putDontNest(result, 894, 1414);
    
    _putDontNest(result, 1172, 1434);
    
    _putDontNest(result, 1134, 1424);
    
    _putDontNest(result, 1244, 1314);
    
    _putDontNest(result, 1216, 1334);
    
    _putDontNest(result, 1214, 1344);
    
    _putDontNest(result, 1164, 1394);
    
    _putDontNest(result, 1206, 1274);
    
    _putDontNest(result, 1034, 1150);
    
    _putDontNest(result, 1164, 1264);
    
    _putDontNest(result, 1170, 1254);
    
    _putDontNest(result, 1394, 1414);
    
    _putDontNest(result, 1346, 1462);
    
    _putDontNest(result, 316, 452);
    
    _putDontNest(result, 328, 432);
    
    _putDontNest(result, 690, 1234);
    
    _putDontNest(result, 1256, 1294);
    
    _putDontNest(result, 1226, 1324);
    
    _putDontNest(result, 1180, 1394);
    
    _putDontNest(result, 1204, 1354);
    
    _putDontNest(result, 1150, 1424);
    
    _putDontNest(result, 1204, 1224);
    
    _putDontNest(result, 1180, 1264);
    
    _putDontNest(result, 1214, 1234);
    
    _putDontNest(result, 1414, 1434);
    
    _putDontNest(result, 1404, 1424);
    
    _putDontNest(result, 1344, 1444);
    
    _putDontNest(result, 842, 1224);
    
    _putDontNest(result, 1274, 1304);
    
    _putDontNest(result, 1182, 1414);
    
    _putDontNest(result, 5462, 5480);
    
    _putDontNest(result, 1424, 1414);
    
    _putDontNest(result, 1304, 1294);
    
    _putDontNest(result, 1346, 1364);
    
    _putDontNest(result, 876, 1254);
    
    _putDontNest(result, 852, 1374);
    
    _putDontNest(result, 886, 1404);
    
    _putDontNest(result, 712, 1144);
    
    _putDontNest(result, 1196, 1444);
    
    _putDontNest(result, 1214, 1462);
    
    _putDontNest(result, 1144, 1384);
    
    _putDontNest(result, 1404, 1394);
    
    _putDontNest(result, 5452, 5490);
    
    _putDontNest(result, 1324, 1314);
    
    _putDontNest(result, 1364, 1354);
    
    _putDontNest(result, 842, 1384);
    
    _putDontNest(result, 1180, 1444);
    
    _putDontNest(result, 1214, 1414);
    
    _putDontNest(result, 1356, 1394);
    
    _putDontNest(result, 412, 422);
    
    _putDontNest(result, 1364, 1434);
    
    _putDontNest(result, 1354, 1404);
    
    _putDontNest(result, 1306, 1324);
    
    _putDontNest(result, 1426, 1444);
    
    _putDontNest(result, 1134, 1234);
    
    _putDontNest(result, 1034, 1214);
    
    _putDontNest(result, 886, 1244);
    
    _putDontNest(result, 1226, 1304);
    
    _putDontNest(result, 894, 1364);
    
    _putDontNest(result, 1164, 1444);
    
    _putDontNest(result, 1182, 1462);
    
    _putDontNest(result, 1296, 1334);
    
    _putDontNest(result, 396, 422);
    
    _putDontNest(result, 1366, 1384);
    
    _putDontNest(result, 1424, 1462);
    
    _putDontNest(result, 1150, 1234);
    
    _putDontNest(result, 1144, 1244);
    
    _putDontNest(result, 876, 1334);
    
    _putDontNest(result, 886, 1324);
    
    _putDontNest(result, 852, 1294);
    
    _putDontNest(result, 1034, 1354);
    
    _putDontNest(result, 1246, 1414);
    
    _putDontNest(result, 1276, 1444);
    
    _putDontNest(result, 1134, 1334);
    
    _putDontNest(result, 1216, 1424);
    
    _putDontNest(result, 414, 452);
    
    _putDontNest(result, 1324, 1394);
    
    _putDontNest(result, 1284, 1354);
    
    _putDontNest(result, 310, 412);
    
    _putDontNest(result, 4830, 5052);
    
    _putDontNest(result, 5896, 6000);
    
    _putDontNest(result, 894, 1204);
    
    _putDontNest(result, 948, 1150);
    
    _putDontNest(result, 770, 1344);
    
    _putDontNest(result, 1194, 1304);
    
    _putDontNest(result, 690, 1138);
    
    _putDontNest(result, 1150, 1334);
    
    _putDontNest(result, 1284, 1274);
    
    _putDontNest(result, 1316, 1434);
    
    _putDontNest(result, 398, 452);
    
    _putDontNest(result, 1334, 1384);
    
    _putDontNest(result, 1304, 1374);
    
    _putDontNest(result, 1294, 1344);
    
    _putDontNest(result, 886, 1164);
    
    _putDontNest(result, 770, 1264);
    
    _putDontNest(result, 894, 1284);
    
    _putDontNest(result, 254, 442);
    
    _putDontNest(result, 1244, 1444);
    
    _putDontNest(result, 5436, 5490);
    
    _putDontNest(result, 1316, 1354);
    
    _putDontNest(result, 1344, 1334);
    
    _putDontNest(result, 1314, 1364);
    
    _putDontNest(result, 1286, 1384);
    
    _putDontNest(result, 1134, 1170);
    
    _putDontNest(result, 712, 1444);
    
    _putDontNest(result, 852, 1214);
    
    _putDontNest(result, 886, 1180);
    
    _putDontNest(result, 1034, 1434);
    
    _putDontNest(result, 904, 1304);
    
    _putDontNest(result, 1246, 1462);
    
    _putDontNest(result, 1264, 1424);
    
    _putDontNest(result, 1336, 1374);
    
    _putDontNest(result, 1284, 1434);
    
    _putDontNest(result, 1306, 1404);
    
    _putDontNest(result, 1326, 1344);
    
    _putDontNest(result, 1144, 1180);
    
    _putDontNest(result, 4774, 4774);
    
    _putDontNest(result, 4880, 5052);
    
    _putDontNest(result, 5896, 6016);
    
    _putDontNest(result, 712, 1364);
    
    _putDontNest(result, 770, 1424);
    
    _putDontNest(result, 1274, 1434);
    
    _putDontNest(result, 1204, 1324);
    
    _putDontNest(result, 1180, 1284);
    
    _putDontNest(result, 248, 412);
    
    _putDontNest(result, 1226, 1354);
    
    _putDontNest(result, 1256, 1384);
    
    _putDontNest(result, 1264, 1254);
    
    _putDontNest(result, 1236, 1274);
    
    _putDontNest(result, 1226, 1244);
    
    _putDontNest(result, 316, 422);
    
    _putDontNest(result, 1296, 1414);
    
    _putDontNest(result, 1294, 1424);
    
    _putDontNest(result, 886, 1138);
    
    _putDontNest(result, 712, 1274);
    
    _putDontNest(result, 1164, 1284);
    
    _putDontNest(result, 1214, 1334);
    
    _putDontNest(result, 1244, 1364);
    
    _putDontNest(result, 1266, 1394);
    
    _putDontNest(result, 1216, 1344);
    
    _putDontNest(result, 1204, 1194);
    
    _putDontNest(result, 1314, 1444);
    
    _putDontNest(result, 904, 1204);
    
    _putDontNest(result, 690, 1294);
    
    _putDontNest(result, 948, 1294);
    
    _putDontNest(result, 1170, 1314);
    
    _putDontNest(result, 1224, 1384);
    
    _putDontNest(result, 1264, 1344);
    
    _putDontNest(result, 1172, 1324);
    
    _putDontNest(result, 1206, 1294);
    
    _putDontNest(result, 1254, 1374);
    
    _putDontNest(result, 1326, 1424);
    
    _putDontNest(result, 4794, 4794);
    
    _putDontNest(result, 876, 1144);
    
    _putDontNest(result, 1276, 1364);
    
    _putDontNest(result, 1236, 1404);
    
    _putDontNest(result, 1274, 1354);
    
    _putDontNest(result, 1226, 1434);
    
    _putDontNest(result, 1182, 1334);
    
    _putDontNest(result, 1196, 1284);
    
    _putDontNest(result, 1234, 1394);
    
    _putDontNest(result, 1172, 1194);
    
    _putDontNest(result, 1170, 1204);
    
    _putDontNest(result, 1216, 1254);
    
    _putDontNest(result, 1296, 1462);
    
    _putDontNest(result, 5954, 6030);
    
    _putDontNest(result, 876, 1462);
    
    _putDontNest(result, 894, 1444);
    
    _putDontNest(result, 904, 1354);
    
    _putDontNest(result, 1244, 1284);
    
    _putDontNest(result, 1134, 1462);
    
    _putDontNest(result, 1266, 1314);
    
    _putDontNest(result, 1164, 1364);
    
    _putDontNest(result, 1164, 1234);
    
    _putDontNest(result, 1172, 1274);
    
    _putDontNest(result, 1394, 1444);
    
    _putDontNest(result, 948, 1264);
    
    _putDontNest(result, 712, 1284);
    
    _putDontNest(result, 690, 1264);
    
    _putDontNest(result, 1194, 1434);
    
    _putDontNest(result, 1150, 1462);
    
    _putDontNest(result, 1180, 1364);
    
    _putDontNest(result, 1204, 1404);
    
    _putDontNest(result, 1180, 1234);
    
    _putDontNest(result, 1214, 1264);
    
    _putDontNest(result, 422, 412);
    
    _putDontNest(result, 1374, 1424);
    
    _putDontNest(result, 1344, 1414);
    
    _putDontNest(result, 770, 1150);
    
    _putDontNest(result, 712, 1194);
    
    _putDontNest(result, 1194, 1354);
    
    _putDontNest(result, 1150, 1414);
    
    _putDontNest(result, 1234, 1314);
    
    _putDontNest(result, 1236, 1324);
    
    _putDontNest(result, 1196, 1364);
    
    _putDontNest(result, 1204, 1274);
    
    _putDontNest(result, 1224, 1214);
    
    _putDontNest(result, 1194, 1244);
    
    _putDontNest(result, 1344, 1462);
    
    _putDontNest(result, 4728, 5046);
    
    _putDontNest(result, 690, 1374);
    
    _putDontNest(result, 876, 1414);
    
    _putDontNest(result, 948, 1374);
    
    _putDontNest(result, 904, 1434);
    
    _putDontNest(result, 1034, 1304);
    
    _putDontNest(result, 1254, 1294);
    
    _putDontNest(result, 1170, 1394);
    
    _putDontNest(result, 1134, 1414);
    
    _putDontNest(result, 1206, 1374);
    
    _putDontNest(result, 1246, 1334);
    
    _putDontNest(result, 1172, 1404);
    
    _putDontNest(result, 1182, 1264);
    
    _putDontNest(result, 1234, 1204);
    
    _putDontNest(result, 1346, 1444);
    
    _putDontNest(result, 1406, 1424);
    
    _putDontNest(result, 894, 1434);
    
    _putDontNest(result, 1276, 1304);
    
    _putDontNest(result, 876, 1384);
    
    _putDontNest(result, 852, 1344);
    
    _putDontNest(result, 1196, 1462);
    
    _putDontNest(result, 1180, 1414);
    
    _putDontNest(result, 1214, 1444);
    
    _putDontNest(result, 1144, 1434);
    
    _putDontNest(result, 1384, 1384);
    
    _putDontNest(result, 1356, 1364);
    
    _putDontNest(result, 5436, 5460);
    
    _putDontNest(result, 1354, 1354);
    
    _putDontNest(result, 1326, 1334);
    
    _putDontNest(result, 1134, 1264);
    
    _putDontNest(result, 1034, 1180);
    
    _putDontNest(result, 886, 1394);
    
    _putDontNest(result, 770, 1294);
    
    _putDontNest(result, 1170, 1424);
    
    _putDontNest(result, 1164, 1414);
    
    _putDontNest(result, 1316, 1324);
    
    _putDontNest(result, 1366, 1374);
    
    _putDontNest(result, 1344, 1344);
    
    _putDontNest(result, 398, 442);
    
    _putDontNest(result, 1394, 1394);
    
    _putDontNest(result, 1424, 1424);
    
    _putDontNest(result, 1314, 1314);
    
    _putDontNest(result, 1286, 1294);
    
    _putDontNest(result, 1150, 1264);
    
    _putDontNest(result, 1034, 1164);
    
    _putDontNest(result, 894, 1274);
    
    _putDontNest(result, 770, 1214);
    
    _putDontNest(result, 876, 1224);
    
    _putDontNest(result, 1244, 1304);
    
    _putDontNest(result, 1182, 1444);
    
    _putDontNest(result, 1134, 1364);
    
    _putDontNest(result, 1164, 1462);
    
    _putDontNest(result, 1346, 1394);
    
    _putDontNest(result, 1294, 1334);
    
    _putDontNest(result, 5490, 5490);
    
    _putDontNest(result, 4794, 5046);
    
    _putDontNest(result, 886, 1234);
    
    _putDontNest(result, 852, 1264);
    
    _putDontNest(result, 842, 1254);
    
    _putDontNest(result, 894, 1354);
    
    _putDontNest(result, 948, 1424);
    
    _putDontNest(result, 904, 1444);
    
    _putDontNest(result, 1150, 1364);
    
    _putDontNest(result, 1144, 1354);
    
    _putDontNest(result, 1180, 1462);
    
    _putDontNest(result, 1196, 1414);
    
    _putDontNest(result, 1354, 1434);
    
    _putDontNest(result, 1284, 1324);
    
    _putDontNest(result, 328, 412);
    
    _putDontNest(result, 712, 1304);
    
    _putDontNest(result, 1364, 1404);
    
    _putDontNest(result, 886, 1314);
    
    _putDontNest(result, 770, 1374);
    
    _putDontNest(result, 1244, 1414);
    
    _putDontNest(result, 1286, 1374);
    
    _putDontNest(result, 1296, 1344);
    
    _putDontNest(result, 1316, 1404);
    
    _putDontNest(result, 1314, 1394);
    
    _putDontNest(result, 1034, 1244);
    
    _putDontNest(result, 5904, 5994);
    
    _putDontNest(result, 712, 1414);
    
    _putDontNest(result, 894, 1194);
    
    _putDontNest(result, 1196, 1304);
    
    _putDontNest(result, 1234, 1424);
    
    _putDontNest(result, 1276, 1462);
    
    _putDontNest(result, 1336, 1384);
    
    _putDontNest(result, 1306, 1354);
    
    _putDontNest(result, 1144, 1214);
    
    _putDontNest(result, 5904, 6010);
    
    _putDontNest(result, 712, 1462);
    
    _putDontNest(result, 1180, 1304);
    
    _putDontNest(result, 842, 1334);
    
    _putDontNest(result, 1276, 1414);
    
    _putDontNest(result, 1150, 1284);
    
    _putDontNest(result, 1246, 1444);
    
    _putDontNest(result, 1034, 1384);
    
    _putDontNest(result, 1324, 1364);
    
    _putDontNest(result, 1284, 1404);
    
    _putDontNest(result, 432, 452);
    
    _putDontNest(result, 1306, 1434);
    
    _putDontNest(result, 886, 1170);
    
    _putDontNest(result, 1164, 1304);
    
    _putDontNest(result, 1134, 1284);
    
    _putDontNest(result, 1266, 1424);
    
    _putDontNest(result, 1244, 1462);
    
    _putDontNest(result, 1334, 1374);
    
    _putDontNest(result, 1304, 1384);
    
    _putDontNest(result, 690, 1324);
    
    _putDontNest(result, 1172, 1294);
    
    _putDontNest(result, 1224, 1354);
    
    _putDontNest(result, 1254, 1404);
    
    _putDontNest(result, 1234, 1344);
    
    _putDontNest(result, 1206, 1324);
    
    _putDontNest(result, 1196, 1334);
    
    _putDontNest(result, 1182, 1284);
    
    _putDontNest(result, 1224, 1224);
    
    _putDontNest(result, 1194, 1194);
    
    _putDontNest(result, 1326, 1462);
    
    _putDontNest(result, 690, 1214);
    
    _putDontNest(result, 904, 1284);
    
    _putDontNest(result, 1256, 1434);
    
    _putDontNest(result, 1274, 1384);
    
    _putDontNest(result, 1264, 1394);
    
    _putDontNest(result, 1246, 1364);
    
    _putDontNest(result, 1236, 1374);
    
    _putDontNest(result, 1234, 1234);
    
    _putDontNest(result, 1264, 1264);
    
    _putDontNest(result, 1226, 1274);
    
    _putDontNest(result, 1296, 1424);
    
    _putDontNest(result, 1324, 1444);
    
    _putDontNest(result, 1294, 1414);
    
    _putDontNest(result, 894, 1144);
    
    _putDontNest(result, 1226, 1384);
    
    _putDontNest(result, 1266, 1344);
    
    _putDontNest(result, 1214, 1284);
    
    _putDontNest(result, 1216, 1394);
    
    _putDontNest(result, 1164, 1334);
    
    _putDontNest(result, 1204, 1294);
    
    _putDontNest(result, 1256, 1354);
    
    _putDontNest(result, 1274, 1274);
    
    _putDontNest(result, 1216, 1264);
    
    _putDontNest(result, 1164, 1204);
    
    _putDontNest(result, 1294, 1462);
    
    _putDontNest(result, 4794, 4784);
    
    _putDontNest(result, 948, 1170);
    
    _putDontNest(result, 852, 1138);
    
    _putDontNest(result, 842, 1304);
    
    _putDontNest(result, 1224, 1434);
    
    _putDontNest(result, 1180, 1334);
    
    _putDontNest(result, 1180, 1204);
    
    _putDontNest(result, 1326, 1414);
    
    _putDontNest(result, 5786, 5804);
    
    _putDontNest(result, 904, 1364);
    
    _putDontNest(result, 1264, 1314);
    
    _putDontNest(result, 1194, 1384);
    
    _putDontNest(result, 1236, 1294);
    
    _putDontNest(result, 1150, 1444);
    
    _putDontNest(result, 1170, 1344);
    
    _putDontNest(result, 1214, 1254);
    
    _putDontNest(result, 1344, 1424);
    
    _putDontNest(result, 1374, 1414);
    
    _putDontNest(result, 1404, 1444);
    
    _putDontNest(result, 4698, 5046);
    
    _putDontNest(result, 690, 1404);
    
    _putDontNest(result, 852, 1424);
    
    _putDontNest(result, 842, 1414);
    
    _putDontNest(result, 1206, 1404);
    
    _putDontNest(result, 1254, 1324);
    
    _putDontNest(result, 1276, 1334);
    
    _putDontNest(result, 1134, 1444);
    
    _putDontNest(result, 1182, 1364);
    
    _putDontNest(result, 1172, 1374);
    
    _putDontNest(result, 1170, 1234);
    
    _putDontNest(result, 1172, 1244);
    
    _putDontNest(result, 1406, 1462);
    
    _putDontNest(result, 5980, 6030);
    
    _putDontNest(result, 712, 1334);
    
    _putDontNest(result, 712, 1204);
    
    _putDontNest(result, 842, 1462);
    
    _putDontNest(result, 948, 1344);
    
    _putDontNest(result, 1182, 1254);
    
    _putDontNest(result, 1406, 1414);
    
    _putDontNest(result, 1434, 1434);
    
    _putDontNest(result, 948, 1234);
    
    _putDontNest(result, 904, 1254);
    
    _putDontNest(result, 1294, 1304);
    
    _putDontNest(result, 1204, 1374);
    
    _putDontNest(result, 1244, 1334);
    
    _putDontNest(result, 1214, 1364);
    
    _putDontNest(result, 1216, 1314);
    
    _putDontNest(result, 1204, 1244);
    
    _putDontNest(result, 1194, 1274);
    
    _putDontNest(result, 1374, 1462);
    
    _putDontNest(result, 1356, 1444);
    
    _putDontNest(result, 4794, 4800);
    
    _putDontNest(result, 770, 1180);
    
    _putDontNest(result, 842, 1364);
    
    _putDontNest(result, 1150, 1434);
    
    _putDontNest(result, 1194, 1462);
    
    _putDontNest(result, 432, 422);
    
    _putDontNest(result, 1324, 1334);
    
    _putDontNest(result, 1334, 1324);
    
    _putDontNest(result, 1150, 1254);
    
    _putDontNest(result, 5954, 6010);
    
    _putDontNest(result, 886, 1264);
    
    _putDontNest(result, 770, 1164);
    
    _putDontNest(result, 852, 1234);
    
    _putDontNest(result, 904, 1414);
    
    _putDontNest(result, 876, 1434);
    
    _putDontNest(result, 894, 1384);
    
    _putDontNest(result, 1172, 1424);
    
    _putDontNest(result, 1134, 1434);
    
    _putDontNest(result, 1364, 1374);
    
    _putDontNest(result, 396, 442);
    
    _putDontNest(result, 1384, 1434);
    
    _putDontNest(result, 1284, 1294);
    
    _putDontNest(result, 1134, 1254);
    
    _putDontNest(result, 5954, 5994);
    
    _putDontNest(result, 1246, 1304);
    
    _putDontNest(result, 876, 1354);
    
    _putDontNest(result, 886, 1344);
    
    _putDontNest(result, 904, 1462);
    
    _putDontNest(result, 1034, 1334);
    
    _putDontNest(result, 1134, 1354);
    
    _putDontNest(result, 1344, 1394);
    
    _putDontNest(result, 1354, 1384);
    
    _putDontNest(result, 1296, 1314);
    
    _putDontNest(result, 1034, 1194);
    
    _putDontNest(result, 4794, 5052);
    
    _putDontNest(result, 894, 1224);
    
    _putDontNest(result, 876, 1274);
    
    _putDontNest(result, 852, 1394);
    
    _putDontNest(result, 770, 1324);
    
    _putDontNest(result, 1144, 1364);
    
    _putDontNest(result, 1204, 1424);
    
    _putDontNest(result, 1194, 1414);
    
    _putDontNest(result, 1150, 1354);
    
    _putDontNest(result, 1286, 1324);
    
    _putDontNest(result, 1436, 1462);
    
    _putDontNest(result, 1366, 1404);
    
    _putDontNest(result, 1144, 1224);
    
    _putDontNest(result, 770, 1244);
    
    _putDontNest(result, 876, 1194);
    
    _putDontNest(result, 1214, 1304);
    
    _putDontNest(result, 1336, 1434);
    
    _putDontNest(result, 1284, 1374);
    
    _putDontNest(result, 1294, 1364);
    
    _putDontNest(result, 712, 1424);
    
    _putDontNest(result, 948, 1138);
    
    _putDontNest(result, 852, 1170);
    
    _putDontNest(result, 842, 1284);
    
    _putDontNest(result, 690, 1150);
    
    _putDontNest(result, 1274, 1462);
    
    _putDontNest(result, 1236, 1424);
    
    _putDontNest(result, 1226, 1414);
    
    _putDontNest(result, 1256, 1444);
    
    _putDontNest(result, 1304, 1354);
    
    _putDontNest(result, 1334, 1404);
    
    _putDontNest(result, 1034, 1274);
    
    _putDontNest(result, 842, 1204);
    
    _putDontNest(result, 770, 1404);
    
    _putDontNest(result, 1182, 1304);
    
    _putDontNest(result, 852, 1314);
    
    _putDontNest(result, 1144, 1284);
    
    _putDontNest(result, 1226, 1462);
    
    _putDontNest(result, 1274, 1414);
    
    _putDontNest(result, 434, 452);
    
    _putDontNest(result, 1286, 1404);
    
    _putDontNest(result, 1304, 1434);
    
    _putDontNest(result, 1316, 1374);
    
    _putDontNest(result, 1326, 1364);
    
    _putDontNest(result, 5460, 5470);
    
    _putDontNest(result, 1224, 1444);
    
    _putDontNest(result, 1296, 1394);
    
    _putDontNest(result, 1344, 1314);
    
    _putDontNest(result, 1336, 1354);
    
    _putDontNest(result, 1306, 1384);
    
    _putDontNest(result, 1314, 1344);
    
    _putDontNest(result, 948, 1314);
    
    _putDontNest(result, 1150, 1304);
    
    _putDontNest(result, 1206, 1314);
    
    _putDontNest(result, 1236, 1344);
    
    _putDontNest(result, 1254, 1394);
    
    _putDontNest(result, 1170, 1294);
    
    _putDontNest(result, 1224, 1364);
    
    _putDontNest(result, 1194, 1334);
    
    _putDontNest(result, 1324, 1462);
    
    _putDontNest(result, 1134, 1304);
    
    _putDontNest(result, 1276, 1384);
    
    _putDontNest(result, 1234, 1374);
    
    _putDontNest(result, 1034, 1414);
    
    _putDontNest(result, 1264, 1404);
    
    _putDontNest(result, 1246, 1354);
    
    _putDontNest(result, 876, 1304);
    
    _putDontNest(result, 1224, 1274);
    
    _putDontNest(result, 1214, 1204);
    
    _putDontNest(result, 1204, 1214);
    
    _putDontNest(result, 1326, 1444);
    
    _putDontNest(result, 310, 432);
    
    _putDontNest(result, 4794, 4774);
    
    _putDontNest(result, 948, 1204);
    
    _putDontNest(result, 894, 1150);
    
    _putDontNest(result, 712, 1344);
    
    _putDontNest(result, 690, 1164);
    
    _putDontNest(result, 904, 1334);
    
    _putDontNest(result, 1256, 1364);
    
    _putDontNest(result, 1216, 1404);
    
    _putDontNest(result, 1246, 1434);
    
    _putDontNest(result, 1034, 1462);
    
    _putDontNest(result, 1244, 1254);
    
    _putDontNest(result, 1314, 1424);
    
    _putDontNest(result, 316, 442);
    
    _putDontNest(result, 4774, 4794);
    
    _putDontNest(result, 842, 1138);
    
    _putDontNest(result, 690, 1180);
    
    _putDontNest(result, 712, 1254);
    
    _putDontNest(result, 1244, 1384);
    
    _putDontNest(result, 1266, 1374);
    
    _putDontNest(result, 1234, 1264);
    
    _putDontNest(result, 1172, 1214);
    
    _putDontNest(result, 1294, 1444);
    
    _putDontNest(result, 1324, 1414);
    
    _putDontNest(result, 1214, 1434);
    
    _putDontNest(result, 1172, 1344);
    
    _putDontNest(result, 1144, 1444);
    
    _putDontNest(result, 1196, 1384);
    
    _putDontNest(result, 1264, 1324);
    
    _putDontNest(result, 1234, 1294);
    
    _putDontNest(result, 1346, 1424);
    
    _putDontNest(result, 1406, 1444);
    
    _putDontNest(result, 442, 412);
    
    _putDontNest(result, 4698, 5052);
    
    _putDontNest(result, 690, 1434);
    
    _putDontNest(result, 948, 1394);
    
    _putDontNest(result, 1224, 1284);
    
    _putDontNest(result, 1170, 1374);
    
    _putDontNest(result, 1274, 1334);
    
    _putDontNest(result, 1206, 1394);
    
    _putDontNest(result, 1254, 1314);
    
    _putDontNest(result, 1182, 1354);
    
    _putDontNest(result, 1196, 1254);
    
    _putDontNest(result, 1034, 1144);
    
    _putDontNest(result, 1356, 1414);
    
    _putDontNest(result, 1404, 1462);
    
    _putDontNest(result, 1182, 1434);
    
    _putDontNest(result, 1164, 1384);
    
    _putDontNest(result, 1266, 1294);
    
    _putDontNest(result, 1204, 1344);
    
    _putDontNest(result, 1226, 1334);
    
    _putDontNest(result, 1180, 1254);
    
    _putDontNest(result, 1194, 1224);
    
    _putDontNest(result, 1224, 1194);
    
    _putDontNest(result, 1374, 1444);
    
    _putDontNest(result, 1404, 1414);
    
    _putDontNest(result, 1356, 1462);
    
    _putDontNest(result, 904, 1264);
    
    _putDontNest(result, 1296, 1304);
    
    _putDontNest(result, 690, 1244);
    
    _putDontNest(result, 842, 1444);
    
    _putDontNest(result, 886, 1424);
    
    _putDontNest(result, 1216, 1324);
    
    _putDontNest(result, 1214, 1354);
    
    _putDontNest(result, 1180, 1384);
    
    _putDontNest(result, 1170, 1264);
    
    _putDontNest(result, 1206, 1244);
    
    _putDontNest(result, 1164, 1254);
    
    _putDontNest(result, 1416, 1434);
    
    _putDontNest(result, 1394, 1424);
    
    _putDontNest(result, 690, 1354);
    
    _putDontNest(result, 1134, 1384);
    
    _putDontNest(result, 1346, 1374);
    
    _putDontNest(result, 1406, 1434);
    
    _putDontNest(result, 1334, 1314);
    
    _putDontNest(result, 5462, 5490);
    
    _putDontNest(result, 886, 1254);
    
    _putDontNest(result, 842, 1234);
    
    _putDontNest(result, 876, 1404);
    
    _putDontNest(result, 948, 1444);
    
    _putDontNest(result, 904, 1424);
    
    _putDontNest(result, 1264, 1304);
    
    _putDontNest(result, 1034, 1284);
    
    _putDontNest(result, 1150, 1384);
    
    _putDontNest(result, 1194, 1444);
    
    _putDontNest(result, 452, 452);
    
    _putDontNest(result, 422, 422);
    
    _putDontNest(result, 5452, 5480);
    
    _putDontNest(result, 1404, 1384);
    
    _putDontNest(result, 5954, 6000);
    
    _putDontNest(result, 852, 1364);
    
    _putDontNest(result, 1356, 1384);
    
    _putDontNest(result, 1374, 1434);
    
    _putDontNest(result, 1344, 1404);
    
    _putDontNest(result, 1296, 1324);
    
    _putDontNest(result, 1144, 1274);
    
    _putDontNest(result, 876, 1244);
    
    _putDontNest(result, 770, 1194);
    
    _putDontNest(result, 842, 1394);
    
    _putDontNest(result, 1206, 1424);
    
    _putDontNest(result, 1306, 1334);
    
    _putDontNest(result, 1416, 1444);
    
    _putDontNest(result, 1366, 1394);
    
    _putDontNest(result, 1434, 1462);
    
    _putDontNest(result, 1286, 1314);
    
    _putDontNest(result, 894, 1374);
    
    _putDontNest(result, 1216, 1304);
    
    _putDontNest(result, 1256, 1462);
    
    _putDontNest(result, 1034, 1364);
    
    _putDontNest(result, 1274, 1444);
    
    _putDontNest(result, 316, 412);
    
    _putDontNest(result, 1294, 1354);
    
    _putDontNest(result, 1324, 1384);
    
    _putDontNest(result, 404, 452);
    
    _putDontNest(result, 1034, 1224);
    
    _putDontNest(result, 1134, 1204);
    
    _putDontNest(result, 4830, 5046);
    
    _putDontNest(result, 842, 1170);
    
    _putDontNest(result, 852, 1284);
    
    _putDontNest(result, 770, 1354);
    
    _putDontNest(result, 1144, 1334);
    
    _putDontNest(result, 1224, 1414);
    
    _putDontNest(result, 1334, 1394);
    
    _putDontNest(result, 1326, 1434);
    
    _putDontNest(result, 1304, 1364);
    
    _putDontNest(result, 1284, 1344);
    
    _putDontNest(result, 1150, 1204);
    
    _putDontNest(result, 1144, 1194);
    
    _putDontNest(result, 894, 1214);
    
    _putDontNest(result, 770, 1274);
    
    _putDontNest(result, 886, 1334);
    
    _putDontNest(result, 876, 1324);
    
    _putDontNest(result, 1224, 1462);
    
    _putDontNest(result, 248, 442);
    
    _putDontNest(result, 1254, 1424);
    
    _putDontNest(result, 1284, 1264);
    
    _putDontNest(result, 1286, 1394);
    
    _putDontNest(result, 1326, 1354);
    
    _putDontNest(result, 1314, 1374);
    
    _putDontNest(result, 5436, 5480);
    
    _putDontNest(result, 876, 1180);
    
    _putDontNest(result, 894, 1294);
    
    _putDontNest(result, 1256, 1414);
    
    _putDontNest(result, 1226, 1444);
    
    _putDontNest(result, 1344, 1324);
    
    _putDontNest(result, 1294, 1434);
    
    _putDontNest(result, 1296, 1404);
    
    _putDontNest(result, 1316, 1344);
    
    _putDontNest(result, 1336, 1364);
    
    _putDontNest(result, 852, 1204);
    
    _putDontNest(result, 876, 1164);
    
    _putDontNest(result, 770, 1434);
    
    _putDontNest(result, 842, 1314);
    
    _putDontNest(result, 1204, 1314);
    
    _putDontNest(result, 1216, 1374);
    
    _putDontNest(result, 254, 412);
    
    _putDontNest(result, 894, 1304);
    
    _putDontNest(result, 1226, 1364);
    
    _putDontNest(result, 1276, 1434);
    
    _putDontNest(result, 1274, 1254);
    
    _putDontNest(result, 1216, 1244);
    
    _putDontNest(result, 1306, 1414);
    
    _putDontNest(result, 1284, 1424);
    
    _putDontNest(result, 1336, 1444);
    
    _putDontNest(result, 310, 422);
    
    _putDontNest(result, 5896, 6030);
    
    _putDontNest(result, 876, 1150);
    
    _putDontNest(result, 904, 1170);
    
    _putDontNest(result, 1266, 1404);
    
    _putDontNest(result, 1244, 1354);
    
    _putDontNest(result, 1214, 1194);
    
    _putDontNest(result, 690, 1194);
    
    _putDontNest(result, 1172, 1314);
    
    _putDontNest(result, 1244, 1434);
    
    _putDontNest(result, 1170, 1324);
    
    _putDontNest(result, 1304, 1444);
    
    _putDontNest(result, 1316, 1424);
    
    _putDontNest(result, 712, 1394);
    
    _putDontNest(result, 712, 1264);
    
    _putDontNest(result, 948, 1284);
    
    _putDontNest(result, 1194, 1284);
    
    _putDontNest(result, 1034, 1444);
    
    _putDontNest(result, 1236, 1394);
    
    _putDontNest(result, 1234, 1404);
    
    _putDontNest(result, 1276, 1354);
    
    _putDontNest(result, 1264, 1374);
    
    _putDontNest(result, 1274, 1364);
    
    _putDontNest(result, 1254, 1344);
    
    _putDontNest(result, 1246, 1384);
    
    _putDontNest(result, 1226, 1254);
    
    _putDontNest(result, 1170, 1214);
    
    _putDontNest(result, 1236, 1264);
    
    _putDontNest(result, 1306, 1462);
    
    _putDontNest(result, 4784, 4794);
    
    _putDontNest(result, 1256, 1334);
    
    _putDontNest(result, 1164, 1354);
    
    _putDontNest(result, 1266, 1324);
    
    _putDontNest(result, 1164, 1224);
    
    _putDontNest(result, 1182, 1274);
    
    _putDontNest(result, 4800, 4794);
    
    _putDontNest(result, 5954, 6016);
    
    _putDontNest(result, 904, 1234);
    
    _putDontNest(result, 948, 1254);
    
    _putDontNest(result, 1216, 1294);
    
    _putDontNest(result, 1214, 1384);
    
    _putDontNest(result, 1180, 1354);
    
    _putDontNest(result, 1204, 1394);
    
    _putDontNest(result, 1226, 1284);
    
    _putDontNest(result, 1144, 1462);
    
    _putDontNest(result, 1196, 1434);
    
    _putDontNest(result, 1194, 1254);
    
    _putDontNest(result, 1204, 1264);
    
    _putDontNest(result, 1180, 1224);
    
    _putDontNest(result, 1384, 1444);
    
    _putDontNest(result, 1354, 1414);
    
    _putDontNest(result, 1364, 1424);
    
    _putDontNest(result, 770, 1144);
    
    _putDontNest(result, 690, 1384);
    
    _putDontNest(result, 904, 1344);
    
    _putDontNest(result, 886, 1462);
    
    _putDontNest(result, 1144, 1414);
    
    _putDontNest(result, 1224, 1334);
    
    _putDontNest(result, 1206, 1344);
    
    _putDontNest(result, 1196, 1354);
    
    _putDontNest(result, 1264, 1294);
    
    _putDontNest(result, 1236, 1314);
    
    _putDontNest(result, 1274, 1284);
    
    _putDontNest(result, 1194, 1364);
    
    _putDontNest(result, 1180, 1434);
    
    _putDontNest(result, 1234, 1324);
    
    _putDontNest(result, 1224, 1204);
    
    _putDontNest(result, 1214, 1274);
    
    _putDontNest(result, 412, 412);
    
    _putDontNest(result, 1354, 1462);
    
    _putDontNest(result, 4728, 5052);
    
    _putDontNest(result, 690, 1274);
    
    _putDontNest(result, 852, 1444);
    
    _putDontNest(result, 886, 1414);
    
    _putDontNest(result, 1164, 1434);
    
    _putDontNest(result, 1170, 1404);
    
    _putDontNest(result, 1182, 1384);
    
    _putDontNest(result, 1172, 1394);
    
    _putDontNest(result, 1172, 1264);
    
    _putDontNest(result, 1234, 1214);
    
    _putDontNest(result, 396, 412);
    
    _putDontNest(result, 712, 1314);
    
    _putDontNest(result, 948, 1364);
   return result;
  }
    
  protected static IntegerMap _initDontNestGroups() {
    IntegerMap result = org.rascalmpl.library.lang.rascal.syntax.RascalRascal._initDontNestGroups();
    int resultStoreId = result.size();
    
    
    ++resultStoreId;
    
    result.putUnsafe(1444, resultStoreId);
    result.putUnsafe(1426, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(1436, resultStoreId);
    result.putUnsafe(1446, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(4830, resultStoreId);
    result.putUnsafe(4698, resultStoreId);
    result.putUnsafe(4728, resultStoreId);
    result.putUnsafe(5044, resultStoreId);
    result.putUnsafe(4880, resultStoreId);
    result.putUnsafe(4656, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(5462, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(1150, resultStoreId);
    result.putUnsafe(1180, resultStoreId);
    result.putUnsafe(1164, resultStoreId);
    result.putUnsafe(1144, resultStoreId);
    result.putUnsafe(1170, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(1404, resultStoreId);
    result.putUnsafe(1384, resultStoreId);
    result.putUnsafe(1394, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(1274, resultStoreId);
    result.putUnsafe(1254, resultStoreId);
    result.putUnsafe(1284, resultStoreId);
    result.putUnsafe(1236, resultStoreId);
    result.putUnsafe(1264, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(5794, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(5490, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(1356, resultStoreId);
    result.putUnsafe(1354, resultStoreId);
    result.putUnsafe(1364, resultStoreId);
    result.putUnsafe(1346, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(5470, resultStoreId);
    result.putUnsafe(5452, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(4794, resultStoreId);
    result.putUnsafe(4774, resultStoreId);
    result.putUnsafe(4784, resultStoreId);
    result.putUnsafe(4800, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(1182, resultStoreId);
    result.putUnsafe(1244, resultStoreId);
    result.putUnsafe(1196, resultStoreId);
    result.putUnsafe(1226, resultStoreId);
    result.putUnsafe(1206, resultStoreId);
    result.putUnsafe(1216, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(5980, resultStoreId);
    result.putUnsafe(5896, resultStoreId);
    result.putUnsafe(5954, resultStoreId);
    result.putUnsafe(5904, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(414, resultStoreId);
    result.putUnsafe(452, resultStoreId);
    result.putUnsafe(404, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(1374, resultStoreId);
    result.putUnsafe(1366, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(412, resultStoreId);
    result.putUnsafe(442, resultStoreId);
    result.putUnsafe(422, resultStoreId);
    result.putUnsafe(432, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(1246, resultStoreId);
    result.putUnsafe(1294, resultStoreId);
    result.putUnsafe(1276, resultStoreId);
    result.putUnsafe(1256, resultStoreId);
    result.putUnsafe(1304, resultStoreId);
    result.putUnsafe(1286, resultStoreId);
    result.putUnsafe(1266, resultStoreId);
    result.putUnsafe(1296, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(1326, resultStoreId);
    result.putUnsafe(1324, resultStoreId);
    result.putUnsafe(1306, resultStoreId);
    result.putUnsafe(1336, resultStoreId);
    result.putUnsafe(1334, resultStoreId);
    result.putUnsafe(1316, resultStoreId);
    result.putUnsafe(1314, resultStoreId);
    result.putUnsafe(1344, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(1214, resultStoreId);
    result.putUnsafe(1194, resultStoreId);
    result.putUnsafe(1224, resultStoreId);
    result.putUnsafe(1204, resultStoreId);
    result.putUnsafe(1172, resultStoreId);
    result.putUnsafe(1234, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(254, resultStoreId);
    result.putUnsafe(398, resultStoreId);
    result.putUnsafe(396, resultStoreId);
    result.putUnsafe(316, resultStoreId);
    result.putUnsafe(328, resultStoreId);
    result.putUnsafe(248, resultStoreId);
    result.putUnsafe(310, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(424, resultStoreId);
    result.putUnsafe(434, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(5436, resultStoreId);
    result.putUnsafe(5460, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(1434, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(1134, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(5804, resultStoreId);
    result.putUnsafe(5786, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(894, resultStoreId);
    result.putUnsafe(876, resultStoreId);
    result.putUnsafe(1034, resultStoreId);
    result.putUnsafe(842, resultStoreId);
    result.putUnsafe(904, resultStoreId);
    result.putUnsafe(712, resultStoreId);
    result.putUnsafe(886, resultStoreId);
    result.putUnsafe(948, resultStoreId);
    result.putUnsafe(852, resultStoreId);
    result.putUnsafe(770, resultStoreId);
    result.putUnsafe(690, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(1406, resultStoreId);
    result.putUnsafe(1416, resultStoreId);
    result.putUnsafe(1414, resultStoreId);
    result.putUnsafe(1424, resultStoreId);
      
    return result;
  }
  
  protected boolean hasNestingRestrictions(String name){
		return (_dontNest.size() != 0); // TODO Make more specific.
  }
    
  protected IntegerList getFilteredParents(int childId) {
		return _dontNest.get(childId);
  }
    
  // initialize priorities     
  static {
    _dontNest = _initDontNest();
    _resultStoreIdMappings = _initDontNestGroups();
  }
    
  // Production declarations
	
  private static final IConstructor regular__iter_seps__QualifiedName__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"QualifiedName\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_constructor_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"constructor\")],{})", Factory.Production);
  private static final IConstructor prod__CharacterClass_Sym__charClass_Class_ = (IConstructor) _read("prod(label(\"CharacterClass\",sort(\"Sym\")),[label(\"charClass\",sort(\"Class\"))],{})", Factory.Production);
  private static final IConstructor prod__ListModules_ShellCommand__lit_modules_ = (IConstructor) _read("prod(label(\"ListModules\",sort(\"ShellCommand\")),[lit(\"modules\")],{})", Factory.Production);
  private static final IConstructor prod__Modulo_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_mod_layouts_LAYOUTLIST_rhs_Expression__assoc__left = (IConstructor) _read("prod(label(\"Modulo\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"mod\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__Char__UnicodeEscape__tag__category___67_111_110_115_116_97_110_116 = (IConstructor) _read("prod(lex(\"Char\"),[lex(\"UnicodeEscape\")],{tag(category(\"Constant\"))})", Factory.Production);
  private static final IConstructor prod__IfDefinedOrDefault_Assignable__receiver_Assignable_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_defaultExpression_Expression_ = (IConstructor) _read("prod(label(\"IfDefinedOrDefault\",sort(\"Assignable\")),[label(\"receiver\",sort(\"Assignable\")),layouts(\"LAYOUTLIST\"),lit(\"?\"),layouts(\"LAYOUTLIST\"),label(\"defaultExpression\",sort(\"Expression\"))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_fail_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"fail\")],{})", Factory.Production);
  private static final IConstructor prod__start__Commands__layouts_LAYOUTLIST_top_Commands_layouts_LAYOUTLIST_ = (IConstructor) _read("prod(start(sort(\"Commands\")),[layouts(\"LAYOUTLIST\"),label(\"top\",sort(\"Commands\")),layouts(\"LAYOUTLIST\")],{})", Factory.Production);
  private static final IConstructor prod__NamedRegExp__char_class___range__92_92_char_class___range__47_47_range__60_60_range__62_62_range__92_92_ = (IConstructor) _read("prod(lex(\"NamedRegExp\"),[\\char-class([range(92,92)]),\\char-class([range(47,47),range(60,60),range(62,62),range(92,92)])],{})", Factory.Production);
  private static final IConstructor prod__RationalLiteral__char_class___range__49_57_iter_star__char_class___range__48_57_char_class___range__114_114_char_class___range__48_57_conditional__iter_star__char_class___range__48_57__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_ = (IConstructor) _read("prod(lex(\"RationalLiteral\"),[\\char-class([range(49,57)]),\\iter-star(\\char-class([range(48,57)])),\\char-class([range(114,114)]),\\char-class([range(48,57)]),conditional(\\iter-star(\\char-class([range(48,57)])),{\\not-follow(\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)]))})],{})", Factory.Production);
  private static final IConstructor prod__TimeZonePart__lit_Z_ = (IConstructor) _read("prod(lex(\"TimeZonePart\"),[lit(\"Z\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_default_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"default\")],{})", Factory.Production);
  private static final IConstructor prod__RegExpLiteral__lit___47_iter_star__RegExp_lit___47_RegExpModifier_ = (IConstructor) _read("prod(lex(\"RegExpLiteral\"),[lit(\"/\"),\\iter-star(lex(\"RegExp\")),lit(\"/\"),lex(\"RegExpModifier\")],{})", Factory.Production);
  private static final IConstructor prod__HeaderKeyword__lit_layout_ = (IConstructor) _read("prod(keywords(\"HeaderKeyword\"),[lit(\"layout\")],{})", Factory.Production);
  private static final IConstructor prod__lit_fail__char_class___range__102_102_char_class___range__97_97_char_class___range__105_105_char_class___range__108_108_ = (IConstructor) _read("prod(lit(\"fail\"),[\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(105,105)]),\\char-class([range(108,108)])],{})", Factory.Production);
  private static final IConstructor prod__List_Comprehension__lit___91_layouts_LAYOUTLIST_results_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"List\",sort(\"Comprehension\")),[lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"results\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"|\"),layouts(\"LAYOUTLIST\"),label(\"generators\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor regular__iter__char_class___range__117_117 = (IConstructor) _read("regular(iter(\\char-class([range(117,117)])))", Factory.Production);
  private static final IConstructor prod__lit_repeat__char_class___range__114_114_char_class___range__101_101_char_class___range__112_112_char_class___range__101_101_char_class___range__97_97_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"repeat\"),[\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__Name__conditional__seq___conditional__char_class___range__65_90_range__95_95_range__97_122__not_precede__char_class___range__65_90_range__95_95_range__97_122_conditional__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122__delete__RascalKeywords_ = (IConstructor) _read("prod(lex(\"Name\"),[conditional(seq([conditional(\\char-class([range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)]))})]),{delete(keywords(\"RascalKeywords\"))})],{})", Factory.Production);
  private static final IConstructor prod__lit_parameter__char_class___range__112_112_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__109_109_char_class___range__101_101_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_ = (IConstructor) _read("prod(lit(\"parameter\"),[\\char-class([range(112,112)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)])],{})", Factory.Production);
  private static final IConstructor prod__Unlabeled_Prod__modifiers_iter_star_seps__ProdModifier__layouts_LAYOUTLIST_layouts_LAYOUTLIST_args_iter_star_seps__Sym__layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"Unlabeled\",sort(\"Prod\")),[label(\"modifiers\",\\iter-star-seps(sort(\"ProdModifier\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),label(\"args\",\\iter-star-seps(sort(\"Sym\"),[layouts(\"LAYOUTLIST\")]))],{})", Factory.Production);
  private static final IConstructor prod__NonEmptyBlock_Statement__label_Label_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_statements_iter_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"NonEmptyBlock\",sort(\"Statement\")),[label(\"label\",sort(\"Label\")),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"statements\",\\iter-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__lit___45_61__char_class___range__45_45_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"-=\"),[\\char-class([range(45,45)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor regular__iter_star__char_class___range__48_57 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(48,57)])))", Factory.Production);
  private static final IConstructor prod__Variable_Kind__lit_variable_ = (IConstructor) _read("prod(label(\"Variable\",sort(\"Kind\")),[lit(\"variable\")],{})", Factory.Production);
  private static final IConstructor prod__UnInitialized_Variable__name_Name_ = (IConstructor) _read("prod(label(\"UnInitialized\",sort(\"Variable\")),[label(\"name\",lex(\"Name\"))],{})", Factory.Production);
  private static final IConstructor prod__Interpolated_PathPart__pre_PrePathChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_PathTail_ = (IConstructor) _read("prod(label(\"Interpolated\",sort(\"PathPart\")),[label(\"pre\",lex(\"PrePathChars\")),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),label(\"tail\",sort(\"PathTail\"))],{})", Factory.Production);
  private static final IConstructor prod__List_Expression__lit___91_layouts_LAYOUTLIST_elements_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"List\",sort(\"Expression\")),[lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"elements\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__Subscript_Expression__expression_Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_subscripts_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"Subscript\",sort(\"Expression\")),[label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"subscripts\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor regular__opt__char_class___range__48_57 = (IConstructor) _read("regular(opt(\\char-class([range(48,57)])))", Factory.Production);
  private static final IConstructor prod__lit_function__char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"function\"),[\\char-class([range(102,102)]),\\char-class([range(117,117)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__Visit_Statement__label_Label_layouts_LAYOUTLIST_visit_Visit_ = (IConstructor) _read("prod(label(\"Visit\",sort(\"Statement\")),[label(\"label\",sort(\"Label\")),layouts(\"LAYOUTLIST\"),label(\"visit\",sort(\"Visit\"))],{})", Factory.Production);
  private static final IConstructor prod__Default_Module__header_Header_layouts_LAYOUTLIST_body_Body_ = (IConstructor) _read("prod(label(\"Default\",sort(\"Module\")),[label(\"header\",sort(\"Header\")),layouts(\"LAYOUTLIST\"),label(\"body\",sort(\"Body\"))],{})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__lit_int__char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"int\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__AssertWithMessage_Statement__lit_assert_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_message_Expression_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"AssertWithMessage\",sort(\"Statement\")),[lit(\"assert\"),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),label(\"message\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Splice_Pattern__lit___42_layouts_LAYOUTLIST_argument_Pattern_ = (IConstructor) _read("prod(label(\"Splice\",sort(\"Pattern\")),[lit(\"*\"),layouts(\"LAYOUTLIST\"),label(\"argument\",sort(\"Pattern\"))],{})", Factory.Production);
  private static final IConstructor prod__While_Statement__label_Label_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_body_Statement_ = (IConstructor) _read("prod(label(\"While\",sort(\"Statement\")),[label(\"label\",sort(\"Label\")),layouts(\"LAYOUTLIST\"),lit(\"while\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"conditions\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),label(\"body\",sort(\"Statement\"))],{})", Factory.Production);
  private static final IConstructor prod__OctalIntegerLiteral_IntegerLiteral__octal_OctalIntegerLiteral_ = (IConstructor) _read("prod(label(\"OctalIntegerLiteral\",sort(\"IntegerLiteral\")),[label(\"octal\",lex(\"OctalIntegerLiteral\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_when__char_class___range__119_119_char_class___range__104_104_char_class___range__101_101_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"when\"),[\\char-class([range(119,119)]),\\char-class([range(104,104)]),\\char-class([range(101,101)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__lit_type__char_class___range__116_116_char_class___range__121_121_char_class___range__112_112_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"type\"),[\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(112,112)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_void_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"void\")],{})", Factory.Production);
  private static final IConstructor prod__NamedRegExp__char_class___range__0_46_range__48_59_range__61_61_range__63_91_range__93_65535_ = (IConstructor) _read("prod(lex(\"NamedRegExp\"),[\\char-class([range(0,46),range(48,59),range(61,61),range(63,91),range(93,65535)])],{})", Factory.Production);
  private static final IConstructor prod__LessThan_Expression__lhs_Expression_layouts_LAYOUTLIST_conditional__lit___60__not_follow__lit___layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"LessThan\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),conditional(lit(\"\\<\"),{\\not-follow(lit(\"-\"))}),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__AppendAfter_Expression__lhs_Expression_layouts_LAYOUTLIST_conditional__lit___60_60__not_follow__lit___61_layouts_LAYOUTLIST_rhs_Expression__assoc__left = (IConstructor) _read("prod(label(\"AppendAfter\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),conditional(lit(\"\\<\\<\"),{\\not-follow(lit(\"=\"))}),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__NonEmptyBlock_Expression__lit___123_layouts_LAYOUTLIST_statements_iter_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"NonEmptyBlock\",sort(\"Expression\")),[lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"statements\",\\iter-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__Tuple_Assignable__lit___60_layouts_LAYOUTLIST_elements_iter_seps__Assignable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___62_ = (IConstructor) _read("prod(label(\"Tuple\",sort(\"Assignable\")),[lit(\"\\<\"),layouts(\"LAYOUTLIST\"),label(\"elements\",\\iter-seps(sort(\"Assignable\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"\\>\")],{})", Factory.Production);
  private static final IConstructor prod__lit_modules__char_class___range__109_109_char_class___range__111_111_char_class___range__100_100_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"modules\"),[\\char-class([range(109,109)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__PreStringChars__char_class___range__34_34_iter_star__StringCharacter_char_class___range__60_60__tag__category___67_111_110_115_116_97_110_116 = (IConstructor) _read("prod(lex(\"PreStringChars\"),[\\char-class([range(34,34)]),\\iter-star(lex(\"StringCharacter\")),\\char-class([range(60,60)])],{tag(category(\"Constant\"))})", Factory.Production);
  private static final IConstructor prod__List_Commands__commands_iter_seps__Command__layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"List\",sort(\"Commands\")),[label(\"commands\",\\iter-seps(sort(\"Command\"),[layouts(\"LAYOUTLIST\")]))],{})", Factory.Production);
  private static final IConstructor prod__Bracket_ProdModifier__lit_bracket_ = (IConstructor) _read("prod(label(\"Bracket\",sort(\"ProdModifier\")),[lit(\"bracket\")],{})", Factory.Production);
  private static final IConstructor regular__iter_seps__Command__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"Command\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_ = (IConstructor) _read("prod(lit(\"catch\"),[\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(99,99)]),\\char-class([range(104,104)])],{})", Factory.Production);
  private static final IConstructor prod__Post_StringTail__post_PostStringChars_ = (IConstructor) _read("prod(label(\"Post\",sort(\"StringTail\")),[label(\"post\",lex(\"PostStringChars\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_case__char_class___range__99_99_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"case\"),[\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit___47_61__char_class___range__47_47_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"/=\"),[\\char-class([range(47,47)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor regular__iter_seps__Case__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"Case\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor regular__seq___char_class___range__44_44_range__46_46_char_class___range__48_57_opt__seq___char_class___range__48_57_opt__char_class___range__48_57 = (IConstructor) _read("regular(seq([\\char-class([range(44,44),range(46,46)]),\\char-class([range(48,57)]),opt(seq([\\char-class([range(48,57)]),opt(\\char-class([range(48,57)]))]))]))", Factory.Production);
  private static final IConstructor prod__DataAbstract_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_data_layouts_LAYOUTLIST_user_UserType_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"DataAbstract\",sort(\"Declaration\")),[label(\"tags\",sort(\"Tags\")),layouts(\"LAYOUTLIST\"),label(\"visibility\",sort(\"Visibility\")),layouts(\"LAYOUTLIST\"),lit(\"data\"),layouts(\"LAYOUTLIST\"),label(\"user\",sort(\"UserType\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__RegExp__lit___60_Name_lit___58_iter_star__NamedRegExp_lit___62_ = (IConstructor) _read("prod(lex(\"RegExp\"),[lit(\"\\<\"),lex(\"Name\"),lit(\":\"),\\iter-star(lex(\"NamedRegExp\")),lit(\"\\>\")],{})", Factory.Production);
  private static final IConstructor prod__SetOption_ShellCommand__lit_set_layouts_LAYOUTLIST_name_QualifiedName_layouts_LAYOUTLIST_expression_Expression_ = (IConstructor) _read("prod(label(\"SetOption\",sort(\"ShellCommand\")),[lit(\"set\"),layouts(\"LAYOUTLIST\"),label(\"name\",sort(\"QualifiedName\")),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\"))],{})", Factory.Production);
  private static final IConstructor prod__LAYOUT__Comment_ = (IConstructor) _read("prod(lex(\"LAYOUT\"),[lex(\"Comment\")],{})", Factory.Production);
  private static final IConstructor regular__iter_seps__TypeVar__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"TypeVar\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__IfDefined_Assignment__lit___63_61_ = (IConstructor) _read("prod(label(\"IfDefined\",sort(\"Assignment\")),[lit(\"?=\")],{})", Factory.Production);
  private static final IConstructor prod__HeaderKeyword__lit_import_ = (IConstructor) _read("prod(keywords(\"HeaderKeyword\"),[lit(\"import\")],{})", Factory.Production);
  private static final IConstructor prod__Java_FunctionModifier__lit_java_ = (IConstructor) _read("prod(label(\"Java\",sort(\"FunctionModifier\")),[lit(\"java\")],{})", Factory.Production);
  private static final IConstructor prod__Default_Case__lit_default_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_statement_Statement__tag__Foldable = (IConstructor) _read("prod(label(\"Default\",sort(\"Case\")),[lit(\"default\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),label(\"statement\",sort(\"Statement\"))],{tag(Foldable())})", Factory.Production);
  private static final IConstructor prod__lit___47_47__char_class___range__47_47_char_class___range__47_47_ = (IConstructor) _read("prod(lit(\"//\"),[\\char-class([range(47,47)]),\\char-class([range(47,47)])],{})", Factory.Production);
  private static final IConstructor prod__lit_help__char_class___range__104_104_char_class___range__101_101_char_class___range__108_108_char_class___range__112_112_ = (IConstructor) _read("prod(lit(\"help\"),[\\char-class([range(104,104)]),\\char-class([range(101,101)]),\\char-class([range(108,108)]),\\char-class([range(112,112)])],{})", Factory.Production);
  private static final IConstructor prod__lit_num__char_class___range__110_110_char_class___range__117_117_char_class___range__109_109_ = (IConstructor) _read("prod(lit(\"num\"),[\\char-class([range(110,110)]),\\char-class([range(117,117)]),\\char-class([range(109,109)])],{})", Factory.Production);
  private static final IConstructor prod__ReifiedAdt_BasicType__lit_adt_ = (IConstructor) _read("prod(label(\"ReifiedAdt\",sort(\"BasicType\")),[lit(\"adt\")],{})", Factory.Production);
  private static final IConstructor prod__lit_tag__char_class___range__116_116_char_class___range__97_97_char_class___range__103_103_ = (IConstructor) _read("prod(lit(\"tag\"),[\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(103,103)])],{})", Factory.Production);
  private static final IConstructor prod__Char__lit___92_char_class___range__32_32_range__34_34_range__39_39_range__45_45_range__60_60_range__62_62_range__91_93_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116__tag__category___67_111_110_115_116_97_110_116 = (IConstructor) _read("prod(lex(\"Char\"),[lit(\"\\\\\"),\\char-class([range(32,32),range(34,34),range(39,39),range(45,45),range(60,60),range(62,62),range(91,93),range(98,98),range(102,102),range(110,110),range(114,114),range(116,116)])],{tag(category(\"Constant\"))})", Factory.Production);
  private static final IConstructor prod__NotFollow_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___33_62_62_layouts_LAYOUTLIST_match_Sym__assoc__left = (IConstructor) _read("prod(label(\"NotFollow\",sort(\"Sym\")),[label(\"symbol\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),lit(\"!\\>\\>\"),layouts(\"LAYOUTLIST\"),label(\"match\",sort(\"Sym\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor regular__iter__char_class___range__48_55 = (IConstructor) _read("regular(iter(\\char-class([range(48,55)])))", Factory.Production);
  private static final IConstructor regular__iter__char_class___range__48_57 = (IConstructor) _read("regular(iter(\\char-class([range(48,57)])))", Factory.Production);
  private static final IConstructor prod__Template_StringMiddle__mid_MidStringChars_layouts_LAYOUTLIST_template_StringTemplate_layouts_LAYOUTLIST_tail_StringMiddle_ = (IConstructor) _read("prod(label(\"Template\",sort(\"StringMiddle\")),[label(\"mid\",lex(\"MidStringChars\")),layouts(\"LAYOUTLIST\"),label(\"template\",sort(\"StringTemplate\")),layouts(\"LAYOUTLIST\"),label(\"tail\",sort(\"StringMiddle\"))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_join_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"join\")],{})", Factory.Production);
  private static final IConstructor prod__Default_Assignment__lit___61_ = (IConstructor) _read("prod(label(\"Default\",sort(\"Assignment\")),[lit(\"=\")],{})", Factory.Production);
  private static final IConstructor prod__RegExp__char_class___range__0_46_range__48_59_range__61_61_range__63_91_range__93_65535_ = (IConstructor) _read("prod(lex(\"RegExp\"),[\\char-class([range(0,46),range(48,59),range(61,61),range(63,91),range(93,65535)])],{})", Factory.Production);
  private static final IConstructor prod__start__Module__layouts_LAYOUTLIST_top_Module_layouts_LAYOUTLIST_ = (IConstructor) _read("prod(start(sort(\"Module\")),[layouts(\"LAYOUTLIST\"),label(\"top\",sort(\"Module\")),layouts(\"LAYOUTLIST\")],{})", Factory.Production);
  private static final IConstructor prod__Empty_Tag__lit___64_layouts_LAYOUTLIST_name_Name__tag__Folded_tag__category___67_111_109_109_101_110_116 = (IConstructor) _read("prod(label(\"Empty\",sort(\"Tag\")),[lit(\"@\"),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\"))],{tag(Folded()),tag(category(\"Comment\"))})", Factory.Production);
  private static final IConstructor prod__lit___58_47_47__char_class___range__58_58_char_class___range__47_47_char_class___range__47_47_ = (IConstructor) _read("prod(lit(\"://\"),[\\char-class([range(58,58)]),\\char-class([range(47,47)]),\\char-class([range(47,47)])],{})", Factory.Production);
  private static final IConstructor prod__BottomUp_Strategy__lit_bottom_up_ = (IConstructor) _read("prod(label(\"BottomUp\",sort(\"Strategy\")),[lit(\"bottom-up\")],{})", Factory.Production);
  private static final IConstructor prod__Parameters_Header__tags_Tags_layouts_LAYOUTLIST_lit_module_layouts_LAYOUTLIST_name_QualifiedName_layouts_LAYOUTLIST_params_ModuleParameters_layouts_LAYOUTLIST_imports_iter_star_seps__Import__layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"Parameters\",sort(\"Header\")),[label(\"tags\",sort(\"Tags\")),layouts(\"LAYOUTLIST\"),lit(\"module\"),layouts(\"LAYOUTLIST\"),label(\"name\",sort(\"QualifiedName\")),layouts(\"LAYOUTLIST\"),label(\"params\",sort(\"ModuleParameters\")),layouts(\"LAYOUTLIST\"),label(\"imports\",\\iter-star-seps(sort(\"Import\"),[layouts(\"LAYOUTLIST\")]))],{})", Factory.Production);
  private static final IConstructor prod__RegExp__char_class___range__92_92_char_class___range__47_47_range__60_60_range__62_62_range__92_92_ = (IConstructor) _read("prod(lex(\"RegExp\"),[\\char-class([range(92,92)]),\\char-class([range(47,47),range(60,60),range(62,62),range(92,92)])],{})", Factory.Production);
  private static final IConstructor prod__CallOrTree_Expression__expression_Expression_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"CallOrTree\",sort(\"Expression\")),[label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"arguments\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__Sequence_Sym__lit___40_layouts_LAYOUTLIST_first_Sym_layouts_LAYOUTLIST_sequence_iter_seps__Sym__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"Sequence\",sort(\"Sym\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"first\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),label(\"sequence\",\\iter-seps(sort(\"Sym\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__Char__OctalEscapeSequence__tag__category___67_111_110_115_116_97_110_116 = (IConstructor) _read("prod(lex(\"Char\"),[lex(\"OctalEscapeSequence\")],{tag(category(\"Constant\"))})", Factory.Production);
  private static final IConstructor prod__Rational_BasicType__lit_rat_ = (IConstructor) _read("prod(label(\"Rational\",sort(\"BasicType\")),[lit(\"rat\")],{})", Factory.Production);
  private static final IConstructor prod__NotIn_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_notin_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"NotIn\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"notin\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__First_Prod__lhs_Prod_layouts_LAYOUTLIST_conditional__lit___62__not_follow__lit___62_layouts_LAYOUTLIST_rhs_Prod__assoc__left = (IConstructor) _read("prod(label(\"First\",sort(\"Prod\")),[label(\"lhs\",sort(\"Prod\")),layouts(\"LAYOUTLIST\"),conditional(lit(\"\\>\"),{\\not-follow(lit(\"\\>\"))}),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Prod\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor regular__iter_star__char_class___range__100_100_range__105_105_range__109_109_range__115_115 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(100,100),range(105,105),range(109,109),range(115,115)])))", Factory.Production);
  private static final IConstructor prod__Parametric_UserType__conditional__name_QualifiedName__follow__lit___91_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_parameters_iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"Parametric\",sort(\"UserType\")),[conditional(label(\"name\",sort(\"QualifiedName\")),{follow(lit(\"[\"))}),layouts(\"LAYOUTLIST\"),lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"parameters\",\\iter-seps(sort(\"Type\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__lit___33_62_62__char_class___range__33_33_char_class___range__62_62_char_class___range__62_62_ = (IConstructor) _read("prod(lit(\"!\\>\\>\"),[\\char-class([range(33,33)]),\\char-class([range(62,62)]),\\char-class([range(62,62)])],{})", Factory.Production);
  private static final IConstructor prod__GetAnnotation_Expression__expression_Expression_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_name_Name_ = (IConstructor) _read("prod(label(\"GetAnnotation\",sort(\"Expression\")),[label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"@\"),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\"))],{})", Factory.Production);
  private static final IConstructor prod__lit___46_46__char_class___range__46_46_char_class___range__46_46_ = (IConstructor) _read("prod(lit(\"..\"),[\\char-class([range(46,46)]),\\char-class([range(46,46)])],{})", Factory.Production);
  private static final IConstructor prod__Toplevels_Body__toplevels_iter_star_seps__Toplevel__layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"Toplevels\",sort(\"Body\")),[label(\"toplevels\",\\iter-star-seps(sort(\"Toplevel\"),[layouts(\"LAYOUTLIST\")]))],{})", Factory.Production);
  private static final IConstructor prod__Nonterminal_Sym__conditional__nonterminal_Nonterminal__not_follow__lit___91_ = (IConstructor) _read("prod(label(\"Nonterminal\",sort(\"Sym\")),[conditional(label(\"nonterminal\",lex(\"Nonterminal\")),{\\not-follow(lit(\"[\"))})],{})", Factory.Production);
  private static final IConstructor prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_ = (IConstructor) _read("prod(lit(\"throw\"),[\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(119,119)])],{})", Factory.Production);
  private static final IConstructor prod__VarArgs_Parameters__lit___40_layouts_LAYOUTLIST_formals_Formals_layouts_LAYOUTLIST_lit___46_46_46_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"VarArgs\",sort(\"Parameters\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"formals\",sort(\"Formals\")),layouts(\"LAYOUTLIST\"),lit(\"...\"),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__Data_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_data_layouts_LAYOUTLIST_user_UserType_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_variants_iter_seps__Variant__layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59__tag__Foldable = (IConstructor) _read("prod(label(\"Data\",sort(\"Declaration\")),[label(\"tags\",sort(\"Tags\")),layouts(\"LAYOUTLIST\"),label(\"visibility\",sort(\"Visibility\")),layouts(\"LAYOUTLIST\"),lit(\"data\"),layouts(\"LAYOUTLIST\"),label(\"user\",sort(\"UserType\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"variants\",\\iter-seps(sort(\"Variant\"),[layouts(\"LAYOUTLIST\"),lit(\"|\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\")],{tag(Foldable())})", Factory.Production);
  private static final IConstructor prod__Unequal_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___92_layouts_LAYOUTLIST_match_Sym__assoc__left = (IConstructor) _read("prod(label(\"Unequal\",sort(\"Sym\")),[label(\"symbol\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),lit(\"\\\\\"),layouts(\"LAYOUTLIST\"),label(\"match\",sort(\"Sym\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__Return_Statement__lit_return_layouts_LAYOUTLIST_statement_Statement__assoc__non_assoc = (IConstructor) _read("prod(label(\"Return\",sort(\"Statement\")),[lit(\"return\"),layouts(\"LAYOUTLIST\"),label(\"statement\",sort(\"Statement\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_real_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"real\")],{})", Factory.Production);
  private static final IConstructor prod__Function_Kind__lit_function_ = (IConstructor) _read("prod(label(\"Function\",sort(\"Kind\")),[lit(\"function\")],{})", Factory.Production);
  private static final IConstructor prod__Remainder_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___37_layouts_LAYOUTLIST_rhs_Expression__assoc__left = (IConstructor) _read("prod(label(\"Remainder\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"%\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__lit_on__char_class___range__111_111_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"on\"),[\\char-class([range(111,111)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__lit___47_42__char_class___range__47_47_char_class___range__42_42_ = (IConstructor) _read("prod(lit(\"/*\"),[\\char-class([range(47,47)]),\\char-class([range(42,42)])],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_break_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"break\")],{})", Factory.Production);
  private static final IConstructor prod__lit_is__char_class___range__105_105_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"is\"),[\\char-class([range(105,105)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__lit_it__char_class___range__105_105_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"it\"),[\\char-class([range(105,105)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__TryFinally_Statement__lit_try_layouts_LAYOUTLIST_body_Statement_layouts_LAYOUTLIST_handlers_iter_seps__Catch__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_finallyBody_Statement_ = (IConstructor) _read("prod(label(\"TryFinally\",sort(\"Statement\")),[lit(\"try\"),layouts(\"LAYOUTLIST\"),label(\"body\",sort(\"Statement\")),layouts(\"LAYOUTLIST\"),label(\"handlers\",\\iter-seps(sort(\"Catch\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"finally\"),layouts(\"LAYOUTLIST\"),label(\"finallyBody\",sort(\"Statement\"))],{})", Factory.Production);
  private static final IConstructor prod__User_Type__conditional__user_UserType__delete__HeaderKeyword_ = (IConstructor) _read("prod(label(\"User\",sort(\"Type\")),[conditional(label(\"user\",sort(\"UserType\")),{delete(keywords(\"HeaderKeyword\"))})],{})", Factory.Production);
  private static final IConstructor prod__Post_PathTail__post_PostPathChars_ = (IConstructor) _read("prod(label(\"Post\",sort(\"PathTail\")),[label(\"post\",lex(\"PostPathChars\"))],{})", Factory.Production);
  private static final IConstructor prod__Abstract_FunctionDeclaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_signature_Signature_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"Abstract\",sort(\"FunctionDeclaration\")),[label(\"tags\",sort(\"Tags\")),layouts(\"LAYOUTLIST\"),label(\"visibility\",sort(\"Visibility\")),layouts(\"LAYOUTLIST\"),label(\"signature\",sort(\"Signature\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__FieldAccess_Assignable__receiver_Assignable_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_field_Name_ = (IConstructor) _read("prod(label(\"FieldAccess\",sort(\"Assignable\")),[label(\"receiver\",sort(\"Assignable\")),layouts(\"LAYOUTLIST\"),lit(\".\"),layouts(\"LAYOUTLIST\"),label(\"field\",lex(\"Name\"))],{})", Factory.Production);
  private static final IConstructor prod__Bracket_Expression__lit___40_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___41__bracket = (IConstructor) _read("prod(label(\"Bracket\",sort(\"Expression\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\")],{bracket()})", Factory.Production);
  private static final IConstructor prod__lit_loc__char_class___range__108_108_char_class___range__111_111_char_class___range__99_99_ = (IConstructor) _read("prod(lit(\"loc\"),[\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(99,99)])],{})", Factory.Production);
  private static final IConstructor prod__Layout_SyntaxDefinition__vis_Visibility_layouts_LAYOUTLIST_lit_layout_layouts_LAYOUTLIST_defined_Sym_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_production_Prod_layouts_LAYOUTLIST_lit___59__tag__Foldable = (IConstructor) _read("prod(label(\"Layout\",sort(\"SyntaxDefinition\")),[label(\"vis\",sort(\"Visibility\")),layouts(\"LAYOUTLIST\"),lit(\"layout\"),layouts(\"LAYOUTLIST\"),label(\"defined\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"production\",sort(\"Prod\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{tag(Foldable())})", Factory.Production);
  private static final IConstructor prod__Precede_Sym__match_Sym_layouts_LAYOUTLIST_lit___60_60_layouts_LAYOUTLIST_symbol_Sym__assoc__right = (IConstructor) _read("prod(label(\"Precede\",sort(\"Sym\")),[label(\"match\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),lit(\"\\<\\<\"),layouts(\"LAYOUTLIST\"),label(\"symbol\",sort(\"Sym\"))],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__BooleanLiteral__lit_false_ = (IConstructor) _read("prod(lex(\"BooleanLiteral\"),[lit(\"false\")],{})", Factory.Production);
  private static final IConstructor prod__lit_in__char_class___range__105_105_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"in\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__Assert_Statement__lit_assert_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"Assert\",sort(\"Statement\")),[lit(\"assert\"),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__ReifiedConstructor_BasicType__lit_constructor_ = (IConstructor) _read("prod(label(\"ReifiedConstructor\",sort(\"BasicType\")),[lit(\"constructor\")],{})", Factory.Production);
  private static final IConstructor prod__Literal_Pattern__literal_Literal_ = (IConstructor) _read("prod(label(\"Literal\",sort(\"Pattern\")),[label(\"literal\",sort(\"Literal\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_right__char_class___range__114_114_char_class___range__105_105_char_class___range__103_103_char_class___range__104_104_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"right\"),[\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(104,104)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit_declarations__char_class___range__100_100_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"declarations\"),[\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__DatePart__char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_49_char_class___range__48_57_char_class___range__48_51_char_class___range__48_57_ = (IConstructor) _read("prod(lex(\"DatePart\"),[\\char-class([range(48,57)]),\\char-class([range(48,57)]),\\char-class([range(48,57)]),\\char-class([range(48,57)]),\\char-class([range(48,49)]),\\char-class([range(48,57)]),\\char-class([range(48,51)]),\\char-class([range(48,57)])],{})", Factory.Production);
  private static final IConstructor prod__Closure_Expression__type_Type_layouts_LAYOUTLIST_parameters_Parameters_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_statements_iter_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"Closure\",sort(\"Expression\")),[label(\"type\",sort(\"Type\")),layouts(\"LAYOUTLIST\"),label(\"parameters\",sort(\"Parameters\")),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"statements\",\\iter-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__Anti_Pattern__lit___33_layouts_LAYOUTLIST_pattern_Pattern_ = (IConstructor) _read("prod(label(\"Anti\",sort(\"Pattern\")),[lit(\"!\"),layouts(\"LAYOUTLIST\"),label(\"pattern\",sort(\"Pattern\"))],{})", Factory.Production);
  private static final IConstructor prod__DoWhile_Statement__label_Label_layouts_LAYOUTLIST_lit_do_layouts_LAYOUTLIST_body_Statement_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_condition_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"DoWhile\",sort(\"Statement\")),[label(\"label\",sort(\"Label\")),layouts(\"LAYOUTLIST\"),lit(\"do\"),layouts(\"LAYOUTLIST\"),label(\"body\",sort(\"Statement\")),layouts(\"LAYOUTLIST\"),lit(\"while\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"condition\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_test_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"test\")],{})", Factory.Production);
  private static final IConstructor prod__Join_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_join_layouts_LAYOUTLIST_rhs_Expression__assoc__left = (IConstructor) _read("prod(label(\"Join\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"join\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__Innermost_Strategy__lit_innermost_ = (IConstructor) _read("prod(label(\"Innermost\",sort(\"Strategy\")),[lit(\"innermost\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_start_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"start\")],{})", Factory.Production);
  private static final IConstructor prod__Throw_Statement__lit_throw_layouts_LAYOUTLIST_statement_Statement__assoc__non_assoc = (IConstructor) _read("prod(label(\"Throw\",sort(\"Statement\")),[lit(\"throw\"),layouts(\"LAYOUTLIST\"),label(\"statement\",sort(\"Statement\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__IfThenElse_Expression__condition_Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_thenExp_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_elseExp_Expression__assoc__right = (IConstructor) _read("prod(label(\"IfThenElse\",sort(\"Expression\")),[label(\"condition\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"?\"),layouts(\"LAYOUTLIST\"),label(\"thenExp\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),label(\"elseExp\",sort(\"Expression\"))],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__It_Expression__conditional__lit_it__not_precede__char_class___range__65_90_range__95_95_range__97_122_not_follow__char_class___range__65_90_range__95_95_range__97_122_ = (IConstructor) _read("prod(label(\"It\",sort(\"Expression\")),[conditional(lit(\"it\"),{\\not-precede(\\char-class([range(65,90),range(95,95),range(97,122)])),\\not-follow(\\char-class([range(65,90),range(95,95),range(97,122)]))})],{})", Factory.Production);
  private static final IConstructor prod__Expression_Statement__expression_Expression_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"Expression\",sort(\"Statement\")),[label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Char__char_class___range__0_31_range__33_33_range__35_38_range__40_44_range__46_59_range__61_61_range__63_90_range__94_65535__tag__category___67_111_110_115_116_97_110_116 = (IConstructor) _read("prod(lex(\"Char\"),[\\char-class([range(0,31),range(33,33),range(35,38),range(40,44),range(46,59),range(61,61),range(63,90),range(94,65535)])],{tag(category(\"Constant\"))})", Factory.Production);
  private static final IConstructor prod__lit___59__char_class___range__59_59_ = (IConstructor) _read("prod(lit(\";\"),[\\char-class([range(59,59)])],{})", Factory.Production);
  private static final IConstructor prod__lit___58__char_class___range__58_58_ = (IConstructor) _read("prod(lit(\":\"),[\\char-class([range(58,58)])],{})", Factory.Production);
  private static final IConstructor prod__Insert_Statement__lit_insert_layouts_LAYOUTLIST_dataTarget_DataTarget_layouts_LAYOUTLIST_statement_Statement__assoc__non_assoc = (IConstructor) _read("prod(label(\"Insert\",sort(\"Statement\")),[lit(\"insert\"),layouts(\"LAYOUTLIST\"),label(\"dataTarget\",sort(\"DataTarget\")),layouts(\"LAYOUTLIST\"),label(\"statement\",sort(\"Statement\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__lit___61__char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"=\"),[\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit_data__char_class___range__100_100_char_class___range__97_97_char_class___range__116_116_char_class___range__97_97_ = (IConstructor) _read("prod(lit(\"data\"),[\\char-class([range(100,100)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(97,97)])],{})", Factory.Production);
  private static final IConstructor prod__lit___60__char_class___range__60_60_ = (IConstructor) _read("prod(lit(\"\\<\"),[\\char-class([range(60,60)])],{})", Factory.Production);
  private static final IConstructor prod__Data_Kind__lit_data_ = (IConstructor) _read("prod(label(\"Data\",sort(\"Kind\")),[lit(\"data\")],{})", Factory.Production);
  private static final IConstructor prod__lit___63__char_class___range__63_63_ = (IConstructor) _read("prod(lit(\"?\"),[\\char-class([range(63,63)])],{})", Factory.Production);
  private static final IConstructor prod__Break_Statement__lit_break_layouts_LAYOUTLIST_target_Target_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"Break\",sort(\"Statement\")),[lit(\"break\"),layouts(\"LAYOUTLIST\"),label(\"target\",sort(\"Target\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Edit_ShellCommand__lit_edit_layouts_LAYOUTLIST_name_QualifiedName_ = (IConstructor) _read("prod(label(\"Edit\",sort(\"ShellCommand\")),[lit(\"edit\"),layouts(\"LAYOUTLIST\"),label(\"name\",sort(\"QualifiedName\"))],{})", Factory.Production);
  private static final IConstructor regular__opt__char_class___range__43_43_range__45_45 = (IConstructor) _read("regular(opt(\\char-class([range(43,43),range(45,45)])))", Factory.Production);
  private static final IConstructor prod__lit___33_60_60__char_class___range__33_33_char_class___range__60_60_char_class___range__60_60_ = (IConstructor) _read("prod(lit(\"!\\<\\<\"),[\\char-class([range(33,33)]),\\char-class([range(60,60)]),\\char-class([range(60,60)])],{})", Factory.Production);
  private static final IConstructor prod__lit___62__char_class___range__62_62_ = (IConstructor) _read("prod(lit(\"\\>\"),[\\char-class([range(62,62)])],{})", Factory.Production);
  private static final IConstructor prod__Default_ModuleActuals__lit___91_layouts_LAYOUTLIST_types_iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"Default\",sort(\"ModuleActuals\")),[lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"types\",\\iter-seps(sort(\"Type\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__lit_0__char_class___range__48_48_ = (IConstructor) _read("prod(lit(\"0\"),[\\char-class([range(48,48)])],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_anno_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"anno\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_insert_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"insert\")],{})", Factory.Production);
  private static final IConstructor prod__NoMatch_Expression__pattern_Pattern_layouts_LAYOUTLIST_lit___33_58_61_layouts_LAYOUTLIST_expression_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"NoMatch\",sort(\"Expression\")),[label(\"pattern\",sort(\"Pattern\")),layouts(\"LAYOUTLIST\"),lit(\"!:=\"),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__AssociativityGroup_Prod__associativity_Assoc_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_group_Prod_layouts_LAYOUTLIST_lit___41__tag__Foldable = (IConstructor) _read("prod(label(\"AssociativityGroup\",sort(\"Prod\")),[label(\"associativity\",sort(\"Assoc\")),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"group\",sort(\"Prod\")),layouts(\"LAYOUTLIST\"),lit(\")\")],{tag(Foldable())})", Factory.Production);
  private static final IConstructor prod__lit___41__char_class___range__41_41_ = (IConstructor) _read("prod(lit(\")\"),[\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__Conditional_FunctionDeclaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_signature_Signature_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit_when_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59__tag__Foldable = (IConstructor) _read("prod(label(\"Conditional\",sort(\"FunctionDeclaration\")),[label(\"tags\",sort(\"Tags\")),layouts(\"LAYOUTLIST\"),label(\"visibility\",sort(\"Visibility\")),layouts(\"LAYOUTLIST\"),label(\"signature\",sort(\"Signature\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"when\"),layouts(\"LAYOUTLIST\"),label(\"conditions\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\")],{tag(Foldable())})", Factory.Production);
  private static final IConstructor prod__lit___40__char_class___range__40_40_ = (IConstructor) _read("prod(lit(\"(\"),[\\char-class([range(40,40)])],{})", Factory.Production);
  private static final IConstructor prod__lit___43__char_class___range__43_43_ = (IConstructor) _read("prod(lit(\"+\"),[\\char-class([range(43,43)])],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_try_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"try\")],{})", Factory.Production);
  private static final IConstructor prod__lit___42__char_class___range__42_42_ = (IConstructor) _read("prod(lit(\"*\"),[\\char-class([range(42,42)])],{})", Factory.Production);
  private static final IConstructor prod__lit____char_class___range__45_45_ = (IConstructor) _read("prod(lit(\"-\"),[\\char-class([range(45,45)])],{})", Factory.Production);
  private static final IConstructor prod__OctalIntegerLiteral__char_class___range__48_48_conditional__iter__char_class___range__48_55__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_ = (IConstructor) _read("prod(lex(\"OctalIntegerLiteral\"),[\\char-class([range(48,48)]),conditional(iter(\\char-class([range(48,55)])),{\\not-follow(\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)]))})],{})", Factory.Production);
  private static final IConstructor prod__lit___44__char_class___range__44_44_ = (IConstructor) _read("prod(lit(\",\"),[\\char-class([range(44,44)])],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_non_terminal_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"non-terminal\")],{})", Factory.Production);
  private static final IConstructor prod__Fail_Statement__lit_fail_layouts_LAYOUTLIST_target_Target_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"Fail\",sort(\"Statement\")),[lit(\"fail\"),layouts(\"LAYOUTLIST\"),label(\"target\",sort(\"Target\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__lit___47__char_class___range__47_47_ = (IConstructor) _read("prod(lit(\"/\"),[\\char-class([range(47,47)])],{})", Factory.Production);
  private static final IConstructor prod__StartOfLine_Sym__lit___94_layouts_LAYOUTLIST_symbol_Sym_ = (IConstructor) _read("prod(label(\"StartOfLine\",sort(\"Sym\")),[lit(\"^\"),layouts(\"LAYOUTLIST\"),label(\"symbol\",sort(\"Sym\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_if__char_class___range__105_105_char_class___range__102_102_ = (IConstructor) _read("prod(lit(\"if\"),[\\char-class([range(105,105)]),\\char-class([range(102,102)])],{})", Factory.Production);
  private static final IConstructor prod__lit___46__char_class___range__46_46_ = (IConstructor) _read("prod(lit(\".\"),[\\char-class([range(46,46)])],{})", Factory.Production);
  private static final IConstructor prod__Expression_FunctionDeclaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_signature_Signature_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59__tag__Foldable = (IConstructor) _read("prod(label(\"Expression\",sort(\"FunctionDeclaration\")),[label(\"tags\",sort(\"Tags\")),layouts(\"LAYOUTLIST\"),label(\"visibility\",sort(\"Visibility\")),layouts(\"LAYOUTLIST\"),label(\"signature\",sort(\"Signature\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{tag(Foldable())})", Factory.Production);
  private static final IConstructor prod__lit___33__char_class___range__33_33_ = (IConstructor) _read("prod(lit(\"!\"),[\\char-class([range(33,33)])],{})", Factory.Production);
  private static final IConstructor prod__lit___35__char_class___range__35_35_ = (IConstructor) _read("prod(lit(\"#\"),[\\char-class([range(35,35)])],{})", Factory.Production);
  private static final IConstructor prod__Default_QualifiedName__conditional__names_iter_seps__Name__layouts_LAYOUTLIST_lit___58_58_layouts_LAYOUTLIST__not_follow__lit___58_58_ = (IConstructor) _read("prod(label(\"Default\",sort(\"QualifiedName\")),[conditional(label(\"names\",\\iter-seps(lex(\"Name\"),[layouts(\"LAYOUTLIST\"),lit(\"::\"),layouts(\"LAYOUTLIST\")])),{\\not-follow(lit(\"::\"))})],{})", Factory.Production);
  private static final IConstructor prod__lit___34__char_class___range__34_34_ = (IConstructor) _read("prod(lit(\"\\\"\"),[\\char-class([range(34,34)])],{})", Factory.Production);
  private static final IConstructor prod__lit___37__char_class___range__37_37_ = (IConstructor) _read("prod(lit(\"%\"),[\\char-class([range(37,37)])],{})", Factory.Production);
  private static final IConstructor prod__lit___36__char_class___range__36_36_ = (IConstructor) _read("prod(lit(\"$\"),[\\char-class([range(36,36)])],{})", Factory.Production);
  private static final IConstructor prod__lit_return__char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"return\"),[\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(117,117)]),\\char-class([range(114,114)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__lit___39__char_class___range__39_39_ = (IConstructor) _read("prod(lit(\"\\'\\\\\"),[\\char-class([range(39,39)])],{})", Factory.Production);
  private static final IConstructor prod__lit_datetime__char_class___range__100_100_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__116_116_char_class___range__105_105_char_class___range__109_109_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"datetime\"),[\\char-class([range(100,100)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit___38__char_class___range__38_38_ = (IConstructor) _read("prod(lit(\"&\"),[\\char-class([range(38,38)])],{})", Factory.Production);
  private static final IConstructor prod__Comprehension_Expression__comprehension_Comprehension_ = (IConstructor) _read("prod(label(\"Comprehension\",sort(\"Expression\")),[label(\"comprehension\",sort(\"Comprehension\"))],{})", Factory.Production);
  private static final IConstructor prod__Associativity_ProdModifier__associativity_Assoc_ = (IConstructor) _read("prod(label(\"Associativity\",sort(\"ProdModifier\")),[label(\"associativity\",sort(\"Assoc\"))],{})", Factory.Production);
  private static final IConstructor prod__Bracket_Class__lit___40_layouts_LAYOUTLIST_charclass_Class_layouts_LAYOUTLIST_lit___41__bracket = (IConstructor) _read("prod(label(\"Bracket\",sort(\"Class\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"charclass\",sort(\"Class\")),layouts(\"LAYOUTLIST\"),lit(\")\")],{bracket()})", Factory.Production);
  private static final IConstructor regular__seq___lit___92_char_class___range__123_123_range__125_125 = (IConstructor) _read("regular(seq([lit(\"\\\\\"),\\char-class([range(123,123),range(125,125)])]))", Factory.Production);
  private static final IConstructor prod__NonInterpolated_ProtocolPart__protocolChars_ProtocolChars_ = (IConstructor) _read("prod(label(\"NonInterpolated\",sort(\"ProtocolPart\")),[label(\"protocolChars\",lex(\"ProtocolChars\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_Z__char_class___range__90_90_ = (IConstructor) _read("prod(lit(\"Z\"),[\\char-class([range(90,90)])],{})", Factory.Production);
  private static final IConstructor prod__lit___91__char_class___range__91_91_ = (IConstructor) _read("prod(lit(\"[\"),[\\char-class([range(91,91)])],{})", Factory.Production);
  private static final IConstructor prod__Free_TypeVar__lit___38_layouts_LAYOUTLIST_name_Name_ = (IConstructor) _read("prod(label(\"Free\",sort(\"TypeVar\")),[lit(\"&\"),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\"))],{})", Factory.Production);
  private static final IConstructor prod__lit___94__char_class___range__94_94_ = (IConstructor) _read("prod(lit(\"^\"),[\\char-class([range(94,94)])],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_append_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"append\")],{})", Factory.Production);
  private static final IConstructor prod__lit___92__char_class___range__92_92_ = (IConstructor) _read("prod(lit(\"\\\\\"),[\\char-class([range(92,92)])],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_notin_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"notin\")],{})", Factory.Production);
  private static final IConstructor prod__lit___93__char_class___range__93_93_ = (IConstructor) _read("prod(lit(\"]\"),[\\char-class([range(93,93)])],{})", Factory.Production);
  private static final IConstructor prod__Anno_Kind__lit_anno_ = (IConstructor) _read("prod(label(\"Anno\",sort(\"Kind\")),[lit(\"anno\")],{})", Factory.Production);
  private static final IConstructor prod__lit_mod__char_class___range__109_109_char_class___range__111_111_char_class___range__100_100_ = (IConstructor) _read("prod(lit(\"mod\"),[\\char-class([range(109,109)]),\\char-class([range(111,111)]),\\char-class([range(100,100)])],{})", Factory.Production);
  private static final IConstructor prod__Help_ShellCommand__lit_help_ = (IConstructor) _read("prod(label(\"Help\",sort(\"ShellCommand\")),[lit(\"help\")],{})", Factory.Production);
  private static final IConstructor prod__lit_T__char_class___range__84_84_ = (IConstructor) _read("prod(lit(\"T\"),[\\char-class([range(84,84)])],{})", Factory.Production);
  private static final IConstructor prod__Set_Expression__lit___123_layouts_LAYOUTLIST_elements_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"Set\",sort(\"Expression\")),[lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"elements\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__lit_alias__char_class___range__97_97_char_class___range__108_108_char_class___range__105_105_char_class___range__97_97_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"alias\"),[\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__GivenVisibility_Toplevel__declaration_Declaration_ = (IConstructor) _read("prod(label(\"GivenVisibility\",sort(\"Toplevel\")),[label(\"declaration\",sort(\"Declaration\"))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_visit_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"visit\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star__char_class___range__9_9_range__32_32 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(9,9),range(32,32)])))", Factory.Production);
  private static final IConstructor prod__IfThen_Statement__label_Label_layouts_LAYOUTLIST_lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_thenStatement_Statement_layouts_LAYOUTLIST_conditional__empty__not_follow__lit_else_ = (IConstructor) _read("prod(label(\"IfThen\",sort(\"Statement\")),[label(\"label\",sort(\"Label\")),layouts(\"LAYOUTLIST\"),lit(\"if\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"conditions\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),label(\"thenStatement\",sort(\"Statement\")),layouts(\"LAYOUTLIST\"),conditional(empty(),{\\not-follow(lit(\"else\"))})],{})", Factory.Production);
  private static final IConstructor prod__Intersection_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___38_layouts_LAYOUTLIST_rhs_Expression__assoc__left = (IConstructor) _read("prod(label(\"Intersection\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"&\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__Private_Visibility__lit_private_ = (IConstructor) _read("prod(label(\"Private\",sort(\"Visibility\")),[lit(\"private\")],{})", Factory.Production);
  private static final IConstructor prod__Annotation_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_anno_layouts_LAYOUTLIST_annoType_Type_layouts_LAYOUTLIST_onType_Type_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"Annotation\",sort(\"Declaration\")),[label(\"tags\",sort(\"Tags\")),layouts(\"LAYOUTLIST\"),label(\"visibility\",sort(\"Visibility\")),layouts(\"LAYOUTLIST\"),lit(\"anno\"),layouts(\"LAYOUTLIST\"),label(\"annoType\",sort(\"Type\")),layouts(\"LAYOUTLIST\"),label(\"onType\",sort(\"Type\")),layouts(\"LAYOUTLIST\"),lit(\"@\"),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Mid_ProtocolTail__mid_MidProtocolChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_ProtocolTail_ = (IConstructor) _read("prod(label(\"Mid\",sort(\"ProtocolTail\")),[label(\"mid\",lex(\"MidProtocolChars\")),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),label(\"tail\",sort(\"ProtocolTail\"))],{})", Factory.Production);
  private static final IConstructor prod__lit___64__char_class___range__64_64_ = (IConstructor) _read("prod(lit(\"@\"),[\\char-class([range(64,64)])],{})", Factory.Production);
  private static final IConstructor prod__Default_Tags__tags_iter_star_seps__Tag__layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"Default\",sort(\"Tags\")),[label(\"tags\",\\iter-star-seps(sort(\"Tag\"),[layouts(\"LAYOUTLIST\")]))],{})", Factory.Production);
  private static final IConstructor prod__lit___43_61__char_class___range__43_43_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"+=\"),[\\char-class([range(43,43)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___123__char_class___range__123_123_ = (IConstructor) _read("prod(lit(\"{\"),[\\char-class([range(123,123)])],{})", Factory.Production);
  private static final IConstructor prod__ReifiedType_Expression__basicType_BasicType_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"ReifiedType\",sort(\"Expression\")),[label(\"basicType\",sort(\"BasicType\")),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"arguments\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__Associative_Assoc__lit_assoc_ = (IConstructor) _read("prod(label(\"Associative\",sort(\"Assoc\")),[lit(\"assoc\")],{})", Factory.Production);
  private static final IConstructor prod__lit___33_58_61__char_class___range__33_33_char_class___range__58_58_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"!:=\"),[\\char-class([range(33,33)]),\\char-class([range(58,58)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__Bag_BasicType__lit_bag_ = (IConstructor) _read("prod(label(\"Bag\",sort(\"BasicType\")),[lit(\"bag\")],{})", Factory.Production);
  private static final IConstructor prod__SplicePlus_Pattern__lit___43_layouts_LAYOUTLIST_argument_Pattern_ = (IConstructor) _read("prod(label(\"SplicePlus\",sort(\"Pattern\")),[lit(\"+\"),layouts(\"LAYOUTLIST\"),label(\"argument\",sort(\"Pattern\"))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_filter_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"filter\")],{})", Factory.Production);
  private static final IConstructor prod__lit___125__char_class___range__125_125_ = (IConstructor) _read("prod(lit(\"}\"),[\\char-class([range(125,125)])],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_while_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"while\")],{})", Factory.Production);
  private static final IConstructor prod__lit___124__char_class___range__124_124_ = (IConstructor) _read("prod(lit(\"|\"),[\\char-class([range(124,124)])],{})", Factory.Production);
  private static final IConstructor prod__lit___42_47__char_class___range__42_42_char_class___range__47_47_ = (IConstructor) _read("prod(lit(\"*/\"),[\\char-class([range(42,42)]),\\char-class([range(47,47)])],{})", Factory.Production);
  private static final IConstructor prod__TypedVariable_Pattern__type_Type_layouts_LAYOUTLIST_name_Name_ = (IConstructor) _read("prod(label(\"TypedVariable\",sort(\"Pattern\")),[label(\"type\",sort(\"Type\")),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\"))],{})", Factory.Production);
  private static final IConstructor prod__QualifiedName_Expression__qualifiedName_QualifiedName_ = (IConstructor) _read("prod(label(\"QualifiedName\",sort(\"Expression\")),[label(\"qualifiedName\",sort(\"QualifiedName\"))],{})", Factory.Production);
  private static final IConstructor prod__Conditional_Replacement__replacementExpression_Expression_layouts_LAYOUTLIST_lit_when_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"Conditional\",sort(\"Replacement\")),[label(\"replacementExpression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"when\"),layouts(\"LAYOUTLIST\"),label(\"conditions\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))],{})", Factory.Production);
  private static final IConstructor regular__alt___TagString_char_class___range__0_122_range__124_124_range__126_65535_seq___lit___92_char_class___range__123_123_range__125_125 = (IConstructor) _read("regular(alt({lex(\"TagString\"),\\char-class([range(0,122),range(124,124),range(126,65535)]),seq([lit(\"\\\\\"),\\char-class([range(123,123),range(125,125)])])}))", Factory.Production);
  private static final IConstructor prod__Index_Field__fieldIndex_IntegerLiteral_ = (IConstructor) _read("prod(label(\"Index\",sort(\"Field\")),[label(\"fieldIndex\",sort(\"IntegerLiteral\"))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_finally_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"finally\")],{})", Factory.Production);
  private static final IConstructor prod__Implication_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___61_61_62_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"Implication\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"==\\>\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__Labeled_Prod__modifiers_iter_star_seps__ProdModifier__layouts_LAYOUTLIST_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_args_iter_star_seps__Sym__layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"Labeled\",sort(\"Prod\")),[label(\"modifiers\",\\iter-star-seps(sort(\"ProdModifier\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),label(\"args\",\\iter-star-seps(sort(\"Sym\"),[layouts(\"LAYOUTLIST\")]))],{})", Factory.Production);
  private static final IConstructor prod__lit_o__char_class___range__111_111_ = (IConstructor) _read("prod(lit(\"o\"),[\\char-class([range(111,111)])],{})", Factory.Production);
  private static final IConstructor prod__MidStringChars__char_class___range__62_62_iter_star__StringCharacter_char_class___range__60_60__tag__category___67_111_110_115_116_97_110_116 = (IConstructor) _read("prod(lex(\"MidStringChars\"),[\\char-class([range(62,62)]),\\iter-star(lex(\"StringCharacter\")),\\char-class([range(60,60)])],{tag(category(\"Constant\"))})", Factory.Production);
  private static final IConstructor prod__Expression_Tag__lit___64_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_expression_Expression__tag__Folded_tag__category___67_111_109_109_101_110_116 = (IConstructor) _read("prod(label(\"Expression\",sort(\"Tag\")),[lit(\"@\"),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\"))],{tag(Folded()),tag(category(\"Comment\"))})", Factory.Production);
  private static final IConstructor prod__Intersection_Assignment__lit___38_61_ = (IConstructor) _read("prod(label(\"Intersection\",sort(\"Assignment\")),[lit(\"&=\")],{})", Factory.Production);
  private static final IConstructor prod__TagString__lit___123_contents_iter_star__alt___TagString_char_class___range__0_122_range__124_124_range__126_65535_seq___lit___92_char_class___range__123_123_range__125_125_lit___125_ = (IConstructor) _read("prod(lex(\"TagString\"),[lit(\"{\"),label(\"contents\",\\iter-star(alt({lex(\"TagString\"),\\char-class([range(0,122),range(124,124),range(126,65535)]),seq([lit(\"\\\\\"),\\char-class([range(123,123),range(125,125)])])}))),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__Labeled_DataTarget__label_Name_layouts_LAYOUTLIST_lit___58_ = (IConstructor) _read("prod(label(\"Labeled\",sort(\"DataTarget\")),[label(\"label\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),lit(\":\")],{})", Factory.Production);
  private static final IConstructor prod__lit_unimport__char_class___range__117_117_char_class___range__110_110_char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"unimport\"),[\\char-class([range(117,117)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__Map_BasicType__lit_map_ = (IConstructor) _read("prod(label(\"Map\",sort(\"BasicType\")),[lit(\"map\")],{})", Factory.Production);
  private static final IConstructor prod__RegExpModifier__iter_star__char_class___range__100_100_range__105_105_range__109_109_range__115_115_ = (IConstructor) _read("prod(lex(\"RegExpModifier\"),[\\iter-star(\\char-class([range(100,100),range(105,105),range(109,109),range(115,115)]))],{})", Factory.Production);
  private static final IConstructor prod__lit___42_61__char_class___range__42_42_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"*=\"),[\\char-class([range(42,42)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__Range_Expression__lit___91_layouts_LAYOUTLIST_first_Expression_layouts_LAYOUTLIST_lit___46_46_layouts_LAYOUTLIST_last_Expression_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"Range\",sort(\"Expression\")),[lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"first\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"..\"),layouts(\"LAYOUTLIST\"),label(\"last\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__TimeZonePart__char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_ = (IConstructor) _read("prod(lex(\"TimeZonePart\"),[\\char-class([range(43,43),range(45,45)]),\\char-class([range(48,49)]),\\char-class([range(48,57)]),\\char-class([range(48,53)]),\\char-class([range(48,57)])],{})", Factory.Production);
  private static final IConstructor regular__alt___conditional__char_class___range__42_42__not_follow__char_class___range__47_47_char_class___range__0_41_range__43_65535 = (IConstructor) _read("regular(alt({conditional(\\char-class([range(42,42)]),{\\not-follow(\\char-class([range(47,47)]))}),\\char-class([range(0,41),range(43,65535)])}))", Factory.Production);
  private static final IConstructor prod__lit_edit__char_class___range__101_101_char_class___range__100_100_char_class___range__105_105_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"edit\"),[\\char-class([range(101,101)]),\\char-class([range(100,100)]),\\char-class([range(105,105)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__Variable_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_variables_iter_seps__Variable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"Variable\",sort(\"Declaration\")),[label(\"tags\",sort(\"Tags\")),layouts(\"LAYOUTLIST\"),label(\"visibility\",sort(\"Visibility\")),layouts(\"LAYOUTLIST\"),label(\"type\",sort(\"Type\")),layouts(\"LAYOUTLIST\"),label(\"variables\",\\iter-seps(sort(\"Variable\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__RegExp__lit___60_Name_lit___62_ = (IConstructor) _read("prod(lex(\"RegExp\"),[lit(\"\\<\"),lex(\"Name\"),lit(\"\\>\")],{})", Factory.Production);
  private static final IConstructor prod__DoWhile_StringTemplate__lit_do_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_body_StringMiddle_layouts_LAYOUTLIST_postStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_condition_Expression_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"DoWhile\",sort(\"StringTemplate\")),[lit(\"do\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"preStats\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),label(\"body\",sort(\"StringMiddle\")),layouts(\"LAYOUTLIST\"),label(\"postStats\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\"),layouts(\"LAYOUTLIST\"),lit(\"while\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"condition\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__IfThenElse_StringTemplate__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStatsThen_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_thenString_StringMiddle_layouts_LAYOUTLIST_postStatsThen_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStatsElse_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_elseString_StringMiddle_layouts_LAYOUTLIST_postStatsElse_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"IfThenElse\",sort(\"StringTemplate\")),[lit(\"if\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"conditions\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"preStatsThen\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),label(\"thenString\",sort(\"StringMiddle\")),layouts(\"LAYOUTLIST\"),label(\"postStatsThen\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\"),layouts(\"LAYOUTLIST\"),lit(\"else\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"preStatsElse\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),label(\"elseString\",sort(\"StringMiddle\")),layouts(\"LAYOUTLIST\"),label(\"postStatsElse\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__RationalLiteral__char_class___range__48_57_iter_star__char_class___range__48_57_char_class___range__114_114_ = (IConstructor) _read("prod(lex(\"RationalLiteral\"),[\\char-class([range(48,57)]),\\iter-star(\\char-class([range(48,57)])),\\char-class([range(114,114)])],{})", Factory.Production);
  private static final IConstructor prod__lit_node__char_class___range__110_110_char_class___range__111_111_char_class___range__100_100_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"node\"),[\\char-class([range(110,110)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__TimeZonePart__char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_ = (IConstructor) _read("prod(lex(\"TimeZonePart\"),[\\char-class([range(43,43),range(45,45)]),\\char-class([range(48,49)]),\\char-class([range(48,57)]),lit(\":\"),\\char-class([range(48,53)]),\\char-class([range(48,57)])],{})", Factory.Production);
  private static final IConstructor regular__iter_seps__Name__layouts_LAYOUTLIST_lit___58_58_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(lex(\"Name\"),[layouts(\"LAYOUTLIST\"),lit(\"::\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_true_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"true\")],{})", Factory.Production);
  private static final IConstructor prod__Product_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___42_layouts_LAYOUTLIST_conditional__empty__not_follow__lit___42_layouts_LAYOUTLIST_rhs_Expression__assoc__left = (IConstructor) _read("prod(label(\"Product\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"*\"),layouts(\"LAYOUTLIST\"),conditional(empty(),{\\not-follow(lit(\"*\"))}),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__Solve_Statement__lit_solve_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_variables_iter_seps__QualifiedName__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_bound_Bound_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_body_Statement_ = (IConstructor) _read("prod(label(\"Solve\",sort(\"Statement\")),[lit(\"solve\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"variables\",\\iter-seps(sort(\"QualifiedName\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),label(\"bound\",sort(\"Bound\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),label(\"body\",sort(\"Statement\"))],{})", Factory.Production);
  private static final IConstructor prod__Visit_Expression__label_Label_layouts_LAYOUTLIST_visit_Visit_ = (IConstructor) _read("prod(label(\"Visit\",sort(\"Expression\")),[label(\"label\",sort(\"Label\")),layouts(\"LAYOUTLIST\"),label(\"visit\",sort(\"Visit\"))],{})", Factory.Production);
  private static final IConstructor prod__Actuals_ImportedModule__name_QualifiedName_layouts_LAYOUTLIST_actuals_ModuleActuals_ = (IConstructor) _read("prod(label(\"Actuals\",sort(\"ImportedModule\")),[label(\"name\",sort(\"QualifiedName\")),layouts(\"LAYOUTLIST\"),label(\"actuals\",sort(\"ModuleActuals\"))],{})", Factory.Production);
  private static final IConstructor regular__iter__char_class___range__48_57_range__65_70_range__97_102 = (IConstructor) _read("regular(iter(\\char-class([range(48,57),range(65,70),range(97,102)])))", Factory.Production);
  private static final IConstructor prod__lit___36_84__char_class___range__36_36_char_class___range__84_84_ = (IConstructor) _read("prod(lit(\"$T\"),[\\char-class([range(36,36)]),\\char-class([range(84,84)])],{})", Factory.Production);
  private static final IConstructor prod__lit_do__char_class___range__100_100_char_class___range__111_111_ = (IConstructor) _read("prod(lit(\"do\"),[\\char-class([range(100,100)]),\\char-class([range(111,111)])],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_import_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"import\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_assert_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"assert\")],{})", Factory.Production);
  private static final IConstructor prod__Default_Mapping__Expression__from_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_to_Expression_ = (IConstructor) _read("prod(label(\"Default\",\\parameterized-sort(\"Mapping\",[sort(\"Expression\")])),[label(\"from\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),label(\"to\",sort(\"Expression\"))],{})", Factory.Production);
  private static final IConstructor prod__RegExp_Literal__regExpLiteral_RegExpLiteral_ = (IConstructor) _read("prod(label(\"RegExp\",sort(\"Literal\")),[label(\"regExpLiteral\",lex(\"RegExpLiteral\"))],{})", Factory.Production);
  private static final IConstructor prod__Rational_Literal__rationalLiteral_RationalLiteral_ = (IConstructor) _read("prod(label(\"Rational\",sort(\"Literal\")),[label(\"rationalLiteral\",lex(\"RationalLiteral\"))],{})", Factory.Production);
  private static final IConstructor prod__String_BasicType__lit_str_ = (IConstructor) _read("prod(label(\"String\",sort(\"BasicType\")),[lit(\"str\")],{})", Factory.Production);
  private static final IConstructor prod__lit_java__char_class___range__106_106_char_class___range__97_97_char_class___range__118_118_char_class___range__97_97_ = (IConstructor) _read("prod(lit(\"java\"),[\\char-class([range(106,106)]),\\char-class([range(97,97)]),\\char-class([range(118,118)]),\\char-class([range(97,97)])],{})", Factory.Production);
  private static final IConstructor prod__Optional_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___63_ = (IConstructor) _read("prod(label(\"Optional\",sort(\"Sym\")),[label(\"symbol\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),lit(\"?\")],{})", Factory.Production);
  private static final IConstructor prod__Bracket_Type__lit___40_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_lit___41__bracket = (IConstructor) _read("prod(label(\"Bracket\",sort(\"Type\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"type\",sort(\"Type\")),layouts(\"LAYOUTLIST\"),lit(\")\")],{bracket()})", Factory.Production);
  private static final IConstructor regular__opt__TimeZonePart = (IConstructor) _read("regular(opt(lex(\"TimeZonePart\")))", Factory.Production);
  private static final IConstructor prod__InsertBefore_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_rhs_Expression__assoc__left = (IConstructor) _read("prod(label(\"InsertBefore\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"\\>\\>\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__IterSep_Sym__lit___123_layouts_LAYOUTLIST_symbol_Sym_layouts_LAYOUTLIST_sep_Sym_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit___43_ = (IConstructor) _read("prod(label(\"IterSep\",sort(\"Sym\")),[lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"symbol\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),label(\"sep\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),lit(\"}\"),layouts(\"LAYOUTLIST\"),lit(\"+\")],{})", Factory.Production);
  private static final IConstructor prod__Value_BasicType__lit_value_ = (IConstructor) _read("prod(label(\"Value\",sort(\"BasicType\")),[lit(\"value\")],{})", Factory.Production);
  private static final IConstructor prod__Difference_Class__lhs_Class_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_rhs_Class__assoc__left = (IConstructor) _read("prod(label(\"Difference\",sort(\"Class\")),[label(\"lhs\",sort(\"Class\")),layouts(\"LAYOUTLIST\"),lit(\"-\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Class\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__Constructor_Assignable__name_Name_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_seps__Assignable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"Constructor\",sort(\"Assignable\")),[label(\"name\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"arguments\",\\iter-seps(sort(\"Assignable\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__CallOrTree_Pattern__expression_Pattern_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"CallOrTree\",sort(\"Pattern\")),[label(\"expression\",sort(\"Pattern\")),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"arguments\",\\iter-star-seps(sort(\"Pattern\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__IfThen_StringTemplate__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_body_StringMiddle_layouts_LAYOUTLIST_postStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"IfThen\",sort(\"StringTemplate\")),[lit(\"if\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"conditions\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"preStats\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),label(\"body\",sort(\"StringMiddle\")),layouts(\"LAYOUTLIST\"),label(\"postStats\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__Complement_Class__lit___33_layouts_LAYOUTLIST_charClass_Class_ = (IConstructor) _read("prod(label(\"Complement\",sort(\"Class\")),[lit(\"!\"),layouts(\"LAYOUTLIST\"),label(\"charClass\",sort(\"Class\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_quit__char_class___range__113_113_char_class___range__117_117_char_class___range__105_105_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"quit\"),[\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(105,105)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__Tag_ProdModifier__tag_Tag_ = (IConstructor) _read("prod(label(\"Tag\",sort(\"ProdModifier\")),[label(\"tag\",sort(\"Tag\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_tuple__char_class___range__116_116_char_class___range__117_117_char_class___range__112_112_char_class___range__108_108_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"tuple\"),[\\char-class([range(116,116)]),\\char-class([range(117,117)]),\\char-class([range(112,112)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__Default_StructuredType__basicType_BasicType_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_arguments_iter_seps__TypeArg__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"Default\",sort(\"StructuredType\")),[label(\"basicType\",sort(\"BasicType\")),layouts(\"LAYOUTLIST\"),lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"arguments\",\\iter-seps(sort(\"TypeArg\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor regular__iter_seps__Variant__layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"Variant\"),[layouts(\"LAYOUTLIST\"),lit(\"|\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__MidProtocolChars__lit___62_URLChars_lit___60_ = (IConstructor) _read("prod(lex(\"MidProtocolChars\"),[lit(\"\\>\"),lex(\"URLChars\"),lit(\"\\<\")],{})", Factory.Production);
  private static final IConstructor prod__Location_Literal__locationLiteral_LocationLiteral_ = (IConstructor) _read("prod(label(\"Location\",sort(\"Literal\")),[label(\"locationLiteral\",sort(\"LocationLiteral\"))],{})", Factory.Production);
  private static final IConstructor prod__Default_Visibility__ = (IConstructor) _read("prod(label(\"Default\",sort(\"Visibility\")),[],{})", Factory.Production);
  private static final IConstructor prod__layouts_LAYOUTLIST__conditional__iter_star__LAYOUT__not_follow__char_class___range__9_10_range__13_13_range__32_32_not_follow__lit___47_47_not_follow__lit___47_42_ = (IConstructor) _read("prod(layouts(\"LAYOUTLIST\"),[conditional(\\iter-star(lex(\"LAYOUT\")),{\\not-follow(\\char-class([range(9,10),range(13,13),range(32,32)])),\\not-follow(lit(\"//\")),\\not-follow(lit(\"/*\"))})],{})", Factory.Production);
  private static final IConstructor prod__Set_BasicType__lit_set_ = (IConstructor) _read("prod(label(\"Set\",sort(\"BasicType\")),[lit(\"set\")],{})", Factory.Production);
  private static final IConstructor prod__Addition_Assignment__lit___43_61_ = (IConstructor) _read("prod(label(\"Addition\",sort(\"Assignment\")),[lit(\"+=\")],{})", Factory.Production);
  private static final IConstructor prod__FunctionDeclaration_Statement__functionDeclaration_FunctionDeclaration_ = (IConstructor) _read("prod(label(\"FunctionDeclaration\",sort(\"Statement\")),[label(\"functionDeclaration\",sort(\"FunctionDeclaration\"))],{})", Factory.Production);
  private static final IConstructor prod__Empty_Target__ = (IConstructor) _read("prod(label(\"Empty\",sort(\"Target\")),[],{})", Factory.Production);
  private static final IConstructor prod__lit_has__char_class___range__104_104_char_class___range__97_97_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"has\"),[\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__Tuple_Pattern__lit___60_layouts_LAYOUTLIST_elements_iter_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___62_ = (IConstructor) _read("prod(label(\"Tuple\",sort(\"Pattern\")),[lit(\"\\<\"),layouts(\"LAYOUTLIST\"),label(\"elements\",\\iter-seps(sort(\"Pattern\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"\\>\")],{})", Factory.Production);
  private static final IConstructor prod__Right_Assoc__lit_right_ = (IConstructor) _read("prod(label(\"Right\",sort(\"Assoc\")),[lit(\"right\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_bag_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"bag\")],{})", Factory.Production);
  private static final IConstructor prod__NamedRegExp__lit___60_Name_lit___62_ = (IConstructor) _read("prod(lex(\"NamedRegExp\"),[lit(\"\\<\"),lex(\"Name\"),lit(\"\\>\")],{})", Factory.Production);
  private static final IConstructor prod__Empty_Sym__lit___40_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"Empty\",sort(\"Sym\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor regular__seq___conditional__char_class___range__65_90_range__95_95_range__97_122__not_precede__char_class___range__65_90_range__95_95_range__97_122_conditional__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122 = (IConstructor) _read("regular(seq([conditional(\\char-class([range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)]))})]))", Factory.Production);
  private static final IConstructor prod__lit_outermost__char_class___range__111_111_char_class___range__117_117_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__109_109_char_class___range__111_111_char_class___range__115_115_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"outermost\"),[\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(109,109)]),\\char-class([range(111,111)]),\\char-class([range(115,115)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__Negation_Expression__lit___33_layouts_LAYOUTLIST_argument_Expression_ = (IConstructor) _read("prod(label(\"Negation\",sort(\"Expression\")),[lit(\"!\"),layouts(\"LAYOUTLIST\"),label(\"argument\",sort(\"Expression\"))],{})", Factory.Production);
  private static final IConstructor prod__Interpolated_StringMiddle__mid_MidStringChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_StringMiddle_ = (IConstructor) _read("prod(label(\"Interpolated\",sort(\"StringMiddle\")),[label(\"mid\",lex(\"MidStringChars\")),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),label(\"tail\",sort(\"StringMiddle\"))],{})", Factory.Production);
  private static final IConstructor prod__Default_Catch__lit_catch_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_body_Statement_ = (IConstructor) _read("prod(label(\"Default\",sort(\"Catch\")),[lit(\"catch\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),label(\"body\",sort(\"Statement\"))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_case_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"case\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_layout_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"layout\")],{})", Factory.Production);
  private static final IConstructor prod__IterStarSep_Sym__lit___123_layouts_LAYOUTLIST_symbol_Sym_layouts_LAYOUTLIST_sep_Sym_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit___42_ = (IConstructor) _read("prod(label(\"IterStarSep\",sort(\"Sym\")),[lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"symbol\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),label(\"sep\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),lit(\"}\"),layouts(\"LAYOUTLIST\"),lit(\"*\")],{})", Factory.Production);
  private static final IConstructor prod__NonInterpolated_PathPart__pathChars_PathChars_ = (IConstructor) _read("prod(label(\"NonInterpolated\",sort(\"PathPart\")),[label(\"pathChars\",lex(\"PathChars\"))],{})", Factory.Production);
  private static final IConstructor prod__lit___38_38__char_class___range__38_38_char_class___range__38_38_ = (IConstructor) _read("prod(lit(\"&&\"),[\\char-class([range(38,38)]),\\char-class([range(38,38)])],{})", Factory.Production);
  private static final IConstructor prod__Addition_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___43_layouts_LAYOUTLIST_rhs_Expression__assoc__left = (IConstructor) _read("prod(label(\"Addition\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"+\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__For_StringTemplate__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_body_StringMiddle_layouts_LAYOUTLIST_postStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"For\",sort(\"StringTemplate\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"generators\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"preStats\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),label(\"body\",sort(\"StringMiddle\")),layouts(\"LAYOUTLIST\"),label(\"postStats\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star__char_class___range__9_10_range__13_13_range__32_32 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(9,10),range(13,13),range(32,32)])))", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_any_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"any\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_all_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"all\")],{})", Factory.Production);
  private static final IConstructor prod__Symbol_Type__symbol_Sym_ = (IConstructor) _read("prod(label(\"Symbol\",sort(\"Type\")),[label(\"symbol\",sort(\"Sym\"))],{})", Factory.Production);
  private static final IConstructor prod__Present_Start__lit_start_ = (IConstructor) _read("prod(label(\"Present\",sort(\"Start\")),[lit(\"start\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_adt_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"adt\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__BasicType_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[sort(\"BasicType\")],{})", Factory.Production);
  private static final IConstructor prod__lit___38_61__char_class___range__38_38_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"&=\"),[\\char-class([range(38,38)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__DecimalIntegerLiteral__conditional__lit_0__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_ = (IConstructor) _read("prod(lex(\"DecimalIntegerLiteral\"),[conditional(lit(\"0\"),{\\not-follow(\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)]))})],{})", Factory.Production);
  private static final IConstructor prod__Default_ModuleParameters__lit___91_layouts_LAYOUTLIST_parameters_iter_seps__TypeVar__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"Default\",sort(\"ModuleParameters\")),[lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"parameters\",\\iter-seps(sort(\"TypeVar\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__Character_Range__character_Char_ = (IConstructor) _read("prod(label(\"Character\",sort(\"Range\")),[label(\"character\",lex(\"Char\"))],{})", Factory.Production);
  private static final IConstructor prod__Or_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_rhs_Expression__assoc__left = (IConstructor) _read("prod(label(\"Or\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"||\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__Selector_Type__selector_DataTypeSelector_ = (IConstructor) _read("prod(label(\"Selector\",sort(\"Type\")),[label(\"selector\",sort(\"DataTypeSelector\"))],{})", Factory.Production);
  private static final IConstructor regular__iter_seps__Catch__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"Catch\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__TransitiveClosure_Expression__argument_Expression_layouts_LAYOUTLIST_conditional__lit___43__not_follow__lit___61_ = (IConstructor) _read("prod(label(\"TransitiveClosure\",sort(\"Expression\")),[label(\"argument\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),conditional(lit(\"+\"),{\\not-follow(lit(\"=\"))})],{})", Factory.Production);
  private static final IConstructor prod__lit___33_61__char_class___range__33_33_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"!=\"),[\\char-class([range(33,33)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__Start_Sym__lit_start_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_nonterminal_Nonterminal_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"Start\",sort(\"Sym\")),[lit(\"start\"),layouts(\"LAYOUTLIST\"),lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"nonterminal\",lex(\"Nonterminal\")),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__Equals_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___61_61_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"Equals\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"==\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__Default_Renaming__from_Name_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_to_Name_ = (IConstructor) _read("prod(label(\"Default\",sort(\"Renaming\")),[label(\"from\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),lit(\"=\\>\"),layouts(\"LAYOUTLIST\"),label(\"to\",lex(\"Name\"))],{})", Factory.Production);
  private static final IConstructor prod__Iter_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___43_ = (IConstructor) _read("prod(label(\"Iter\",sort(\"Sym\")),[label(\"symbol\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),lit(\"+\")],{})", Factory.Production);
  private static final IConstructor prod__Subscript_Assignable__receiver_Assignable_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_subscript_Expression_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"Subscript\",sort(\"Assignable\")),[label(\"receiver\",sort(\"Assignable\")),layouts(\"LAYOUTLIST\"),lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"subscript\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__lit_anno__char_class___range__97_97_char_class___range__110_110_char_class___range__110_110_char_class___range__111_111_ = (IConstructor) _read("prod(lit(\"anno\"),[\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(110,110)]),\\char-class([range(111,111)])],{})", Factory.Production);
  private static final IConstructor prod__Rule_Declaration__tags_Tags_layouts_LAYOUTLIST_lit_rule_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_patternAction_PatternWithAction_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"Rule\",sort(\"Declaration\")),[label(\"tags\",sort(\"Tags\")),layouts(\"LAYOUTLIST\"),lit(\"rule\"),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),label(\"patternAction\",sort(\"PatternWithAction\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Default_LocationLiteral__protocolPart_ProtocolPart_layouts_LAYOUTLIST_pathPart_PathPart_ = (IConstructor) _read("prod(label(\"Default\",sort(\"LocationLiteral\")),[label(\"protocolPart\",sort(\"ProtocolPart\")),layouts(\"LAYOUTLIST\"),label(\"pathPart\",sort(\"PathPart\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_top_down__char_class___range__116_116_char_class___range__111_111_char_class___range__112_112_char_class___range__45_45_char_class___range__100_100_char_class___range__111_111_char_class___range__119_119_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"top-down\"),[\\char-class([range(116,116)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(45,45)]),\\char-class([range(100,100)]),\\char-class([range(111,111)]),\\char-class([range(119,119)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__lit___46_46_46__char_class___range__46_46_char_class___range__46_46_char_class___range__46_46_ = (IConstructor) _read("prod(lit(\"...\"),[\\char-class([range(46,46)]),\\char-class([range(46,46)]),\\char-class([range(46,46)])],{})", Factory.Production);
  private static final IConstructor prod__EndOfLine_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___36_ = (IConstructor) _read("prod(label(\"EndOfLine\",sort(\"Sym\")),[label(\"symbol\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),lit(\"$\")],{})", Factory.Production);
  private static final IConstructor prod__lit_top_down_break__char_class___range__116_116_char_class___range__111_111_char_class___range__112_112_char_class___range__45_45_char_class___range__100_100_char_class___range__111_111_char_class___range__119_119_char_class___range__110_110_char_class___range__45_45_char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_ = (IConstructor) _read("prod(lit(\"top-down-break\"),[\\char-class([range(116,116)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(45,45)]),\\char-class([range(100,100)]),\\char-class([range(111,111)]),\\char-class([range(119,119)]),\\char-class([range(110,110)]),\\char-class([range(45,45)]),\\char-class([range(98,98)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(107,107)])],{})", Factory.Production);
  private static final IConstructor prod__lit_view__char_class___range__118_118_char_class___range__105_105_char_class___range__101_101_char_class___range__119_119_ = (IConstructor) _read("prod(lit(\"view\"),[\\char-class([range(118,118)]),\\char-class([range(105,105)]),\\char-class([range(101,101)]),\\char-class([range(119,119)])],{})", Factory.Production);
  private static final IConstructor prod__lit_innermost__char_class___range__105_105_char_class___range__110_110_char_class___range__110_110_char_class___range__101_101_char_class___range__114_114_char_class___range__109_109_char_class___range__111_111_char_class___range__115_115_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"innermost\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(109,109)]),\\char-class([range(111,111)]),\\char-class([range(115,115)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit_one__char_class___range__111_111_char_class___range__110_110_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"one\"),[\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__SetAnnotation_Expression__expression_Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_value_Expression_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"SetAnnotation\",sort(\"Expression\")),[label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"[\"),layouts(\"LAYOUTLIST\"),lit(\"@\"),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"value\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__Empty_DataTarget__ = (IConstructor) _read("prod(label(\"Empty\",sort(\"DataTarget\")),[],{})", Factory.Production);
  private static final IConstructor prod__lit_reified__char_class___range__114_114_char_class___range__101_101_char_class___range__105_105_char_class___range__102_102_char_class___range__105_105_char_class___range__101_101_char_class___range__100_100_ = (IConstructor) _read("prod(lit(\"reified\"),[\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(105,105)]),\\char-class([range(102,102)]),\\char-class([range(105,105)]),\\char-class([range(101,101)]),\\char-class([range(100,100)])],{})", Factory.Production);
  private static final IConstructor prod__Binding_Catch__lit_catch_layouts_LAYOUTLIST_pattern_Pattern_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_body_Statement_ = (IConstructor) _read("prod(label(\"Binding\",sort(\"Catch\")),[lit(\"catch\"),layouts(\"LAYOUTLIST\"),label(\"pattern\",sort(\"Pattern\")),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),label(\"body\",sort(\"Statement\"))],{})", Factory.Production);
  private static final IConstructor regular__iter_seps__Sym__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"Sym\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__IfDefinedOtherwise_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"IfDefinedOtherwise\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"?\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Range__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Range\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"while\"),[\\char-class([range(119,119)]),\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor regular__iter_seps__TypeArg__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"TypeArg\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__lit_notin__char_class___range__110_110_char_class___range__111_111_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"notin\"),[\\char-class([range(110,110)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor regular__iter_seps__Renaming__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"Renaming\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__Unimport_ShellCommand__lit_unimport_layouts_LAYOUTLIST_name_QualifiedName_ = (IConstructor) _read("prod(label(\"Unimport\",sort(\"ShellCommand\")),[lit(\"unimport\"),layouts(\"LAYOUTLIST\"),label(\"name\",sort(\"QualifiedName\"))],{})", Factory.Production);
  private static final IConstructor prod__Default_Renamings__lit_renaming_layouts_LAYOUTLIST_renamings_iter_seps__Renaming__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"Default\",sort(\"Renamings\")),[lit(\"renaming\"),layouts(\"LAYOUTLIST\"),label(\"renamings\",\\iter-seps(sort(\"Renaming\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_dynamic_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"dynamic\")],{})", Factory.Production);
  private static final IConstructor prod__Renamings_ImportedModule__name_QualifiedName_layouts_LAYOUTLIST_renamings_Renamings_ = (IConstructor) _read("prod(label(\"Renamings\",sort(\"ImportedModule\")),[label(\"name\",sort(\"QualifiedName\")),layouts(\"LAYOUTLIST\"),label(\"renamings\",sort(\"Renamings\"))],{})", Factory.Production);
  private static final IConstructor prod__Rest__conditional__iter_star__char_class___range__0_65535__not_follow__char_class___range__0_65535_ = (IConstructor) _read("prod(lex(\"Rest\"),[conditional(\\iter-star(\\char-class([range(0,65535)])),{\\not-follow(\\char-class([range(0,65535)]))})],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_data_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"data\")],{})", Factory.Production);
  private static final IConstructor prod__Labeled_Sym__symbol_Sym_layouts_LAYOUTLIST_label_NonterminalLabel_ = (IConstructor) _read("prod(label(\"Labeled\",sort(\"Sym\")),[label(\"symbol\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),label(\"label\",lex(\"NonterminalLabel\"))],{})", Factory.Production);
  private static final IConstructor prod__HexIntegerLiteral_IntegerLiteral__hex_HexIntegerLiteral_ = (IConstructor) _read("prod(label(\"HexIntegerLiteral\",sort(\"IntegerLiteral\")),[label(\"hex\",lex(\"HexIntegerLiteral\"))],{})", Factory.Production);
  private static final IConstructor regular__opt__seq___char_class___range__48_57_opt__char_class___range__48_57 = (IConstructor) _read("regular(opt(seq([\\char-class([range(48,57)]),opt(\\char-class([range(48,57)]))])))", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_catch_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"catch\")],{})", Factory.Production);
  private static final IConstructor prod__GlobalDirective_Statement__lit_global_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_names_iter_seps__QualifiedName__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"GlobalDirective\",sort(\"Statement\")),[lit(\"global\"),layouts(\"LAYOUTLIST\"),label(\"type\",sort(\"Type\")),layouts(\"LAYOUTLIST\"),label(\"names\",\\iter-seps(sort(\"QualifiedName\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Test_FunctionModifier__lit_test_ = (IConstructor) _read("prod(label(\"Test\",sort(\"FunctionModifier\")),[lit(\"test\")],{})", Factory.Production);
  private static final IConstructor prod__Default_Tag__lit___64_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_contents_TagString__tag__Folded_tag__category___67_111_109_109_101_110_116 = (IConstructor) _read("prod(label(\"Default\",sort(\"Tag\")),[lit(\"@\"),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),label(\"contents\",lex(\"TagString\"))],{tag(Folded()),tag(category(\"Comment\"))})", Factory.Production);
  private static final IConstructor prod__Language_SyntaxDefinition__start_Start_layouts_LAYOUTLIST_lit_syntax_layouts_LAYOUTLIST_defined_Sym_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_production_Prod_layouts_LAYOUTLIST_lit___59__tag__Foldable = (IConstructor) _read("prod(label(\"Language\",sort(\"SyntaxDefinition\")),[label(\"start\",sort(\"Start\")),layouts(\"LAYOUTLIST\"),lit(\"syntax\"),layouts(\"LAYOUTLIST\"),label(\"defined\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"production\",sort(\"Prod\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{tag(Foldable())})", Factory.Production);
  private static final IConstructor prod__Default_Import__lit_import_layouts_LAYOUTLIST_module_ImportedModule_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"Default\",sort(\"Import\")),[lit(\"import\"),layouts(\"LAYOUTLIST\"),label(\"module\",sort(\"ImportedModule\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Switch_Statement__label_Label_layouts_LAYOUTLIST_lit_switch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_cases_iter_seps__Case__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"Switch\",sort(\"Statement\")),[label(\"label\",sort(\"Label\")),layouts(\"LAYOUTLIST\"),lit(\"switch\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"cases\",\\iter-seps(sort(\"Case\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__ReifiedNonTerminal_BasicType__lit_non_terminal_ = (IConstructor) _read("prod(label(\"ReifiedNonTerminal\",sort(\"BasicType\")),[lit(\"non-terminal\")],{})", Factory.Production);
  private static final IConstructor prod__List_BasicType__lit_list_ = (IConstructor) _read("prod(label(\"List\",sort(\"BasicType\")),[lit(\"list\")],{})", Factory.Production);
  private static final IConstructor prod__VariableDeclaration_Statement__declaration_LocalVariableDeclaration_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"VariableDeclaration\",sort(\"Statement\")),[label(\"declaration\",sort(\"LocalVariableDeclaration\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__ProtocolChars__char_class___range__124_124_URLChars_conditional__lit___58_47_47__not_follow__char_class___range__9_10_range__13_13_range__32_32_ = (IConstructor) _read("prod(lex(\"ProtocolChars\"),[\\char-class([range(124,124)]),lex(\"URLChars\"),conditional(lit(\"://\"),{\\not-follow(\\char-class([range(9,10),range(13,13),range(32,32)]))})],{})", Factory.Production);
  private static final IConstructor prod__CaseInsensitiveStringConstant__lit___39_iter_star__StringCharacter_lit___39__tag__category___67_111_110_115_116_97_110_116 = (IConstructor) _read("prod(lex(\"CaseInsensitiveStringConstant\"),[lit(\"\\'\\\\\"),\\iter-star(lex(\"StringCharacter\")),lit(\"\\'\\\\\")],{tag(category(\"Constant\"))})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_assoc_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"assoc\")],{})", Factory.Production);
  private static final IConstructor prod__Match_Expression__pattern_Pattern_layouts_LAYOUTLIST_lit___58_61_layouts_LAYOUTLIST_expression_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"Match\",sort(\"Expression\")),[label(\"pattern\",sort(\"Pattern\")),layouts(\"LAYOUTLIST\"),lit(\":=\"),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__Nonterminal__conditional__char_class___range__65_90__not_precede__char_class___range__65_90_conditional__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_delete__RascalReservedKeywords_ = (IConstructor) _read("prod(lex(\"Nonterminal\"),[conditional(\\char-class([range(65,90)]),{\\not-precede(\\char-class([range(65,90)]))}),conditional(\\iter-star(\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)])),delete(sort(\"RascalReservedKeywords\"))})],{})", Factory.Production);
  private static final IConstructor prod__ActualsRenaming_ImportedModule__name_QualifiedName_layouts_LAYOUTLIST_actuals_ModuleActuals_layouts_LAYOUTLIST_renamings_Renamings_ = (IConstructor) _read("prod(label(\"ActualsRenaming\",sort(\"ImportedModule\")),[label(\"name\",sort(\"QualifiedName\")),layouts(\"LAYOUTLIST\"),label(\"actuals\",sort(\"ModuleActuals\")),layouts(\"LAYOUTLIST\"),label(\"renamings\",sort(\"Renamings\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_default__char_class___range__100_100_char_class___range__101_101_char_class___range__102_102_char_class___range__97_97_char_class___range__117_117_char_class___range__108_108_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"default\"),[\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__Name_UserType__name_QualifiedName_ = (IConstructor) _read("prod(label(\"Name\",sort(\"UserType\")),[label(\"name\",sort(\"QualifiedName\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_bool__char_class___range__98_98_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_ = (IConstructor) _read("prod(lit(\"bool\"),[\\char-class([range(98,98)]),\\char-class([range(111,111)]),\\char-class([range(111,111)]),\\char-class([range(108,108)])],{})", Factory.Production);
  private static final IConstructor prod__Expression_Command__expression_Expression_ = (IConstructor) _read("prod(label(\"Expression\",sort(\"Command\")),[label(\"expression\",sort(\"Expression\"))],{})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Statement__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__EmptyStatement_Statement__lit___59_ = (IConstructor) _read("prod(label(\"EmptyStatement\",sort(\"Statement\")),[lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__NAryConstructor_Variant__name_Name_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__TypeArg__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"NAryConstructor\",sort(\"Variant\")),[label(\"name\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"arguments\",\\iter-star-seps(sort(\"TypeArg\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__ReifiedType_BasicType__lit_type_ = (IConstructor) _read("prod(label(\"ReifiedType\",sort(\"BasicType\")),[lit(\"type\")],{})", Factory.Production);
  private static final IConstructor regular__opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102 = (IConstructor) _read("regular(opt(\\char-class([range(68,68),range(70,70),range(100,100),range(102,102)])))", Factory.Production);
  private static final IConstructor prod__Equivalence_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___60_61_61_62_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"Equivalence\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"\\<==\\>\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__TransitiveReflexiveClosure_Expression__argument_Expression_layouts_LAYOUTLIST_conditional__lit___42__not_follow__lit___61_ = (IConstructor) _read("prod(label(\"TransitiveReflexiveClosure\",sort(\"Expression\")),[label(\"argument\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),conditional(lit(\"*\"),{\\not-follow(lit(\"=\"))})],{})", Factory.Production);
  private static final IConstructor regular__iter_star__LAYOUT = (IConstructor) _read("regular(\\iter-star(lex(\"LAYOUT\")))", Factory.Production);
  private static final IConstructor prod__Set_Comprehension__lit___123_layouts_LAYOUTLIST_results_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"Set\",sort(\"Comprehension\")),[lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"results\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"|\"),layouts(\"LAYOUTLIST\"),label(\"generators\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Pattern\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__Reference_Prod__lit___58_layouts_LAYOUTLIST_referenced_Name_ = (IConstructor) _read("prod(label(\"Reference\",sort(\"Prod\")),[lit(\":\"),layouts(\"LAYOUTLIST\"),label(\"referenced\",lex(\"Name\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_variable__char_class___range__118_118_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"variable\"),[\\char-class([range(118,118)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__Empty_Bound__ = (IConstructor) _read("prod(label(\"Empty\",sort(\"Bound\")),[],{})", Factory.Production);
  private static final IConstructor prod__HeaderKeyword__lit_start_ = (IConstructor) _read("prod(keywords(\"HeaderKeyword\"),[lit(\"start\")],{})", Factory.Production);
  private static final IConstructor prod__lit_rule__char_class___range__114_114_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"rule\"),[\\char-class([range(114,114)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit___60_61_61_62__char_class___range__60_60_char_class___range__61_61_char_class___range__61_61_char_class___range__62_62_ = (IConstructor) _read("prod(lit(\"\\<==\\>\"),[\\char-class([range(60,60)]),\\char-class([range(61,61)]),\\char-class([range(61,61)]),\\char-class([range(62,62)])],{})", Factory.Production);
  private static final IConstructor prod__StringConstant__lit___34_iter_star__StringCharacter_lit___34__tag__category___67_111_110_115_116_97_110_116 = (IConstructor) _read("prod(lex(\"StringConstant\"),[lit(\"\\\"\"),\\iter-star(lex(\"StringCharacter\")),lit(\"\\\"\")],{tag(category(\"Constant\"))})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Mapping__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(\\parameterized-sort(\"Mapping\",[sort(\"Expression\")]),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__lit_str__char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_ = (IConstructor) _read("prod(lit(\"str\"),[\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(114,114)])],{})", Factory.Production);
  private static final IConstructor prod__layouts_$QUOTES__conditional__iter_star__char_class___range__9_10_range__13_13_range__32_32__not_follow__char_class___range__9_10_range__13_13_range__32_32_ = (IConstructor) _read("prod(layouts(\"$QUOTES\"),[conditional(\\iter-star(\\char-class([range(9,10),range(13,13),range(32,32)])),{\\not-follow(\\char-class([range(9,10),range(13,13),range(32,32)]))})],{})", Factory.Production);
  private static final IConstructor regular__iter_seps__Field__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"Field\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__SimpleCharclass_Class__lit___91_layouts_LAYOUTLIST_ranges_iter_star_seps__Range__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"SimpleCharclass\",sort(\"Class\")),[lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"ranges\",\\iter-star-seps(sort(\"Range\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__PreProtocolChars__lit___124_URLChars_lit___60_ = (IConstructor) _read("prod(lex(\"PreProtocolChars\"),[lit(\"|\"),lex(\"URLChars\"),lit(\"\\<\")],{})", Factory.Production);
  private static final IConstructor prod__Subtraction_Assignment__lit___45_61_ = (IConstructor) _read("prod(label(\"Subtraction\",sort(\"Assignment\")),[lit(\"-=\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_int_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"int\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__TypeArg__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"TypeArg\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__Post_ProtocolTail__post_PostProtocolChars_ = (IConstructor) _read("prod(label(\"Post\",sort(\"ProtocolTail\")),[label(\"post\",lex(\"PostProtocolChars\"))],{})", Factory.Production);
  private static final IConstructor prod__HexIntegerLiteral__char_class___range__48_48_char_class___range__88_88_range__120_120_conditional__iter__char_class___range__48_57_range__65_70_range__97_102__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_ = (IConstructor) _read("prod(lex(\"HexIntegerLiteral\"),[\\char-class([range(48,48)]),\\char-class([range(88,88),range(120,120)]),conditional(iter(\\char-class([range(48,57),range(65,70),range(97,102)])),{\\not-follow(\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)]))})],{})", Factory.Production);
  private static final IConstructor prod__AsType_Pattern__lit___91_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_lit___93_layouts_LAYOUTLIST_argument_Pattern_ = (IConstructor) _read("prod(label(\"AsType\",sort(\"Pattern\")),[lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"type\",sort(\"Type\")),layouts(\"LAYOUTLIST\"),lit(\"]\"),layouts(\"LAYOUTLIST\"),label(\"argument\",sort(\"Pattern\"))],{})", Factory.Production);
  private static final IConstructor regular__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)])))", Factory.Production);
  private static final IConstructor prod__Descendant_Pattern__lit___47_layouts_LAYOUTLIST_pattern_Pattern_ = (IConstructor) _read("prod(label(\"Descendant\",sort(\"Pattern\")),[lit(\"/\"),layouts(\"LAYOUTLIST\"),label(\"pattern\",sort(\"Pattern\"))],{})", Factory.Production);
  private static final IConstructor prod__Append_Assignment__lit___60_60_61_ = (IConstructor) _read("prod(label(\"Append\",sort(\"Assignment\")),[lit(\"\\<\\<=\")],{})", Factory.Production);
  private static final IConstructor prod__Assignment_Statement__assignable_Assignable_layouts_LAYOUTLIST_operator_Assignment_layouts_LAYOUTLIST_statement_Statement_ = (IConstructor) _read("prod(label(\"Assignment\",sort(\"Statement\")),[label(\"assignable\",sort(\"Assignable\")),layouts(\"LAYOUTLIST\"),label(\"operator\",sort(\"Assignment\")),layouts(\"LAYOUTLIST\"),label(\"statement\",sort(\"Statement\"))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_rule_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"rule\")],{})", Factory.Production);
  private static final IConstructor prod__Map_Expression__lit___40_layouts_LAYOUTLIST_mappings_iter_star_seps__Mapping__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"Map\",sort(\"Expression\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"mappings\",\\iter-star-seps(\\parameterized-sort(\"Mapping\",[sort(\"Expression\")]),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__lit___61_62__char_class___range__61_61_char_class___range__62_62_ = (IConstructor) _read("prod(lit(\"=\\>\"),[\\char-class([range(61,61)]),\\char-class([range(62,62)])],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_alias_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"alias\")],{})", Factory.Production);
  private static final IConstructor prod__lit___61_61__char_class___range__61_61_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"==\"),[\\char-class([range(61,61)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Sym__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Sym\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__Function_Type__function_FunctionType_ = (IConstructor) _read("prod(label(\"Function\",sort(\"Type\")),[label(\"function\",sort(\"FunctionType\"))],{})", Factory.Production);
  private static final IConstructor prod__ListDeclarations_ShellCommand__lit_declarations_ = (IConstructor) _read("prod(label(\"ListDeclarations\",sort(\"ShellCommand\")),[lit(\"declarations\")],{})", Factory.Production);
  private static final IConstructor prod__RealLiteral__conditional__lit___46__not_precede__char_class___range__46_46_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_ = (IConstructor) _read("prod(lex(\"RealLiteral\"),[conditional(lit(\".\"),{\\not-precede(\\char-class([range(46,46)]))}),iter(\\char-class([range(48,57)])),opt(\\char-class([range(68,68),range(70,70),range(100,100),range(102,102)]))],{})", Factory.Production);
  private static final IConstructor prod__lit___62_61__char_class___range__62_62_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"\\>=\"),[\\char-class([range(62,62)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__Name__char_class___range__92_92_char_class___range__65_90_range__95_95_range__97_122_conditional__iter_star__char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_ = (IConstructor) _read("prod(lex(\"Name\"),[\\char-class([range(92,92)]),\\char-class([range(65,90),range(95,95),range(97,122)]),conditional(\\iter-star(\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)]))})],{})", Factory.Production);
  private static final IConstructor prod__DateAndTime__lit___36_DatePart_lit_T_TimePartNoTZ_opt__TimeZonePart_ = (IConstructor) _read("prod(lex(\"DateAndTime\"),[lit(\"$\"),lex(\"DatePart\"),lit(\"T\"),lex(\"TimePartNoTZ\"),opt(lex(\"TimeZonePart\"))],{})", Factory.Production);
  private static final IConstructor prod__OctalEscapeSequence__lit___92_char_class___range__48_55_conditional__char_class___range__48_55__not_follow__char_class___range__48_55_ = (IConstructor) _read("prod(lex(\"OctalEscapeSequence\"),[lit(\"\\\\\"),\\char-class([range(48,55)]),conditional(\\char-class([range(48,55)]),{\\not-follow(\\char-class([range(48,55)]))})],{})", Factory.Production);
  private static final IConstructor prod__lit_non_assoc__char_class___range__110_110_char_class___range__111_111_char_class___range__110_110_char_class___range__45_45_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__111_111_char_class___range__99_99_ = (IConstructor) _read("prod(lit(\"non-assoc\"),[\\char-class([range(110,110)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(45,45)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(99,99)])],{})", Factory.Production);
  private static final IConstructor prod__Syntax_Import__syntax_SyntaxDefinition_ = (IConstructor) _read("prod(label(\"Syntax\",sort(\"Import\")),[label(\"syntax\",sort(\"SyntaxDefinition\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_private__char_class___range__112_112_char_class___range__114_114_char_class___range__105_105_char_class___range__118_118_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"private\"),[\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(118,118)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__NotPrecede_Sym__match_Sym_layouts_LAYOUTLIST_lit___33_60_60_layouts_LAYOUTLIST_symbol_Sym__assoc__right = (IConstructor) _read("prod(label(\"NotPrecede\",sort(\"Sym\")),[label(\"match\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),lit(\"!\\<\\<\"),layouts(\"LAYOUTLIST\"),label(\"symbol\",sort(\"Sym\"))],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__Declaration_Command__declaration_Declaration_ = (IConstructor) _read("prod(label(\"Declaration\",sort(\"Command\")),[label(\"declaration\",sort(\"Declaration\"))],{})", Factory.Production);
  private static final IConstructor prod__Subtraction_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_rhs_Expression__assoc__left = (IConstructor) _read("prod(label(\"Subtraction\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"-\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__lit_any__char_class___range__97_97_char_class___range__110_110_char_class___range__121_121_ = (IConstructor) _read("prod(lit(\"any\"),[\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(121,121)])],{})", Factory.Production);
  private static final IConstructor prod__lit_join__char_class___range__106_106_char_class___range__111_111_char_class___range__105_105_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"join\"),[\\char-class([range(106,106)]),\\char-class([range(111,111)]),\\char-class([range(105,105)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__GreaterThan_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___62_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"GreaterThan\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"\\>\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__Interpolated_ProtocolPart__pre_PreProtocolChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_ProtocolTail_ = (IConstructor) _read("prod(label(\"Interpolated\",sort(\"ProtocolPart\")),[label(\"pre\",lex(\"PreProtocolChars\")),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),label(\"tail\",sort(\"ProtocolTail\"))],{})", Factory.Production);
  private static final IConstructor prod__lit___124_124__char_class___range__124_124_char_class___range__124_124_ = (IConstructor) _read("prod(lit(\"||\"),[\\char-class([range(124,124)]),\\char-class([range(124,124)])],{})", Factory.Production);
  private static final IConstructor prod__lit___60_61__char_class___range__60_60_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"\\<=\"),[\\char-class([range(60,60)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit_finally__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_ = (IConstructor) _read("prod(lit(\"finally\"),[\\char-class([range(102,102)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(108,108)]),\\char-class([range(121,121)])],{})", Factory.Production);
  private static final IConstructor prod__PostProtocolChars__lit___62_URLChars_lit___58_47_47_ = (IConstructor) _read("prod(lex(\"PostProtocolChars\"),[lit(\"\\>\"),lex(\"URLChars\"),lit(\"://\")],{})", Factory.Production);
  private static final IConstructor prod__lit___60_60__char_class___range__60_60_char_class___range__60_60_ = (IConstructor) _read("prod(lit(\"\\<\\<\"),[\\char-class([range(60,60)]),\\char-class([range(60,60)])],{})", Factory.Production);
  private static final IConstructor prod__HeaderKeyword__lit_extend_ = (IConstructor) _read("prod(keywords(\"HeaderKeyword\"),[lit(\"extend\")],{})", Factory.Production);
  private static final IConstructor prod__WithThrows_Signature__modifiers_FunctionModifiers_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_parameters_Parameters_layouts_LAYOUTLIST_lit_throws_layouts_LAYOUTLIST_exceptions_iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"WithThrows\",sort(\"Signature\")),[label(\"modifiers\",sort(\"FunctionModifiers\")),layouts(\"LAYOUTLIST\"),label(\"type\",sort(\"Type\")),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),label(\"parameters\",sort(\"Parameters\")),layouts(\"LAYOUTLIST\"),lit(\"throws\"),layouts(\"LAYOUTLIST\"),label(\"exceptions\",\\iter-seps(sort(\"Type\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))],{})", Factory.Production);
  private static final IConstructor prod__Bool_BasicType__lit_bool_ = (IConstructor) _read("prod(label(\"Bool\",sort(\"BasicType\")),[lit(\"bool\")],{})", Factory.Production);
  private static final IConstructor prod__Alias_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_alias_layouts_LAYOUTLIST_user_UserType_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_base_Type_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"Alias\",sort(\"Declaration\")),[label(\"tags\",sort(\"Tags\")),layouts(\"LAYOUTLIST\"),label(\"visibility\",sort(\"Visibility\")),layouts(\"LAYOUTLIST\"),lit(\"alias\"),layouts(\"LAYOUTLIST\"),label(\"user\",sort(\"UserType\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"base\",sort(\"Type\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_value_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"value\")],{})", Factory.Production);
  private static final IConstructor prod__lit_import__char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"import\"),[\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit_else__char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"else\"),[\\char-class([range(101,101)]),\\char-class([range(108,108)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_global__char_class___range__103_103_char_class___range__108_108_char_class___range__111_111_char_class___range__98_98_char_class___range__97_97_char_class___range__108_108_ = (IConstructor) _read("prod(lit(\"global\"),[\\char-class([range(103,103)]),\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(98,98)]),\\char-class([range(97,97)]),\\char-class([range(108,108)])],{})", Factory.Production);
  private static final IConstructor prod__NonAssociative_Assoc__lit_non_assoc_ = (IConstructor) _read("prod(label(\"NonAssociative\",sort(\"Assoc\")),[lit(\"non-assoc\")],{})", Factory.Production);
  private static final IConstructor prod__Outermost_Strategy__lit_outermost_ = (IConstructor) _read("prod(label(\"Outermost\",sort(\"Strategy\")),[lit(\"outermost\")],{})", Factory.Production);
  private static final IConstructor prod__Template_StringLiteral__pre_PreStringChars_layouts_LAYOUTLIST_template_StringTemplate_layouts_LAYOUTLIST_tail_StringTail_ = (IConstructor) _read("prod(label(\"Template\",sort(\"StringLiteral\")),[label(\"pre\",lex(\"PreStringChars\")),layouts(\"LAYOUTLIST\"),label(\"template\",sort(\"StringTemplate\")),layouts(\"LAYOUTLIST\"),label(\"tail\",sort(\"StringTail\"))],{})", Factory.Production);
  private static final IConstructor regular__iter_star__alt___conditional__char_class___range__42_42__not_follow__char_class___range__47_47_char_class___range__0_41_range__43_65535 = (IConstructor) _read("regular(\\iter-star(alt({conditional(\\char-class([range(42,42)]),{\\not-follow(\\char-class([range(47,47)]))}),\\char-class([range(0,41),range(43,65535)])})))", Factory.Production);
  private static final IConstructor prod__LessThanOrEq_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___60_61_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"LessThanOrEq\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"\\<=\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__FunctionModifier__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"FunctionModifier\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__Any_Expression__lit_any_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"Any\",sort(\"Expression\")),[lit(\"any\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"generators\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__PostPathChars__lit___62_URLChars_lit___124_ = (IConstructor) _read("prod(lex(\"PostPathChars\"),[lit(\"\\>\"),lex(\"URLChars\"),lit(\"|\")],{})", Factory.Production);
  private static final IConstructor prod__Tag_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_tag_layouts_LAYOUTLIST_kind_Kind_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit_on_layouts_LAYOUTLIST_types_iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"Tag\",sort(\"Declaration\")),[label(\"tags\",sort(\"Tags\")),layouts(\"LAYOUTLIST\"),label(\"visibility\",sort(\"Visibility\")),layouts(\"LAYOUTLIST\"),lit(\"tag\"),layouts(\"LAYOUTLIST\"),label(\"kind\",sort(\"Kind\")),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),lit(\"on\"),layouts(\"LAYOUTLIST\"),label(\"types\",\\iter-seps(sort(\"Type\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Intersection_Class__lhs_Class_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_rhs_Class__assoc__left = (IConstructor) _read("prod(label(\"Intersection\",sort(\"Class\")),[label(\"lhs\",sort(\"Class\")),layouts(\"LAYOUTLIST\"),lit(\"&&\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Class\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__Keyword_SyntaxDefinition__lit_keyword_layouts_LAYOUTLIST_defined_Sym_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_production_Prod_layouts_LAYOUTLIST_lit___59__tag__Foldable = (IConstructor) _read("prod(label(\"Keyword\",sort(\"SyntaxDefinition\")),[lit(\"keyword\"),layouts(\"LAYOUTLIST\"),label(\"defined\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"production\",sort(\"Prod\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{tag(Foldable())})", Factory.Production);
  private static final IConstructor prod__AsType_Expression__lit___91_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_lit___93_layouts_LAYOUTLIST_argument_Expression_ = (IConstructor) _read("prod(label(\"AsType\",sort(\"Expression\")),[lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"type\",sort(\"Type\")),layouts(\"LAYOUTLIST\"),lit(\"]\"),layouts(\"LAYOUTLIST\"),label(\"argument\",sort(\"Expression\"))],{})", Factory.Production);
  private static final IConstructor prod__While_StringTemplate__lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_condition_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_body_StringMiddle_layouts_LAYOUTLIST_postStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"While\",sort(\"StringTemplate\")),[lit(\"while\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"condition\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"preStats\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),label(\"body\",sort(\"StringMiddle\")),layouts(\"LAYOUTLIST\"),label(\"postStats\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_non_assoc_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"non-assoc\")],{})", Factory.Production);
  private static final IConstructor regular__iter_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"Pattern\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__In_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"In\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"in\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor regular__iter_seps__Statement__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__Default_Label__name_Name_layouts_LAYOUTLIST_lit___58_ = (IConstructor) _read("prod(label(\"Default\",sort(\"Label\")),[label(\"name\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),lit(\":\")],{})", Factory.Production);
  private static final IConstructor prod__All_Kind__lit_all_ = (IConstructor) _read("prod(label(\"All\",sort(\"Kind\")),[lit(\"all\")],{})", Factory.Production);
  private static final IConstructor prod__lit_keyword__char_class___range__107_107_char_class___range__101_101_char_class___range__121_121_char_class___range__119_119_char_class___range__111_111_char_class___range__114_114_char_class___range__100_100_ = (IConstructor) _read("prod(lit(\"keyword\"),[\\char-class([range(107,107)]),\\char-class([range(101,101)]),\\char-class([range(121,121)]),\\char-class([range(119,119)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(100,100)])],{})", Factory.Production);
  private static final IConstructor prod__NamedBackslash__conditional__char_class___range__92_92__not_follow__char_class___range__60_60_range__62_62_range__92_92_ = (IConstructor) _read("prod(lex(\"NamedBackslash\"),[conditional(\\char-class([range(92,92)]),{\\not-follow(\\char-class([range(60,60),range(62,62),range(92,92)]))})],{})", Factory.Production);
  private static final IConstructor prod__NoThrows_Signature__modifiers_FunctionModifiers_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_parameters_Parameters_ = (IConstructor) _read("prod(label(\"NoThrows\",sort(\"Signature\")),[label(\"modifiers\",sort(\"FunctionModifiers\")),layouts(\"LAYOUTLIST\"),label(\"type\",sort(\"Type\")),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),label(\"parameters\",sort(\"Parameters\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_syntax__char_class___range__115_115_char_class___range__121_121_char_class___range__110_110_char_class___range__116_116_char_class___range__97_97_char_class___range__120_120_ = (IConstructor) _read("prod(lit(\"syntax\"),[\\char-class([range(115,115)]),\\char-class([range(121,121)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(120,120)])],{})", Factory.Production);
  private static final IConstructor prod__lit_all__char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_ = (IConstructor) _read("prod(lit(\"all\"),[\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(108,108)])],{})", Factory.Production);
  private static final IConstructor prod__DecimalIntegerLiteral__char_class___range__49_57_conditional__iter_star__char_class___range__48_57__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_ = (IConstructor) _read("prod(lex(\"DecimalIntegerLiteral\"),[\\char-class([range(49,57)]),conditional(\\iter-star(\\char-class([range(48,57)])),{\\not-follow(\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)]))})],{})", Factory.Production);
  private static final IConstructor prod__Default_Declarator__type_Type_layouts_LAYOUTLIST_variables_iter_seps__Variable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"Default\",sort(\"Declarator\")),[label(\"type\",sort(\"Type\")),layouts(\"LAYOUTLIST\"),label(\"variables\",\\iter-seps(sort(\"Variable\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))],{})", Factory.Production);
  private static final IConstructor prod__Function_Declaration__functionDeclaration_FunctionDeclaration_ = (IConstructor) _read("prod(label(\"Function\",sort(\"Declaration\")),[label(\"functionDeclaration\",sort(\"FunctionDeclaration\"))],{})", Factory.Production);
  private static final IConstructor prod__lit___62_62__char_class___range__62_62_char_class___range__62_62_ = (IConstructor) _read("prod(lit(\"\\>\\>\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)])],{})", Factory.Production);
  private static final IConstructor prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_ = (IConstructor) _read("prod(lit(\"try\"),[\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(121,121)])],{})", Factory.Production);
  private static final IConstructor prod__lit___63_61__char_class___range__63_63_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"?=\"),[\\char-class([range(63,63)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit_bottom_up__char_class___range__98_98_char_class___range__111_111_char_class___range__116_116_char_class___range__116_116_char_class___range__111_111_char_class___range__109_109_char_class___range__45_45_char_class___range__117_117_char_class___range__112_112_ = (IConstructor) _read("prod(lit(\"bottom-up\"),[\\char-class([range(98,98)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(116,116)]),\\char-class([range(111,111)]),\\char-class([range(109,109)]),\\char-class([range(45,45)]),\\char-class([range(117,117)]),\\char-class([range(112,112)])],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_false_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"false\")],{})", Factory.Production);
  private static final IConstructor prod__lit_break__char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_ = (IConstructor) _read("prod(lit(\"break\"),[\\char-class([range(98,98)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(107,107)])],{})", Factory.Production);
  private static final IConstructor prod__IfThenElse_Statement__label_Label_layouts_LAYOUTLIST_lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_thenStatement_Statement_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_elseStatement_Statement_ = (IConstructor) _read("prod(label(\"IfThenElse\",sort(\"Statement\")),[label(\"label\",sort(\"Label\")),layouts(\"LAYOUTLIST\"),lit(\"if\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"conditions\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),label(\"thenStatement\",sort(\"Statement\")),layouts(\"LAYOUTLIST\"),lit(\"else\"),layouts(\"LAYOUTLIST\"),label(\"elseStatement\",sort(\"Statement\"))],{})", Factory.Production);
  private static final IConstructor regular__iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"Type\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__HeaderKeyword__lit_lexical_ = (IConstructor) _read("prod(keywords(\"HeaderKeyword\"),[lit(\"lexical\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_tuple_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"tuple\")],{})", Factory.Production);
  private static final IConstructor prod__Comment__lit___47_42_iter_star__alt___conditional__char_class___range__42_42__not_follow__char_class___range__47_47_char_class___range__0_41_range__43_65535_lit___42_47__tag__category___67_111_109_109_101_110_116 = (IConstructor) _read("prod(lex(\"Comment\"),[lit(\"/*\"),\\iter-star(alt({conditional(\\char-class([range(42,42)]),{\\not-follow(\\char-class([range(47,47)]))}),\\char-class([range(0,41),range(43,65535)])})),lit(\"*/\")],{tag(category(\"Comment\"))})", Factory.Production);
  private static final IConstructor prod__lit_true__char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"true\"),[\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(117,117)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__History_ShellCommand__lit_history_ = (IConstructor) _read("prod(label(\"History\",sort(\"ShellCommand\")),[lit(\"history\")],{})", Factory.Production);
  private static final IConstructor prod__TopDownBreak_Strategy__lit_top_down_break_ = (IConstructor) _read("prod(label(\"TopDownBreak\",sort(\"Strategy\")),[lit(\"top-down-break\")],{})", Factory.Production);
  private static final IConstructor prod__start__Command__layouts_LAYOUTLIST_top_Command_layouts_LAYOUTLIST_ = (IConstructor) _read("prod(start(sort(\"Command\")),[layouts(\"LAYOUTLIST\"),label(\"top\",sort(\"Command\")),layouts(\"LAYOUTLIST\")],{})", Factory.Production);
  private static final IConstructor prod__HeaderKeyword__lit_syntax_ = (IConstructor) _read("prod(keywords(\"HeaderKeyword\"),[lit(\"syntax\")],{})", Factory.Production);
  private static final IConstructor prod__DateTime_BasicType__lit_datetime_ = (IConstructor) _read("prod(label(\"DateTime\",sort(\"BasicType\")),[lit(\"datetime\")],{})", Factory.Production);
  private static final IConstructor prod__lit_extend__char_class___range__101_101_char_class___range__120_120_char_class___range__116_116_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_ = (IConstructor) _read("prod(lit(\"extend\"),[\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(100,100)])],{})", Factory.Production);
  private static final IConstructor prod__lit_append__char_class___range__97_97_char_class___range__112_112_char_class___range__112_112_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_ = (IConstructor) _read("prod(lit(\"append\"),[\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(100,100)])],{})", Factory.Production);
  private static final IConstructor prod__lit_constructor__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__99_99_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_ = (IConstructor) _read("prod(lit(\"constructor\"),[\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(117,117)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(111,111)]),\\char-class([range(114,114)])],{})", Factory.Production);
  private static final IConstructor prod__Extend_Import__lit_extend_layouts_LAYOUTLIST_module_ImportedModule_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"Extend\",sort(\"Import\")),[lit(\"extend\"),layouts(\"LAYOUTLIST\"),label(\"module\",sort(\"ImportedModule\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Alias_Kind__lit_alias_ = (IConstructor) _read("prod(label(\"Alias\",sort(\"Kind\")),[lit(\"alias\")],{})", Factory.Production);
  private static final IConstructor prod__All_Expression__lit_all_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"All\",sort(\"Expression\")),[lit(\"all\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"generators\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__Default_Mapping__Pattern__from_Pattern_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_to_Pattern_ = (IConstructor) _read("prod(label(\"Default\",\\parameterized-sort(\"Mapping\",[sort(\"Pattern\")])),[label(\"from\",sort(\"Pattern\")),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),label(\"to\",sort(\"Pattern\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_assoc__char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__111_111_char_class___range__99_99_ = (IConstructor) _read("prod(lit(\"assoc\"),[\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(99,99)])],{})", Factory.Production);
  private static final IConstructor prod__Continue_Statement__lit_continue_layouts_LAYOUTLIST_target_Target_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"Continue\",sort(\"Statement\")),[lit(\"continue\"),layouts(\"LAYOUTLIST\"),label(\"target\",sort(\"Target\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Tag_Kind__lit_tag_ = (IConstructor) _read("prod(label(\"Tag\",sort(\"Kind\")),[lit(\"tag\")],{})", Factory.Production);
  private static final IConstructor prod__lit_map__char_class___range__109_109_char_class___range__97_97_char_class___range__112_112_ = (IConstructor) _read("prod(lit(\"map\"),[\\char-class([range(109,109)]),\\char-class([range(97,97)]),\\char-class([range(112,112)])],{})", Factory.Production);
  private static final IConstructor prod__lit_real__char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__108_108_ = (IConstructor) _read("prod(lit(\"real\"),[\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(108,108)])],{})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Mapping__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(\\parameterized-sort(\"Mapping\",[sort(\"Pattern\")]),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor regular__iter_star__char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])))", Factory.Production);
  private static final IConstructor prod__ReifiedFunction_BasicType__lit_fun_ = (IConstructor) _read("prod(label(\"ReifiedFunction\",sort(\"BasicType\")),[lit(\"fun\")],{})", Factory.Production);
  private static final IConstructor prod__Division_Assignment__lit___47_61_ = (IConstructor) _read("prod(label(\"Division\",sort(\"Assignment\")),[lit(\"/=\")],{})", Factory.Production);
  private static final IConstructor prod__Product_Assignment__lit___42_61_ = (IConstructor) _read("prod(label(\"Product\",sort(\"Assignment\")),[lit(\"*=\")],{})", Factory.Production);
  private static final IConstructor prod__PostStringChars__char_class___range__62_62_iter_star__StringCharacter_char_class___range__34_34__tag__category___67_111_110_115_116_97_110_116 = (IConstructor) _read("prod(lex(\"PostStringChars\"),[\\char-class([range(62,62)]),\\iter-star(lex(\"StringCharacter\")),\\char-class([range(34,34)])],{tag(category(\"Constant\"))})", Factory.Production);
  private static final IConstructor prod__lit_void__char_class___range__118_118_char_class___range__111_111_char_class___range__105_105_char_class___range__100_100_ = (IConstructor) _read("prod(lit(\"void\"),[\\char-class([range(118,118)]),\\char-class([range(111,111)]),\\char-class([range(105,105)]),\\char-class([range(100,100)])],{})", Factory.Production);
  private static final IConstructor prod__FromTo_Range__start_Char_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_end_Char_ = (IConstructor) _read("prod(label(\"FromTo\",sort(\"Range\")),[label(\"start\",lex(\"Char\")),layouts(\"LAYOUTLIST\"),lit(\"-\"),layouts(\"LAYOUTLIST\"),label(\"end\",lex(\"Char\"))],{})", Factory.Production);
  private static final IConstructor prod__TimeZonePart__char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_ = (IConstructor) _read("prod(lex(\"TimeZonePart\"),[\\char-class([range(43,43),range(45,45)]),\\char-class([range(48,49)]),\\char-class([range(48,57)])],{})", Factory.Production);
  private static final IConstructor prod__Map_Comprehension__lit___40_layouts_LAYOUTLIST_from_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_to_Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"Map\",sort(\"Comprehension\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"from\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),label(\"to\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"|\"),layouts(\"LAYOUTLIST\"),label(\"generators\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__Default_PreModule__header_Header_layouts_LAYOUTLIST_conditional__empty__not_follow__HeaderKeyword_layouts_LAYOUTLIST_rest_Rest_ = (IConstructor) _read("prod(label(\"Default\",sort(\"PreModule\")),[label(\"header\",sort(\"Header\")),layouts(\"LAYOUTLIST\"),conditional(empty(),{\\not-follow(keywords(\"HeaderKeyword\"))}),layouts(\"LAYOUTLIST\"),label(\"rest\",lex(\"Rest\"))],{})", Factory.Production);
  private static final IConstructor prod__Shell_Command__lit___58_layouts_LAYOUTLIST_command_ShellCommand_ = (IConstructor) _read("prod(label(\"Shell\",sort(\"Command\")),[lit(\":\"),layouts(\"LAYOUTLIST\"),label(\"command\",sort(\"ShellCommand\"))],{})", Factory.Production);
  private static final IConstructor prod__Quit_ShellCommand__lit_quit_ = (IConstructor) _read("prod(label(\"Quit\",sort(\"ShellCommand\")),[lit(\"quit\")],{})", Factory.Production);
  private static final IConstructor prod__empty__ = (IConstructor) _read("prod(empty(),[],{})", Factory.Production);
  private static final IConstructor prod__DateAndTimeLiteral_DateTimeLiteral__dateAndTime_DateAndTime_ = (IConstructor) _read("prod(label(\"DateAndTimeLiteral\",sort(\"DateTimeLiteral\")),[label(\"dateAndTime\",lex(\"DateAndTime\"))],{})", Factory.Production);
  private static final IConstructor prod__Negative_Expression__lit___layouts_LAYOUTLIST_argument_Expression_ = (IConstructor) _read("prod(label(\"Negative\",sort(\"Expression\")),[lit(\"-\"),layouts(\"LAYOUTLIST\"),label(\"argument\",sort(\"Expression\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_switch__char_class___range__115_115_char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_ = (IConstructor) _read("prod(lit(\"switch\"),[\\char-class([range(115,115)]),\\char-class([range(119,119)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(99,99)]),\\char-class([range(104,104)])],{})", Factory.Production);
  private static final IConstructor prod__TopDown_Strategy__lit_top_down_ = (IConstructor) _read("prod(label(\"TopDown\",sort(\"Strategy\")),[lit(\"top-down\")],{})", Factory.Production);
  private static final IConstructor prod__DefaultStrategy_Visit__lit_visit_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_subject_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_cases_iter_seps__Case__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"DefaultStrategy\",sort(\"Visit\")),[lit(\"visit\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"subject\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"cases\",\\iter-seps(sort(\"Case\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__Default_Parameters__lit___40_layouts_LAYOUTLIST_formals_Formals_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"Default\",sort(\"Parameters\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"formals\",sort(\"Formals\")),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__lit_solve__char_class___range__115_115_char_class___range__111_111_char_class___range__108_108_char_class___range__118_118_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"solve\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(118,118)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit_fun__char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"fun\"),[\\char-class([range(102,102)]),\\char-class([range(117,117)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__Lexical_SyntaxDefinition__lit_lexical_layouts_LAYOUTLIST_defined_Sym_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_production_Prod_layouts_LAYOUTLIST_lit___59__tag__Foldable = (IConstructor) _read("prod(label(\"Lexical\",sort(\"SyntaxDefinition\")),[lit(\"lexical\"),layouts(\"LAYOUTLIST\"),label(\"defined\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"production\",sort(\"Prod\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{tag(Foldable())})", Factory.Production);
  private static final IConstructor prod__lit_layout__char_class___range__108_108_char_class___range__97_97_char_class___range__121_121_char_class___range__111_111_char_class___range__117_117_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"layout\"),[\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(121,121)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor regular__seq___char_class___range__48_57_opt__char_class___range__48_57 = (IConstructor) _read("regular(seq([\\char-class([range(48,57)]),opt(\\char-class([range(48,57)]))]))", Factory.Production);
  private static final IConstructor prod__List_FunctionModifiers__modifiers_iter_star_seps__FunctionModifier__layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"List\",sort(\"FunctionModifiers\")),[label(\"modifiers\",\\iter-star-seps(sort(\"FunctionModifier\"),[layouts(\"LAYOUTLIST\")]))],{})", Factory.Production);
  private static final IConstructor prod__NonInterpolated_StringLiteral__constant_StringConstant_ = (IConstructor) _read("prod(label(\"NonInterpolated\",sort(\"StringLiteral\")),[label(\"constant\",lex(\"StringConstant\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_non_terminal__char_class___range__110_110_char_class___range__111_111_char_class___range__110_110_char_class___range__45_45_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__109_109_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_ = (IConstructor) _read("prod(lit(\"non-terminal\"),[\\char-class([range(110,110)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(45,45)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(109,109)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)])],{})", Factory.Production);
  private static final IConstructor prod__Division_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___47_layouts_LAYOUTLIST_rhs_Expression__assoc__left = (IConstructor) _read("prod(label(\"Division\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"/\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__Filter_Statement__lit_filter_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"Filter\",sort(\"Statement\")),[lit(\"filter\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Statement_Command__statement_Statement_ = (IConstructor) _read("prod(label(\"Statement\",sort(\"Command\")),[label(\"statement\",sort(\"Statement\"))],{})", Factory.Production);
  private static final IConstructor prod__RealLiteral__iter__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_ = (IConstructor) _read("prod(lex(\"RealLiteral\"),[iter(\\char-class([range(48,57)])),\\char-class([range(69,69),range(101,101)]),opt(\\char-class([range(43,43),range(45,45)])),iter(\\char-class([range(48,57)])),opt(\\char-class([range(68,68),range(70,70),range(100,100),range(102,102)]))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_type_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"type\")],{})", Factory.Production);
  private static final IConstructor prod__Real_Literal__realLiteral_RealLiteral_ = (IConstructor) _read("prod(label(\"Real\",sort(\"Literal\")),[label(\"realLiteral\",lex(\"RealLiteral\"))],{})", Factory.Production);
  private static final IConstructor prod__Undeclare_ShellCommand__lit_undeclare_layouts_LAYOUTLIST_name_QualifiedName_ = (IConstructor) _read("prod(label(\"Undeclare\",sort(\"ShellCommand\")),[lit(\"undeclare\"),layouts(\"LAYOUTLIST\"),label(\"name\",sort(\"QualifiedName\"))],{})", Factory.Production);
  private static final IConstructor prod__Boolean_Literal__booleanLiteral_BooleanLiteral_ = (IConstructor) _read("prod(label(\"Boolean\",sort(\"Literal\")),[label(\"booleanLiteral\",lex(\"BooleanLiteral\"))],{})", Factory.Production);
  private static final IConstructor prod__lit___60_58__char_class___range__60_60_char_class___range__58_58_ = (IConstructor) _read("prod(lit(\"\\<:\"),[\\char-class([range(60,60)]),\\char-class([range(58,58)])],{})", Factory.Production);
  private static final IConstructor prod__lit_assert__char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"assert\"),[\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__Literal_Sym__string_StringConstant_ = (IConstructor) _read("prod(label(\"Literal\",sort(\"Sym\")),[label(\"string\",lex(\"StringConstant\"))],{})", Factory.Production);
  private static final IConstructor prod__StringCharacter__lit___92_char_class___range__34_34_range__39_39_range__60_60_range__62_62_range__92_92_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116_ = (IConstructor) _read("prod(lex(\"StringCharacter\"),[lit(\"\\\\\"),\\char-class([range(34,34),range(39,39),range(60,60),range(62,62),range(92,92),range(98,98),range(102,102),range(110,110),range(114,114),range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_fun_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"fun\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_if_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"if\")],{})", Factory.Production);
  private static final IConstructor prod__Loc_BasicType__lit_loc_ = (IConstructor) _read("prod(label(\"Loc\",sort(\"BasicType\")),[lit(\"loc\")],{})", Factory.Production);
  private static final IConstructor prod__Num_BasicType__lit_num_ = (IConstructor) _read("prod(label(\"Num\",sort(\"BasicType\")),[lit(\"num\")],{})", Factory.Production);
  private static final IConstructor prod__Mid_PathTail__mid_MidPathChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_PathTail_ = (IConstructor) _read("prod(label(\"Mid\",sort(\"PathTail\")),[label(\"mid\",lex(\"MidPathChars\")),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),label(\"tail\",sort(\"PathTail\"))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_it_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"it\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_in_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"in\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_else_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"else\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_for_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"for\")],{})", Factory.Production);
  private static final IConstructor prod__StringCharacter__char_class___range__0_33_range__35_38_range__40_59_range__61_61_range__63_91_range__93_65535_ = (IConstructor) _read("prod(lex(\"StringCharacter\"),[\\char-class([range(0,33),range(35,38),range(40,59),range(61,61),range(63,91),range(93,65535)])],{})", Factory.Production);
  private static final IConstructor prod__lit_lexical__char_class___range__108_108_char_class___range__101_101_char_class___range__120_120_char_class___range__105_105_char_class___range__99_99_char_class___range__97_97_char_class___range__108_108_ = (IConstructor) _read("prod(lit(\"lexical\"),[\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(105,105)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(108,108)])],{})", Factory.Production);
  private static final IConstructor prod__Tuple_Expression__lit___60_layouts_LAYOUTLIST_elements_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___62_ = (IConstructor) _read("prod(label(\"Tuple\",sort(\"Expression\")),[lit(\"\\<\"),layouts(\"LAYOUTLIST\"),label(\"elements\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"\\>\")],{})", Factory.Production);
  private static final IConstructor prod__lit___60_45__char_class___range__60_60_char_class___range__45_45_ = (IConstructor) _read("prod(lit(\"\\<-\"),[\\char-class([range(60,60)]),\\char-class([range(45,45)])],{})", Factory.Production);
  private static final IConstructor prod__StepRange_Expression__lit___91_layouts_LAYOUTLIST_first_Expression_layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_second_Expression_layouts_LAYOUTLIST_lit___46_46_layouts_LAYOUTLIST_last_Expression_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"StepRange\",sort(\"Expression\")),[lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"first\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\"),label(\"second\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"..\"),layouts(\"LAYOUTLIST\"),label(\"last\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__lit_filter__char_class___range__102_102_char_class___range__105_105_char_class___range__108_108_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_ = (IConstructor) _read("prod(lit(\"filter\"),[\\char-class([range(102,102)]),\\char-class([range(105,105)]),\\char-class([range(108,108)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)])],{})", Factory.Production);
  private static final IConstructor prod__MidPathChars__lit___62_URLChars_lit___60_ = (IConstructor) _read("prod(lex(\"MidPathChars\"),[lit(\"\\>\"),lex(\"URLChars\"),lit(\"\\<\")],{})", Factory.Production);
  private static final IConstructor prod__MidTemplate_StringTail__mid_MidStringChars_layouts_LAYOUTLIST_template_StringTemplate_layouts_LAYOUTLIST_tail_StringTail_ = (IConstructor) _read("prod(label(\"MidTemplate\",sort(\"StringTail\")),[label(\"mid\",lex(\"MidStringChars\")),layouts(\"LAYOUTLIST\"),label(\"template\",sort(\"StringTemplate\")),layouts(\"LAYOUTLIST\"),label(\"tail\",sort(\"StringTail\"))],{})", Factory.Production);
  private static final IConstructor prod__String_Literal__stringLiteral_StringLiteral_ = (IConstructor) _read("prod(label(\"String\",sort(\"Literal\")),[label(\"stringLiteral\",sort(\"StringLiteral\"))],{})", Factory.Production);
  private static final IConstructor prod__Negative_Pattern__lit___layouts_LAYOUTLIST_argument_Pattern_ = (IConstructor) _read("prod(label(\"Negative\",sort(\"Pattern\")),[lit(\"-\"),layouts(\"LAYOUTLIST\"),label(\"argument\",sort(\"Pattern\"))],{})", Factory.Production);
  private static final IConstructor prod__Alternative_Sym__lit___40_layouts_LAYOUTLIST_first_Sym_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_alternatives_iter_seps__Sym__layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"Alternative\",sort(\"Sym\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"first\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),lit(\"|\"),layouts(\"LAYOUTLIST\"),label(\"alternatives\",\\iter-seps(sort(\"Sym\"),[layouts(\"LAYOUTLIST\"),lit(\"|\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__lit___58_58__char_class___range__58_58_char_class___range__58_58_ = (IConstructor) _read("prod(lit(\"::\"),[\\char-class([range(58,58)]),\\char-class([range(58,58)])],{})", Factory.Production);
  private static final IConstructor prod__lit_start__char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"start\"),[\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit___58_61__char_class___range__58_58_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\":=\"),[\\char-class([range(58,58)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__NonEquals_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___33_61_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"NonEquals\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"!=\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__TimePartNoTZ__char_class___range__48_50_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_opt__seq___char_class___range__44_44_range__46_46_char_class___range__48_57_opt__seq___char_class___range__48_57_opt__char_class___range__48_57_ = (IConstructor) _read("prod(lex(\"TimePartNoTZ\"),[\\char-class([range(48,50)]),\\char-class([range(48,57)]),\\char-class([range(48,53)]),\\char-class([range(48,57)]),\\char-class([range(48,53)]),\\char-class([range(48,57)]),opt(seq([\\char-class([range(44,44),range(46,46)]),\\char-class([range(48,57)]),opt(seq([\\char-class([range(48,57)]),opt(\\char-class([range(48,57)]))]))]))],{})", Factory.Production);
  private static final IConstructor prod__Dynamic_LocalVariableDeclaration__lit_dynamic_layouts_LAYOUTLIST_declarator_Declarator_ = (IConstructor) _read("prod(label(\"Dynamic\",sort(\"LocalVariableDeclaration\")),[lit(\"dynamic\"),layouts(\"LAYOUTLIST\"),label(\"declarator\",sort(\"Declarator\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_ = (IConstructor) _read("prod(lit(\"for\"),[\\char-class([range(102,102)]),\\char-class([range(111,111)]),\\char-class([range(114,114)])],{})", Factory.Production);
  private static final IConstructor prod__Replacing_PatternWithAction__pattern_Pattern_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_replacement_Replacement_ = (IConstructor) _read("prod(label(\"Replacing\",sort(\"PatternWithAction\")),[label(\"pattern\",sort(\"Pattern\")),layouts(\"LAYOUTLIST\"),lit(\"=\\>\"),layouts(\"LAYOUTLIST\"),label(\"replacement\",sort(\"Replacement\"))],{})", Factory.Production);
  private static final IConstructor prod__UnicodeEscape__lit___92_iter__char_class___range__117_117_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_ = (IConstructor) _read("prod(lex(\"UnicodeEscape\"),[lit(\"\\\\\"),iter(\\char-class([range(117,117)])),\\char-class([range(48,57),range(65,70),range(97,102)]),\\char-class([range(48,57),range(65,70),range(97,102)]),\\char-class([range(48,57),range(65,70),range(97,102)]),\\char-class([range(48,57),range(65,70),range(97,102)])],{})", Factory.Production);
  private static final IConstructor prod__View_Kind__lit_view_ = (IConstructor) _read("prod(label(\"View\",sort(\"Kind\")),[lit(\"view\")],{})", Factory.Production);
  private static final IConstructor prod__Default_FunctionDeclaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_signature_Signature_layouts_LAYOUTLIST_body_FunctionBody__tag__Foldable = (IConstructor) _read("prod(label(\"Default\",sort(\"FunctionDeclaration\")),[label(\"tags\",sort(\"Tags\")),layouts(\"LAYOUTLIST\"),label(\"visibility\",sort(\"Visibility\")),layouts(\"LAYOUTLIST\"),label(\"signature\",sort(\"Signature\")),layouts(\"LAYOUTLIST\"),label(\"body\",sort(\"FunctionBody\"))],{tag(Foldable())})", Factory.Production);
  private static final IConstructor prod__Try_Statement__lit_try_layouts_LAYOUTLIST_body_Statement_layouts_LAYOUTLIST_handlers_iter_seps__Catch__layouts_LAYOUTLIST__assoc__non_assoc = (IConstructor) _read("prod(label(\"Try\",sort(\"Statement\")),[lit(\"try\"),layouts(\"LAYOUTLIST\"),label(\"body\",sort(\"Statement\")),layouts(\"LAYOUTLIST\"),label(\"handlers\",\\iter-seps(sort(\"Catch\"),[layouts(\"LAYOUTLIST\")]))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__IterStar_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___42_ = (IConstructor) _read("prod(label(\"IterStar\",sort(\"Sym\")),[label(\"symbol\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),lit(\"*\")],{})", Factory.Production);
  private static final IConstructor prod__DatePart__char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_lit___char_class___range__48_49_char_class___range__48_57_lit___char_class___range__48_51_char_class___range__48_57_ = (IConstructor) _read("prod(lex(\"DatePart\"),[\\char-class([range(48,57)]),\\char-class([range(48,57)]),\\char-class([range(48,57)]),\\char-class([range(48,57)]),lit(\"-\"),\\char-class([range(48,49)]),\\char-class([range(48,57)]),lit(\"-\"),\\char-class([range(48,51)]),\\char-class([range(48,57)])],{})", Factory.Production);
  private static final IConstructor prod__RegExp__char_class___range__60_60_expression_Expression_char_class___range__62_62__tag__category___77_101_116_97_86_97_114_105_97_98_108_101 = (IConstructor) _read("prod(lex(\"RegExp\"),[\\char-class([range(60,60)]),label(\"expression\",sort(\"Expression\")),\\char-class([range(62,62)])],{tag(category(\"MetaVariable\"))})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_switch_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"switch\")],{})", Factory.Production);
  private static final IConstructor prod__For_Statement__label_Label_layouts_LAYOUTLIST_lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_body_Statement_ = (IConstructor) _read("prod(label(\"For\",sort(\"Statement\")),[label(\"label\",sort(\"Label\")),layouts(\"LAYOUTLIST\"),lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"generators\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),label(\"body\",sort(\"Statement\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_left__char_class___range__108_108_char_class___range__101_101_char_class___range__102_102_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"left\"),[\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(102,102)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__All_Prod__lhs_Prod_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_rhs_Prod__assoc__left = (IConstructor) _read("prod(label(\"All\",sort(\"Prod\")),[label(\"lhs\",sort(\"Prod\")),layouts(\"LAYOUTLIST\"),lit(\"|\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Prod\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_throws_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"throws\")],{})", Factory.Production);
  private static final IConstructor prod__Backslash__conditional__char_class___range__92_92__not_follow__char_class___range__47_47_range__60_60_range__62_62_range__92_92_ = (IConstructor) _read("prod(lex(\"Backslash\"),[conditional(\\char-class([range(92,92)]),{\\not-follow(\\char-class([range(47,47),range(60,60),range(62,62),range(92,92)]))})],{})", Factory.Production);
  private static final IConstructor regular__empty = (IConstructor) _read("regular(empty())", Factory.Production);
  private static final IConstructor regular__iter_star__char_class___range__0_9_range__11_65535 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(0,9),range(11,65535)])))", Factory.Production);
  private static final IConstructor prod__PrePathChars__URLChars_lit___60_ = (IConstructor) _read("prod(lex(\"PrePathChars\"),[lex(\"URLChars\"),lit(\"\\<\")],{})", Factory.Production);
  private static final IConstructor prod__lit_bracket__char_class___range__98_98_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__107_107_char_class___range__101_101_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"bracket\"),[\\char-class([range(98,98)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(107,107)]),\\char-class([range(101,101)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__DateTime_Literal__dateTimeLiteral_DateTimeLiteral_ = (IConstructor) _read("prod(label(\"DateTime\",sort(\"Literal\")),[label(\"dateTimeLiteral\",sort(\"DateTimeLiteral\"))],{})", Factory.Production);
  private static final IConstructor regular__iter_star__char_class___range__0_8_range__11_12_range__14_31_range__33_59_range__61_123_range__125_65535 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(0,8),range(11,12),range(14,31),range(33,59),range(61,123),range(125,65535)])))", Factory.Production);
  private static final IConstructor prod__Parametrized_Sym__conditional__nonterminal_Nonterminal__follow__lit___91_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_parameters_iter_seps__Sym__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"Parametrized\",sort(\"Sym\")),[conditional(label(\"nonterminal\",lex(\"Nonterminal\")),{follow(lit(\"[\"))}),layouts(\"LAYOUTLIST\"),lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"parameters\",\\iter-seps(sort(\"Sym\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__TimeLiteral_DateTimeLiteral__time_JustTime_ = (IConstructor) _read("prod(label(\"TimeLiteral\",sort(\"DateTimeLiteral\")),[label(\"time\",lex(\"JustTime\"))],{})", Factory.Production);
  private static final IConstructor prod__TypedVariableBecomes_Pattern__type_Type_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_pattern_Pattern_ = (IConstructor) _read("prod(label(\"TypedVariableBecomes\",sort(\"Pattern\")),[label(\"type\",sort(\"Type\")),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),label(\"pattern\",sort(\"Pattern\"))],{})", Factory.Production);
  private static final IConstructor prod__start__PreModule__layouts_LAYOUTLIST_top_PreModule_layouts_LAYOUTLIST_ = (IConstructor) _read("prod(start(sort(\"PreModule\")),[layouts(\"LAYOUTLIST\"),label(\"top\",sort(\"PreModule\")),layouts(\"LAYOUTLIST\")],{})", Factory.Production);
  private static final IConstructor prod__DateLiteral_DateTimeLiteral__date_JustDate_ = (IConstructor) _read("prod(label(\"DateLiteral\",sort(\"DateTimeLiteral\")),[label(\"date\",lex(\"JustDate\"))],{})", Factory.Production);
  private static final IConstructor prod__TimePartNoTZ__char_class___range__48_50_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_opt__seq___char_class___range__44_44_range__46_46_char_class___range__48_57_opt__seq___char_class___range__48_57_opt__char_class___range__48_57_ = (IConstructor) _read("prod(lex(\"TimePartNoTZ\"),[\\char-class([range(48,50)]),\\char-class([range(48,57)]),lit(\":\"),\\char-class([range(48,53)]),\\char-class([range(48,57)]),lit(\":\"),\\char-class([range(48,53)]),\\char-class([range(48,57)]),opt(seq([\\char-class([range(44,44),range(46,46)]),\\char-class([range(48,57)]),opt(seq([\\char-class([range(48,57)]),opt(\\char-class([range(48,57)]))]))]))],{})", Factory.Production);
  private static final IConstructor prod__Name_Field__fieldName_Name_ = (IConstructor) _read("prod(label(\"Name\",sort(\"Field\")),[label(\"fieldName\",lex(\"Name\"))],{})", Factory.Production);
  private static final IConstructor prod__StringCharacter__OctalEscapeSequence_ = (IConstructor) _read("prod(lex(\"StringCharacter\"),[lex(\"OctalEscapeSequence\")],{})", Factory.Production);
  private static final IConstructor prod__OctalEscapeSequence__lit___92_conditional__char_class___range__48_55__not_follow__char_class___range__48_55_ = (IConstructor) _read("prod(lex(\"OctalEscapeSequence\"),[lit(\"\\\\\"),conditional(\\char-class([range(48,55)]),{\\not-follow(\\char-class([range(48,55)]))})],{})", Factory.Production);
  private static final IConstructor prod__Bounded_TypeVar__lit___38_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___60_58_layouts_LAYOUTLIST_bound_Type_ = (IConstructor) _read("prod(label(\"Bounded\",sort(\"TypeVar\")),[lit(\"&\"),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),lit(\"\\<:\"),layouts(\"LAYOUTLIST\"),label(\"bound\",sort(\"Type\"))],{})", Factory.Production);
  private static final IConstructor prod__layouts_$BACKTICKS__ = (IConstructor) _read("prod(layouts(\"$BACKTICKS\"),[],{})", Factory.Production);
  private static final IConstructor prod__Comment__lit___47_47_conditional__iter_star__char_class___range__0_9_range__11_65535__not_follow__char_class___range__9_9_range__13_13_range__32_32_end_of_line__tag__category___67_111_109_109_101_110_116 = (IConstructor) _read("prod(lex(\"Comment\"),[lit(\"//\"),conditional(\\iter-star(\\char-class([range(0,9),range(11,65535)])),{\\not-follow(\\char-class([range(9,9),range(13,13),range(32,32)])),\\end-of-line()})],{tag(category(\"Comment\"))})", Factory.Production);
  private static final IConstructor prod__Arbitrary_PatternWithAction__pattern_Pattern_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_statement_Statement_ = (IConstructor) _read("prod(label(\"Arbitrary\",sort(\"PatternWithAction\")),[label(\"pattern\",sort(\"Pattern\")),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),label(\"statement\",sort(\"Statement\"))],{})", Factory.Production);
  private static final IConstructor prod__ReifiedTypeParameter_BasicType__lit_parameter_ = (IConstructor) _read("prod(label(\"ReifiedTypeParameter\",sort(\"BasicType\")),[lit(\"parameter\")],{})", Factory.Production);
  private static final IConstructor prod__ReifiedReifiedType_BasicType__lit_reified_ = (IConstructor) _read("prod(label(\"ReifiedReifiedType\",sort(\"BasicType\")),[lit(\"reified\")],{})", Factory.Production);
  private static final IConstructor prod__lit_insert__char_class___range__105_105_char_class___range__110_110_char_class___range__115_115_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"insert\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_public_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"public\")],{})", Factory.Production);
  private static final IConstructor prod__lit_history__char_class___range__104_104_char_class___range__105_105_char_class___range__115_115_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_char_class___range__121_121_ = (IConstructor) _read("prod(lit(\"history\"),[\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(121,121)])],{})", Factory.Production);
  private static final IConstructor prod__layouts_$default$__ = (IConstructor) _read("prod(layouts(\"$default$\"),[],{})", Factory.Production);
  private static final IConstructor prod__BottomUpBreak_Strategy__lit_bottom_up_break_ = (IConstructor) _read("prod(label(\"BottomUpBreak\",sort(\"Strategy\")),[lit(\"bottom-up-break\")],{})", Factory.Production);
  private static final IConstructor prod__TypeArguments_FunctionType__type_Type_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__TypeArg__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"TypeArguments\",sort(\"FunctionType\")),[label(\"type\",sort(\"Type\")),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"arguments\",\\iter-star-seps(sort(\"TypeArg\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__Variable_Assignable__qualifiedName_QualifiedName_ = (IConstructor) _read("prod(label(\"Variable\",sort(\"Assignable\")),[label(\"qualifiedName\",sort(\"QualifiedName\"))],{})", Factory.Production);
  private static final IConstructor prod__Relation_BasicType__lit_rel_ = (IConstructor) _read("prod(label(\"Relation\",sort(\"BasicType\")),[lit(\"rel\")],{})", Factory.Production);
  private static final IConstructor prod__Selector_DataTypeSelector__sort_QualifiedName_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_production_Name_ = (IConstructor) _read("prod(label(\"Selector\",sort(\"DataTypeSelector\")),[label(\"sort\",sort(\"QualifiedName\")),layouts(\"LAYOUTLIST\"),lit(\".\"),layouts(\"LAYOUTLIST\"),label(\"production\",lex(\"Name\"))],{})", Factory.Production);
  private static final IConstructor prod__Default_TypeArg__type_Type_ = (IConstructor) _read("prod(label(\"Default\",sort(\"TypeArg\")),[label(\"type\",sort(\"Type\"))],{})", Factory.Production);
  private static final IConstructor prod__HeaderKeyword__lit_keyword_ = (IConstructor) _read("prod(keywords(\"HeaderKeyword\"),[lit(\"keyword\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_list_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"list\")],{})", Factory.Production);
  private static final IConstructor prod__lit_undeclare__char_class___range__117_117_char_class___range__110_110_char_class___range__100_100_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"undeclare\"),[\\char-class([range(117,117)]),\\char-class([range(110,110)]),\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor regular__iter_star__StringCharacter = (IConstructor) _read("regular(\\iter-star(lex(\"StringCharacter\")))", Factory.Production);
  private static final IConstructor regular__opt__seq___char_class___range__44_44_range__46_46_char_class___range__48_57_opt__seq___char_class___range__48_57_opt__char_class___range__48_57 = (IConstructor) _read("regular(opt(seq([\\char-class([range(44,44),range(46,46)]),\\char-class([range(48,57)]),opt(seq([\\char-class([range(48,57)]),opt(\\char-class([range(48,57)]))]))])))", Factory.Production);
  private static final IConstructor prod__Union_Class__lhs_Class_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_rhs_Class__assoc__left = (IConstructor) _read("prod(label(\"Union\",sort(\"Class\")),[label(\"lhs\",sort(\"Class\")),layouts(\"LAYOUTLIST\"),lit(\"||\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Class\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__StringCharacter__char_class___range__10_10_iter_star__char_class___range__9_9_range__32_32_char_class___range__39_39_ = (IConstructor) _read("prod(lex(\"StringCharacter\"),[\\char-class([range(10,10)]),\\iter-star(\\char-class([range(9,9),range(32,32)])),\\char-class([range(39,39)])],{})", Factory.Production);
  private static final IConstructor prod__Default_FunctionBody__lit___123_layouts_LAYOUTLIST_statements_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"Default\",sort(\"FunctionBody\")),[lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"statements\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__Test_ShellCommand__lit_test_ = (IConstructor) _read("prod(label(\"Test\",sort(\"ShellCommand\")),[lit(\"test\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_tag_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"tag\")],{})", Factory.Production);
  private static final IConstructor prod__Annotation_Assignable__receiver_Assignable_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_annotation_Name_ = (IConstructor) _read("prod(label(\"Annotation\",sort(\"Assignable\")),[label(\"receiver\",sort(\"Assignable\")),layouts(\"LAYOUTLIST\"),lit(\"@\"),layouts(\"LAYOUTLIST\"),label(\"annotation\",lex(\"Name\"))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_extend_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"extend\")],{})", Factory.Production);
  private static final IConstructor prod__StringCharacter__UnicodeEscape_ = (IConstructor) _read("prod(lex(\"StringCharacter\"),[lex(\"UnicodeEscape\")],{})", Factory.Production);
  private static final IConstructor prod__Follow_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_match_Sym__assoc__left = (IConstructor) _read("prod(label(\"Follow\",sort(\"Sym\")),[label(\"symbol\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),lit(\"\\>\\>\"),layouts(\"LAYOUTLIST\"),label(\"match\",sort(\"Sym\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__URLChars__iter_star__char_class___range__0_8_range__11_12_range__14_31_range__33_59_range__61_123_range__125_65535_ = (IConstructor) _read("prod(lex(\"URLChars\"),[\\iter-star(\\char-class([range(0,8),range(11,12),range(14,31),range(33,59),range(61,123),range(125,65535)]))],{})", Factory.Production);
  private static final IConstructor prod__Named_TypeArg__type_Type_layouts_LAYOUTLIST_name_Name_ = (IConstructor) _read("prod(label(\"Named\",sort(\"TypeArg\")),[label(\"type\",sort(\"Type\")),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\"))],{})", Factory.Production);
  private static final IConstructor prod__Set_Pattern__lit___123_layouts_LAYOUTLIST_elements_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"Set\",sort(\"Pattern\")),[lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"elements\",\\iter-star-seps(sort(\"Pattern\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__Has_Expression__expression_Expression_layouts_LAYOUTLIST_lit_has_layouts_LAYOUTLIST_name_Name_ = (IConstructor) _read("prod(label(\"Has\",sort(\"Expression\")),[label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"has\"),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\"))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_str_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"str\")],{})", Factory.Production);
  private static final IConstructor prod__Initialized_Variable__name_Name_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_initial_Expression_ = (IConstructor) _read("prod(label(\"Initialized\",sort(\"Variable\")),[label(\"name\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"initial\",sort(\"Expression\"))],{})", Factory.Production);
  private static final IConstructor prod__Basic_Type__basic_BasicType_ = (IConstructor) _read("prod(label(\"Basic\",sort(\"Type\")),[label(\"basic\",sort(\"BasicType\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_rel__char_class___range__114_114_char_class___range__101_101_char_class___range__108_108_ = (IConstructor) _read("prod(lit(\"rel\"),[\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(108,108)])],{})", Factory.Production);
  private static final IConstructor prod__JustDate__lit___36_DatePart_ = (IConstructor) _read("prod(lex(\"JustDate\"),[lit(\"$\"),lex(\"DatePart\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_return_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"return\")],{})", Factory.Production);
  private static final IConstructor prod__Structured_Type__structured_StructuredType_ = (IConstructor) _read("prod(label(\"Structured\",sort(\"Type\")),[label(\"structured\",sort(\"StructuredType\"))],{})", Factory.Production);
  private static final IConstructor prod__And_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_rhs_Expression__assoc__left = (IConstructor) _read("prod(label(\"And\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"&&\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__lit___61_61_62__char_class___range__61_61_char_class___range__61_61_char_class___range__62_62_ = (IConstructor) _read("prod(lit(\"==\\>\"),[\\char-class([range(61,61)]),\\char-class([range(61,61)]),\\char-class([range(62,62)])],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_set_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"set\")],{})", Factory.Production);
  private static final IConstructor prod__RealLiteral__conditional__lit___46__not_precede__char_class___range__46_46_iter__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_ = (IConstructor) _read("prod(lex(\"RealLiteral\"),[conditional(lit(\".\"),{\\not-precede(\\char-class([range(46,46)]))}),iter(\\char-class([range(48,57)])),\\char-class([range(69,69),range(101,101)]),opt(\\char-class([range(43,43),range(45,45)])),iter(\\char-class([range(48,57)])),opt(\\char-class([range(68,68),range(70,70),range(100,100),range(102,102)]))],{})", Factory.Production);
  private static final IConstructor prod__ReifiedType_Pattern__basicType_BasicType_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"ReifiedType\",sort(\"Pattern\")),[label(\"basicType\",sort(\"BasicType\")),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"arguments\",\\iter-star-seps(sort(\"Pattern\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_datetime_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"datetime\")],{})", Factory.Production);
  private static final IConstructor prod__GreaterThanOrEq_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___62_61_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"GreaterThanOrEq\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"\\>=\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_bool_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"bool\")],{})", Factory.Production);
  private static final IConstructor prod__OctalEscapeSequence__lit___92_char_class___range__48_51_char_class___range__48_55_char_class___range__48_55_ = (IConstructor) _read("prod(lex(\"OctalEscapeSequence\"),[lit(\"\\\\\"),\\char-class([range(48,51)]),\\char-class([range(48,55)]),\\char-class([range(48,55)])],{})", Factory.Production);
  private static final IConstructor prod__Absent_Start__ = (IConstructor) _read("prod(label(\"Absent\",sort(\"Start\")),[],{})", Factory.Production);
  private static final IConstructor prod__Default_Header__tags_Tags_layouts_LAYOUTLIST_lit_module_layouts_LAYOUTLIST_name_QualifiedName_layouts_LAYOUTLIST_imports_iter_star_seps__Import__layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"Default\",sort(\"Header\")),[label(\"tags\",sort(\"Tags\")),layouts(\"LAYOUTLIST\"),lit(\"module\"),layouts(\"LAYOUTLIST\"),label(\"name\",sort(\"QualifiedName\")),layouts(\"LAYOUTLIST\"),label(\"imports\",\\iter-star-seps(sort(\"Import\"),[layouts(\"LAYOUTLIST\")]))],{})", Factory.Production);
  private static final IConstructor prod__Labeled_Target__name_Name_ = (IConstructor) _read("prod(label(\"Labeled\",sort(\"Target\")),[label(\"name\",lex(\"Name\"))],{})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Import__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Import\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__FieldAccess_Expression__expression_Expression_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_field_Name_ = (IConstructor) _read("prod(label(\"FieldAccess\",sort(\"Expression\")),[label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\".\"),layouts(\"LAYOUTLIST\"),label(\"field\",lex(\"Name\"))],{})", Factory.Production);
  private static final IConstructor prod__Bracket_Assignable__lit___40_layouts_LAYOUTLIST_arg_Assignable_layouts_LAYOUTLIST_lit___41__bracket = (IConstructor) _read("prod(label(\"Bracket\",sort(\"Assignable\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"arg\",sort(\"Assignable\")),layouts(\"LAYOUTLIST\"),lit(\")\")],{bracket()})", Factory.Production);
  private static final IConstructor prod__Interpolated_StringLiteral__pre_PreStringChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_StringTail_ = (IConstructor) _read("prod(label(\"Interpolated\",sort(\"StringLiteral\")),[label(\"pre\",lex(\"PreStringChars\")),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),label(\"tail\",sort(\"StringTail\"))],{})", Factory.Production);
  private static final IConstructor prod__RealLiteral__iter__char_class___range__48_57_conditional__lit___46__not_follow__lit___46_iter_star__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_ = (IConstructor) _read("prod(lex(\"RealLiteral\"),[iter(\\char-class([range(48,57)])),conditional(lit(\".\"),{\\not-follow(lit(\".\"))}),\\iter-star(\\char-class([range(48,57)])),opt(\\char-class([range(68,68),range(70,70),range(100,100),range(102,102)]))],{})", Factory.Production);
  private static final IConstructor prod__Default_ImportedModule__name_QualifiedName_ = (IConstructor) _read("prod(label(\"Default\",sort(\"ImportedModule\")),[label(\"name\",sort(\"QualifiedName\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_continue__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"continue\"),[\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(117,117)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__FieldProject_Expression__expression_Expression_layouts_LAYOUTLIST_lit___60_layouts_LAYOUTLIST_fields_iter_seps__Field__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___62_ = (IConstructor) _read("prod(label(\"FieldProject\",sort(\"Expression\")),[label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"\\<\"),layouts(\"LAYOUTLIST\"),label(\"fields\",\\iter-seps(sort(\"Field\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"\\>\")],{})", Factory.Production);
  private static final IConstructor prod__lit___60_60_61__char_class___range__60_60_char_class___range__60_60_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"\\<\\<=\"),[\\char-class([range(60,60)]),\\char-class([range(60,60)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit_adt__char_class___range__97_97_char_class___range__100_100_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"adt\"),[\\char-class([range(97,97)]),\\char-class([range(100,100)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_rel_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"rel\")],{})", Factory.Production);
  private static final IConstructor prod__Tuple_BasicType__lit_tuple_ = (IConstructor) _read("prod(label(\"Tuple\",sort(\"BasicType\")),[lit(\"tuple\")],{})", Factory.Production);
  private static final IConstructor prod__JustTime__lit___36_84_TimePartNoTZ_opt__TimeZonePart_ = (IConstructor) _read("prod(lex(\"JustTime\"),[lit(\"$T\"),lex(\"TimePartNoTZ\"),opt(lex(\"TimeZonePart\"))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_rat_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"rat\")],{})", Factory.Production);
  private static final IConstructor prod__Map_Pattern__lit___40_layouts_LAYOUTLIST_mappings_iter_star_seps__Mapping__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"Map\",sort(\"Pattern\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"mappings\",\\iter-star-seps(\\parameterized-sort(\"Mapping\",[sort(\"Pattern\")]),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__Unconditional_Replacement__replacementExpression_Expression_ = (IConstructor) _read("prod(label(\"Unconditional\",sort(\"Replacement\")),[label(\"replacementExpression\",sort(\"Expression\"))],{})", Factory.Production);
  private static final IConstructor regular__iter_seps__Sym__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"Sym\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__FieldUpdate_Expression__expression_Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_key_Name_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_replacement_Expression_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"FieldUpdate\",sort(\"Expression\")),[label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"key\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"replacement\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__lit_dynamic__char_class___range__100_100_char_class___range__121_121_char_class___range__110_110_char_class___range__97_97_char_class___range__109_109_char_class___range__105_105_char_class___range__99_99_ = (IConstructor) _read("prod(lit(\"dynamic\"),[\\char-class([range(100,100)]),\\char-class([range(121,121)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(105,105)]),\\char-class([range(99,99)])],{})", Factory.Production);
  private static final IConstructor prod__QualifiedName_Pattern__qualifiedName_QualifiedName_ = (IConstructor) _read("prod(label(\"QualifiedName\",sort(\"Pattern\")),[label(\"qualifiedName\",sort(\"QualifiedName\"))],{})", Factory.Production);
  private static final IConstructor regular__iter_seps__Sym__layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"Sym\"),[layouts(\"LAYOUTLIST\"),lit(\"|\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_mod_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"mod\")],{})", Factory.Production);
  private static final IConstructor prod__MultiVariable_Pattern__qualifiedName_QualifiedName_layouts_LAYOUTLIST_lit___42_ = (IConstructor) _read("prod(label(\"MultiVariable\",sort(\"Pattern\")),[label(\"qualifiedName\",sort(\"QualifiedName\")),layouts(\"LAYOUTLIST\"),lit(\"*\")],{})", Factory.Production);
  private static final IConstructor prod__Is_Expression__expression_Expression_layouts_LAYOUTLIST_lit_is_layouts_LAYOUTLIST_name_Name_ = (IConstructor) _read("prod(label(\"Is\",sort(\"Expression\")),[label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"is\"),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Name\"))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_throw_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"throw\")],{})", Factory.Production);
  private static final IConstructor prod__Public_Visibility__lit_public_ = (IConstructor) _read("prod(label(\"Public\",sort(\"Visibility\")),[lit(\"public\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_module_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"module\")],{})", Factory.Production);
  private static final IConstructor prod__Mid_StringMiddle__mid_MidStringChars_ = (IConstructor) _read("prod(label(\"Mid\",sort(\"StringMiddle\")),[label(\"mid\",lex(\"MidStringChars\"))],{})", Factory.Production);
  private static final IConstructor prod__CaseInsensitiveLiteral_Sym__cistring_CaseInsensitiveStringConstant_ = (IConstructor) _read("prod(label(\"CaseInsensitiveLiteral\",sort(\"Sym\")),[label(\"cistring\",lex(\"CaseInsensitiveStringConstant\"))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_private_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"private\")],{})", Factory.Production);
  private static final IConstructor prod__lit_list__char_class___range__108_108_char_class___range__105_105_char_class___range__115_115_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"list\"),[\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(115,115)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__ReifyType_Expression__lit___35_layouts_LAYOUTLIST_type_Type_ = (IConstructor) _read("prod(label(\"ReifyType\",sort(\"Expression\")),[lit(\"#\"),layouts(\"LAYOUTLIST\"),label(\"type\",sort(\"Type\"))],{})", Factory.Production);
  private static final IConstructor prod__Variable_Type__typeVar_TypeVar_ = (IConstructor) _read("prod(label(\"Variable\",sort(\"Type\")),[label(\"typeVar\",sort(\"TypeVar\"))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_map_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"map\")],{})", Factory.Production);
  private static final IConstructor prod__Splice_Expression__lit___42_layouts_LAYOUTLIST_argument_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"Splice\",sort(\"Expression\")),[lit(\"*\"),layouts(\"LAYOUTLIST\"),label(\"argument\",sort(\"Expression\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__Append_Statement__lit_append_layouts_LAYOUTLIST_dataTarget_DataTarget_layouts_LAYOUTLIST_statement_Statement__assoc__non_assoc = (IConstructor) _read("prod(label(\"Append\",sort(\"Statement\")),[lit(\"append\"),layouts(\"LAYOUTLIST\"),label(\"dataTarget\",sort(\"DataTarget\")),layouts(\"LAYOUTLIST\"),label(\"statement\",sort(\"Statement\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__Left_Assoc__lit_left_ = (IConstructor) _read("prod(label(\"Left\",sort(\"Assoc\")),[lit(\"left\")],{})", Factory.Production);
  private static final IConstructor prod__Import_Command__imported_Import_ = (IConstructor) _read("prod(label(\"Import\",sort(\"Command\")),[label(\"imported\",sort(\"Import\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_test__char_class___range__116_116_char_class___range__101_101_char_class___range__115_115_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"test\"),[\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__PathChars__URLChars_char_class___range__124_124_ = (IConstructor) _read("prod(lex(\"PathChars\"),[lex(\"URLChars\"),\\char-class([range(124,124)])],{})", Factory.Production);
  private static final IConstructor prod__Default_Bound__lit___59_layouts_LAYOUTLIST_expression_Expression_ = (IConstructor) _read("prod(label(\"Default\",sort(\"Bound\")),[lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\"))],{})", Factory.Production);
  private static final IConstructor prod__Int_BasicType__lit_int_ = (IConstructor) _read("prod(label(\"Int\",sort(\"BasicType\")),[lit(\"int\")],{})", Factory.Production);
  private static final IConstructor prod__Real_BasicType__lit_real_ = (IConstructor) _read("prod(label(\"Real\",sort(\"BasicType\")),[lit(\"real\")],{})", Factory.Production);
  private static final IConstructor regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__List_Pattern__lit___91_layouts_LAYOUTLIST_elements_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"List\",sort(\"Pattern\")),[lit(\"[\"),layouts(\"LAYOUTLIST\"),label(\"elements\",\\iter-star-seps(sort(\"Pattern\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__lit_false__char_class___range__102_102_char_class___range__97_97_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"false\"),[\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_loc_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"loc\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star__NamedRegExp = (IConstructor) _read("regular(\\iter-star(lex(\"NamedRegExp\")))", Factory.Production);
  private static final IConstructor prod__Enumerator_Expression__pattern_Pattern_layouts_LAYOUTLIST_lit___60_45_layouts_LAYOUTLIST_expression_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"Enumerator\",sort(\"Expression\")),[label(\"pattern\",sort(\"Pattern\")),layouts(\"LAYOUTLIST\"),lit(\"\\<-\"),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\"))],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__lit_set__char_class___range__115_115_char_class___range__101_101_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"set\"),[\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__Module_Kind__lit_module_ = (IConstructor) _read("prod(label(\"Module\",sort(\"Kind\")),[lit(\"module\")],{})", Factory.Production);
  private static final IConstructor prod__lit_bottom_up_break__char_class___range__98_98_char_class___range__111_111_char_class___range__116_116_char_class___range__116_116_char_class___range__111_111_char_class___range__109_109_char_class___range__45_45_char_class___range__117_117_char_class___range__112_112_char_class___range__45_45_char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_ = (IConstructor) _read("prod(lit(\"bottom-up-break\"),[\\char-class([range(98,98)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(116,116)]),\\char-class([range(111,111)]),\\char-class([range(109,109)]),\\char-class([range(45,45)]),\\char-class([range(117,117)]),\\char-class([range(112,112)]),\\char-class([range(45,45)]),\\char-class([range(98,98)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(107,107)])],{})", Factory.Production);
  private static final IConstructor prod__Integer_Literal__integerLiteral_IntegerLiteral_ = (IConstructor) _read("prod(label(\"Integer\",sort(\"Literal\")),[label(\"integerLiteral\",sort(\"IntegerLiteral\"))],{})", Factory.Production);
  private static final IConstructor prod__PatternWithAction_Case__lit_case_layouts_LAYOUTLIST_patternWithAction_PatternWithAction__tag__Foldable = (IConstructor) _read("prod(label(\"PatternWithAction\",sort(\"Case\")),[lit(\"case\"),layouts(\"LAYOUTLIST\"),label(\"patternWithAction\",sort(\"PatternWithAction\"))],{tag(Foldable())})", Factory.Production);
  private static final IConstructor regular__iter_star__alt___TagString_char_class___range__0_122_range__124_124_range__126_65535_seq___lit___92_char_class___range__123_123_range__125_125 = (IConstructor) _read("regular(\\iter-star(alt({lex(\"TagString\"),\\char-class([range(0,122),range(124,124),range(126,65535)]),seq([lit(\"\\\\\"),\\char-class([range(123,123),range(125,125)])])})))", Factory.Production);
  private static final IConstructor prod__Rule_Kind__lit_rule_ = (IConstructor) _read("prod(label(\"Rule\",sort(\"Kind\")),[lit(\"rule\")],{})", Factory.Production);
  private static final IConstructor regular__iter_seps__Variable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"Variable\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__Node_BasicType__lit_node_ = (IConstructor) _read("prod(label(\"Node\",sort(\"BasicType\")),[lit(\"node\")],{})", Factory.Production);
  private static final IConstructor prod__lit_throws__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"throws\"),[\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(119,119)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__lit_bag__char_class___range__98_98_char_class___range__97_97_char_class___range__103_103_ = (IConstructor) _read("prod(lit(\"bag\"),[\\char-class([range(98,98)]),\\char-class([range(97,97)]),\\char-class([range(103,103)])],{})", Factory.Production);
  private static final IConstructor prod__lit_visit__char_class___range__118_118_char_class___range__105_105_char_class___range__115_115_char_class___range__105_105_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"visit\"),[\\char-class([range(118,118)]),\\char-class([range(105,105)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__Others_Prod__lit___46_46_46_ = (IConstructor) _read("prod(label(\"Others\",sort(\"Prod\")),[lit(\"...\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__ProdModifier__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"ProdModifier\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Toplevel__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Toplevel\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__Parameter_Sym__lit___38_layouts_LAYOUTLIST_nonterminal_Nonterminal_ = (IConstructor) _read("prod(label(\"Parameter\",sort(\"Sym\")),[lit(\"&\"),layouts(\"LAYOUTLIST\"),label(\"nonterminal\",lex(\"Nonterminal\"))],{})", Factory.Production);
  private static final IConstructor prod__DecimalIntegerLiteral_IntegerLiteral__decimal_DecimalIntegerLiteral_ = (IConstructor) _read("prod(label(\"DecimalIntegerLiteral\",sort(\"IntegerLiteral\")),[label(\"decimal\",lex(\"DecimalIntegerLiteral\"))],{})", Factory.Production);
  private static final IConstructor prod__Empty_Label__ = (IConstructor) _read("prod(label(\"Empty\",sort(\"Label\")),[],{})", Factory.Production);
  private static final IConstructor prod__Column_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_column_IntegerLiteral_ = (IConstructor) _read("prod(label(\"Column\",sort(\"Sym\")),[label(\"symbol\",sort(\"Sym\")),layouts(\"LAYOUTLIST\"),lit(\"@\"),layouts(\"LAYOUTLIST\"),label(\"column\",sort(\"IntegerLiteral\"))],{})", Factory.Production);
  private static final IConstructor prod__Default_FunctionModifier__lit_default_ = (IConstructor) _read("prod(label(\"Default\",sort(\"FunctionModifier\")),[lit(\"default\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_one_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"one\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star__RegExp = (IConstructor) _read("regular(\\iter-star(lex(\"RegExp\")))", Factory.Production);
  private static final IConstructor regular__iter_seps__Assignable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"Assignable\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__Default_Formals__formals_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"Default\",sort(\"Formals\")),[label(\"formals\",\\iter-star-seps(sort(\"Pattern\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_node_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"node\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Tag__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Tag\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_repeat_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"repeat\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star__char_class___range__0_65535 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(0,65535)])))", Factory.Production);
  private static final IConstructor prod__Void_BasicType__lit_void_ = (IConstructor) _read("prod(label(\"Void\",sort(\"BasicType\")),[lit(\"void\")],{})", Factory.Production);
  private static final IConstructor prod__Reducer_Expression__lit___40_layouts_LAYOUTLIST_init_Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_result_Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"Reducer\",sort(\"Expression\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"init\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"|\"),layouts(\"LAYOUTLIST\"),label(\"result\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"|\"),layouts(\"LAYOUTLIST\"),label(\"generators\",\\iter-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__VariableBecomes_Pattern__name_Name_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_pattern_Pattern_ = (IConstructor) _read("prod(label(\"VariableBecomes\",sort(\"Pattern\")),[label(\"name\",lex(\"Name\")),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),label(\"pattern\",sort(\"Pattern\"))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_continue_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"continue\")],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_bracket_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"bracket\")],{})", Factory.Production);
  private static final IConstructor prod__RealLiteral__iter__char_class___range__48_57_char_class___range__68_68_range__70_70_range__100_100_range__102_102_ = (IConstructor) _read("prod(lex(\"RealLiteral\"),[iter(\\char-class([range(48,57)])),\\char-class([range(68,68),range(70,70),range(100,100),range(102,102)])],{})", Factory.Production);
  private static final IConstructor prod__Default_LocalVariableDeclaration__declarator_Declarator_ = (IConstructor) _read("prod(label(\"Default\",sort(\"LocalVariableDeclaration\")),[label(\"declarator\",sort(\"Declarator\"))],{})", Factory.Production);
  private static final IConstructor prod__RealLiteral__iter__char_class___range__48_57_lit___46_iter_star__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_ = (IConstructor) _read("prod(lex(\"RealLiteral\"),[iter(\\char-class([range(48,57)])),lit(\".\"),\\iter-star(\\char-class([range(48,57)])),\\char-class([range(69,69),range(101,101)]),opt(\\char-class([range(43,43),range(45,45)])),iter(\\char-class([range(48,57)])),opt(\\char-class([range(68,68),range(70,70),range(100,100),range(102,102)]))],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_num_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"num\")],{})", Factory.Production);
  private static final IConstructor prod__VoidClosure_Expression__parameters_Parameters_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_statements_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"VoidClosure\",sort(\"Expression\")),[label(\"parameters\",sort(\"Parameters\")),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"statements\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__LAYOUT__char_class___range__9_10_range__13_13_range__32_32_ = (IConstructor) _read("prod(lex(\"LAYOUT\"),[\\char-class([range(9,10),range(13,13),range(32,32)])],{})", Factory.Production);
  private static final IConstructor prod__MidInterpolated_StringTail__mid_MidStringChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_StringTail_ = (IConstructor) _read("prod(label(\"MidInterpolated\",sort(\"StringTail\")),[label(\"mid\",lex(\"MidStringChars\")),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),label(\"tail\",sort(\"StringTail\"))],{})", Factory.Production);
  private static final IConstructor prod__BooleanLiteral__lit_true_ = (IConstructor) _read("prod(lex(\"BooleanLiteral\"),[lit(\"true\")],{})", Factory.Production);
  private static final IConstructor prod__lit_public__char_class___range__112_112_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__105_105_char_class___range__99_99_ = (IConstructor) _read("prod(lit(\"public\"),[\\char-class([range(112,112)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(99,99)])],{})", Factory.Production);
  private static final IConstructor prod__lit_rat__char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"rat\"),[\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__GivenStrategy_Visit__strategy_Strategy_layouts_LAYOUTLIST_lit_visit_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_subject_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_cases_iter_seps__Case__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"GivenStrategy\",sort(\"Visit\")),[label(\"strategy\",sort(\"Strategy\")),layouts(\"LAYOUTLIST\"),lit(\"visit\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"subject\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"cases\",\\iter-seps(sort(\"Case\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__lit_renaming__char_class___range__114_114_char_class___range__101_101_char_class___range__110_110_char_class___range__97_97_char_class___range__109_109_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_ = (IConstructor) _read("prod(lit(\"renaming\"),[\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)])],{})", Factory.Production);
  private static final IConstructor prod__Composition_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_o_layouts_LAYOUTLIST_rhs_Expression__assoc__left = (IConstructor) _read("prod(label(\"Composition\",sort(\"Expression\")),[label(\"lhs\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"o\"),layouts(\"LAYOUTLIST\"),label(\"rhs\",sort(\"Expression\"))],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__NonterminalLabel__char_class___range__97_122_conditional__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_ = (IConstructor) _read("prod(lex(\"NonterminalLabel\"),[\\char-class([range(97,122)]),conditional(\\iter-star(\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(48,57),range(65,90),range(95,95),range(97,122)]))})],{})", Factory.Production);
  private static final IConstructor prod__lit_value__char_class___range__118_118_char_class___range__97_97_char_class___range__108_108_char_class___range__117_117_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"value\"),[\\char-class([range(118,118)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(117,117)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__Literal_Expression__literal_Literal_ = (IConstructor) _read("prod(label(\"Literal\",sort(\"Expression\")),[label(\"literal\",sort(\"Literal\"))],{})", Factory.Production);
  private static final IConstructor prod__RegExp__Backslash_ = (IConstructor) _read("prod(lex(\"RegExp\"),[lex(\"Backslash\")],{})", Factory.Production);
  private static final IConstructor prod__IsDefined_Expression__argument_Expression_layouts_LAYOUTLIST_lit___63_ = (IConstructor) _read("prod(label(\"IsDefined\",sort(\"Expression\")),[label(\"argument\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"?\")],{})", Factory.Production);
  private static final IConstructor prod__lit_module__char_class___range__109_109_char_class___range__111_111_char_class___range__100_100_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"module\"),[\\char-class([range(109,109)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__RascalKeywords__lit_solve_ = (IConstructor) _read("prod(keywords(\"RascalKeywords\"),[lit(\"solve\")],{})", Factory.Production);
  private static final IConstructor prod__NamedRegExp__NamedBackslash_ = (IConstructor) _read("prod(lex(\"NamedRegExp\"),[lex(\"NamedBackslash\")],{})", Factory.Production);
    
  // Item declarations
	
	
  protected static class Literal {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__DateTime_Literal__dateTimeLiteral_DateTimeLiteral_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(36, 0, "DateTimeLiteral", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__DateTime_Literal__dateTimeLiteral_DateTimeLiteral_, tmp);
	}
    protected static final void _init_prod__String_Literal__stringLiteral_StringLiteral_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(38, 0, "StringLiteral", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__String_Literal__stringLiteral_StringLiteral_, tmp);
	}
    protected static final void _init_prod__Real_Literal__realLiteral_RealLiteral_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(40, 0, "RealLiteral", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Real_Literal__realLiteral_RealLiteral_, tmp);
	}
    protected static final void _init_prod__Location_Literal__locationLiteral_LocationLiteral_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(42, 0, "LocationLiteral", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Location_Literal__locationLiteral_LocationLiteral_, tmp);
	}
    protected static final void _init_prod__Rational_Literal__rationalLiteral_RationalLiteral_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(44, 0, "RationalLiteral", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Rational_Literal__rationalLiteral_RationalLiteral_, tmp);
	}
    protected static final void _init_prod__RegExp_Literal__regExpLiteral_RegExpLiteral_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(46, 0, "RegExpLiteral", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RegExp_Literal__regExpLiteral_RegExpLiteral_, tmp);
	}
    protected static final void _init_prod__Boolean_Literal__booleanLiteral_BooleanLiteral_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(48, 0, "BooleanLiteral", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Boolean_Literal__booleanLiteral_BooleanLiteral_, tmp);
	}
    protected static final void _init_prod__Integer_Literal__integerLiteral_IntegerLiteral_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(50, 0, "IntegerLiteral", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Integer_Literal__integerLiteral_IntegerLiteral_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__DateTime_Literal__dateTimeLiteral_DateTimeLiteral_(builder);
      
        _init_prod__String_Literal__stringLiteral_StringLiteral_(builder);
      
        _init_prod__Real_Literal__realLiteral_RealLiteral_(builder);
      
        _init_prod__Location_Literal__locationLiteral_LocationLiteral_(builder);
      
        _init_prod__Rational_Literal__rationalLiteral_RationalLiteral_(builder);
      
        _init_prod__RegExp_Literal__regExpLiteral_RegExpLiteral_(builder);
      
        _init_prod__Boolean_Literal__booleanLiteral_BooleanLiteral_(builder);
      
        _init_prod__Integer_Literal__integerLiteral_IntegerLiteral_(builder);
      
    }
  }
	
  protected static class Module {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_Module__header_Header_layouts_LAYOUTLIST_body_Body_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(56, 2, "Body", null, null);
      tmp[1] = new NonTerminalStackNode(54, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(52, 0, "Header", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Module__header_Header_layouts_LAYOUTLIST_body_Body_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_Module__header_Header_layouts_LAYOUTLIST_body_Body_(builder);
      
    }
  }
	
  protected static class PreProtocolChars {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__PreProtocolChars__lit___124_URLChars_lit___60_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(64, 2, prod__lit___60__char_class___range__60_60_, new char[] {60}, null, null);
      tmp[1] = new NonTerminalStackNode(62, 1, "URLChars", null, null);
      tmp[0] = new LiteralStackNode(60, 0, prod__lit___124__char_class___range__124_124_, new char[] {124}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__PreProtocolChars__lit___124_URLChars_lit___60_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__PreProtocolChars__lit___124_URLChars_lit___60_(builder);
      
    }
  }
	
  protected static class Variable {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__UnInitialized_Variable__name_Name_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(110, 0, "Name", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__UnInitialized_Variable__name_Name_, tmp);
	}
    protected static final void _init_prod__Initialized_Variable__name_Name_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_initial_Expression_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(120, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(118, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(116, 2, prod__lit___61__char_class___range__61_61_, new char[] {61}, null, null);
      tmp[1] = new NonTerminalStackNode(114, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(112, 0, "Name", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Initialized_Variable__name_Name_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_initial_Expression_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__UnInitialized_Variable__name_Name_(builder);
      
        _init_prod__Initialized_Variable__name_Name_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_initial_Expression_(builder);
      
    }
  }
	
  protected static class TypeArg {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_TypeArg__type_Type_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(102, 0, "Type", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_TypeArg__type_Type_, tmp);
	}
    protected static final void _init_prod__Named_TypeArg__type_Type_layouts_LAYOUTLIST_name_Name_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(108, 2, "Name", null, null);
      tmp[1] = new NonTerminalStackNode(106, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(104, 0, "Type", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Named_TypeArg__type_Type_layouts_LAYOUTLIST_name_Name_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_TypeArg__type_Type_(builder);
      
        _init_prod__Named_TypeArg__type_Type_layouts_LAYOUTLIST_name_Name_(builder);
      
    }
  }
	
  protected static class Catch {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Binding_Catch__lit_catch_layouts_LAYOUTLIST_pattern_Pattern_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_body_Statement_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new NonTerminalStackNode(152, 6, "Statement", null, null);
      tmp[5] = new NonTerminalStackNode(150, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(148, 4, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[3] = new NonTerminalStackNode(146, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(144, 2, "Pattern", null, null);
      tmp[1] = new NonTerminalStackNode(142, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(140, 0, prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new char[] {99,97,116,99,104}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Binding_Catch__lit_catch_layouts_LAYOUTLIST_pattern_Pattern_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_body_Statement_, tmp);
	}
    protected static final void _init_prod__Default_Catch__lit_catch_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_body_Statement_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(162, 4, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode(160, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(158, 2, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[1] = new NonTerminalStackNode(156, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(154, 0, prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new char[] {99,97,116,99,104}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Catch__lit_catch_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_body_Statement_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Binding_Catch__lit_catch_layouts_LAYOUTLIST_pattern_Pattern_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_body_Statement_(builder);
      
        _init_prod__Default_Catch__lit_catch_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_body_Statement_(builder);
      
    }
  }
	
  protected static class Renaming {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_Renaming__from_Name_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_to_Name_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(138, 4, "Name", null, null);
      tmp[3] = new NonTerminalStackNode(136, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(134, 2, prod__lit___61_62__char_class___range__61_61_char_class___range__62_62_, new char[] {61,62}, null, null);
      tmp[1] = new NonTerminalStackNode(132, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(130, 0, "Name", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Renaming__from_Name_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_to_Name_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_Renaming__from_Name_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_to_Name_(builder);
      
    }
  }
	
  protected static class Signature {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__WithThrows_Signature__modifiers_FunctionModifiers_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_parameters_Parameters_layouts_LAYOUTLIST_lit_throws_layouts_LAYOUTLIST_exceptions_iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[11];
      
      tmp[10] = new SeparatedListStackNode(198, 10, regular__iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(200, 0, "Type", null, null), new AbstractStackNode[]{new NonTerminalStackNode(202, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(204, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(206, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[0] = new NonTerminalStackNode(178, 0, "FunctionModifiers", null, null);
      tmp[1] = new NonTerminalStackNode(180, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(182, 2, "Type", null, null);
      tmp[3] = new NonTerminalStackNode(184, 3, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(186, 4, "Name", null, null);
      tmp[5] = new NonTerminalStackNode(188, 5, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(190, 6, "Parameters", null, null);
      tmp[7] = new NonTerminalStackNode(192, 7, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(194, 8, prod__lit_throws__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_char_class___range__115_115_, new char[] {116,104,114,111,119,115}, null, null);
      tmp[9] = new NonTerminalStackNode(196, 9, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__WithThrows_Signature__modifiers_FunctionModifiers_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_parameters_Parameters_layouts_LAYOUTLIST_lit_throws_layouts_LAYOUTLIST_exceptions_iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_, tmp);
	}
    protected static final void _init_prod__NoThrows_Signature__modifiers_FunctionModifiers_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_parameters_Parameters_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new NonTerminalStackNode(176, 6, "Parameters", null, null);
      tmp[5] = new NonTerminalStackNode(174, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(172, 4, "Name", null, null);
      tmp[3] = new NonTerminalStackNode(170, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(168, 2, "Type", null, null);
      tmp[1] = new NonTerminalStackNode(166, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(164, 0, "FunctionModifiers", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NoThrows_Signature__modifiers_FunctionModifiers_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_parameters_Parameters_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__WithThrows_Signature__modifiers_FunctionModifiers_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_parameters_Parameters_layouts_LAYOUTLIST_lit_throws_layouts_LAYOUTLIST_exceptions_iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_(builder);
      
        _init_prod__NoThrows_Signature__modifiers_FunctionModifiers_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_parameters_Parameters_(builder);
      
    }
  }
	
  protected static class Sym {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Empty_Sym__lit___40_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(226, 2, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[1] = new NonTerminalStackNode(224, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(222, 0, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Empty_Sym__lit___40_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__CharacterClass_Sym__charClass_Class_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(228, 0, "Class", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__CharacterClass_Sym__charClass_Class_, tmp);
	}
    protected static final void _init_prod__Sequence_Sym__lit___40_layouts_LAYOUTLIST_first_Sym_layouts_LAYOUTLIST_sequence_iter_seps__Sym__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(246, 6, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[5] = new NonTerminalStackNode(244, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(238, 4, regular__iter_seps__Sym__layouts_LAYOUTLIST, new NonTerminalStackNode(240, 0, "Sym", null, null), new AbstractStackNode[]{new NonTerminalStackNode(242, 1, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[3] = new NonTerminalStackNode(236, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(234, 2, "Sym", null, null);
      tmp[1] = new NonTerminalStackNode(232, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(230, 0, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Sequence_Sym__lit___40_layouts_LAYOUTLIST_first_Sym_layouts_LAYOUTLIST_sequence_iter_seps__Sym__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__NotPrecede_Sym__match_Sym_layouts_LAYOUTLIST_lit___33_60_60_layouts_LAYOUTLIST_symbol_Sym__assoc__right(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(432, 4, "Sym", null, null);
      tmp[3] = new NonTerminalStackNode(430, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(428, 2, prod__lit___33_60_60__char_class___range__33_33_char_class___range__60_60_char_class___range__60_60_, new char[] {33,60,60}, null, null);
      tmp[1] = new NonTerminalStackNode(426, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(424, 0, "Sym", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NotPrecede_Sym__match_Sym_layouts_LAYOUTLIST_lit___33_60_60_layouts_LAYOUTLIST_symbol_Sym__assoc__right, tmp);
	}
    protected static final void _init_prod__IterStar_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___42_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(252, 2, prod__lit___42__char_class___range__42_42_, new char[] {42}, null, null);
      tmp[1] = new NonTerminalStackNode(250, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(248, 0, "Sym", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__IterStar_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___42_, tmp);
	}
    protected static final void _init_prod__Labeled_Sym__symbol_Sym_layouts_LAYOUTLIST_label_NonterminalLabel_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(258, 2, "NonterminalLabel", null, null);
      tmp[1] = new NonTerminalStackNode(256, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(254, 0, "Sym", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Labeled_Sym__symbol_Sym_layouts_LAYOUTLIST_label_NonterminalLabel_, tmp);
	}
    protected static final void _init_prod__Parameter_Sym__lit___38_layouts_LAYOUTLIST_nonterminal_Nonterminal_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(264, 2, "Nonterminal", null, null);
      tmp[1] = new NonTerminalStackNode(262, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(260, 0, prod__lit___38__char_class___range__38_38_, new char[] {38}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Parameter_Sym__lit___38_layouts_LAYOUTLIST_nonterminal_Nonterminal_, tmp);
	}
    protected static final void _init_prod__IterStarSep_Sym__lit___123_layouts_LAYOUTLIST_symbol_Sym_layouts_LAYOUTLIST_sep_Sym_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit___42_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[9];
      
      tmp[8] = new LiteralStackNode(282, 8, prod__lit___42__char_class___range__42_42_, new char[] {42}, null, null);
      tmp[7] = new NonTerminalStackNode(280, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(278, 6, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[5] = new NonTerminalStackNode(276, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(274, 4, "Sym", null, null);
      tmp[3] = new NonTerminalStackNode(272, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(270, 2, "Sym", null, null);
      tmp[1] = new NonTerminalStackNode(268, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(266, 0, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__IterStarSep_Sym__lit___123_layouts_LAYOUTLIST_symbol_Sym_layouts_LAYOUTLIST_sep_Sym_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit___42_, tmp);
	}
    protected static final void _init_prod__Alternative_Sym__lit___40_layouts_LAYOUTLIST_first_Sym_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_alternatives_iter_seps__Sym__layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[9];
      
      tmp[8] = new LiteralStackNode(308, 8, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[7] = new NonTerminalStackNode(306, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new SeparatedListStackNode(296, 6, regular__iter_seps__Sym__layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST, new NonTerminalStackNode(298, 0, "Sym", null, null), new AbstractStackNode[]{new NonTerminalStackNode(300, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(302, 2, prod__lit___124__char_class___range__124_124_, new char[] {124}, null, null), new NonTerminalStackNode(304, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[5] = new NonTerminalStackNode(294, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(292, 4, prod__lit___124__char_class___range__124_124_, new char[] {124}, null, null);
      tmp[3] = new NonTerminalStackNode(290, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(288, 2, "Sym", null, null);
      tmp[1] = new NonTerminalStackNode(286, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(284, 0, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Alternative_Sym__lit___40_layouts_LAYOUTLIST_first_Sym_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_alternatives_iter_seps__Sym__layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__Follow_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_match_Sym__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(422, 4, "Sym", null, null);
      tmp[3] = new NonTerminalStackNode(420, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(418, 2, prod__lit___62_62__char_class___range__62_62_char_class___range__62_62_, new char[] {62,62}, null, null);
      tmp[1] = new NonTerminalStackNode(416, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(414, 0, "Sym", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Follow_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_match_Sym__assoc__left, tmp);
	}
    protected static final void _init_prod__EndOfLine_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___36_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(314, 2, prod__lit___36__char_class___range__36_36_, new char[] {36}, null, null);
      tmp[1] = new NonTerminalStackNode(312, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(310, 0, "Sym", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__EndOfLine_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___36_, tmp);
	}
    protected static final void _init_prod__Precede_Sym__match_Sym_layouts_LAYOUTLIST_lit___60_60_layouts_LAYOUTLIST_symbol_Sym__assoc__right(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(442, 4, "Sym", null, null);
      tmp[3] = new NonTerminalStackNode(440, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(438, 2, prod__lit___60_60__char_class___range__60_60_char_class___range__60_60_, new char[] {60,60}, null, null);
      tmp[1] = new NonTerminalStackNode(436, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(434, 0, "Sym", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Precede_Sym__match_Sym_layouts_LAYOUTLIST_lit___60_60_layouts_LAYOUTLIST_symbol_Sym__assoc__right, tmp);
	}
    protected static final void _init_prod__Column_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_column_IntegerLiteral_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(324, 4, "IntegerLiteral", null, null);
      tmp[3] = new NonTerminalStackNode(322, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(320, 2, prod__lit___64__char_class___range__64_64_, new char[] {64}, null, null);
      tmp[1] = new NonTerminalStackNode(318, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(316, 0, "Sym", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Column_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_column_IntegerLiteral_, tmp);
	}
    protected static final void _init_prod__Nonterminal_Sym__conditional__nonterminal_Nonterminal__not_follow__lit___91_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(326, 0, "Nonterminal", null, new ICompletionFilter[] {new StringFollowRestriction(new char[] {91})});
      builder.addAlternative(ObjectRascalRascal.prod__Nonterminal_Sym__conditional__nonterminal_Nonterminal__not_follow__lit___91_, tmp);
	}
    protected static final void _init_prod__Optional_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___63_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(332, 2, prod__lit___63__char_class___range__63_63_, new char[] {63}, null, null);
      tmp[1] = new NonTerminalStackNode(330, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(328, 0, "Sym", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Optional_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___63_, tmp);
	}
    protected static final void _init_prod__Start_Sym__lit_start_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_nonterminal_Nonterminal_layouts_LAYOUTLIST_lit___93_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(348, 6, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      tmp[5] = new NonTerminalStackNode(346, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(344, 4, "Nonterminal", null, null);
      tmp[3] = new NonTerminalStackNode(342, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(340, 2, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      tmp[1] = new NonTerminalStackNode(338, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(336, 0, prod__lit_start__char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__116_116_, new char[] {115,116,97,114,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Start_Sym__lit_start_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_nonterminal_Nonterminal_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__CaseInsensitiveLiteral_Sym__cistring_CaseInsensitiveStringConstant_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(334, 0, "CaseInsensitiveStringConstant", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__CaseInsensitiveLiteral_Sym__cistring_CaseInsensitiveStringConstant_, tmp);
	}
    protected static final void _init_prod__Unequal_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___92_layouts_LAYOUTLIST_match_Sym__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(452, 4, "Sym", null, null);
      tmp[3] = new NonTerminalStackNode(450, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(448, 2, prod__lit___92__char_class___range__92_92_, new char[] {92}, null, null);
      tmp[1] = new NonTerminalStackNode(446, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(444, 0, "Sym", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Unequal_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___92_layouts_LAYOUTLIST_match_Sym__assoc__left, tmp);
	}
    protected static final void _init_prod__NotFollow_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___33_62_62_layouts_LAYOUTLIST_match_Sym__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(412, 4, "Sym", null, null);
      tmp[3] = new NonTerminalStackNode(410, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(408, 2, prod__lit___33_62_62__char_class___range__33_33_char_class___range__62_62_char_class___range__62_62_, new char[] {33,62,62}, null, null);
      tmp[1] = new NonTerminalStackNode(406, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(404, 0, "Sym", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NotFollow_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___33_62_62_layouts_LAYOUTLIST_match_Sym__assoc__left, tmp);
	}
    protected static final void _init_prod__Literal_Sym__string_StringConstant_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(350, 0, "StringConstant", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Literal_Sym__string_StringConstant_, tmp);
	}
    protected static final void _init_prod__Parametrized_Sym__conditional__nonterminal_Nonterminal__follow__lit___91_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_parameters_iter_seps__Sym__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(372, 6, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      tmp[5] = new NonTerminalStackNode(370, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(360, 4, regular__iter_seps__Sym__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(362, 0, "Sym", null, null), new AbstractStackNode[]{new NonTerminalStackNode(364, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(366, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(368, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[3] = new NonTerminalStackNode(358, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(356, 2, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      tmp[1] = new NonTerminalStackNode(354, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(352, 0, "Nonterminal", null, new ICompletionFilter[] {new StringFollowRequirement(new char[] {91})});
      builder.addAlternative(ObjectRascalRascal.prod__Parametrized_Sym__conditional__nonterminal_Nonterminal__follow__lit___91_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_parameters_iter_seps__Sym__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__IterSep_Sym__lit___123_layouts_LAYOUTLIST_symbol_Sym_layouts_LAYOUTLIST_sep_Sym_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit___43_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[9];
      
      tmp[8] = new LiteralStackNode(390, 8, prod__lit___43__char_class___range__43_43_, new char[] {43}, null, null);
      tmp[7] = new NonTerminalStackNode(388, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(386, 6, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[5] = new NonTerminalStackNode(384, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(382, 4, "Sym", null, null);
      tmp[3] = new NonTerminalStackNode(380, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(378, 2, "Sym", null, null);
      tmp[1] = new NonTerminalStackNode(376, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(374, 0, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__IterSep_Sym__lit___123_layouts_LAYOUTLIST_symbol_Sym_layouts_LAYOUTLIST_sep_Sym_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit___43_, tmp);
	}
    protected static final void _init_prod__StartOfLine_Sym__lit___94_layouts_LAYOUTLIST_symbol_Sym_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(396, 2, "Sym", null, null);
      tmp[1] = new NonTerminalStackNode(394, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(392, 0, prod__lit___94__char_class___range__94_94_, new char[] {94}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__StartOfLine_Sym__lit___94_layouts_LAYOUTLIST_symbol_Sym_, tmp);
	}
    protected static final void _init_prod__Iter_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___43_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(402, 2, prod__lit___43__char_class___range__43_43_, new char[] {43}, null, null);
      tmp[1] = new NonTerminalStackNode(400, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(398, 0, "Sym", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Iter_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___43_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Empty_Sym__lit___40_layouts_LAYOUTLIST_lit___41_(builder);
      
        _init_prod__CharacterClass_Sym__charClass_Class_(builder);
      
        _init_prod__Sequence_Sym__lit___40_layouts_LAYOUTLIST_first_Sym_layouts_LAYOUTLIST_sequence_iter_seps__Sym__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(builder);
      
        _init_prod__NotPrecede_Sym__match_Sym_layouts_LAYOUTLIST_lit___33_60_60_layouts_LAYOUTLIST_symbol_Sym__assoc__right(builder);
      
        _init_prod__IterStar_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___42_(builder);
      
        _init_prod__Labeled_Sym__symbol_Sym_layouts_LAYOUTLIST_label_NonterminalLabel_(builder);
      
        _init_prod__Parameter_Sym__lit___38_layouts_LAYOUTLIST_nonterminal_Nonterminal_(builder);
      
        _init_prod__IterStarSep_Sym__lit___123_layouts_LAYOUTLIST_symbol_Sym_layouts_LAYOUTLIST_sep_Sym_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit___42_(builder);
      
        _init_prod__Alternative_Sym__lit___40_layouts_LAYOUTLIST_first_Sym_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_alternatives_iter_seps__Sym__layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(builder);
      
        _init_prod__Follow_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_match_Sym__assoc__left(builder);
      
        _init_prod__EndOfLine_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___36_(builder);
      
        _init_prod__Precede_Sym__match_Sym_layouts_LAYOUTLIST_lit___60_60_layouts_LAYOUTLIST_symbol_Sym__assoc__right(builder);
      
        _init_prod__Column_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_column_IntegerLiteral_(builder);
      
        _init_prod__Nonterminal_Sym__conditional__nonterminal_Nonterminal__not_follow__lit___91_(builder);
      
        _init_prod__Optional_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___63_(builder);
      
        _init_prod__Start_Sym__lit_start_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_nonterminal_Nonterminal_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__CaseInsensitiveLiteral_Sym__cistring_CaseInsensitiveStringConstant_(builder);
      
        _init_prod__Unequal_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___92_layouts_LAYOUTLIST_match_Sym__assoc__left(builder);
      
        _init_prod__NotFollow_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___33_62_62_layouts_LAYOUTLIST_match_Sym__assoc__left(builder);
      
        _init_prod__Literal_Sym__string_StringConstant_(builder);
      
        _init_prod__Parametrized_Sym__conditional__nonterminal_Nonterminal__follow__lit___91_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_parameters_iter_seps__Sym__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__IterSep_Sym__lit___123_layouts_LAYOUTLIST_symbol_Sym_layouts_LAYOUTLIST_sep_Sym_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit___43_(builder);
      
        _init_prod__StartOfLine_Sym__lit___94_layouts_LAYOUTLIST_symbol_Sym_(builder);
      
        _init_prod__Iter_Sym__symbol_Sym_layouts_LAYOUTLIST_lit___43_(builder);
      
    }
  }
	
  protected static class NonterminalLabel {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__NonterminalLabel__char_class___range__97_122_conditional__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[2];
      
      tmp[1] = new ListStackNode(464, 1, regular__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122, new CharStackNode(466, 0, new char[][]{{48,57},{65,90},{95,95},{97,122}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{48,57},{65,90},{95,95},{97,122}})});
      tmp[0] = new CharStackNode(462, 0, new char[][]{{97,122}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NonterminalLabel__char_class___range__97_122_conditional__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__NonterminalLabel__char_class___range__97_122_conditional__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_(builder);
      
    }
  }
	
  protected static class Header {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_Header__tags_Tags_layouts_LAYOUTLIST_lit_module_layouts_LAYOUTLIST_name_QualifiedName_layouts_LAYOUTLIST_imports_iter_star_seps__Import__layouts_LAYOUTLIST_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new SeparatedListStackNode(506, 6, regular__iter_star_seps__Import__layouts_LAYOUTLIST, new NonTerminalStackNode(508, 0, "Import", null, null), new AbstractStackNode[]{new NonTerminalStackNode(510, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[5] = new NonTerminalStackNode(504, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(502, 4, "QualifiedName", null, null);
      tmp[3] = new NonTerminalStackNode(500, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(498, 2, prod__lit_module__char_class___range__109_109_char_class___range__111_111_char_class___range__100_100_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_, new char[] {109,111,100,117,108,101}, null, null);
      tmp[1] = new NonTerminalStackNode(496, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(494, 0, "Tags", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Header__tags_Tags_layouts_LAYOUTLIST_lit_module_layouts_LAYOUTLIST_name_QualifiedName_layouts_LAYOUTLIST_imports_iter_star_seps__Import__layouts_LAYOUTLIST_, tmp);
	}
    protected static final void _init_prod__Parameters_Header__tags_Tags_layouts_LAYOUTLIST_lit_module_layouts_LAYOUTLIST_name_QualifiedName_layouts_LAYOUTLIST_params_ModuleParameters_layouts_LAYOUTLIST_imports_iter_star_seps__Import__layouts_LAYOUTLIST_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[9];
      
      tmp[8] = new SeparatedListStackNode(528, 8, regular__iter_star_seps__Import__layouts_LAYOUTLIST, new NonTerminalStackNode(530, 0, "Import", null, null), new AbstractStackNode[]{new NonTerminalStackNode(532, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[7] = new NonTerminalStackNode(526, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(524, 6, "ModuleParameters", null, null);
      tmp[5] = new NonTerminalStackNode(522, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(520, 4, "QualifiedName", null, null);
      tmp[3] = new NonTerminalStackNode(518, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(516, 2, prod__lit_module__char_class___range__109_109_char_class___range__111_111_char_class___range__100_100_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_, new char[] {109,111,100,117,108,101}, null, null);
      tmp[1] = new NonTerminalStackNode(514, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(512, 0, "Tags", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Parameters_Header__tags_Tags_layouts_LAYOUTLIST_lit_module_layouts_LAYOUTLIST_name_QualifiedName_layouts_LAYOUTLIST_params_ModuleParameters_layouts_LAYOUTLIST_imports_iter_star_seps__Import__layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_Header__tags_Tags_layouts_LAYOUTLIST_lit_module_layouts_LAYOUTLIST_name_QualifiedName_layouts_LAYOUTLIST_imports_iter_star_seps__Import__layouts_LAYOUTLIST_(builder);
      
        _init_prod__Parameters_Header__tags_Tags_layouts_LAYOUTLIST_lit_module_layouts_LAYOUTLIST_name_QualifiedName_layouts_LAYOUTLIST_params_ModuleParameters_layouts_LAYOUTLIST_imports_iter_star_seps__Import__layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class Commands {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__List_Commands__commands_iter_seps__Command__layouts_LAYOUTLIST_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode(578, 0, regular__iter_seps__Command__layouts_LAYOUTLIST, new NonTerminalStackNode(580, 0, "Command", null, null), new AbstractStackNode[]{new NonTerminalStackNode(582, 1, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__List_Commands__commands_iter_seps__Command__layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__List_Commands__commands_iter_seps__Command__layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class ImportedModule {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Renamings_ImportedModule__name_QualifiedName_layouts_LAYOUTLIST_renamings_Renamings_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(612, 2, "Renamings", null, null);
      tmp[1] = new NonTerminalStackNode(610, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(608, 0, "QualifiedName", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Renamings_ImportedModule__name_QualifiedName_layouts_LAYOUTLIST_renamings_Renamings_, tmp);
	}
    protected static final void _init_prod__ActualsRenaming_ImportedModule__name_QualifiedName_layouts_LAYOUTLIST_actuals_ModuleActuals_layouts_LAYOUTLIST_renamings_Renamings_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(622, 4, "Renamings", null, null);
      tmp[3] = new NonTerminalStackNode(620, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(618, 2, "ModuleActuals", null, null);
      tmp[1] = new NonTerminalStackNode(616, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(614, 0, "QualifiedName", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__ActualsRenaming_ImportedModule__name_QualifiedName_layouts_LAYOUTLIST_actuals_ModuleActuals_layouts_LAYOUTLIST_renamings_Renamings_, tmp);
	}
    protected static final void _init_prod__Default_ImportedModule__name_QualifiedName_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(624, 0, "QualifiedName", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_ImportedModule__name_QualifiedName_, tmp);
	}
    protected static final void _init_prod__Actuals_ImportedModule__name_QualifiedName_layouts_LAYOUTLIST_actuals_ModuleActuals_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(630, 2, "ModuleActuals", null, null);
      tmp[1] = new NonTerminalStackNode(628, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(626, 0, "QualifiedName", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Actuals_ImportedModule__name_QualifiedName_layouts_LAYOUTLIST_actuals_ModuleActuals_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Renamings_ImportedModule__name_QualifiedName_layouts_LAYOUTLIST_renamings_Renamings_(builder);
      
        _init_prod__ActualsRenaming_ImportedModule__name_QualifiedName_layouts_LAYOUTLIST_actuals_ModuleActuals_layouts_LAYOUTLIST_renamings_Renamings_(builder);
      
        _init_prod__Default_ImportedModule__name_QualifiedName_(builder);
      
        _init_prod__Actuals_ImportedModule__name_QualifiedName_layouts_LAYOUTLIST_actuals_ModuleActuals_(builder);
      
    }
  }
	
  protected static class Expression {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__FieldUpdate_Expression__expression_Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_key_Name_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_replacement_Expression_layouts_LAYOUTLIST_lit___93_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[11];
      
      tmp[10] = new LiteralStackNode(710, 10, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      tmp[9] = new NonTerminalStackNode(708, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode(706, 8, "Expression", null, null);
      tmp[7] = new NonTerminalStackNode(704, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(702, 6, prod__lit___61__char_class___range__61_61_, new char[] {61}, null, null);
      tmp[5] = new NonTerminalStackNode(700, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(698, 4, "Name", null, null);
      tmp[3] = new NonTerminalStackNode(696, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(694, 2, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      tmp[1] = new NonTerminalStackNode(692, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(690, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__FieldUpdate_Expression__expression_Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_key_Name_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_replacement_Expression_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__Range_Expression__lit___91_layouts_LAYOUTLIST_first_Expression_layouts_LAYOUTLIST_lit___46_46_layouts_LAYOUTLIST_last_Expression_layouts_LAYOUTLIST_lit___93_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[9];
      
      tmp[7] = new NonTerminalStackNode(748, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(746, 6, "Expression", null, null);
      tmp[5] = new NonTerminalStackNode(744, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(742, 4, prod__lit___46_46__char_class___range__46_46_char_class___range__46_46_, new char[] {46,46}, null, null);
      tmp[3] = new NonTerminalStackNode(740, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(738, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(736, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(734, 0, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      tmp[8] = new LiteralStackNode(750, 8, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Range_Expression__lit___91_layouts_LAYOUTLIST_first_Expression_layouts_LAYOUTLIST_lit___46_46_layouts_LAYOUTLIST_last_Expression_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__Modulo_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_mod_layouts_LAYOUTLIST_rhs_Expression__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1204, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1202, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1200, 2, prod__lit_mod__char_class___range__109_109_char_class___range__111_111_char_class___range__100_100_, new char[] {109,111,100}, null, null);
      tmp[1] = new NonTerminalStackNode(1198, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1196, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Modulo_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_mod_layouts_LAYOUTLIST_rhs_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__LessThanOrEq_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___60_61_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1314, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1312, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1310, 2, prod__lit___60_61__char_class___range__60_60_char_class___range__61_61_, new char[] {60,61}, null, null);
      tmp[1] = new NonTerminalStackNode(1308, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1306, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__LessThanOrEq_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___60_61_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__Or_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_rhs_Expression__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1444, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1442, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1440, 2, prod__lit___124_124__char_class___range__124_124_char_class___range__124_124_, new char[] {124,124}, null, null);
      tmp[1] = new NonTerminalStackNode(1438, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1436, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Or_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_rhs_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__Bracket_Expression__lit___40_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___41__bracket(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(818, 4, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[3] = new NonTerminalStackNode(816, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(814, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(812, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(810, 0, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Bracket_Expression__lit___40_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___41__bracket, tmp);
	}
    protected static final void _init_prod__Any_Expression__lit_any_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[0] = new LiteralStackNode(820, 0, prod__lit_any__char_class___range__97_97_char_class___range__110_110_char_class___range__121_121_, new char[] {97,110,121}, null, null);
      tmp[1] = new NonTerminalStackNode(822, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(824, 2, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[3] = new NonTerminalStackNode(826, 3, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(828, 4, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(830, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(832, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(834, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(836, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[5] = new NonTerminalStackNode(838, 5, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(840, 6, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Any_Expression__lit_any_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__Is_Expression__expression_Expression_layouts_LAYOUTLIST_lit_is_layouts_LAYOUTLIST_name_Name_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(850, 4, "Name", null, null);
      tmp[3] = new NonTerminalStackNode(848, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(846, 2, prod__lit_is__char_class___range__105_105_char_class___range__115_115_, new char[] {105,115}, null, null);
      tmp[1] = new NonTerminalStackNode(844, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(842, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Is_Expression__expression_Expression_layouts_LAYOUTLIST_lit_is_layouts_LAYOUTLIST_name_Name_, tmp);
	}
    protected static final void _init_prod__TransitiveClosure_Expression__argument_Expression_layouts_LAYOUTLIST_conditional__lit___43__not_follow__lit___61_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(856, 2, prod__lit___43__char_class___range__43_43_, new char[] {43}, null, new ICompletionFilter[] {new StringFollowRestriction(new char[] {61})});
      tmp[1] = new NonTerminalStackNode(854, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(852, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__TransitiveClosure_Expression__argument_Expression_layouts_LAYOUTLIST_conditional__lit___43__not_follow__lit___61_, tmp);
	}
    protected static final void _init_prod__Map_Expression__lit___40_layouts_LAYOUTLIST_mappings_iter_star_seps__Mapping__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode(858, 0, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[1] = new NonTerminalStackNode(860, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode(862, 2, regular__iter_star_seps__Mapping__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(864, 0, "Mapping__Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(866, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(868, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(870, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode(872, 3, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(874, 4, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Map_Expression__lit___40_layouts_LAYOUTLIST_mappings_iter_star_seps__Mapping__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__Has_Expression__expression_Expression_layouts_LAYOUTLIST_lit_has_layouts_LAYOUTLIST_name_Name_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(902, 4, "Name", null, null);
      tmp[3] = new NonTerminalStackNode(900, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(898, 2, prod__lit_has__char_class___range__104_104_char_class___range__97_97_char_class___range__115_115_, new char[] {104,97,115}, null, null);
      tmp[1] = new NonTerminalStackNode(896, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(894, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Has_Expression__expression_Expression_layouts_LAYOUTLIST_lit_has_layouts_LAYOUTLIST_name_Name_, tmp);
	}
    protected static final void _init_prod__Set_Expression__lit___123_layouts_LAYOUTLIST_elements_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(946, 4, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[3] = new NonTerminalStackNode(944, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode(934, 2, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(936, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(938, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(940, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(942, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[1] = new NonTerminalStackNode(932, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(930, 0, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Set_Expression__lit___123_layouts_LAYOUTLIST_elements_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__All_Expression__lit_all_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(978, 6, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[5] = new NonTerminalStackNode(976, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(966, 4, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(968, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(970, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(972, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(974, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[3] = new NonTerminalStackNode(964, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(962, 2, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[1] = new NonTerminalStackNode(960, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(958, 0, prod__lit_all__char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_, new char[] {97,108,108}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__All_Expression__lit_all_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__Equals_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___61_61_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1364, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1362, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1360, 2, prod__lit___61_61__char_class___range__61_61_char_class___range__61_61_, new char[] {61,61}, null, null);
      tmp[1] = new NonTerminalStackNode(1358, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1356, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Equals_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___61_61_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__Product_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___42_layouts_LAYOUTLIST_conditional__empty__not_follow__lit___42_layouts_LAYOUTLIST_rhs_Expression__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new NonTerminalStackNode(1194, 6, "Expression", null, null);
      tmp[5] = new NonTerminalStackNode(1192, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new EmptyStackNode(1190, 4, regular__empty, null, new ICompletionFilter[] {new StringFollowRestriction(new char[] {42})});
      tmp[3] = new NonTerminalStackNode(1188, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1186, 2, prod__lit___42__char_class___range__42_42_, new char[] {42}, null, null);
      tmp[1] = new NonTerminalStackNode(1184, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1182, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Product_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___42_layouts_LAYOUTLIST_conditional__empty__not_follow__lit___42_layouts_LAYOUTLIST_rhs_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__ReifyType_Expression__lit___35_layouts_LAYOUTLIST_type_Type_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(984, 2, "Type", null, null);
      tmp[1] = new NonTerminalStackNode(982, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(980, 0, prod__lit___35__char_class___range__35_35_, new char[] {35}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__ReifyType_Expression__lit___35_layouts_LAYOUTLIST_type_Type_, tmp);
	}
    protected static final void _init_prod__AsType_Expression__lit___91_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_lit___93_layouts_LAYOUTLIST_argument_Expression_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new NonTerminalStackNode(1164, 6, "Expression", null, null);
      tmp[5] = new NonTerminalStackNode(1162, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(1160, 4, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      tmp[3] = new NonTerminalStackNode(1158, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(1156, 2, "Type", null, null);
      tmp[1] = new NonTerminalStackNode(1154, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(1152, 0, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__AsType_Expression__lit___91_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_lit___93_layouts_LAYOUTLIST_argument_Expression_, tmp);
	}
    protected static final void _init_prod__Splice_Expression__lit___42_layouts_LAYOUTLIST_argument_Expression__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(1170, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(1168, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(1166, 0, prod__lit___42__char_class___range__42_42_, new char[] {42}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Splice_Expression__lit___42_layouts_LAYOUTLIST_argument_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__Reducer_Expression__lit___40_layouts_LAYOUTLIST_init_Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_result_Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[13];
      
      tmp[12] = new LiteralStackNode(1032, 12, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[11] = new NonTerminalStackNode(1030, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new SeparatedListStackNode(1020, 10, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(1022, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(1024, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(1026, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(1028, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[9] = new NonTerminalStackNode(1018, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(1016, 8, prod__lit___124__char_class___range__124_124_, new char[] {124}, null, null);
      tmp[7] = new NonTerminalStackNode(1014, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(1012, 6, "Expression", null, null);
      tmp[5] = new NonTerminalStackNode(1010, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(1008, 4, prod__lit___124__char_class___range__124_124_, new char[] {124}, null, null);
      tmp[3] = new NonTerminalStackNode(1006, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(1004, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(1002, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(1000, 0, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Reducer_Expression__lit___40_layouts_LAYOUTLIST_init_Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_result_Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__Closure_Expression__type_Type_layouts_LAYOUTLIST_parameters_Parameters_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_statements_iter_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[9];
      
      tmp[8] = new LiteralStackNode(1076, 8, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[7] = new NonTerminalStackNode(1074, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new SeparatedListStackNode(1068, 6, regular__iter_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode(1070, 0, "Statement", null, null), new AbstractStackNode[]{new NonTerminalStackNode(1072, 1, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[5] = new NonTerminalStackNode(1066, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(1064, 4, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      tmp[3] = new NonTerminalStackNode(1062, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(1060, 2, "Parameters", null, null);
      tmp[1] = new NonTerminalStackNode(1058, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1056, 0, "Type", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Closure_Expression__type_Type_layouts_LAYOUTLIST_parameters_Parameters_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_statements_iter_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__Intersection_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___38_layouts_LAYOUTLIST_rhs_Expression__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1244, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1242, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1240, 2, prod__lit___38__char_class___range__38_38_, new char[] {38}, null, null);
      tmp[1] = new NonTerminalStackNode(1238, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1236, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Intersection_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___38_layouts_LAYOUTLIST_rhs_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__Visit_Expression__label_Label_layouts_LAYOUTLIST_visit_Visit_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(1082, 2, "Visit", null, null);
      tmp[1] = new NonTerminalStackNode(1080, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1078, 0, "Label", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Visit_Expression__label_Label_layouts_LAYOUTLIST_visit_Visit_, tmp);
	}
    protected static final void _init_prod__And_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_rhs_Expression__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1434, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1432, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1430, 2, prod__lit___38_38__char_class___range__38_38_char_class___range__38_38_, new char[] {38,38}, null, null);
      tmp[1] = new NonTerminalStackNode(1428, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1426, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__And_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_rhs_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__Join_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_join_layouts_LAYOUTLIST_rhs_Expression__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1224, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1222, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1220, 2, prod__lit_join__char_class___range__106_106_char_class___range__111_111_char_class___range__105_105_char_class___range__110_110_, new char[] {106,111,105,110}, null, null);
      tmp[1] = new NonTerminalStackNode(1218, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1216, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Join_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_join_layouts_LAYOUTLIST_rhs_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__Tuple_Expression__lit___60_layouts_LAYOUTLIST_elements_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___62_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(1102, 4, prod__lit___62__char_class___range__62_62_, new char[] {62}, null, null);
      tmp[3] = new NonTerminalStackNode(1100, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode(1090, 2, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(1092, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(1094, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(1096, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(1098, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[1] = new NonTerminalStackNode(1088, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(1086, 0, prod__lit___60__char_class___range__60_60_, new char[] {60}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Tuple_Expression__lit___60_layouts_LAYOUTLIST_elements_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___62_, tmp);
	}
    protected static final void _init_prod__In_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1304, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1302, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1300, 2, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new char[] {105,110}, null, null);
      tmp[1] = new NonTerminalStackNode(1298, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1296, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__In_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__StepRange_Expression__lit___91_layouts_LAYOUTLIST_first_Expression_layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_second_Expression_layouts_LAYOUTLIST_lit___46_46_layouts_LAYOUTLIST_last_Expression_layouts_LAYOUTLIST_lit___93_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[13];
      
      tmp[12] = new LiteralStackNode(1128, 12, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      tmp[11] = new NonTerminalStackNode(1126, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new NonTerminalStackNode(1124, 10, "Expression", null, null);
      tmp[9] = new NonTerminalStackNode(1122, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(1120, 8, prod__lit___46_46__char_class___range__46_46_char_class___range__46_46_, new char[] {46,46}, null, null);
      tmp[7] = new NonTerminalStackNode(1118, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(1116, 6, "Expression", null, null);
      tmp[5] = new NonTerminalStackNode(1114, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(1112, 4, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null);
      tmp[3] = new NonTerminalStackNode(1110, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(1108, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(1106, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(1104, 0, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__StepRange_Expression__lit___91_layouts_LAYOUTLIST_first_Expression_layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_second_Expression_layouts_LAYOUTLIST_lit___46_46_layouts_LAYOUTLIST_last_Expression_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__It_Expression__conditional__lit_it__not_precede__char_class___range__65_90_range__95_95_range__97_122_not_follow__char_class___range__65_90_range__95_95_range__97_122_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1130, 0, prod__lit_it__char_class___range__105_105_char_class___range__116_116_, new char[] {105,116}, new IEnterFilter[] {new CharPrecedeRestriction(new char[][]{{65,90},{95,95},{97,122}})}, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{65,90},{95,95},{97,122}})});
      builder.addAlternative(ObjectRascalRascal.prod__It_Expression__conditional__lit_it__not_precede__char_class___range__65_90_range__95_95_range__97_122_not_follow__char_class___range__65_90_range__95_95_range__97_122_, tmp);
	}
    protected static final void _init_prod__IfThenElse_Expression__condition_Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_thenExp_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_elseExp_Expression__assoc__right(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[9];
      
      tmp[8] = new NonTerminalStackNode(1462, 8, "Expression", null, null);
      tmp[7] = new NonTerminalStackNode(1460, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(1458, 6, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[5] = new NonTerminalStackNode(1456, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(1454, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1452, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1450, 2, prod__lit___63__char_class___range__63_63_, new char[] {63}, null, null);
      tmp[1] = new NonTerminalStackNode(1448, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1446, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__IfThenElse_Expression__condition_Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_thenExp_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_elseExp_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__Match_Expression__pattern_Pattern_layouts_LAYOUTLIST_lit___58_61_layouts_LAYOUTLIST_expression_Expression__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1384, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1382, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1380, 2, prod__lit___58_61__char_class___range__58_58_char_class___range__61_61_, new char[] {58,61}, null, null);
      tmp[1] = new NonTerminalStackNode(1378, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1376, 0, "Pattern", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Match_Expression__pattern_Pattern_layouts_LAYOUTLIST_lit___58_61_layouts_LAYOUTLIST_expression_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__ReifiedType_Expression__basicType_BasicType_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(688, 6, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[5] = new NonTerminalStackNode(686, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(676, 4, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(678, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(680, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(682, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(684, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode(674, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(672, 2, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[1] = new NonTerminalStackNode(670, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(668, 0, "BasicType", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__ReifiedType_Expression__basicType_BasicType_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__CallOrTree_Expression__expression_Expression_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[0] = new NonTerminalStackNode(712, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(714, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(716, 2, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[3] = new NonTerminalStackNode(718, 3, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(720, 4, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(722, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(724, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(726, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(728, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[5] = new NonTerminalStackNode(730, 5, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(732, 6, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__CallOrTree_Expression__expression_Expression_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__Negation_Expression__lit___33_layouts_LAYOUTLIST_argument_Expression_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(1144, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(1142, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(1140, 0, prod__lit___33__char_class___range__33_33_, new char[] {33}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Negation_Expression__lit___33_layouts_LAYOUTLIST_argument_Expression_, tmp);
	}
    protected static final void _init_prod__List_Expression__lit___91_layouts_LAYOUTLIST_elements_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(768, 4, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      tmp[3] = new NonTerminalStackNode(766, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode(756, 2, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(758, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(760, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(762, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(764, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[1] = new NonTerminalStackNode(754, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(752, 0, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__List_Expression__lit___91_layouts_LAYOUTLIST_elements_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__VoidClosure_Expression__parameters_Parameters_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_statements_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[0] = new NonTerminalStackNode(792, 0, "Parameters", null, null);
      tmp[1] = new NonTerminalStackNode(794, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(796, 2, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      tmp[3] = new NonTerminalStackNode(798, 3, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(800, 4, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode(802, 0, "Statement", null, null), new AbstractStackNode[]{new NonTerminalStackNode(804, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[5] = new NonTerminalStackNode(806, 5, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(808, 6, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__VoidClosure_Expression__parameters_Parameters_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_statements_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__Subscript_Expression__expression_Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_subscripts_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(790, 6, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      tmp[5] = new NonTerminalStackNode(788, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(778, 4, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(780, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(782, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(784, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(786, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[3] = new NonTerminalStackNode(776, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(774, 2, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      tmp[1] = new NonTerminalStackNode(772, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(770, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Subscript_Expression__expression_Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_subscripts_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__Subtraction_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_rhs_Expression__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1264, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1262, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1260, 2, prod__lit____char_class___range__45_45_, new char[] {45}, null, null);
      tmp[1] = new NonTerminalStackNode(1258, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1256, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Subtraction_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_rhs_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__NotIn_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_notin_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1294, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1292, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1290, 2, prod__lit_notin__char_class___range__110_110_char_class___range__111_111_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_, new char[] {110,111,116,105,110}, null, null);
      tmp[1] = new NonTerminalStackNode(1288, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1286, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NotIn_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_notin_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__GreaterThan_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___62_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1334, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1332, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1330, 2, prod__lit___62__char_class___range__62_62_, new char[] {62}, null, null);
      tmp[1] = new NonTerminalStackNode(1328, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1326, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__GreaterThan_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___62_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__Enumerator_Expression__pattern_Pattern_layouts_LAYOUTLIST_lit___60_45_layouts_LAYOUTLIST_expression_Expression__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1394, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1392, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1390, 2, prod__lit___60_45__char_class___range__60_60_char_class___range__45_45_, new char[] {60,45}, null, null);
      tmp[1] = new NonTerminalStackNode(1388, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1386, 0, "Pattern", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Enumerator_Expression__pattern_Pattern_layouts_LAYOUTLIST_lit___60_45_layouts_LAYOUTLIST_expression_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__GreaterThanOrEq_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___62_61_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1344, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1342, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1340, 2, prod__lit___62_61__char_class___range__62_62_char_class___range__61_61_, new char[] {62,61}, null, null);
      tmp[1] = new NonTerminalStackNode(1338, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1336, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__GreaterThanOrEq_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___62_61_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__Equivalence_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___60_61_61_62_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1424, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1422, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1420, 2, prod__lit___60_61_61_62__char_class___range__60_60_char_class___range__61_61_char_class___range__61_61_char_class___range__62_62_, new char[] {60,61,61,62}, null, null);
      tmp[1] = new NonTerminalStackNode(1418, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1416, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Equivalence_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___60_61_61_62_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__GetAnnotation_Expression__expression_Expression_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_name_Name_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(884, 4, "Name", null, null);
      tmp[3] = new NonTerminalStackNode(882, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(880, 2, prod__lit___64__char_class___range__64_64_, new char[] {64}, null, null);
      tmp[1] = new NonTerminalStackNode(878, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(876, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__GetAnnotation_Expression__expression_Expression_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_name_Name_, tmp);
	}
    protected static final void _init_prod__TransitiveReflexiveClosure_Expression__argument_Expression_layouts_LAYOUTLIST_conditional__lit___42__not_follow__lit___61_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(890, 2, prod__lit___42__char_class___range__42_42_, new char[] {42}, null, new ICompletionFilter[] {new StringFollowRestriction(new char[] {61})});
      tmp[1] = new NonTerminalStackNode(888, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(886, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__TransitiveReflexiveClosure_Expression__argument_Expression_layouts_LAYOUTLIST_conditional__lit___42__not_follow__lit___61_, tmp);
	}
    protected static final void _init_prod__QualifiedName_Expression__qualifiedName_QualifiedName_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(892, 0, "QualifiedName", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__QualifiedName_Expression__qualifiedName_QualifiedName_, tmp);
	}
    protected static final void _init_prod__Addition_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___43_layouts_LAYOUTLIST_rhs_Expression__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1284, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1282, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1280, 2, prod__lit___43__char_class___range__43_43_, new char[] {43}, null, null);
      tmp[1] = new NonTerminalStackNode(1278, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1276, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Addition_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___43_layouts_LAYOUTLIST_rhs_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__NoMatch_Expression__pattern_Pattern_layouts_LAYOUTLIST_lit___33_58_61_layouts_LAYOUTLIST_expression_Expression__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1404, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1402, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1400, 2, prod__lit___33_58_61__char_class___range__33_33_char_class___range__58_58_char_class___range__61_61_, new char[] {33,58,61}, null, null);
      tmp[1] = new NonTerminalStackNode(1398, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1396, 0, "Pattern", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NoMatch_Expression__pattern_Pattern_layouts_LAYOUTLIST_lit___33_58_61_layouts_LAYOUTLIST_expression_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__SetAnnotation_Expression__expression_Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_value_Expression_layouts_LAYOUTLIST_lit___93_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[13];
      
      tmp[12] = new LiteralStackNode(928, 12, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      tmp[11] = new NonTerminalStackNode(926, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new NonTerminalStackNode(924, 10, "Expression", null, null);
      tmp[9] = new NonTerminalStackNode(922, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(920, 8, prod__lit___61__char_class___range__61_61_, new char[] {61}, null, null);
      tmp[7] = new NonTerminalStackNode(918, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(916, 6, "Name", null, null);
      tmp[5] = new NonTerminalStackNode(914, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(912, 4, prod__lit___64__char_class___range__64_64_, new char[] {64}, null, null);
      tmp[3] = new NonTerminalStackNode(910, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(908, 2, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      tmp[1] = new NonTerminalStackNode(906, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(904, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__SetAnnotation_Expression__expression_Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_value_Expression_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__FieldAccess_Expression__expression_Expression_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_field_Name_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(956, 4, "Name", null, null);
      tmp[3] = new NonTerminalStackNode(954, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(952, 2, prod__lit___46__char_class___range__46_46_, new char[] {46}, null, null);
      tmp[1] = new NonTerminalStackNode(950, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(948, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__FieldAccess_Expression__expression_Expression_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_field_Name_, tmp);
	}
    protected static final void _init_prod__NonEquals_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___33_61_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1354, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1352, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1350, 2, prod__lit___33_61__char_class___range__33_33_char_class___range__61_61_, new char[] {33,61}, null, null);
      tmp[1] = new NonTerminalStackNode(1348, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1346, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NonEquals_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___33_61_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__Composition_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_o_layouts_LAYOUTLIST_rhs_Expression__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1180, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1178, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1176, 2, prod__lit_o__char_class___range__111_111_, new char[] {111}, null, null);
      tmp[1] = new NonTerminalStackNode(1174, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1172, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Composition_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_o_layouts_LAYOUTLIST_rhs_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__Implication_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___61_61_62_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1414, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1412, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1410, 2, prod__lit___61_61_62__char_class___range__61_61_char_class___range__61_61_char_class___range__62_62_, new char[] {61,61,62}, null, null);
      tmp[1] = new NonTerminalStackNode(1408, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1406, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Implication_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___61_61_62_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__Negative_Expression__lit___layouts_LAYOUTLIST_argument_Expression_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(1150, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(1148, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(1146, 0, prod__lit____char_class___range__45_45_, new char[] {45}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Negative_Expression__lit___layouts_LAYOUTLIST_argument_Expression_, tmp);
	}
    protected static final void _init_prod__LessThan_Expression__lhs_Expression_layouts_LAYOUTLIST_conditional__lit___60__not_follow__lit___layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1324, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1322, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1320, 2, prod__lit___60__char_class___range__60_60_, new char[] {60}, null, new ICompletionFilter[] {new StringFollowRestriction(new char[] {45})});
      tmp[1] = new NonTerminalStackNode(1318, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1316, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__LessThan_Expression__lhs_Expression_layouts_LAYOUTLIST_conditional__lit___60__not_follow__lit___layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__AppendAfter_Expression__lhs_Expression_layouts_LAYOUTLIST_conditional__lit___60_60__not_follow__lit___61_layouts_LAYOUTLIST_rhs_Expression__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1254, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1252, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1250, 2, prod__lit___60_60__char_class___range__60_60_char_class___range__60_60_, new char[] {60,60}, null, new ICompletionFilter[] {new StringFollowRestriction(new char[] {61})});
      tmp[1] = new NonTerminalStackNode(1248, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1246, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__AppendAfter_Expression__lhs_Expression_layouts_LAYOUTLIST_conditional__lit___60_60__not_follow__lit___61_layouts_LAYOUTLIST_rhs_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__NonEmptyBlock_Expression__lit___123_layouts_LAYOUTLIST_statements_iter_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(998, 4, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[3] = new NonTerminalStackNode(996, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode(990, 2, regular__iter_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode(992, 0, "Statement", null, null), new AbstractStackNode[]{new NonTerminalStackNode(994, 1, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[1] = new NonTerminalStackNode(988, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(986, 0, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NonEmptyBlock_Expression__lit___123_layouts_LAYOUTLIST_statements_iter_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__Remainder_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___37_layouts_LAYOUTLIST_rhs_Expression__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1214, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1212, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1210, 2, prod__lit___37__char_class___range__37_37_, new char[] {37}, null, null);
      tmp[1] = new NonTerminalStackNode(1208, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1206, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Remainder_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___37_layouts_LAYOUTLIST_rhs_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__IfDefinedOtherwise_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1374, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1372, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1370, 2, prod__lit___63__char_class___range__63_63_, new char[] {63}, null, null);
      tmp[1] = new NonTerminalStackNode(1368, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1366, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__IfDefinedOtherwise_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__InsertBefore_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_rhs_Expression__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1274, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1272, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1270, 2, prod__lit___62_62__char_class___range__62_62_char_class___range__62_62_, new char[] {62,62}, null, null);
      tmp[1] = new NonTerminalStackNode(1268, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1266, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__InsertBefore_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_rhs_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__FieldProject_Expression__expression_Expression_layouts_LAYOUTLIST_lit___60_layouts_LAYOUTLIST_fields_iter_seps__Field__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___62_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(1054, 6, prod__lit___62__char_class___range__62_62_, new char[] {62}, null, null);
      tmp[5] = new NonTerminalStackNode(1052, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(1042, 4, regular__iter_seps__Field__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(1044, 0, "Field", null, null), new AbstractStackNode[]{new NonTerminalStackNode(1046, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(1048, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(1050, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[3] = new NonTerminalStackNode(1040, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1038, 2, prod__lit___60__char_class___range__60_60_, new char[] {60}, null, null);
      tmp[1] = new NonTerminalStackNode(1036, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1034, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__FieldProject_Expression__expression_Expression_layouts_LAYOUTLIST_lit___60_layouts_LAYOUTLIST_fields_iter_seps__Field__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___62_, tmp);
	}
    protected static final void _init_prod__Literal_Expression__literal_Literal_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(1084, 0, "Literal", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Literal_Expression__literal_Literal_, tmp);
	}
    protected static final void _init_prod__IsDefined_Expression__argument_Expression_layouts_LAYOUTLIST_lit___63_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(1138, 2, prod__lit___63__char_class___range__63_63_, new char[] {63}, null, null);
      tmp[1] = new NonTerminalStackNode(1136, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1134, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__IsDefined_Expression__argument_Expression_layouts_LAYOUTLIST_lit___63_, tmp);
	}
    protected static final void _init_prod__Division_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___47_layouts_LAYOUTLIST_rhs_Expression__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1234, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1232, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1230, 2, prod__lit___47__char_class___range__47_47_, new char[] {47}, null, null);
      tmp[1] = new NonTerminalStackNode(1228, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1226, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Division_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___47_layouts_LAYOUTLIST_rhs_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__Comprehension_Expression__comprehension_Comprehension_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(1132, 0, "Comprehension", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Comprehension_Expression__comprehension_Comprehension_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__FieldUpdate_Expression__expression_Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_key_Name_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_replacement_Expression_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__Range_Expression__lit___91_layouts_LAYOUTLIST_first_Expression_layouts_LAYOUTLIST_lit___46_46_layouts_LAYOUTLIST_last_Expression_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__Modulo_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_mod_layouts_LAYOUTLIST_rhs_Expression__assoc__left(builder);
      
        _init_prod__LessThanOrEq_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___60_61_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(builder);
      
        _init_prod__Or_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_rhs_Expression__assoc__left(builder);
      
        _init_prod__Bracket_Expression__lit___40_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___41__bracket(builder);
      
        _init_prod__Any_Expression__lit_any_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(builder);
      
        _init_prod__Is_Expression__expression_Expression_layouts_LAYOUTLIST_lit_is_layouts_LAYOUTLIST_name_Name_(builder);
      
        _init_prod__TransitiveClosure_Expression__argument_Expression_layouts_LAYOUTLIST_conditional__lit___43__not_follow__lit___61_(builder);
      
        _init_prod__Map_Expression__lit___40_layouts_LAYOUTLIST_mappings_iter_star_seps__Mapping__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(builder);
      
        _init_prod__Has_Expression__expression_Expression_layouts_LAYOUTLIST_lit_has_layouts_LAYOUTLIST_name_Name_(builder);
      
        _init_prod__Set_Expression__lit___123_layouts_LAYOUTLIST_elements_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__All_Expression__lit_all_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(builder);
      
        _init_prod__Equals_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___61_61_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(builder);
      
        _init_prod__Product_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___42_layouts_LAYOUTLIST_conditional__empty__not_follow__lit___42_layouts_LAYOUTLIST_rhs_Expression__assoc__left(builder);
      
        _init_prod__ReifyType_Expression__lit___35_layouts_LAYOUTLIST_type_Type_(builder);
      
        _init_prod__AsType_Expression__lit___91_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_lit___93_layouts_LAYOUTLIST_argument_Expression_(builder);
      
        _init_prod__Splice_Expression__lit___42_layouts_LAYOUTLIST_argument_Expression__assoc__non_assoc(builder);
      
        _init_prod__Reducer_Expression__lit___40_layouts_LAYOUTLIST_init_Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_result_Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(builder);
      
        _init_prod__Closure_Expression__type_Type_layouts_LAYOUTLIST_parameters_Parameters_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_statements_iter_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__Intersection_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___38_layouts_LAYOUTLIST_rhs_Expression__assoc__left(builder);
      
        _init_prod__Visit_Expression__label_Label_layouts_LAYOUTLIST_visit_Visit_(builder);
      
        _init_prod__And_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_rhs_Expression__assoc__left(builder);
      
        _init_prod__Join_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_join_layouts_LAYOUTLIST_rhs_Expression__assoc__left(builder);
      
        _init_prod__Tuple_Expression__lit___60_layouts_LAYOUTLIST_elements_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___62_(builder);
      
        _init_prod__In_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(builder);
      
        _init_prod__StepRange_Expression__lit___91_layouts_LAYOUTLIST_first_Expression_layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_second_Expression_layouts_LAYOUTLIST_lit___46_46_layouts_LAYOUTLIST_last_Expression_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__It_Expression__conditional__lit_it__not_precede__char_class___range__65_90_range__95_95_range__97_122_not_follow__char_class___range__65_90_range__95_95_range__97_122_(builder);
      
        _init_prod__IfThenElse_Expression__condition_Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_thenExp_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_elseExp_Expression__assoc__right(builder);
      
        _init_prod__Match_Expression__pattern_Pattern_layouts_LAYOUTLIST_lit___58_61_layouts_LAYOUTLIST_expression_Expression__assoc__non_assoc(builder);
      
        _init_prod__ReifiedType_Expression__basicType_BasicType_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(builder);
      
        _init_prod__CallOrTree_Expression__expression_Expression_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(builder);
      
        _init_prod__Negation_Expression__lit___33_layouts_LAYOUTLIST_argument_Expression_(builder);
      
        _init_prod__List_Expression__lit___91_layouts_LAYOUTLIST_elements_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__VoidClosure_Expression__parameters_Parameters_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_statements_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__Subscript_Expression__expression_Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_subscripts_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__Subtraction_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_rhs_Expression__assoc__left(builder);
      
        _init_prod__NotIn_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_notin_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(builder);
      
        _init_prod__GreaterThan_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___62_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(builder);
      
        _init_prod__Enumerator_Expression__pattern_Pattern_layouts_LAYOUTLIST_lit___60_45_layouts_LAYOUTLIST_expression_Expression__assoc__non_assoc(builder);
      
        _init_prod__GreaterThanOrEq_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___62_61_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(builder);
      
        _init_prod__Equivalence_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___60_61_61_62_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(builder);
      
        _init_prod__GetAnnotation_Expression__expression_Expression_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_name_Name_(builder);
      
        _init_prod__TransitiveReflexiveClosure_Expression__argument_Expression_layouts_LAYOUTLIST_conditional__lit___42__not_follow__lit___61_(builder);
      
        _init_prod__QualifiedName_Expression__qualifiedName_QualifiedName_(builder);
      
        _init_prod__Addition_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___43_layouts_LAYOUTLIST_rhs_Expression__assoc__left(builder);
      
        _init_prod__NoMatch_Expression__pattern_Pattern_layouts_LAYOUTLIST_lit___33_58_61_layouts_LAYOUTLIST_expression_Expression__assoc__non_assoc(builder);
      
        _init_prod__SetAnnotation_Expression__expression_Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_value_Expression_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__FieldAccess_Expression__expression_Expression_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_field_Name_(builder);
      
        _init_prod__NonEquals_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___33_61_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(builder);
      
        _init_prod__Composition_Expression__lhs_Expression_layouts_LAYOUTLIST_lit_o_layouts_LAYOUTLIST_rhs_Expression__assoc__left(builder);
      
        _init_prod__Implication_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___61_61_62_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(builder);
      
        _init_prod__Negative_Expression__lit___layouts_LAYOUTLIST_argument_Expression_(builder);
      
        _init_prod__LessThan_Expression__lhs_Expression_layouts_LAYOUTLIST_conditional__lit___60__not_follow__lit___layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(builder);
      
        _init_prod__AppendAfter_Expression__lhs_Expression_layouts_LAYOUTLIST_conditional__lit___60_60__not_follow__lit___61_layouts_LAYOUTLIST_rhs_Expression__assoc__left(builder);
      
        _init_prod__NonEmptyBlock_Expression__lit___123_layouts_LAYOUTLIST_statements_iter_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__Remainder_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___37_layouts_LAYOUTLIST_rhs_Expression__assoc__left(builder);
      
        _init_prod__IfDefinedOtherwise_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_rhs_Expression__assoc__non_assoc(builder);
      
        _init_prod__InsertBefore_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_rhs_Expression__assoc__left(builder);
      
        _init_prod__FieldProject_Expression__expression_Expression_layouts_LAYOUTLIST_lit___60_layouts_LAYOUTLIST_fields_iter_seps__Field__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___62_(builder);
      
        _init_prod__Literal_Expression__literal_Literal_(builder);
      
        _init_prod__IsDefined_Expression__argument_Expression_layouts_LAYOUTLIST_lit___63_(builder);
      
        _init_prod__Division_Expression__lhs_Expression_layouts_LAYOUTLIST_lit___47_layouts_LAYOUTLIST_rhs_Expression__assoc__left(builder);
      
        _init_prod__Comprehension_Expression__comprehension_Comprehension_(builder);
      
    }
  }
	
  protected static class TagString {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__TagString__lit___123_contents_iter_star__alt___TagString_char_class___range__0_122_range__124_124_range__126_65535_seq___lit___92_char_class___range__123_123_range__125_125_lit___125_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(1482, 2, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[1] = new ListStackNode(1468, 1, regular__iter_star__alt___TagString_char_class___range__0_122_range__124_124_range__126_65535_seq___lit___92_char_class___range__123_123_range__125_125, new AlternativeStackNode(1470, 0, regular__alt___TagString_char_class___range__0_122_range__124_124_range__126_65535_seq___lit___92_char_class___range__123_123_range__125_125, new AbstractStackNode[]{new NonTerminalStackNode(1472, 0, "TagString", null, null), new CharStackNode(1474, 0, new char[][]{{0,122},{124,124},{126,65535}}, null, null), new SequenceStackNode(1476, 0, regular__seq___lit___92_char_class___range__123_123_range__125_125, new AbstractStackNode[]{new LiteralStackNode(1478, 0, prod__lit___92__char_class___range__92_92_, new char[] {92}, null, null), new CharStackNode(1480, 1, new char[][]{{123,123},{125,125}}, null, null)}, null, null)}, null, null), false, null, null);
      tmp[0] = new LiteralStackNode(1466, 0, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__TagString__lit___123_contents_iter_star__alt___TagString_char_class___range__0_122_range__124_124_range__126_65535_seq___lit___92_char_class___range__123_123_range__125_125_lit___125_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__TagString__lit___123_contents_iter_star__alt___TagString_char_class___range__0_122_range__124_124_range__126_65535_seq___lit___92_char_class___range__123_123_range__125_125_lit___125_(builder);
      
    }
  }
	
  protected static class Nonterminal {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Nonterminal__conditional__char_class___range__65_90__not_precede__char_class___range__65_90_conditional__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_delete__RascalReservedKeywords_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[2];
      
      tmp[1] = new ListStackNode(1496, 1, regular__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122, new CharStackNode(1498, 0, new char[][]{{48,57},{65,90},{95,95},{97,122}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{48,57},{65,90},{95,95},{97,122}})});
      tmp[0] = new CharStackNode(1494, 0, new char[][]{{65,90}}, new IEnterFilter[] {new CharPrecedeRestriction(new char[][]{{65,90}})}, null);
      builder.addAlternative(ObjectRascalRascal.prod__Nonterminal__conditional__char_class___range__65_90__not_precede__char_class___range__65_90_conditional__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_delete__RascalReservedKeywords_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Nonterminal__conditional__char_class___range__65_90__not_precede__char_class___range__65_90_conditional__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_delete__RascalReservedKeywords_(builder);
      
    }
  }
	
  protected static class PreModule {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_PreModule__header_Header_layouts_LAYOUTLIST_conditional__empty__not_follow__HeaderKeyword_layouts_LAYOUTLIST_rest_Rest_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1524, 4, "Rest", null, null);
      tmp[3] = new NonTerminalStackNode(1522, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new EmptyStackNode(1520, 2, regular__empty, null, new ICompletionFilter[] {new StringFollowRestriction(new char[] {108,101,120,105,99,97,108}), new StringFollowRestriction(new char[] {105,109,112,111,114,116}), new StringFollowRestriction(new char[] {115,116,97,114,116}), new StringFollowRestriction(new char[] {115,121,110,116,97,120}), new StringFollowRestriction(new char[] {101,120,116,101,110,100}), new StringFollowRestriction(new char[] {108,97,121,111,117,116}), new StringFollowRestriction(new char[] {107,101,121,119,111,114,100})});
      tmp[1] = new NonTerminalStackNode(1518, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1516, 0, "Header", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_PreModule__header_Header_layouts_LAYOUTLIST_conditional__empty__not_follow__HeaderKeyword_layouts_LAYOUTLIST_rest_Rest_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_PreModule__header_Header_layouts_LAYOUTLIST_conditional__empty__not_follow__HeaderKeyword_layouts_LAYOUTLIST_rest_Rest_(builder);
      
    }
  }
	
  protected static class ProtocolPart {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__NonInterpolated_ProtocolPart__protocolChars_ProtocolChars_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(1528, 0, "ProtocolChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NonInterpolated_ProtocolPart__protocolChars_ProtocolChars_, tmp);
	}
    protected static final void _init_prod__Interpolated_ProtocolPart__pre_PreProtocolChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_ProtocolTail_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1538, 4, "ProtocolTail", null, null);
      tmp[3] = new NonTerminalStackNode(1536, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(1534, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(1532, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1530, 0, "PreProtocolChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Interpolated_ProtocolPart__pre_PreProtocolChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_ProtocolTail_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__NonInterpolated_ProtocolPart__protocolChars_ProtocolChars_(builder);
      
        _init_prod__Interpolated_ProtocolPart__pre_PreProtocolChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_ProtocolTail_(builder);
      
    }
  }
	
  protected static class Comment {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Comment__lit___47_42_iter_star__alt___conditional__char_class___range__42_42__not_follow__char_class___range__47_47_char_class___range__0_41_range__43_65535_lit___42_47__tag__category___67_111_109_109_101_110_116(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(1576, 2, prod__lit___42_47__char_class___range__42_42_char_class___range__47_47_, new char[] {42,47}, null, null);
      tmp[1] = new ListStackNode(1568, 1, regular__iter_star__alt___conditional__char_class___range__42_42__not_follow__char_class___range__47_47_char_class___range__0_41_range__43_65535, new AlternativeStackNode(1570, 0, regular__alt___conditional__char_class___range__42_42__not_follow__char_class___range__47_47_char_class___range__0_41_range__43_65535, new AbstractStackNode[]{new CharStackNode(1572, 0, new char[][]{{42,42}}, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{47,47}})}), new CharStackNode(1574, 0, new char[][]{{0,41},{43,65535}}, null, null)}, null, null), false, null, null);
      tmp[0] = new LiteralStackNode(1566, 0, prod__lit___47_42__char_class___range__47_47_char_class___range__42_42_, new char[] {47,42}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Comment__lit___47_42_iter_star__alt___conditional__char_class___range__42_42__not_follow__char_class___range__47_47_char_class___range__0_41_range__43_65535_lit___42_47__tag__category___67_111_109_109_101_110_116, tmp);
	}
    protected static final void _init_prod__Comment__lit___47_47_conditional__iter_star__char_class___range__0_9_range__11_65535__not_follow__char_class___range__9_9_range__13_13_range__32_32_end_of_line__tag__category___67_111_109_109_101_110_116(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[2];
      
      tmp[1] = new ListStackNode(1580, 1, regular__iter_star__char_class___range__0_9_range__11_65535, new CharStackNode(1582, 0, new char[][]{{0,9},{11,65535}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{9,9},{13,13},{32,32}}), new AtEndOfLineRequirement()});
      tmp[0] = new LiteralStackNode(1578, 0, prod__lit___47_47__char_class___range__47_47_char_class___range__47_47_, new char[] {47,47}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Comment__lit___47_47_conditional__iter_star__char_class___range__0_9_range__11_65535__not_follow__char_class___range__9_9_range__13_13_range__32_32_end_of_line__tag__category___67_111_109_109_101_110_116, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Comment__lit___47_42_iter_star__alt___conditional__char_class___range__42_42__not_follow__char_class___range__47_47_char_class___range__0_41_range__43_65535_lit___42_47__tag__category___67_111_109_109_101_110_116(builder);
      
        _init_prod__Comment__lit___47_47_conditional__iter_star__char_class___range__0_9_range__11_65535__not_follow__char_class___range__9_9_range__13_13_range__32_32_end_of_line__tag__category___67_111_109_109_101_110_116(builder);
      
    }
  }
	
  protected static class Label {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Empty_Label__(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new EpsilonStackNode(1584, 0);
      builder.addAlternative(ObjectRascalRascal.prod__Empty_Label__, tmp);
	}
    protected static final void _init_prod__Default_Label__name_Name_layouts_LAYOUTLIST_lit___58_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(1590, 2, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[1] = new NonTerminalStackNode(1588, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1586, 0, "Name", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Label__name_Name_layouts_LAYOUTLIST_lit___58_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Empty_Label__(builder);
      
        _init_prod__Default_Label__name_Name_layouts_LAYOUTLIST_lit___58_(builder);
      
    }
  }
	
  protected static class Field {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Index_Field__fieldIndex_IntegerLiteral_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(1650, 0, "IntegerLiteral", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Index_Field__fieldIndex_IntegerLiteral_, tmp);
	}
    protected static final void _init_prod__Name_Field__fieldName_Name_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(1652, 0, "Name", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Name_Field__fieldName_Name_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Index_Field__fieldIndex_IntegerLiteral_(builder);
      
        _init_prod__Name_Field__fieldName_Name_(builder);
      
    }
  }
	
  protected static class FunctionModifier {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Java_FunctionModifier__lit_java_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1678, 0, prod__lit_java__char_class___range__106_106_char_class___range__97_97_char_class___range__118_118_char_class___range__97_97_, new char[] {106,97,118,97}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Java_FunctionModifier__lit_java_, tmp);
	}
    protected static final void _init_prod__Default_FunctionModifier__lit_default_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1680, 0, prod__lit_default__char_class___range__100_100_char_class___range__101_101_char_class___range__102_102_char_class___range__97_97_char_class___range__117_117_char_class___range__108_108_char_class___range__116_116_, new char[] {100,101,102,97,117,108,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_FunctionModifier__lit_default_, tmp);
	}
    protected static final void _init_prod__Test_FunctionModifier__lit_test_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1682, 0, prod__lit_test__char_class___range__116_116_char_class___range__101_101_char_class___range__115_115_char_class___range__116_116_, new char[] {116,101,115,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Test_FunctionModifier__lit_test_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Java_FunctionModifier__lit_java_(builder);
      
        _init_prod__Default_FunctionModifier__lit_default_(builder);
      
        _init_prod__Test_FunctionModifier__lit_test_(builder);
      
    }
  }
	
  protected static class ProtocolChars {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__ProtocolChars__char_class___range__124_124_URLChars_conditional__lit___58_47_47__not_follow__char_class___range__9_10_range__13_13_range__32_32_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(1742, 2, prod__lit___58_47_47__char_class___range__58_58_char_class___range__47_47_char_class___range__47_47_, new char[] {58,47,47}, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{9,10},{13,13},{32,32}})});
      tmp[1] = new NonTerminalStackNode(1740, 1, "URLChars", null, null);
      tmp[0] = new CharStackNode(1738, 0, new char[][]{{124,124}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__ProtocolChars__char_class___range__124_124_URLChars_conditional__lit___58_47_47__not_follow__char_class___range__9_10_range__13_13_range__32_32_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__ProtocolChars__char_class___range__124_124_URLChars_conditional__lit___58_47_47__not_follow__char_class___range__9_10_range__13_13_range__32_32_(builder);
      
    }
  }
	
  protected static class Assignment {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Subtraction_Assignment__lit___45_61_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1722, 0, prod__lit___45_61__char_class___range__45_45_char_class___range__61_61_, new char[] {45,61}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Subtraction_Assignment__lit___45_61_, tmp);
	}
    protected static final void _init_prod__Intersection_Assignment__lit___38_61_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1724, 0, prod__lit___38_61__char_class___range__38_38_char_class___range__61_61_, new char[] {38,61}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Intersection_Assignment__lit___38_61_, tmp);
	}
    protected static final void _init_prod__Append_Assignment__lit___60_60_61_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1726, 0, prod__lit___60_60_61__char_class___range__60_60_char_class___range__60_60_char_class___range__61_61_, new char[] {60,60,61}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Append_Assignment__lit___60_60_61_, tmp);
	}
    protected static final void _init_prod__Default_Assignment__lit___61_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1728, 0, prod__lit___61__char_class___range__61_61_, new char[] {61}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Assignment__lit___61_, tmp);
	}
    protected static final void _init_prod__IfDefined_Assignment__lit___63_61_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1730, 0, prod__lit___63_61__char_class___range__63_63_char_class___range__61_61_, new char[] {63,61}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__IfDefined_Assignment__lit___63_61_, tmp);
	}
    protected static final void _init_prod__Division_Assignment__lit___47_61_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1732, 0, prod__lit___47_61__char_class___range__47_47_char_class___range__61_61_, new char[] {47,61}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Division_Assignment__lit___47_61_, tmp);
	}
    protected static final void _init_prod__Product_Assignment__lit___42_61_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1734, 0, prod__lit___42_61__char_class___range__42_42_char_class___range__61_61_, new char[] {42,61}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Product_Assignment__lit___42_61_, tmp);
	}
    protected static final void _init_prod__Addition_Assignment__lit___43_61_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1736, 0, prod__lit___43_61__char_class___range__43_43_char_class___range__61_61_, new char[] {43,61}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Addition_Assignment__lit___43_61_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Subtraction_Assignment__lit___45_61_(builder);
      
        _init_prod__Intersection_Assignment__lit___38_61_(builder);
      
        _init_prod__Append_Assignment__lit___60_60_61_(builder);
      
        _init_prod__Default_Assignment__lit___61_(builder);
      
        _init_prod__IfDefined_Assignment__lit___63_61_(builder);
      
        _init_prod__Division_Assignment__lit___47_61_(builder);
      
        _init_prod__Product_Assignment__lit___42_61_(builder);
      
        _init_prod__Addition_Assignment__lit___43_61_(builder);
      
    }
  }
	
  protected static class Assignable {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Bracket_Assignable__lit___40_layouts_LAYOUTLIST_arg_Assignable_layouts_LAYOUTLIST_lit___41__bracket(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(1796, 4, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[3] = new NonTerminalStackNode(1794, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(1792, 2, "Assignable", null, null);
      tmp[1] = new NonTerminalStackNode(1790, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(1788, 0, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Bracket_Assignable__lit___40_layouts_LAYOUTLIST_arg_Assignable_layouts_LAYOUTLIST_lit___41__bracket, tmp);
	}
    protected static final void _init_prod__Variable_Assignable__qualifiedName_QualifiedName_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(1798, 0, "QualifiedName", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Variable_Assignable__qualifiedName_QualifiedName_, tmp);
	}
    protected static final void _init_prod__Tuple_Assignable__lit___60_layouts_LAYOUTLIST_elements_iter_seps__Assignable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___62_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode(1810, 0, prod__lit___60__char_class___range__60_60_, new char[] {60}, null, null);
      tmp[1] = new NonTerminalStackNode(1812, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode(1814, 2, regular__iter_seps__Assignable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(1816, 0, "Assignable", null, null), new AbstractStackNode[]{new NonTerminalStackNode(1818, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(1820, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(1822, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[3] = new NonTerminalStackNode(1824, 3, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(1826, 4, prod__lit___62__char_class___range__62_62_, new char[] {62}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Tuple_Assignable__lit___60_layouts_LAYOUTLIST_elements_iter_seps__Assignable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___62_, tmp);
	}
    protected static final void _init_prod__IfDefinedOrDefault_Assignable__receiver_Assignable_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_defaultExpression_Expression_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1808, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1806, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1804, 2, prod__lit___63__char_class___range__63_63_, new char[] {63}, null, null);
      tmp[1] = new NonTerminalStackNode(1802, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1800, 0, "Assignable", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__IfDefinedOrDefault_Assignable__receiver_Assignable_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_defaultExpression_Expression_, tmp);
	}
    protected static final void _init_prod__Annotation_Assignable__receiver_Assignable_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_annotation_Name_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1836, 4, "Name", null, null);
      tmp[3] = new NonTerminalStackNode(1834, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1832, 2, prod__lit___64__char_class___range__64_64_, new char[] {64}, null, null);
      tmp[1] = new NonTerminalStackNode(1830, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1828, 0, "Assignable", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Annotation_Assignable__receiver_Assignable_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_annotation_Name_, tmp);
	}
    protected static final void _init_prod__FieldAccess_Assignable__receiver_Assignable_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_field_Name_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(1846, 4, "Name", null, null);
      tmp[3] = new NonTerminalStackNode(1844, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1842, 2, prod__lit___46__char_class___range__46_46_, new char[] {46}, null, null);
      tmp[1] = new NonTerminalStackNode(1840, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1838, 0, "Assignable", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__FieldAccess_Assignable__receiver_Assignable_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_field_Name_, tmp);
	}
    protected static final void _init_prod__Subscript_Assignable__receiver_Assignable_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_subscript_Expression_layouts_LAYOUTLIST_lit___93_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(1860, 6, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      tmp[5] = new NonTerminalStackNode(1858, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(1856, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(1854, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1852, 2, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      tmp[1] = new NonTerminalStackNode(1850, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1848, 0, "Assignable", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Subscript_Assignable__receiver_Assignable_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_subscript_Expression_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__Constructor_Assignable__name_Name_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_seps__Assignable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(1882, 6, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[5] = new NonTerminalStackNode(1880, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(1870, 4, regular__iter_seps__Assignable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(1872, 0, "Assignable", null, null), new AbstractStackNode[]{new NonTerminalStackNode(1874, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(1876, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(1878, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[3] = new NonTerminalStackNode(1868, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(1866, 2, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[1] = new NonTerminalStackNode(1864, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(1862, 0, "Name", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Constructor_Assignable__name_Name_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_seps__Assignable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Bracket_Assignable__lit___40_layouts_LAYOUTLIST_arg_Assignable_layouts_LAYOUTLIST_lit___41__bracket(builder);
      
        _init_prod__Variable_Assignable__qualifiedName_QualifiedName_(builder);
      
        _init_prod__Tuple_Assignable__lit___60_layouts_LAYOUTLIST_elements_iter_seps__Assignable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___62_(builder);
      
        _init_prod__IfDefinedOrDefault_Assignable__receiver_Assignable_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_defaultExpression_Expression_(builder);
      
        _init_prod__Annotation_Assignable__receiver_Assignable_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_annotation_Name_(builder);
      
        _init_prod__FieldAccess_Assignable__receiver_Assignable_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_field_Name_(builder);
      
        _init_prod__Subscript_Assignable__receiver_Assignable_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_subscript_Expression_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__Constructor_Assignable__name_Name_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_seps__Assignable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(builder);
      
    }
  }
	
  protected static class HeaderKeyword {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__HeaderKeyword__lit_start_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1926, 0, prod__lit_start__char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__116_116_, new char[] {115,116,97,114,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__HeaderKeyword__lit_start_, tmp);
	}
    protected static final void _init_prod__HeaderKeyword__lit_keyword_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1928, 0, prod__lit_keyword__char_class___range__107_107_char_class___range__101_101_char_class___range__121_121_char_class___range__119_119_char_class___range__111_111_char_class___range__114_114_char_class___range__100_100_, new char[] {107,101,121,119,111,114,100}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__HeaderKeyword__lit_keyword_, tmp);
	}
    protected static final void _init_prod__HeaderKeyword__lit_syntax_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1930, 0, prod__lit_syntax__char_class___range__115_115_char_class___range__121_121_char_class___range__110_110_char_class___range__116_116_char_class___range__97_97_char_class___range__120_120_, new char[] {115,121,110,116,97,120}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__HeaderKeyword__lit_syntax_, tmp);
	}
    protected static final void _init_prod__HeaderKeyword__lit_import_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1932, 0, prod__lit_import__char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_, new char[] {105,109,112,111,114,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__HeaderKeyword__lit_import_, tmp);
	}
    protected static final void _init_prod__HeaderKeyword__lit_lexical_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1934, 0, prod__lit_lexical__char_class___range__108_108_char_class___range__101_101_char_class___range__120_120_char_class___range__105_105_char_class___range__99_99_char_class___range__97_97_char_class___range__108_108_, new char[] {108,101,120,105,99,97,108}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__HeaderKeyword__lit_lexical_, tmp);
	}
    protected static final void _init_prod__HeaderKeyword__lit_extend_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1936, 0, prod__lit_extend__char_class___range__101_101_char_class___range__120_120_char_class___range__116_116_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_, new char[] {101,120,116,101,110,100}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__HeaderKeyword__lit_extend_, tmp);
	}
    protected static final void _init_prod__HeaderKeyword__lit_layout_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(1938, 0, prod__lit_layout__char_class___range__108_108_char_class___range__97_97_char_class___range__121_121_char_class___range__111_111_char_class___range__117_117_char_class___range__116_116_, new char[] {108,97,121,111,117,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__HeaderKeyword__lit_layout_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__HeaderKeyword__lit_start_(builder);
      
        _init_prod__HeaderKeyword__lit_keyword_(builder);
      
        _init_prod__HeaderKeyword__lit_syntax_(builder);
      
        _init_prod__HeaderKeyword__lit_import_(builder);
      
        _init_prod__HeaderKeyword__lit_lexical_(builder);
      
        _init_prod__HeaderKeyword__lit_extend_(builder);
      
        _init_prod__HeaderKeyword__lit_layout_(builder);
      
    }
  }
	
  protected static class Parameters {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_Parameters__lit___40_layouts_LAYOUTLIST_formals_Formals_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(1992, 4, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[3] = new NonTerminalStackNode(1990, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(1988, 2, "Formals", null, null);
      tmp[1] = new NonTerminalStackNode(1986, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(1984, 0, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Parameters__lit___40_layouts_LAYOUTLIST_formals_Formals_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__VarArgs_Parameters__lit___40_layouts_LAYOUTLIST_formals_Formals_layouts_LAYOUTLIST_lit___46_46_46_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(2006, 6, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[5] = new NonTerminalStackNode(2004, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(2002, 4, prod__lit___46_46_46__char_class___range__46_46_char_class___range__46_46_char_class___range__46_46_, new char[] {46,46,46}, null, null);
      tmp[3] = new NonTerminalStackNode(2000, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(1998, 2, "Formals", null, null);
      tmp[1] = new NonTerminalStackNode(1996, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(1994, 0, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__VarArgs_Parameters__lit___40_layouts_LAYOUTLIST_formals_Formals_layouts_LAYOUTLIST_lit___46_46_46_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_Parameters__lit___40_layouts_LAYOUTLIST_formals_Formals_layouts_LAYOUTLIST_lit___41_(builder);
      
        _init_prod__VarArgs_Parameters__lit___40_layouts_LAYOUTLIST_formals_Formals_layouts_LAYOUTLIST_lit___46_46_46_layouts_LAYOUTLIST_lit___41_(builder);
      
    }
  }
	
  protected static class DatePart {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__DatePart__char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_lit___char_class___range__48_49_char_class___range__48_57_lit___char_class___range__48_51_char_class___range__48_57_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[10];
      
      tmp[9] = new CharStackNode(2026, 9, new char[][]{{48,57}}, null, null);
      tmp[8] = new CharStackNode(2024, 8, new char[][]{{48,51}}, null, null);
      tmp[7] = new LiteralStackNode(2022, 7, prod__lit____char_class___range__45_45_, new char[] {45}, null, null);
      tmp[6] = new CharStackNode(2020, 6, new char[][]{{48,57}}, null, null);
      tmp[5] = new CharStackNode(2018, 5, new char[][]{{48,49}}, null, null);
      tmp[4] = new LiteralStackNode(2016, 4, prod__lit____char_class___range__45_45_, new char[] {45}, null, null);
      tmp[3] = new CharStackNode(2014, 3, new char[][]{{48,57}}, null, null);
      tmp[2] = new CharStackNode(2012, 2, new char[][]{{48,57}}, null, null);
      tmp[1] = new CharStackNode(2010, 1, new char[][]{{48,57}}, null, null);
      tmp[0] = new CharStackNode(2008, 0, new char[][]{{48,57}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__DatePart__char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_lit___char_class___range__48_49_char_class___range__48_57_lit___char_class___range__48_51_char_class___range__48_57_, tmp);
	}
    protected static final void _init_prod__DatePart__char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_49_char_class___range__48_57_char_class___range__48_51_char_class___range__48_57_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[8];
      
      tmp[7] = new CharStackNode(2042, 7, new char[][]{{48,57}}, null, null);
      tmp[6] = new CharStackNode(2040, 6, new char[][]{{48,51}}, null, null);
      tmp[5] = new CharStackNode(2038, 5, new char[][]{{48,57}}, null, null);
      tmp[4] = new CharStackNode(2036, 4, new char[][]{{48,49}}, null, null);
      tmp[3] = new CharStackNode(2034, 3, new char[][]{{48,57}}, null, null);
      tmp[2] = new CharStackNode(2032, 2, new char[][]{{48,57}}, null, null);
      tmp[1] = new CharStackNode(2030, 1, new char[][]{{48,57}}, null, null);
      tmp[0] = new CharStackNode(2028, 0, new char[][]{{48,57}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__DatePart__char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_49_char_class___range__48_57_char_class___range__48_51_char_class___range__48_57_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__DatePart__char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_lit___char_class___range__48_49_char_class___range__48_57_lit___char_class___range__48_51_char_class___range__48_57_(builder);
      
        _init_prod__DatePart__char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_57_char_class___range__48_49_char_class___range__48_57_char_class___range__48_51_char_class___range__48_57_(builder);
      
    }
  }
	
  protected static class Mapping__Pattern {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_Mapping__Pattern__from_Pattern_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_to_Pattern_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(2052, 4, "Pattern", null, null);
      tmp[3] = new NonTerminalStackNode(2050, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(2048, 2, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[1] = new NonTerminalStackNode(2046, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(2044, 0, "Pattern", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Mapping__Pattern__from_Pattern_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_to_Pattern_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_Mapping__Pattern__from_Pattern_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_to_Pattern_(builder);
      
    }
  }
	
  protected static class LocalVariableDeclaration {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Dynamic_LocalVariableDeclaration__lit_dynamic_layouts_LAYOUTLIST_declarator_Declarator_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(2062, 2, "Declarator", null, null);
      tmp[1] = new NonTerminalStackNode(2060, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(2058, 0, prod__lit_dynamic__char_class___range__100_100_char_class___range__121_121_char_class___range__110_110_char_class___range__97_97_char_class___range__109_109_char_class___range__105_105_char_class___range__99_99_, new char[] {100,121,110,97,109,105,99}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Dynamic_LocalVariableDeclaration__lit_dynamic_layouts_LAYOUTLIST_declarator_Declarator_, tmp);
	}
    protected static final void _init_prod__Default_LocalVariableDeclaration__declarator_Declarator_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(2064, 0, "Declarator", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_LocalVariableDeclaration__declarator_Declarator_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Dynamic_LocalVariableDeclaration__lit_dynamic_layouts_LAYOUTLIST_declarator_Declarator_(builder);
      
        _init_prod__Default_LocalVariableDeclaration__declarator_Declarator_(builder);
      
    }
  }
	
  protected static class StringConstant {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__StringConstant__lit___34_iter_star__StringCharacter_lit___34__tag__category___67_111_110_115_116_97_110_116(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(2078, 2, prod__lit___34__char_class___range__34_34_, new char[] {34}, null, null);
      tmp[1] = new ListStackNode(2074, 1, regular__iter_star__StringCharacter, new NonTerminalStackNode(2076, 0, "StringCharacter", null, null), false, null, null);
      tmp[0] = new LiteralStackNode(2072, 0, prod__lit___34__char_class___range__34_34_, new char[] {34}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__StringConstant__lit___34_iter_star__StringCharacter_lit___34__tag__category___67_111_110_115_116_97_110_116, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__StringConstant__lit___34_iter_star__StringCharacter_lit___34__tag__category___67_111_110_115_116_97_110_116(builder);
      
    }
  }
	
  protected static class start__Module {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__start__Module__layouts_LAYOUTLIST_top_Module_layouts_LAYOUTLIST_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(2084, 2, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode(2082, 1, "Module", null, null);
      tmp[0] = new NonTerminalStackNode(2080, 0, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__start__Module__layouts_LAYOUTLIST_top_Module_layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__start__Module__layouts_LAYOUTLIST_top_Module_layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class DataTypeSelector {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Selector_DataTypeSelector__sort_QualifiedName_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_production_Name_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(2094, 4, "Name", null, null);
      tmp[3] = new NonTerminalStackNode(2092, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(2090, 2, prod__lit___46__char_class___range__46_46_, new char[] {46}, null, null);
      tmp[1] = new NonTerminalStackNode(2088, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(2086, 0, "QualifiedName", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Selector_DataTypeSelector__sort_QualifiedName_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_production_Name_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Selector_DataTypeSelector__sort_QualifiedName_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_production_Name_(builder);
      
    }
  }
	
  protected static class StringTail {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__MidInterpolated_StringTail__mid_MidStringChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_StringTail_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(2104, 4, "StringTail", null, null);
      tmp[3] = new NonTerminalStackNode(2102, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(2100, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(2098, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(2096, 0, "MidStringChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__MidInterpolated_StringTail__mid_MidStringChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_StringTail_, tmp);
	}
    protected static final void _init_prod__MidTemplate_StringTail__mid_MidStringChars_layouts_LAYOUTLIST_template_StringTemplate_layouts_LAYOUTLIST_tail_StringTail_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(2114, 4, "StringTail", null, null);
      tmp[3] = new NonTerminalStackNode(2112, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(2110, 2, "StringTemplate", null, null);
      tmp[1] = new NonTerminalStackNode(2108, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(2106, 0, "MidStringChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__MidTemplate_StringTail__mid_MidStringChars_layouts_LAYOUTLIST_template_StringTemplate_layouts_LAYOUTLIST_tail_StringTail_, tmp);
	}
    protected static final void _init_prod__Post_StringTail__post_PostStringChars_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(2116, 0, "PostStringChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Post_StringTail__post_PostStringChars_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__MidInterpolated_StringTail__mid_MidStringChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_StringTail_(builder);
      
        _init_prod__MidTemplate_StringTail__mid_MidStringChars_layouts_LAYOUTLIST_template_StringTemplate_layouts_LAYOUTLIST_tail_StringTail_(builder);
      
        _init_prod__Post_StringTail__post_PostStringChars_(builder);
      
    }
  }
	
  protected static class PatternWithAction {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Replacing_PatternWithAction__pattern_Pattern_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_replacement_Replacement_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(2126, 4, "Replacement", null, null);
      tmp[3] = new NonTerminalStackNode(2124, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(2122, 2, prod__lit___61_62__char_class___range__61_61_char_class___range__62_62_, new char[] {61,62}, null, null);
      tmp[1] = new NonTerminalStackNode(2120, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(2118, 0, "Pattern", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Replacing_PatternWithAction__pattern_Pattern_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_replacement_Replacement_, tmp);
	}
    protected static final void _init_prod__Arbitrary_PatternWithAction__pattern_Pattern_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_statement_Statement_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(2136, 4, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode(2134, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(2132, 2, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[1] = new NonTerminalStackNode(2130, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(2128, 0, "Pattern", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Arbitrary_PatternWithAction__pattern_Pattern_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_statement_Statement_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Replacing_PatternWithAction__pattern_Pattern_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_replacement_Replacement_(builder);
      
        _init_prod__Arbitrary_PatternWithAction__pattern_Pattern_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_statement_Statement_(builder);
      
    }
  }
	
  protected static class MidProtocolChars {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__MidProtocolChars__lit___62_URLChars_lit___60_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(2188, 2, prod__lit___60__char_class___range__60_60_, new char[] {60}, null, null);
      tmp[1] = new NonTerminalStackNode(2186, 1, "URLChars", null, null);
      tmp[0] = new LiteralStackNode(2184, 0, prod__lit___62__char_class___range__62_62_, new char[] {62}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__MidProtocolChars__lit___62_URLChars_lit___60_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__MidProtocolChars__lit___62_URLChars_lit___60_(builder);
      
    }
  }
	
  protected static class PathTail {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Mid_PathTail__mid_MidPathChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_PathTail_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(2180, 4, "PathTail", null, null);
      tmp[3] = new NonTerminalStackNode(2178, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(2176, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(2174, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(2172, 0, "MidPathChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Mid_PathTail__mid_MidPathChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_PathTail_, tmp);
	}
    protected static final void _init_prod__Post_PathTail__post_PostPathChars_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(2182, 0, "PostPathChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Post_PathTail__post_PostPathChars_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Mid_PathTail__mid_MidPathChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_PathTail_(builder);
      
        _init_prod__Post_PathTail__post_PostPathChars_(builder);
      
    }
  }
	
  protected static class JustDate {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__JustDate__lit___36_DatePart_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[2];
      
      tmp[1] = new NonTerminalStackNode(2202, 1, "DatePart", null, null);
      tmp[0] = new LiteralStackNode(2200, 0, prod__lit___36__char_class___range__36_36_, new char[] {36}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__JustDate__lit___36_DatePart_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__JustDate__lit___36_DatePart_(builder);
      
    }
  }
	
  protected static class Backslash {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Backslash__conditional__char_class___range__92_92__not_follow__char_class___range__47_47_range__60_60_range__62_62_range__92_92_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode(2226, 0, new char[][]{{92,92}}, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{47,47},{60,60},{62,62},{92,92}})});
      builder.addAlternative(ObjectRascalRascal.prod__Backslash__conditional__char_class___range__92_92__not_follow__char_class___range__47_47_range__60_60_range__62_62_range__92_92_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Backslash__conditional__char_class___range__92_92__not_follow__char_class___range__47_47_range__60_60_range__62_62_range__92_92_(builder);
      
    }
  }
	
  protected static class start__Commands {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__start__Commands__layouts_LAYOUTLIST_top_Commands_layouts_LAYOUTLIST_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(2224, 2, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode(2222, 1, "Commands", null, null);
      tmp[0] = new NonTerminalStackNode(2220, 0, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__start__Commands__layouts_LAYOUTLIST_top_Commands_layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__start__Commands__layouts_LAYOUTLIST_top_Commands_layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class CaseInsensitiveStringConstant {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__CaseInsensitiveStringConstant__lit___39_iter_star__StringCharacter_lit___39__tag__category___67_111_110_115_116_97_110_116(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(2218, 2, prod__lit___39__char_class___range__39_39_, new char[] {39}, null, null);
      tmp[1] = new ListStackNode(2214, 1, regular__iter_star__StringCharacter, new NonTerminalStackNode(2216, 0, "StringCharacter", null, null), false, null, null);
      tmp[0] = new LiteralStackNode(2212, 0, prod__lit___39__char_class___range__39_39_, new char[] {39}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__CaseInsensitiveStringConstant__lit___39_iter_star__StringCharacter_lit___39__tag__category___67_111_110_115_116_97_110_116, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__CaseInsensitiveStringConstant__lit___39_iter_star__StringCharacter_lit___39__tag__category___67_111_110_115_116_97_110_116(builder);
      
    }
  }
	
  protected static class Tags {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_Tags__tags_iter_star_seps__Tag__layouts_LAYOUTLIST_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode(2228, 0, regular__iter_star_seps__Tag__layouts_LAYOUTLIST, new NonTerminalStackNode(2230, 0, "Tag", null, null), new AbstractStackNode[]{new NonTerminalStackNode(2232, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Tags__tags_iter_star_seps__Tag__layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_Tags__tags_iter_star_seps__Tag__layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class Formals {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_Formals__formals_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode(2242, 0, regular__iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(2244, 0, "Pattern", null, null), new AbstractStackNode[]{new NonTerminalStackNode(2246, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(2248, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(2250, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Formals__formals_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_Formals__formals_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class Start {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Present_Start__lit_start_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2252, 0, prod__lit_start__char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__116_116_, new char[] {115,116,97,114,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Present_Start__lit_start_, tmp);
	}
    protected static final void _init_prod__Absent_Start__(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new EpsilonStackNode(2254, 0);
      builder.addAlternative(ObjectRascalRascal.prod__Absent_Start__, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Present_Start__lit_start_(builder);
      
        _init_prod__Absent_Start__(builder);
      
    }
  }
	
  protected static class Name {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Name__char_class___range__92_92_char_class___range__65_90_range__95_95_range__97_122_conditional__iter_star__char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new ListStackNode(2260, 2, regular__iter_star__char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122, new CharStackNode(2262, 0, new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{45,45},{48,57},{65,90},{95,95},{97,122}})});
      tmp[1] = new CharStackNode(2258, 1, new char[][]{{65,90},{95,95},{97,122}}, null, null);
      tmp[0] = new CharStackNode(2256, 0, new char[][]{{92,92}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Name__char_class___range__92_92_char_class___range__65_90_range__95_95_range__97_122_conditional__iter_star__char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_, tmp);
	}
    protected static final void _init_prod__Name__conditional__seq___conditional__char_class___range__65_90_range__95_95_range__97_122__not_precede__char_class___range__65_90_range__95_95_range__97_122_conditional__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122__delete__RascalKeywords_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new SequenceStackNode(2264, 0, regular__seq___conditional__char_class___range__65_90_range__95_95_range__97_122__not_precede__char_class___range__65_90_range__95_95_range__97_122_conditional__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122, new AbstractStackNode[]{new CharStackNode(2266, 0, new char[][]{{65,90},{95,95},{97,122}}, new IEnterFilter[] {new CharPrecedeRestriction(new char[][]{{65,90},{95,95},{97,122}})}, null), new ListStackNode(2268, 1, regular__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122, new CharStackNode(2270, 0, new char[][]{{48,57},{65,90},{95,95},{97,122}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{48,57},{65,90},{95,95},{97,122}})})}, null, new ICompletionFilter[] {new StringMatchRestriction(new char[] {105,109,112,111,114,116}), new StringMatchRestriction(new char[] {105,110}), new StringMatchRestriction(new char[] {114,97,116}), new StringMatchRestriction(new char[] {99,111,110,116,105,110,117,101}), new StringMatchRestriction(new char[] {97,108,108}), new StringMatchRestriction(new char[] {102,97,108,115,101}), new StringMatchRestriction(new char[] {97,110,110,111}), new StringMatchRestriction(new char[] {98,114,97,99,107,101,116}), new StringMatchRestriction(new char[] {100,97,116,97}), new StringMatchRestriction(new char[] {106,111,105,110}), new StringMatchRestriction(new char[] {108,97,121,111,117,116}), new StringMatchRestriction(new char[] {105,116}), new StringMatchRestriction(new char[] {115,119,105,116,99,104}), new StringMatchRestriction(new char[] {114,101,116,117,114,110}), new StringMatchRestriction(new char[] {99,97,115,101}), new StringMatchRestriction(new char[] {119,104,105,108,101}), new StringMatchRestriction(new char[] {97,100,116}), new StringMatchRestriction(new char[] {115,116,114}), new StringMatchRestriction(new char[] {100,121,110,97,109,105,99}), new StringMatchRestriction(new char[] {115,111,108,118,101}), new StringMatchRestriction(new char[] {110,111,116,105,110}), new StringMatchRestriction(new char[] {105,110,115,101,114,116}), new StringMatchRestriction(new char[] {101,108,115,101}), new StringMatchRestriction(new char[] {116,121,112,101}), new StringMatchRestriction(new char[] {116,114,121}), new StringMatchRestriction(new char[] {99,97,116,99,104}), new StringMatchRestriction(new char[] {110,117,109}), new StringMatchRestriction(new char[] {109,111,100}), new StringMatchRestriction(new char[] {110,111,100,101}), new StringMatchRestriction(new char[] {102,105,110,97,108,108,121}), new StringMatchRestriction(new char[] {112,114,105,118,97,116,101}), new StringMatchRestriction(new char[] {116,114,117,101}), new StringMatchRestriction(new char[] {98,97,103}), new StringMatchRestriction(new char[] {118,111,105,100}), new StringMatchRestriction(new char[] {110,111,110,45,97,115,115,111,99}), new StringMatchRestriction(new char[] {97,115,115,111,99}), new StringMatchRestriction(new char[] {116,101,115,116}), new StringMatchRestriction(new char[] {105,102}), new StringMatchRestriction(new char[] {102,97,105,108}), new StringMatchRestriction(new char[] {108,105,115,116}), new StringMatchRestriction(new char[] {114,101,97,108}), new StringMatchRestriction(new char[] {114,101,108}), new StringMatchRestriction(new char[] {97,112,112,101,110,100}), new StringMatchRestriction(new char[] {101,120,116,101,110,100}), new StringMatchRestriction(new char[] {116,97,103}), new StringMatchRestriction(new char[] {114,101,112,101,97,116}), new StringMatchRestriction(new char[] {116,104,114,111,119}), new StringMatchRestriction(new char[] {111,110,101}), new StringMatchRestriction(new char[] {115,116,97,114,116}), new StringMatchRestriction(new char[] {115,101,116}), new StringMatchRestriction(new char[] {109,111,100,117,108,101}), new StringMatchRestriction(new char[] {97,110,121}), new StringMatchRestriction(new char[] {105,110,116}), new StringMatchRestriction(new char[] {112,117,98,108,105,99}), new StringMatchRestriction(new char[] {98,111,111,108}), new StringMatchRestriction(new char[] {118,97,108,117,101}), new StringMatchRestriction(new char[] {110,111,110,45,116,101,114,109,105,110,97,108}), new StringMatchRestriction(new char[] {114,117,108,101}), new StringMatchRestriction(new char[] {98,114,101,97,107}), new StringMatchRestriction(new char[] {102,117,110}), new StringMatchRestriction(new char[] {102,105,108,116,101,114}), new StringMatchRestriction(new char[] {99,111,110,115,116,114,117,99,116,111,114}), new StringMatchRestriction(new char[] {100,97,116,101,116,105,109,101}), new StringMatchRestriction(new char[] {97,115,115,101,114,116}), new StringMatchRestriction(new char[] {108,111,99}), new StringMatchRestriction(new char[] {100,101,102,97,117,108,116}), new StringMatchRestriction(new char[] {116,104,114,111,119,115}), new StringMatchRestriction(new char[] {116,117,112,108,101}), new StringMatchRestriction(new char[] {102,111,114}), new StringMatchRestriction(new char[] {118,105,115,105,116}), new StringMatchRestriction(new char[] {97,108,105,97,115}), new StringMatchRestriction(new char[] {109,97,112})});
      builder.addAlternative(ObjectRascalRascal.prod__Name__conditional__seq___conditional__char_class___range__65_90_range__95_95_range__97_122__not_precede__char_class___range__65_90_range__95_95_range__97_122_conditional__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122__delete__RascalKeywords_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Name__char_class___range__92_92_char_class___range__65_90_range__95_95_range__97_122_conditional__iter_star__char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__45_45_range__48_57_range__65_90_range__95_95_range__97_122_(builder);
      
        _init_prod__Name__conditional__seq___conditional__char_class___range__65_90_range__95_95_range__97_122__not_precede__char_class___range__65_90_range__95_95_range__97_122_conditional__iter_star__char_class___range__48_57_range__65_90_range__95_95_range__97_122__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122__delete__RascalKeywords_(builder);
      
    }
  }
	
  protected static class TimePartNoTZ {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__TimePartNoTZ__char_class___range__48_50_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_opt__seq___char_class___range__44_44_range__46_46_char_class___range__48_57_opt__seq___char_class___range__48_57_opt__char_class___range__48_57_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new OptionalStackNode(2304, 6, regular__opt__seq___char_class___range__44_44_range__46_46_char_class___range__48_57_opt__seq___char_class___range__48_57_opt__char_class___range__48_57, new SequenceStackNode(2306, 0, regular__seq___char_class___range__44_44_range__46_46_char_class___range__48_57_opt__seq___char_class___range__48_57_opt__char_class___range__48_57, new AbstractStackNode[]{new CharStackNode(2308, 0, new char[][]{{44,44},{46,46}}, null, null), new CharStackNode(2310, 1, new char[][]{{48,57}}, null, null), new OptionalStackNode(2312, 2, regular__opt__seq___char_class___range__48_57_opt__char_class___range__48_57, new SequenceStackNode(2314, 0, regular__seq___char_class___range__48_57_opt__char_class___range__48_57, new AbstractStackNode[]{new CharStackNode(2316, 0, new char[][]{{48,57}}, null, null), new OptionalStackNode(2318, 1, regular__opt__char_class___range__48_57, new CharStackNode(2320, 0, new char[][]{{48,57}}, null, null), null, null)}, null, null), null, null)}, null, null), null, null);
      tmp[5] = new CharStackNode(2302, 5, new char[][]{{48,57}}, null, null);
      tmp[4] = new CharStackNode(2300, 4, new char[][]{{48,53}}, null, null);
      tmp[3] = new CharStackNode(2298, 3, new char[][]{{48,57}}, null, null);
      tmp[2] = new CharStackNode(2296, 2, new char[][]{{48,53}}, null, null);
      tmp[1] = new CharStackNode(2294, 1, new char[][]{{48,57}}, null, null);
      tmp[0] = new CharStackNode(2292, 0, new char[][]{{48,50}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__TimePartNoTZ__char_class___range__48_50_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_opt__seq___char_class___range__44_44_range__46_46_char_class___range__48_57_opt__seq___char_class___range__48_57_opt__char_class___range__48_57_, tmp);
	}
    protected static final void _init_prod__TimePartNoTZ__char_class___range__48_50_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_opt__seq___char_class___range__44_44_range__46_46_char_class___range__48_57_opt__seq___char_class___range__48_57_opt__char_class___range__48_57_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[9];
      
      tmp[8] = new OptionalStackNode(2338, 8, regular__opt__seq___char_class___range__44_44_range__46_46_char_class___range__48_57_opt__seq___char_class___range__48_57_opt__char_class___range__48_57, new SequenceStackNode(2340, 0, regular__seq___char_class___range__44_44_range__46_46_char_class___range__48_57_opt__seq___char_class___range__48_57_opt__char_class___range__48_57, new AbstractStackNode[]{new CharStackNode(2342, 0, new char[][]{{44,44},{46,46}}, null, null), new CharStackNode(2344, 1, new char[][]{{48,57}}, null, null), new OptionalStackNode(2346, 2, regular__opt__seq___char_class___range__48_57_opt__char_class___range__48_57, new SequenceStackNode(2348, 0, regular__seq___char_class___range__48_57_opt__char_class___range__48_57, new AbstractStackNode[]{new CharStackNode(2350, 0, new char[][]{{48,57}}, null, null), new OptionalStackNode(2352, 1, regular__opt__char_class___range__48_57, new CharStackNode(2354, 0, new char[][]{{48,57}}, null, null), null, null)}, null, null), null, null)}, null, null), null, null);
      tmp[7] = new CharStackNode(2336, 7, new char[][]{{48,57}}, null, null);
      tmp[6] = new CharStackNode(2334, 6, new char[][]{{48,53}}, null, null);
      tmp[5] = new LiteralStackNode(2332, 5, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[4] = new CharStackNode(2330, 4, new char[][]{{48,57}}, null, null);
      tmp[3] = new CharStackNode(2328, 3, new char[][]{{48,53}}, null, null);
      tmp[2] = new LiteralStackNode(2326, 2, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[1] = new CharStackNode(2324, 1, new char[][]{{48,57}}, null, null);
      tmp[0] = new CharStackNode(2322, 0, new char[][]{{48,50}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__TimePartNoTZ__char_class___range__48_50_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_opt__seq___char_class___range__44_44_range__46_46_char_class___range__48_57_opt__seq___char_class___range__48_57_opt__char_class___range__48_57_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__TimePartNoTZ__char_class___range__48_50_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_opt__seq___char_class___range__44_44_range__46_46_char_class___range__48_57_opt__seq___char_class___range__48_57_opt__char_class___range__48_57_(builder);
      
        _init_prod__TimePartNoTZ__char_class___range__48_50_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_opt__seq___char_class___range__44_44_range__46_46_char_class___range__48_57_opt__seq___char_class___range__48_57_opt__char_class___range__48_57_(builder);
      
    }
  }
	
  protected static class StructuredType {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_StructuredType__basicType_BasicType_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_arguments_iter_seps__TypeArg__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(2396, 6, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      tmp[5] = new NonTerminalStackNode(2394, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(2384, 4, regular__iter_seps__TypeArg__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(2386, 0, "TypeArg", null, null), new AbstractStackNode[]{new NonTerminalStackNode(2388, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(2390, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(2392, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[3] = new NonTerminalStackNode(2382, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(2380, 2, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      tmp[1] = new NonTerminalStackNode(2378, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(2376, 0, "BasicType", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_StructuredType__basicType_BasicType_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_arguments_iter_seps__TypeArg__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_StructuredType__basicType_BasicType_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_arguments_iter_seps__TypeArg__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(builder);
      
    }
  }
	
  protected static class Declarator {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_Declarator__type_Type_layouts_LAYOUTLIST_variables_iter_seps__Variable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new SeparatedListStackNode(2420, 2, regular__iter_seps__Variable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(2422, 0, "Variable", null, null), new AbstractStackNode[]{new NonTerminalStackNode(2424, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(2426, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(2428, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[1] = new NonTerminalStackNode(2418, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(2416, 0, "Type", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Declarator__type_Type_layouts_LAYOUTLIST_variables_iter_seps__Variable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_Declarator__type_Type_layouts_LAYOUTLIST_variables_iter_seps__Variable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class start__PreModule {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__start__PreModule__layouts_LAYOUTLIST_top_PreModule_layouts_LAYOUTLIST_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(2440, 2, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode(2438, 1, "PreModule", null, null);
      tmp[0] = new NonTerminalStackNode(2436, 0, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__start__PreModule__layouts_LAYOUTLIST_top_PreModule_layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__start__PreModule__layouts_LAYOUTLIST_top_PreModule_layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class Variant {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__NAryConstructor_Variant__name_Name_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__TypeArg__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(2490, 6, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[5] = new NonTerminalStackNode(2488, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(2478, 4, regular__iter_star_seps__TypeArg__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(2480, 0, "TypeArg", null, null), new AbstractStackNode[]{new NonTerminalStackNode(2482, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(2484, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(2486, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode(2476, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(2474, 2, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[1] = new NonTerminalStackNode(2472, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(2470, 0, "Name", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NAryConstructor_Variant__name_Name_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__TypeArg__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__NAryConstructor_Variant__name_Name_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__TypeArg__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(builder);
      
    }
  }
	
  protected static class FunctionDeclaration {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Conditional_FunctionDeclaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_signature_Signature_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit_when_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59__tag__Foldable(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[15];
      
      tmp[14] = new LiteralStackNode(2528, 14, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[13] = new NonTerminalStackNode(2526, 13, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new SeparatedListStackNode(2516, 12, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(2518, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(2520, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(2522, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(2524, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[11] = new NonTerminalStackNode(2514, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode(2512, 10, prod__lit_when__char_class___range__119_119_char_class___range__104_104_char_class___range__101_101_char_class___range__110_110_, new char[] {119,104,101,110}, null, null);
      tmp[9] = new NonTerminalStackNode(2510, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode(2508, 8, "Expression", null, null);
      tmp[7] = new NonTerminalStackNode(2506, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(2504, 6, prod__lit___61__char_class___range__61_61_, new char[] {61}, null, null);
      tmp[5] = new NonTerminalStackNode(2502, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(2500, 4, "Signature", null, null);
      tmp[3] = new NonTerminalStackNode(2498, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(2496, 2, "Visibility", null, null);
      tmp[1] = new NonTerminalStackNode(2494, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(2492, 0, "Tags", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Conditional_FunctionDeclaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_signature_Signature_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit_when_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59__tag__Foldable, tmp);
	}
    protected static final void _init_prod__Default_FunctionDeclaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_signature_Signature_layouts_LAYOUTLIST_body_FunctionBody__tag__Foldable(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new NonTerminalStackNode(2542, 6, "FunctionBody", null, null);
      tmp[5] = new NonTerminalStackNode(2540, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(2538, 4, "Signature", null, null);
      tmp[3] = new NonTerminalStackNode(2536, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(2534, 2, "Visibility", null, null);
      tmp[1] = new NonTerminalStackNode(2532, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(2530, 0, "Tags", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_FunctionDeclaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_signature_Signature_layouts_LAYOUTLIST_body_FunctionBody__tag__Foldable, tmp);
	}
    protected static final void _init_prod__Abstract_FunctionDeclaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_signature_Signature_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(2556, 6, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[5] = new NonTerminalStackNode(2554, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(2552, 4, "Signature", null, null);
      tmp[3] = new NonTerminalStackNode(2550, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(2548, 2, "Visibility", null, null);
      tmp[1] = new NonTerminalStackNode(2546, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(2544, 0, "Tags", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Abstract_FunctionDeclaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_signature_Signature_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__Expression_FunctionDeclaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_signature_Signature_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59__tag__Foldable(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[11];
      
      tmp[10] = new LiteralStackNode(2578, 10, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[9] = new NonTerminalStackNode(2576, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode(2574, 8, "Expression", null, null);
      tmp[7] = new NonTerminalStackNode(2572, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(2570, 6, prod__lit___61__char_class___range__61_61_, new char[] {61}, null, null);
      tmp[5] = new NonTerminalStackNode(2568, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(2566, 4, "Signature", null, null);
      tmp[3] = new NonTerminalStackNode(2564, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(2562, 2, "Visibility", null, null);
      tmp[1] = new NonTerminalStackNode(2560, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(2558, 0, "Tags", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Expression_FunctionDeclaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_signature_Signature_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59__tag__Foldable, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Conditional_FunctionDeclaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_signature_Signature_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit_when_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59__tag__Foldable(builder);
      
        _init_prod__Default_FunctionDeclaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_signature_Signature_layouts_LAYOUTLIST_body_FunctionBody__tag__Foldable(builder);
      
        _init_prod__Abstract_FunctionDeclaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_signature_Signature_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__Expression_FunctionDeclaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_signature_Signature_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59__tag__Foldable(builder);
      
    }
  }
	
  protected static class BasicType {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Rational_BasicType__lit_rat_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2606, 0, prod__lit_rat__char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_, new char[] {114,97,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Rational_BasicType__lit_rat_, tmp);
	}
    protected static final void _init_prod__Bag_BasicType__lit_bag_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2608, 0, prod__lit_bag__char_class___range__98_98_char_class___range__97_97_char_class___range__103_103_, new char[] {98,97,103}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Bag_BasicType__lit_bag_, tmp);
	}
    protected static final void _init_prod__ReifiedTypeParameter_BasicType__lit_parameter_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2610, 0, prod__lit_parameter__char_class___range__112_112_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__109_109_char_class___range__101_101_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_, new char[] {112,97,114,97,109,101,116,101,114}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__ReifiedTypeParameter_BasicType__lit_parameter_, tmp);
	}
    protected static final void _init_prod__ReifiedType_BasicType__lit_type_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2612, 0, prod__lit_type__char_class___range__116_116_char_class___range__121_121_char_class___range__112_112_char_class___range__101_101_, new char[] {116,121,112,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__ReifiedType_BasicType__lit_type_, tmp);
	}
    protected static final void _init_prod__ReifiedReifiedType_BasicType__lit_reified_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2614, 0, prod__lit_reified__char_class___range__114_114_char_class___range__101_101_char_class___range__105_105_char_class___range__102_102_char_class___range__105_105_char_class___range__101_101_char_class___range__100_100_, new char[] {114,101,105,102,105,101,100}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__ReifiedReifiedType_BasicType__lit_reified_, tmp);
	}
    protected static final void _init_prod__String_BasicType__lit_str_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2616, 0, prod__lit_str__char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_, new char[] {115,116,114}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__String_BasicType__lit_str_, tmp);
	}
    protected static final void _init_prod__DateTime_BasicType__lit_datetime_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2618, 0, prod__lit_datetime__char_class___range__100_100_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__116_116_char_class___range__105_105_char_class___range__109_109_char_class___range__101_101_, new char[] {100,97,116,101,116,105,109,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__DateTime_BasicType__lit_datetime_, tmp);
	}
    protected static final void _init_prod__Set_BasicType__lit_set_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2620, 0, prod__lit_set__char_class___range__115_115_char_class___range__101_101_char_class___range__116_116_, new char[] {115,101,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Set_BasicType__lit_set_, tmp);
	}
    protected static final void _init_prod__ReifiedAdt_BasicType__lit_adt_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2622, 0, prod__lit_adt__char_class___range__97_97_char_class___range__100_100_char_class___range__116_116_, new char[] {97,100,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__ReifiedAdt_BasicType__lit_adt_, tmp);
	}
    protected static final void _init_prod__Bool_BasicType__lit_bool_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2624, 0, prod__lit_bool__char_class___range__98_98_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_, new char[] {98,111,111,108}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Bool_BasicType__lit_bool_, tmp);
	}
    protected static final void _init_prod__ReifiedConstructor_BasicType__lit_constructor_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2626, 0, prod__lit_constructor__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__99_99_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_, new char[] {99,111,110,115,116,114,117,99,116,111,114}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__ReifiedConstructor_BasicType__lit_constructor_, tmp);
	}
    protected static final void _init_prod__Relation_BasicType__lit_rel_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2628, 0, prod__lit_rel__char_class___range__114_114_char_class___range__101_101_char_class___range__108_108_, new char[] {114,101,108}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Relation_BasicType__lit_rel_, tmp);
	}
    protected static final void _init_prod__Void_BasicType__lit_void_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2630, 0, prod__lit_void__char_class___range__118_118_char_class___range__111_111_char_class___range__105_105_char_class___range__100_100_, new char[] {118,111,105,100}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Void_BasicType__lit_void_, tmp);
	}
    protected static final void _init_prod__Num_BasicType__lit_num_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2638, 0, prod__lit_num__char_class___range__110_110_char_class___range__117_117_char_class___range__109_109_, new char[] {110,117,109}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Num_BasicType__lit_num_, tmp);
	}
    protected static final void _init_prod__Loc_BasicType__lit_loc_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2640, 0, prod__lit_loc__char_class___range__108_108_char_class___range__111_111_char_class___range__99_99_, new char[] {108,111,99}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Loc_BasicType__lit_loc_, tmp);
	}
    protected static final void _init_prod__Value_BasicType__lit_value_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2632, 0, prod__lit_value__char_class___range__118_118_char_class___range__97_97_char_class___range__108_108_char_class___range__117_117_char_class___range__101_101_, new char[] {118,97,108,117,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Value_BasicType__lit_value_, tmp);
	}
    protected static final void _init_prod__List_BasicType__lit_list_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2634, 0, prod__lit_list__char_class___range__108_108_char_class___range__105_105_char_class___range__115_115_char_class___range__116_116_, new char[] {108,105,115,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__List_BasicType__lit_list_, tmp);
	}
    protected static final void _init_prod__ReifiedNonTerminal_BasicType__lit_non_terminal_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2636, 0, prod__lit_non_terminal__char_class___range__110_110_char_class___range__111_111_char_class___range__110_110_char_class___range__45_45_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__109_109_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_, new char[] {110,111,110,45,116,101,114,109,105,110,97,108}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__ReifiedNonTerminal_BasicType__lit_non_terminal_, tmp);
	}
    protected static final void _init_prod__ReifiedFunction_BasicType__lit_fun_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2642, 0, prod__lit_fun__char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_, new char[] {102,117,110}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__ReifiedFunction_BasicType__lit_fun_, tmp);
	}
    protected static final void _init_prod__Tuple_BasicType__lit_tuple_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2644, 0, prod__lit_tuple__char_class___range__116_116_char_class___range__117_117_char_class___range__112_112_char_class___range__108_108_char_class___range__101_101_, new char[] {116,117,112,108,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Tuple_BasicType__lit_tuple_, tmp);
	}
    protected static final void _init_prod__Map_BasicType__lit_map_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2646, 0, prod__lit_map__char_class___range__109_109_char_class___range__97_97_char_class___range__112_112_, new char[] {109,97,112}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Map_BasicType__lit_map_, tmp);
	}
    protected static final void _init_prod__Int_BasicType__lit_int_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2648, 0, prod__lit_int__char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_, new char[] {105,110,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Int_BasicType__lit_int_, tmp);
	}
    protected static final void _init_prod__Node_BasicType__lit_node_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2650, 0, prod__lit_node__char_class___range__110_110_char_class___range__111_111_char_class___range__100_100_char_class___range__101_101_, new char[] {110,111,100,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Node_BasicType__lit_node_, tmp);
	}
    protected static final void _init_prod__Real_BasicType__lit_real_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2652, 0, prod__lit_real__char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__108_108_, new char[] {114,101,97,108}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Real_BasicType__lit_real_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Rational_BasicType__lit_rat_(builder);
      
        _init_prod__Bag_BasicType__lit_bag_(builder);
      
        _init_prod__ReifiedTypeParameter_BasicType__lit_parameter_(builder);
      
        _init_prod__ReifiedType_BasicType__lit_type_(builder);
      
        _init_prod__ReifiedReifiedType_BasicType__lit_reified_(builder);
      
        _init_prod__String_BasicType__lit_str_(builder);
      
        _init_prod__DateTime_BasicType__lit_datetime_(builder);
      
        _init_prod__Set_BasicType__lit_set_(builder);
      
        _init_prod__ReifiedAdt_BasicType__lit_adt_(builder);
      
        _init_prod__Bool_BasicType__lit_bool_(builder);
      
        _init_prod__ReifiedConstructor_BasicType__lit_constructor_(builder);
      
        _init_prod__Relation_BasicType__lit_rel_(builder);
      
        _init_prod__Void_BasicType__lit_void_(builder);
      
        _init_prod__Num_BasicType__lit_num_(builder);
      
        _init_prod__Loc_BasicType__lit_loc_(builder);
      
        _init_prod__Value_BasicType__lit_value_(builder);
      
        _init_prod__List_BasicType__lit_list_(builder);
      
        _init_prod__ReifiedNonTerminal_BasicType__lit_non_terminal_(builder);
      
        _init_prod__ReifiedFunction_BasicType__lit_fun_(builder);
      
        _init_prod__Tuple_BasicType__lit_tuple_(builder);
      
        _init_prod__Map_BasicType__lit_map_(builder);
      
        _init_prod__Int_BasicType__lit_int_(builder);
      
        _init_prod__Node_BasicType__lit_node_(builder);
      
        _init_prod__Real_BasicType__lit_real_(builder);
      
    }
  }
	
  protected static class DateTimeLiteral {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__DateAndTimeLiteral_DateTimeLiteral__dateAndTime_DateAndTime_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(2662, 0, "DateAndTime", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__DateAndTimeLiteral_DateTimeLiteral__dateAndTime_DateAndTime_, tmp);
	}
    protected static final void _init_prod__TimeLiteral_DateTimeLiteral__time_JustTime_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(2664, 0, "JustTime", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__TimeLiteral_DateTimeLiteral__time_JustTime_, tmp);
	}
    protected static final void _init_prod__DateLiteral_DateTimeLiteral__date_JustDate_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(2666, 0, "JustDate", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__DateLiteral_DateTimeLiteral__date_JustDate_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__DateAndTimeLiteral_DateTimeLiteral__dateAndTime_DateAndTime_(builder);
      
        _init_prod__TimeLiteral_DateTimeLiteral__time_JustTime_(builder);
      
        _init_prod__DateLiteral_DateTimeLiteral__date_JustDate_(builder);
      
    }
  }
	
  protected static class PathChars {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__PathChars__URLChars_char_class___range__124_124_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[2];
      
      tmp[1] = new CharStackNode(2686, 1, new char[][]{{124,124}}, null, null);
      tmp[0] = new NonTerminalStackNode(2684, 0, "URLChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__PathChars__URLChars_char_class___range__124_124_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__PathChars__URLChars_char_class___range__124_124_(builder);
      
    }
  }
	
  protected static class ModuleActuals {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_ModuleActuals__lit___91_layouts_LAYOUTLIST_types_iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(2780, 4, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      tmp[3] = new NonTerminalStackNode(2778, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode(2768, 2, regular__iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(2770, 0, "Type", null, null), new AbstractStackNode[]{new NonTerminalStackNode(2772, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(2774, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(2776, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[1] = new NonTerminalStackNode(2766, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(2764, 0, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_ModuleActuals__lit___91_layouts_LAYOUTLIST_types_iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_ModuleActuals__lit___91_layouts_LAYOUTLIST_types_iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(builder);
      
    }
  }
	
  protected static class PostStringChars {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__PostStringChars__char_class___range__62_62_iter_star__StringCharacter_char_class___range__34_34__tag__category___67_111_110_115_116_97_110_116(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode(2792, 2, new char[][]{{34,34}}, null, null);
      tmp[1] = new ListStackNode(2788, 1, regular__iter_star__StringCharacter, new NonTerminalStackNode(2790, 0, "StringCharacter", null, null), false, null, null);
      tmp[0] = new CharStackNode(2786, 0, new char[][]{{62,62}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__PostStringChars__char_class___range__62_62_iter_star__StringCharacter_char_class___range__34_34__tag__category___67_111_110_115_116_97_110_116, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__PostStringChars__char_class___range__62_62_iter_star__StringCharacter_char_class___range__34_34__tag__category___67_111_110_115_116_97_110_116(builder);
      
    }
  }
	
  protected static class HexIntegerLiteral {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__HexIntegerLiteral__char_class___range__48_48_char_class___range__88_88_range__120_120_conditional__iter__char_class___range__48_57_range__65_70_range__97_102__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new ListStackNode(2798, 2, regular__iter__char_class___range__48_57_range__65_70_range__97_102, new CharStackNode(2800, 0, new char[][]{{48,57},{65,70},{97,102}}, null, null), true, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{48,57},{65,90},{95,95},{97,122}})});
      tmp[1] = new CharStackNode(2796, 1, new char[][]{{88,88},{120,120}}, null, null);
      tmp[0] = new CharStackNode(2794, 0, new char[][]{{48,48}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__HexIntegerLiteral__char_class___range__48_48_char_class___range__88_88_range__120_120_conditional__iter__char_class___range__48_57_range__65_70_range__97_102__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__HexIntegerLiteral__char_class___range__48_48_char_class___range__88_88_range__120_120_conditional__iter__char_class___range__48_57_range__65_70_range__97_102__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_(builder);
      
    }
  }
	
  protected static class OctalEscapeSequence {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__OctalEscapeSequence__lit___92_conditional__char_class___range__48_55__not_follow__char_class___range__48_55_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[2];
      
      tmp[1] = new CharStackNode(2804, 1, new char[][]{{48,55}}, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{48,55}})});
      tmp[0] = new LiteralStackNode(2802, 0, prod__lit___92__char_class___range__92_92_, new char[] {92}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__OctalEscapeSequence__lit___92_conditional__char_class___range__48_55__not_follow__char_class___range__48_55_, tmp);
	}
    protected static final void _init_prod__OctalEscapeSequence__lit___92_char_class___range__48_55_conditional__char_class___range__48_55__not_follow__char_class___range__48_55_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode(2810, 2, new char[][]{{48,55}}, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{48,55}})});
      tmp[1] = new CharStackNode(2808, 1, new char[][]{{48,55}}, null, null);
      tmp[0] = new LiteralStackNode(2806, 0, prod__lit___92__char_class___range__92_92_, new char[] {92}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__OctalEscapeSequence__lit___92_char_class___range__48_55_conditional__char_class___range__48_55__not_follow__char_class___range__48_55_, tmp);
	}
    protected static final void _init_prod__OctalEscapeSequence__lit___92_char_class___range__48_51_char_class___range__48_55_char_class___range__48_55_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[4];
      
      tmp[3] = new CharStackNode(2818, 3, new char[][]{{48,55}}, null, null);
      tmp[2] = new CharStackNode(2816, 2, new char[][]{{48,55}}, null, null);
      tmp[1] = new CharStackNode(2814, 1, new char[][]{{48,51}}, null, null);
      tmp[0] = new LiteralStackNode(2812, 0, prod__lit___92__char_class___range__92_92_, new char[] {92}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__OctalEscapeSequence__lit___92_char_class___range__48_51_char_class___range__48_55_char_class___range__48_55_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__OctalEscapeSequence__lit___92_conditional__char_class___range__48_55__not_follow__char_class___range__48_55_(builder);
      
        _init_prod__OctalEscapeSequence__lit___92_char_class___range__48_55_conditional__char_class___range__48_55__not_follow__char_class___range__48_55_(builder);
      
        _init_prod__OctalEscapeSequence__lit___92_char_class___range__48_51_char_class___range__48_55_char_class___range__48_55_(builder);
      
    }
  }
	
  protected static class RegExpLiteral {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__RegExpLiteral__lit___47_iter_star__RegExp_lit___47_RegExpModifier_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[4];
      
      tmp[3] = new NonTerminalStackNode(2828, 3, "RegExpModifier", null, null);
      tmp[2] = new LiteralStackNode(2826, 2, prod__lit___47__char_class___range__47_47_, new char[] {47}, null, null);
      tmp[1] = new ListStackNode(2822, 1, regular__iter_star__RegExp, new NonTerminalStackNode(2824, 0, "RegExp", null, null), false, null, null);
      tmp[0] = new LiteralStackNode(2820, 0, prod__lit___47__char_class___range__47_47_, new char[] {47}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RegExpLiteral__lit___47_iter_star__RegExp_lit___47_RegExpModifier_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__RegExpLiteral__lit___47_iter_star__RegExp_lit___47_RegExpModifier_(builder);
      
    }
  }
	
  protected static class NamedRegExp {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__NamedRegExp__lit___60_Name_lit___62_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(2834, 2, prod__lit___62__char_class___range__62_62_, new char[] {62}, null, null);
      tmp[1] = new NonTerminalStackNode(2832, 1, "Name", null, null);
      tmp[0] = new LiteralStackNode(2830, 0, prod__lit___60__char_class___range__60_60_, new char[] {60}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NamedRegExp__lit___60_Name_lit___62_, tmp);
	}
    protected static final void _init_prod__NamedRegExp__char_class___range__0_46_range__48_59_range__61_61_range__63_91_range__93_65535_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode(2836, 0, new char[][]{{0,46},{48,59},{61,61},{63,91},{93,65535}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NamedRegExp__char_class___range__0_46_range__48_59_range__61_61_range__63_91_range__93_65535_, tmp);
	}
    protected static final void _init_prod__NamedRegExp__char_class___range__92_92_char_class___range__47_47_range__60_60_range__62_62_range__92_92_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[2];
      
      tmp[1] = new CharStackNode(2840, 1, new char[][]{{47,47},{60,60},{62,62},{92,92}}, null, null);
      tmp[0] = new CharStackNode(2838, 0, new char[][]{{92,92}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NamedRegExp__char_class___range__92_92_char_class___range__47_47_range__60_60_range__62_62_range__92_92_, tmp);
	}
    protected static final void _init_prod__NamedRegExp__NamedBackslash_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(2842, 0, "NamedBackslash", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NamedRegExp__NamedBackslash_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__NamedRegExp__lit___60_Name_lit___62_(builder);
      
        _init_prod__NamedRegExp__char_class___range__0_46_range__48_59_range__61_61_range__63_91_range__93_65535_(builder);
      
        _init_prod__NamedRegExp__char_class___range__92_92_char_class___range__47_47_range__60_60_range__62_62_range__92_92_(builder);
      
        _init_prod__NamedRegExp__NamedBackslash_(builder);
      
    }
  }
	
  protected static class ModuleParameters {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_ModuleParameters__lit___91_layouts_LAYOUTLIST_parameters_iter_seps__TypeVar__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(2866, 4, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      tmp[3] = new NonTerminalStackNode(2864, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode(2854, 2, regular__iter_seps__TypeVar__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(2856, 0, "TypeVar", null, null), new AbstractStackNode[]{new NonTerminalStackNode(2858, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(2860, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(2862, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[1] = new NonTerminalStackNode(2852, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(2850, 0, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_ModuleParameters__lit___91_layouts_LAYOUTLIST_parameters_iter_seps__TypeVar__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_ModuleParameters__lit___91_layouts_LAYOUTLIST_parameters_iter_seps__TypeVar__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(builder);
      
    }
  }
	
  protected static class RascalKeywords {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__RascalKeywords__lit_tuple_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2882, 0, prod__lit_tuple__char_class___range__116_116_char_class___range__117_117_char_class___range__112_112_char_class___range__108_108_char_class___range__101_101_, new char[] {116,117,112,108,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_tuple_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_constructor_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2884, 0, prod__lit_constructor__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__99_99_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_, new char[] {99,111,110,115,116,114,117,99,116,111,114}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_constructor_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_int_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2886, 0, prod__lit_int__char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_, new char[] {105,110,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_int_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_fail_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2890, 0, prod__lit_fail__char_class___range__102_102_char_class___range__97_97_char_class___range__105_105_char_class___range__108_108_, new char[] {102,97,105,108}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_fail_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_mod_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2888, 0, prod__lit_mod__char_class___range__109_109_char_class___range__111_111_char_class___range__100_100_, new char[] {109,111,100}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_mod_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_switch_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2892, 0, prod__lit_switch__char_class___range__115_115_char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new char[] {115,119,105,116,99,104}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_switch_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_rule_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2894, 0, prod__lit_rule__char_class___range__114_114_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_, new char[] {114,117,108,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_rule_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_throw_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2896, 0, prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_, new char[] {116,104,114,111,119}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_throw_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_alias_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2898, 0, prod__lit_alias__char_class___range__97_97_char_class___range__108_108_char_class___range__105_105_char_class___range__97_97_char_class___range__115_115_, new char[] {97,108,105,97,115}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_alias_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_default_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2900, 0, prod__lit_default__char_class___range__100_100_char_class___range__101_101_char_class___range__102_102_char_class___range__97_97_char_class___range__117_117_char_class___range__108_108_char_class___range__116_116_, new char[] {100,101,102,97,117,108,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_default_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_throws_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2902, 0, prod__lit_throws__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_char_class___range__115_115_, new char[] {116,104,114,111,119,115}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_throws_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_module_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2904, 0, prod__lit_module__char_class___range__109_109_char_class___range__111_111_char_class___range__100_100_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_, new char[] {109,111,100,117,108,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_module_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_true_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2908, 0, prod__lit_true__char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__101_101_, new char[] {116,114,117,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_true_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_private_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2906, 0, prod__lit_private__char_class___range__112_112_char_class___range__114_114_char_class___range__105_105_char_class___range__118_118_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_, new char[] {112,114,105,118,97,116,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_private_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_map_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2910, 0, prod__lit_map__char_class___range__109_109_char_class___range__97_97_char_class___range__112_112_, new char[] {109,97,112}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_map_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_test_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2912, 0, prod__lit_test__char_class___range__116_116_char_class___range__101_101_char_class___range__115_115_char_class___range__116_116_, new char[] {116,101,115,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_test_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_start_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2914, 0, prod__lit_start__char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__116_116_, new char[] {115,116,97,114,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_start_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_import_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2916, 0, prod__lit_import__char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_, new char[] {105,109,112,111,114,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_import_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_loc_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2918, 0, prod__lit_loc__char_class___range__108_108_char_class___range__111_111_char_class___range__99_99_, new char[] {108,111,99}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_loc_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_assert_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2920, 0, prod__lit_assert__char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_, new char[] {97,115,115,101,114,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_assert_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_insert_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2922, 0, prod__lit_insert__char_class___range__105_105_char_class___range__110_110_char_class___range__115_115_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_, new char[] {105,110,115,101,114,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_insert_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_anno_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2924, 0, prod__lit_anno__char_class___range__97_97_char_class___range__110_110_char_class___range__110_110_char_class___range__111_111_, new char[] {97,110,110,111}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_anno_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_public_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2926, 0, prod__lit_public__char_class___range__112_112_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__105_105_char_class___range__99_99_, new char[] {112,117,98,108,105,99}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_public_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_void_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2928, 0, prod__lit_void__char_class___range__118_118_char_class___range__111_111_char_class___range__105_105_char_class___range__100_100_, new char[] {118,111,105,100}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_void_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_try_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2930, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new char[] {116,114,121}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_try_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_value_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2932, 0, prod__lit_value__char_class___range__118_118_char_class___range__97_97_char_class___range__108_108_char_class___range__117_117_char_class___range__101_101_, new char[] {118,97,108,117,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_value_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_non_terminal_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2934, 0, prod__lit_non_terminal__char_class___range__110_110_char_class___range__111_111_char_class___range__110_110_char_class___range__45_45_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__109_109_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_, new char[] {110,111,110,45,116,101,114,109,105,110,97,108}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_non_terminal_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_list_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2936, 0, prod__lit_list__char_class___range__108_108_char_class___range__105_105_char_class___range__115_115_char_class___range__116_116_, new char[] {108,105,115,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_list_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_dynamic_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2938, 0, prod__lit_dynamic__char_class___range__100_100_char_class___range__121_121_char_class___range__110_110_char_class___range__97_97_char_class___range__109_109_char_class___range__105_105_char_class___range__99_99_, new char[] {100,121,110,97,109,105,99}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_dynamic_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_tag_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2940, 0, prod__lit_tag__char_class___range__116_116_char_class___range__97_97_char_class___range__103_103_, new char[] {116,97,103}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_tag_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_data_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2942, 0, prod__lit_data__char_class___range__100_100_char_class___range__97_97_char_class___range__116_116_char_class___range__97_97_, new char[] {100,97,116,97}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_data_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_append_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2946, 0, prod__lit_append__char_class___range__97_97_char_class___range__112_112_char_class___range__112_112_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_, new char[] {97,112,112,101,110,100}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_append_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_extend_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2944, 0, prod__lit_extend__char_class___range__101_101_char_class___range__120_120_char_class___range__116_116_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_, new char[] {101,120,116,101,110,100}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_extend_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_type_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2950, 0, prod__lit_type__char_class___range__116_116_char_class___range__121_121_char_class___range__112_112_char_class___range__101_101_, new char[] {116,121,112,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_type_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_notin_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2948, 0, prod__lit_notin__char_class___range__110_110_char_class___range__111_111_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_, new char[] {110,111,116,105,110}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_notin_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_catch_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2952, 0, prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new char[] {99,97,116,99,104}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_catch_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_one_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2954, 0, prod__lit_one__char_class___range__111_111_char_class___range__110_110_char_class___range__101_101_, new char[] {111,110,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_one_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_node_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2956, 0, prod__lit_node__char_class___range__110_110_char_class___range__111_111_char_class___range__100_100_char_class___range__101_101_, new char[] {110,111,100,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_node_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_str_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2958, 0, prod__lit_str__char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_, new char[] {115,116,114}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_str_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_repeat_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2960, 0, prod__lit_repeat__char_class___range__114_114_char_class___range__101_101_char_class___range__112_112_char_class___range__101_101_char_class___range__97_97_char_class___range__116_116_, new char[] {114,101,112,101,97,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_repeat_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_visit_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2962, 0, prod__lit_visit__char_class___range__118_118_char_class___range__105_105_char_class___range__115_115_char_class___range__105_105_char_class___range__116_116_, new char[] {118,105,115,105,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_visit_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_fun_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2964, 0, prod__lit_fun__char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_, new char[] {102,117,110}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_fun_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_if_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2968, 0, prod__lit_if__char_class___range__105_105_char_class___range__102_102_, new char[] {105,102}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_if_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_non_assoc_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2966, 0, prod__lit_non_assoc__char_class___range__110_110_char_class___range__111_111_char_class___range__110_110_char_class___range__45_45_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__111_111_char_class___range__99_99_, new char[] {110,111,110,45,97,115,115,111,99}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_non_assoc_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_return_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2970, 0, prod__lit_return__char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_, new char[] {114,101,116,117,114,110}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_return_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_else_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2972, 0, prod__lit_else__char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new char[] {101,108,115,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_else_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_in_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2974, 0, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new char[] {105,110}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_in_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_join_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2978, 0, prod__lit_join__char_class___range__106_106_char_class___range__111_111_char_class___range__105_105_char_class___range__110_110_, new char[] {106,111,105,110}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_join_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_it_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2976, 0, prod__lit_it__char_class___range__105_105_char_class___range__116_116_, new char[] {105,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_it_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_for_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2980, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new char[] {102,111,114}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_for_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_continue_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2982, 0, prod__lit_continue__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_, new char[] {99,111,110,116,105,110,117,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_continue_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_bracket_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2984, 0, prod__lit_bracket__char_class___range__98_98_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__107_107_char_class___range__101_101_char_class___range__116_116_, new char[] {98,114,97,99,107,101,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_bracket_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_set_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2986, 0, prod__lit_set__char_class___range__115_115_char_class___range__101_101_char_class___range__116_116_, new char[] {115,101,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_set_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_assoc_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2988, 0, prod__lit_assoc__char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__111_111_char_class___range__99_99_, new char[] {97,115,115,111,99}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_assoc_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_bag_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2990, 0, prod__lit_bag__char_class___range__98_98_char_class___range__97_97_char_class___range__103_103_, new char[] {98,97,103}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_bag_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_num_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2992, 0, prod__lit_num__char_class___range__110_110_char_class___range__117_117_char_class___range__109_109_, new char[] {110,117,109}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_num_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_datetime_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2994, 0, prod__lit_datetime__char_class___range__100_100_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__116_116_char_class___range__105_105_char_class___range__109_109_char_class___range__101_101_, new char[] {100,97,116,101,116,105,109,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_datetime_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_filter_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2996, 0, prod__lit_filter__char_class___range__102_102_char_class___range__105_105_char_class___range__108_108_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_, new char[] {102,105,108,116,101,114}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_filter_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_layout_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3002, 0, prod__lit_layout__char_class___range__108_108_char_class___range__97_97_char_class___range__121_121_char_class___range__111_111_char_class___range__117_117_char_class___range__116_116_, new char[] {108,97,121,111,117,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_layout_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_case_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3000, 0, prod__lit_case__char_class___range__99_99_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_, new char[] {99,97,115,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_case_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_while_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(2998, 0, prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new char[] {119,104,105,108,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_while_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_bool_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3004, 0, prod__lit_bool__char_class___range__98_98_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_, new char[] {98,111,111,108}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_bool_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_any_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3006, 0, prod__lit_any__char_class___range__97_97_char_class___range__110_110_char_class___range__121_121_, new char[] {97,110,121}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_any_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_real_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3010, 0, prod__lit_real__char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__108_108_, new char[] {114,101,97,108}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_real_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_finally_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3008, 0, prod__lit_finally__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_, new char[] {102,105,110,97,108,108,121}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_finally_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_all_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3012, 0, prod__lit_all__char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_, new char[] {97,108,108}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_all_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_false_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3014, 0, prod__lit_false__char_class___range__102_102_char_class___range__97_97_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new char[] {102,97,108,115,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_false_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_break_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3016, 0, prod__lit_break__char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_, new char[] {98,114,101,97,107}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_break_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_rel_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3018, 0, prod__lit_rel__char_class___range__114_114_char_class___range__101_101_char_class___range__108_108_, new char[] {114,101,108}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_rel_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__BasicType_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(3020, 0, "BasicType", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__BasicType_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_adt_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3022, 0, prod__lit_adt__char_class___range__97_97_char_class___range__100_100_char_class___range__116_116_, new char[] {97,100,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_adt_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_solve_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3024, 0, prod__lit_solve__char_class___range__115_115_char_class___range__111_111_char_class___range__108_108_char_class___range__118_118_char_class___range__101_101_, new char[] {115,111,108,118,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_solve_, tmp);
	}
    protected static final void _init_prod__RascalKeywords__lit_rat_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3026, 0, prod__lit_rat__char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_, new char[] {114,97,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RascalKeywords__lit_rat_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__RascalKeywords__lit_tuple_(builder);
      
        _init_prod__RascalKeywords__lit_constructor_(builder);
      
        _init_prod__RascalKeywords__lit_int_(builder);
      
        _init_prod__RascalKeywords__lit_fail_(builder);
      
        _init_prod__RascalKeywords__lit_mod_(builder);
      
        _init_prod__RascalKeywords__lit_switch_(builder);
      
        _init_prod__RascalKeywords__lit_rule_(builder);
      
        _init_prod__RascalKeywords__lit_throw_(builder);
      
        _init_prod__RascalKeywords__lit_alias_(builder);
      
        _init_prod__RascalKeywords__lit_default_(builder);
      
        _init_prod__RascalKeywords__lit_throws_(builder);
      
        _init_prod__RascalKeywords__lit_module_(builder);
      
        _init_prod__RascalKeywords__lit_true_(builder);
      
        _init_prod__RascalKeywords__lit_private_(builder);
      
        _init_prod__RascalKeywords__lit_map_(builder);
      
        _init_prod__RascalKeywords__lit_test_(builder);
      
        _init_prod__RascalKeywords__lit_start_(builder);
      
        _init_prod__RascalKeywords__lit_import_(builder);
      
        _init_prod__RascalKeywords__lit_loc_(builder);
      
        _init_prod__RascalKeywords__lit_assert_(builder);
      
        _init_prod__RascalKeywords__lit_insert_(builder);
      
        _init_prod__RascalKeywords__lit_anno_(builder);
      
        _init_prod__RascalKeywords__lit_public_(builder);
      
        _init_prod__RascalKeywords__lit_void_(builder);
      
        _init_prod__RascalKeywords__lit_try_(builder);
      
        _init_prod__RascalKeywords__lit_value_(builder);
      
        _init_prod__RascalKeywords__lit_non_terminal_(builder);
      
        _init_prod__RascalKeywords__lit_list_(builder);
      
        _init_prod__RascalKeywords__lit_dynamic_(builder);
      
        _init_prod__RascalKeywords__lit_tag_(builder);
      
        _init_prod__RascalKeywords__lit_data_(builder);
      
        _init_prod__RascalKeywords__lit_append_(builder);
      
        _init_prod__RascalKeywords__lit_extend_(builder);
      
        _init_prod__RascalKeywords__lit_type_(builder);
      
        _init_prod__RascalKeywords__lit_notin_(builder);
      
        _init_prod__RascalKeywords__lit_catch_(builder);
      
        _init_prod__RascalKeywords__lit_one_(builder);
      
        _init_prod__RascalKeywords__lit_node_(builder);
      
        _init_prod__RascalKeywords__lit_str_(builder);
      
        _init_prod__RascalKeywords__lit_repeat_(builder);
      
        _init_prod__RascalKeywords__lit_visit_(builder);
      
        _init_prod__RascalKeywords__lit_fun_(builder);
      
        _init_prod__RascalKeywords__lit_if_(builder);
      
        _init_prod__RascalKeywords__lit_non_assoc_(builder);
      
        _init_prod__RascalKeywords__lit_return_(builder);
      
        _init_prod__RascalKeywords__lit_else_(builder);
      
        _init_prod__RascalKeywords__lit_in_(builder);
      
        _init_prod__RascalKeywords__lit_join_(builder);
      
        _init_prod__RascalKeywords__lit_it_(builder);
      
        _init_prod__RascalKeywords__lit_for_(builder);
      
        _init_prod__RascalKeywords__lit_continue_(builder);
      
        _init_prod__RascalKeywords__lit_bracket_(builder);
      
        _init_prod__RascalKeywords__lit_set_(builder);
      
        _init_prod__RascalKeywords__lit_assoc_(builder);
      
        _init_prod__RascalKeywords__lit_bag_(builder);
      
        _init_prod__RascalKeywords__lit_num_(builder);
      
        _init_prod__RascalKeywords__lit_datetime_(builder);
      
        _init_prod__RascalKeywords__lit_filter_(builder);
      
        _init_prod__RascalKeywords__lit_layout_(builder);
      
        _init_prod__RascalKeywords__lit_case_(builder);
      
        _init_prod__RascalKeywords__lit_while_(builder);
      
        _init_prod__RascalKeywords__lit_bool_(builder);
      
        _init_prod__RascalKeywords__lit_any_(builder);
      
        _init_prod__RascalKeywords__lit_real_(builder);
      
        _init_prod__RascalKeywords__lit_finally_(builder);
      
        _init_prod__RascalKeywords__lit_all_(builder);
      
        _init_prod__RascalKeywords__lit_false_(builder);
      
        _init_prod__RascalKeywords__lit_break_(builder);
      
        _init_prod__RascalKeywords__lit_rel_(builder);
      
        _init_prod__RascalKeywords__BasicType_(builder);
      
        _init_prod__RascalKeywords__lit_adt_(builder);
      
        _init_prod__RascalKeywords__lit_solve_(builder);
      
        _init_prod__RascalKeywords__lit_rat_(builder);
      
    }
  }
	
  protected static class Strategy {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__TopDown_Strategy__lit_top_down_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3048, 0, prod__lit_top_down__char_class___range__116_116_char_class___range__111_111_char_class___range__112_112_char_class___range__45_45_char_class___range__100_100_char_class___range__111_111_char_class___range__119_119_char_class___range__110_110_, new char[] {116,111,112,45,100,111,119,110}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__TopDown_Strategy__lit_top_down_, tmp);
	}
    protected static final void _init_prod__TopDownBreak_Strategy__lit_top_down_break_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3050, 0, prod__lit_top_down_break__char_class___range__116_116_char_class___range__111_111_char_class___range__112_112_char_class___range__45_45_char_class___range__100_100_char_class___range__111_111_char_class___range__119_119_char_class___range__110_110_char_class___range__45_45_char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_, new char[] {116,111,112,45,100,111,119,110,45,98,114,101,97,107}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__TopDownBreak_Strategy__lit_top_down_break_, tmp);
	}
    protected static final void _init_prod__Innermost_Strategy__lit_innermost_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3052, 0, prod__lit_innermost__char_class___range__105_105_char_class___range__110_110_char_class___range__110_110_char_class___range__101_101_char_class___range__114_114_char_class___range__109_109_char_class___range__111_111_char_class___range__115_115_char_class___range__116_116_, new char[] {105,110,110,101,114,109,111,115,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Innermost_Strategy__lit_innermost_, tmp);
	}
    protected static final void _init_prod__BottomUp_Strategy__lit_bottom_up_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3054, 0, prod__lit_bottom_up__char_class___range__98_98_char_class___range__111_111_char_class___range__116_116_char_class___range__116_116_char_class___range__111_111_char_class___range__109_109_char_class___range__45_45_char_class___range__117_117_char_class___range__112_112_, new char[] {98,111,116,116,111,109,45,117,112}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__BottomUp_Strategy__lit_bottom_up_, tmp);
	}
    protected static final void _init_prod__Outermost_Strategy__lit_outermost_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3056, 0, prod__lit_outermost__char_class___range__111_111_char_class___range__117_117_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__109_109_char_class___range__111_111_char_class___range__115_115_char_class___range__116_116_, new char[] {111,117,116,101,114,109,111,115,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Outermost_Strategy__lit_outermost_, tmp);
	}
    protected static final void _init_prod__BottomUpBreak_Strategy__lit_bottom_up_break_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3058, 0, prod__lit_bottom_up_break__char_class___range__98_98_char_class___range__111_111_char_class___range__116_116_char_class___range__116_116_char_class___range__111_111_char_class___range__109_109_char_class___range__45_45_char_class___range__117_117_char_class___range__112_112_char_class___range__45_45_char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_, new char[] {98,111,116,116,111,109,45,117,112,45,98,114,101,97,107}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__BottomUpBreak_Strategy__lit_bottom_up_break_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__TopDown_Strategy__lit_top_down_(builder);
      
        _init_prod__TopDownBreak_Strategy__lit_top_down_break_(builder);
      
        _init_prod__Innermost_Strategy__lit_innermost_(builder);
      
        _init_prod__BottomUp_Strategy__lit_bottom_up_(builder);
      
        _init_prod__Outermost_Strategy__lit_outermost_(builder);
      
        _init_prod__BottomUpBreak_Strategy__lit_bottom_up_break_(builder);
      
    }
  }
	
  protected static class Char {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Char__lit___92_char_class___range__32_32_range__34_34_range__39_39_range__45_45_range__60_60_range__62_62_range__91_93_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116__tag__category___67_111_110_115_116_97_110_116(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[2];
      
      tmp[1] = new CharStackNode(3066, 1, new char[][]{{32,32},{34,34},{39,39},{45,45},{60,60},{62,62},{91,93},{98,98},{102,102},{110,110},{114,114},{116,116}}, null, null);
      tmp[0] = new LiteralStackNode(3064, 0, prod__lit___92__char_class___range__92_92_, new char[] {92}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Char__lit___92_char_class___range__32_32_range__34_34_range__39_39_range__45_45_range__60_60_range__62_62_range__91_93_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116__tag__category___67_111_110_115_116_97_110_116, tmp);
	}
    protected static final void _init_prod__Char__char_class___range__0_31_range__33_33_range__35_38_range__40_44_range__46_59_range__61_61_range__63_90_range__94_65535__tag__category___67_111_110_115_116_97_110_116(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode(3068, 0, new char[][]{{0,31},{33,33},{35,38},{40,44},{46,59},{61,61},{63,90},{94,65535}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Char__char_class___range__0_31_range__33_33_range__35_38_range__40_44_range__46_59_range__61_61_range__63_90_range__94_65535__tag__category___67_111_110_115_116_97_110_116, tmp);
	}
    protected static final void _init_prod__Char__OctalEscapeSequence__tag__category___67_111_110_115_116_97_110_116(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(3070, 0, "OctalEscapeSequence", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Char__OctalEscapeSequence__tag__category___67_111_110_115_116_97_110_116, tmp);
	}
    protected static final void _init_prod__Char__UnicodeEscape__tag__category___67_111_110_115_116_97_110_116(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(3072, 0, "UnicodeEscape", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Char__UnicodeEscape__tag__category___67_111_110_115_116_97_110_116, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Char__lit___92_char_class___range__32_32_range__34_34_range__39_39_range__45_45_range__60_60_range__62_62_range__91_93_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116__tag__category___67_111_110_115_116_97_110_116(builder);
      
        _init_prod__Char__char_class___range__0_31_range__33_33_range__35_38_range__40_44_range__46_59_range__61_61_range__63_90_range__94_65535__tag__category___67_111_110_115_116_97_110_116(builder);
      
        _init_prod__Char__OctalEscapeSequence__tag__category___67_111_110_115_116_97_110_116(builder);
      
        _init_prod__Char__UnicodeEscape__tag__category___67_111_110_115_116_97_110_116(builder);
      
    }
  }
	
  protected static class PrePathChars {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__PrePathChars__URLChars_lit___60_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[2];
      
      tmp[1] = new LiteralStackNode(3086, 1, prod__lit___60__char_class___range__60_60_, new char[] {60}, null, null);
      tmp[0] = new NonTerminalStackNode(3084, 0, "URLChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__PrePathChars__URLChars_lit___60_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__PrePathChars__URLChars_lit___60_(builder);
      
    }
  }
	
  protected static class MidPathChars {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__MidPathChars__lit___62_URLChars_lit___60_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(3102, 2, prod__lit___60__char_class___range__60_60_, new char[] {60}, null, null);
      tmp[1] = new NonTerminalStackNode(3100, 1, "URLChars", null, null);
      tmp[0] = new LiteralStackNode(3098, 0, prod__lit___62__char_class___range__62_62_, new char[] {62}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__MidPathChars__lit___62_URLChars_lit___60_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__MidPathChars__lit___62_URLChars_lit___60_(builder);
      
    }
  }
	
  protected static class PostProtocolChars {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__PostProtocolChars__lit___62_URLChars_lit___58_47_47_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(3154, 2, prod__lit___58_47_47__char_class___range__58_58_char_class___range__47_47_char_class___range__47_47_, new char[] {58,47,47}, null, null);
      tmp[1] = new NonTerminalStackNode(3152, 1, "URLChars", null, null);
      tmp[0] = new LiteralStackNode(3150, 0, prod__lit___62__char_class___range__62_62_, new char[] {62}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__PostProtocolChars__lit___62_URLChars_lit___58_47_47_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__PostProtocolChars__lit___62_URLChars_lit___58_47_47_(builder);
      
    }
  }
	
  protected static class SyntaxDefinition {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Keyword_SyntaxDefinition__lit_keyword_layouts_LAYOUTLIST_defined_Sym_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_production_Prod_layouts_LAYOUTLIST_lit___59__tag__Foldable(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[9];
      
      tmp[8] = new LiteralStackNode(3244, 8, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[7] = new NonTerminalStackNode(3242, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(3240, 6, "Prod", null, null);
      tmp[5] = new NonTerminalStackNode(3238, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(3236, 4, prod__lit___61__char_class___range__61_61_, new char[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode(3234, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(3232, 2, "Sym", null, null);
      tmp[1] = new NonTerminalStackNode(3230, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(3228, 0, prod__lit_keyword__char_class___range__107_107_char_class___range__101_101_char_class___range__121_121_char_class___range__119_119_char_class___range__111_111_char_class___range__114_114_char_class___range__100_100_, new char[] {107,101,121,119,111,114,100}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Keyword_SyntaxDefinition__lit_keyword_layouts_LAYOUTLIST_defined_Sym_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_production_Prod_layouts_LAYOUTLIST_lit___59__tag__Foldable, tmp);
	}
    protected static final void _init_prod__Language_SyntaxDefinition__start_Start_layouts_LAYOUTLIST_lit_syntax_layouts_LAYOUTLIST_defined_Sym_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_production_Prod_layouts_LAYOUTLIST_lit___59__tag__Foldable(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[11];
      
      tmp[10] = new LiteralStackNode(3266, 10, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[9] = new NonTerminalStackNode(3264, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode(3262, 8, "Prod", null, null);
      tmp[7] = new NonTerminalStackNode(3260, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(3258, 6, prod__lit___61__char_class___range__61_61_, new char[] {61}, null, null);
      tmp[5] = new NonTerminalStackNode(3256, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(3254, 4, "Sym", null, null);
      tmp[3] = new NonTerminalStackNode(3252, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(3250, 2, prod__lit_syntax__char_class___range__115_115_char_class___range__121_121_char_class___range__110_110_char_class___range__116_116_char_class___range__97_97_char_class___range__120_120_, new char[] {115,121,110,116,97,120}, null, null);
      tmp[1] = new NonTerminalStackNode(3248, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(3246, 0, "Start", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Language_SyntaxDefinition__start_Start_layouts_LAYOUTLIST_lit_syntax_layouts_LAYOUTLIST_defined_Sym_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_production_Prod_layouts_LAYOUTLIST_lit___59__tag__Foldable, tmp);
	}
    protected static final void _init_prod__Lexical_SyntaxDefinition__lit_lexical_layouts_LAYOUTLIST_defined_Sym_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_production_Prod_layouts_LAYOUTLIST_lit___59__tag__Foldable(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[9];
      
      tmp[8] = new LiteralStackNode(3284, 8, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[7] = new NonTerminalStackNode(3282, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(3280, 6, "Prod", null, null);
      tmp[5] = new NonTerminalStackNode(3278, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(3276, 4, prod__lit___61__char_class___range__61_61_, new char[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode(3274, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(3272, 2, "Sym", null, null);
      tmp[1] = new NonTerminalStackNode(3270, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(3268, 0, prod__lit_lexical__char_class___range__108_108_char_class___range__101_101_char_class___range__120_120_char_class___range__105_105_char_class___range__99_99_char_class___range__97_97_char_class___range__108_108_, new char[] {108,101,120,105,99,97,108}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Lexical_SyntaxDefinition__lit_lexical_layouts_LAYOUTLIST_defined_Sym_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_production_Prod_layouts_LAYOUTLIST_lit___59__tag__Foldable, tmp);
	}
    protected static final void _init_prod__Layout_SyntaxDefinition__vis_Visibility_layouts_LAYOUTLIST_lit_layout_layouts_LAYOUTLIST_defined_Sym_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_production_Prod_layouts_LAYOUTLIST_lit___59__tag__Foldable(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[11];
      
      tmp[10] = new LiteralStackNode(3306, 10, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[9] = new NonTerminalStackNode(3304, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode(3302, 8, "Prod", null, null);
      tmp[7] = new NonTerminalStackNode(3300, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(3298, 6, prod__lit___61__char_class___range__61_61_, new char[] {61}, null, null);
      tmp[5] = new NonTerminalStackNode(3296, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(3294, 4, "Sym", null, null);
      tmp[3] = new NonTerminalStackNode(3292, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(3290, 2, prod__lit_layout__char_class___range__108_108_char_class___range__97_97_char_class___range__121_121_char_class___range__111_111_char_class___range__117_117_char_class___range__116_116_, new char[] {108,97,121,111,117,116}, null, null);
      tmp[1] = new NonTerminalStackNode(3288, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(3286, 0, "Visibility", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Layout_SyntaxDefinition__vis_Visibility_layouts_LAYOUTLIST_lit_layout_layouts_LAYOUTLIST_defined_Sym_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_production_Prod_layouts_LAYOUTLIST_lit___59__tag__Foldable, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Keyword_SyntaxDefinition__lit_keyword_layouts_LAYOUTLIST_defined_Sym_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_production_Prod_layouts_LAYOUTLIST_lit___59__tag__Foldable(builder);
      
        _init_prod__Language_SyntaxDefinition__start_Start_layouts_LAYOUTLIST_lit_syntax_layouts_LAYOUTLIST_defined_Sym_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_production_Prod_layouts_LAYOUTLIST_lit___59__tag__Foldable(builder);
      
        _init_prod__Lexical_SyntaxDefinition__lit_lexical_layouts_LAYOUTLIST_defined_Sym_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_production_Prod_layouts_LAYOUTLIST_lit___59__tag__Foldable(builder);
      
        _init_prod__Layout_SyntaxDefinition__vis_Visibility_layouts_LAYOUTLIST_lit_layout_layouts_LAYOUTLIST_defined_Sym_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_production_Prod_layouts_LAYOUTLIST_lit___59__tag__Foldable(builder);
      
    }
  }
	
  protected static class Kind {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Alias_Kind__lit_alias_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3308, 0, prod__lit_alias__char_class___range__97_97_char_class___range__108_108_char_class___range__105_105_char_class___range__97_97_char_class___range__115_115_, new char[] {97,108,105,97,115}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Alias_Kind__lit_alias_, tmp);
	}
    protected static final void _init_prod__View_Kind__lit_view_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3310, 0, prod__lit_view__char_class___range__118_118_char_class___range__105_105_char_class___range__101_101_char_class___range__119_119_, new char[] {118,105,101,119}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__View_Kind__lit_view_, tmp);
	}
    protected static final void _init_prod__Function_Kind__lit_function_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3312, 0, prod__lit_function__char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_, new char[] {102,117,110,99,116,105,111,110}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Function_Kind__lit_function_, tmp);
	}
    protected static final void _init_prod__Tag_Kind__lit_tag_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3314, 0, prod__lit_tag__char_class___range__116_116_char_class___range__97_97_char_class___range__103_103_, new char[] {116,97,103}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Tag_Kind__lit_tag_, tmp);
	}
    protected static final void _init_prod__Data_Kind__lit_data_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3316, 0, prod__lit_data__char_class___range__100_100_char_class___range__97_97_char_class___range__116_116_char_class___range__97_97_, new char[] {100,97,116,97}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Data_Kind__lit_data_, tmp);
	}
    protected static final void _init_prod__Anno_Kind__lit_anno_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3318, 0, prod__lit_anno__char_class___range__97_97_char_class___range__110_110_char_class___range__110_110_char_class___range__111_111_, new char[] {97,110,110,111}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Anno_Kind__lit_anno_, tmp);
	}
    protected static final void _init_prod__Rule_Kind__lit_rule_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3320, 0, prod__lit_rule__char_class___range__114_114_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_, new char[] {114,117,108,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Rule_Kind__lit_rule_, tmp);
	}
    protected static final void _init_prod__Variable_Kind__lit_variable_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3322, 0, prod__lit_variable__char_class___range__118_118_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_, new char[] {118,97,114,105,97,98,108,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Variable_Kind__lit_variable_, tmp);
	}
    protected static final void _init_prod__Module_Kind__lit_module_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3324, 0, prod__lit_module__char_class___range__109_109_char_class___range__111_111_char_class___range__100_100_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_, new char[] {109,111,100,117,108,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Module_Kind__lit_module_, tmp);
	}
    protected static final void _init_prod__All_Kind__lit_all_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3326, 0, prod__lit_all__char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_, new char[] {97,108,108}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__All_Kind__lit_all_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Alias_Kind__lit_alias_(builder);
      
        _init_prod__View_Kind__lit_view_(builder);
      
        _init_prod__Function_Kind__lit_function_(builder);
      
        _init_prod__Tag_Kind__lit_tag_(builder);
      
        _init_prod__Data_Kind__lit_data_(builder);
      
        _init_prod__Anno_Kind__lit_anno_(builder);
      
        _init_prod__Rule_Kind__lit_rule_(builder);
      
        _init_prod__Variable_Kind__lit_variable_(builder);
      
        _init_prod__Module_Kind__lit_module_(builder);
      
        _init_prod__All_Kind__lit_all_(builder);
      
    }
  }
	
  protected static class IntegerLiteral {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__OctalIntegerLiteral_IntegerLiteral__octal_OctalIntegerLiteral_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(3352, 0, "OctalIntegerLiteral", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__OctalIntegerLiteral_IntegerLiteral__octal_OctalIntegerLiteral_, tmp);
	}
    protected static final void _init_prod__HexIntegerLiteral_IntegerLiteral__hex_HexIntegerLiteral_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(3354, 0, "HexIntegerLiteral", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__HexIntegerLiteral_IntegerLiteral__hex_HexIntegerLiteral_, tmp);
	}
    protected static final void _init_prod__DecimalIntegerLiteral_IntegerLiteral__decimal_DecimalIntegerLiteral_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(3356, 0, "DecimalIntegerLiteral", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__DecimalIntegerLiteral_IntegerLiteral__decimal_DecimalIntegerLiteral_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__OctalIntegerLiteral_IntegerLiteral__octal_OctalIntegerLiteral_(builder);
      
        _init_prod__HexIntegerLiteral_IntegerLiteral__hex_HexIntegerLiteral_(builder);
      
        _init_prod__DecimalIntegerLiteral_IntegerLiteral__decimal_DecimalIntegerLiteral_(builder);
      
    }
  }
	
  protected static class Target {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Empty_Target__(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new EpsilonStackNode(3348, 0);
      builder.addAlternative(ObjectRascalRascal.prod__Empty_Target__, tmp);
	}
    protected static final void _init_prod__Labeled_Target__name_Name_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(3350, 0, "Name", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Labeled_Target__name_Name_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Empty_Target__(builder);
      
        _init_prod__Labeled_Target__name_Name_(builder);
      
    }
  }
	
  protected static class start__Command {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__start__Command__layouts_LAYOUTLIST_top_Command_layouts_LAYOUTLIST_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(3364, 2, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode(3362, 1, "Command", null, null);
      tmp[0] = new NonTerminalStackNode(3360, 0, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__start__Command__layouts_LAYOUTLIST_top_Command_layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__start__Command__layouts_LAYOUTLIST_top_Command_layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class FunctionBody {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_FunctionBody__lit___123_layouts_LAYOUTLIST_statements_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(3378, 4, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[3] = new NonTerminalStackNode(3376, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode(3370, 2, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode(3372, 0, "Statement", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3374, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[1] = new NonTerminalStackNode(3368, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(3366, 0, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_FunctionBody__lit___123_layouts_LAYOUTLIST_statements_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_FunctionBody__lit___123_layouts_LAYOUTLIST_statements_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
    }
  }
	
  protected static class Import {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Extend_Import__lit_extend_layouts_LAYOUTLIST_module_ImportedModule_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(3412, 4, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[3] = new NonTerminalStackNode(3410, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(3408, 2, "ImportedModule", null, null);
      tmp[1] = new NonTerminalStackNode(3406, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(3404, 0, prod__lit_extend__char_class___range__101_101_char_class___range__120_120_char_class___range__116_116_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_, new char[] {101,120,116,101,110,100}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Extend_Import__lit_extend_layouts_LAYOUTLIST_module_ImportedModule_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__Default_Import__lit_import_layouts_LAYOUTLIST_module_ImportedModule_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(3422, 4, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[3] = new NonTerminalStackNode(3420, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(3418, 2, "ImportedModule", null, null);
      tmp[1] = new NonTerminalStackNode(3416, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(3414, 0, prod__lit_import__char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_, new char[] {105,109,112,111,114,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Import__lit_import_layouts_LAYOUTLIST_module_ImportedModule_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__Syntax_Import__syntax_SyntaxDefinition_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(3424, 0, "SyntaxDefinition", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Syntax_Import__syntax_SyntaxDefinition_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Extend_Import__lit_extend_layouts_LAYOUTLIST_module_ImportedModule_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__Default_Import__lit_import_layouts_LAYOUTLIST_module_ImportedModule_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__Syntax_Import__syntax_SyntaxDefinition_(builder);
      
    }
  }
	
  protected static class UserType {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Name_UserType__name_QualifiedName_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(3380, 0, "QualifiedName", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Name_UserType__name_QualifiedName_, tmp);
	}
    protected static final void _init_prod__Parametric_UserType__conditional__name_QualifiedName__follow__lit___91_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_parameters_iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(3402, 6, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      tmp[5] = new NonTerminalStackNode(3400, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(3390, 4, regular__iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(3392, 0, "Type", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3394, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(3396, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(3398, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[3] = new NonTerminalStackNode(3388, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(3386, 2, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      tmp[1] = new NonTerminalStackNode(3384, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(3382, 0, "QualifiedName", null, new ICompletionFilter[] {new StringFollowRequirement(new char[] {91})});
      builder.addAlternative(ObjectRascalRascal.prod__Parametric_UserType__conditional__name_QualifiedName__follow__lit___91_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_parameters_iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Name_UserType__name_QualifiedName_(builder);
      
        _init_prod__Parametric_UserType__conditional__name_QualifiedName__follow__lit___91_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_parameters_iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(builder);
      
    }
  }
	
  protected static class Body {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Toplevels_Body__toplevels_iter_star_seps__Toplevel__layouts_LAYOUTLIST_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode(3430, 0, regular__iter_star_seps__Toplevel__layouts_LAYOUTLIST, new NonTerminalStackNode(3432, 0, "Toplevel", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3434, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Toplevels_Body__toplevels_iter_star_seps__Toplevel__layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Toplevels_Body__toplevels_iter_star_seps__Toplevel__layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class LAYOUT {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__LAYOUT__char_class___range__9_10_range__13_13_range__32_32_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode(3426, 0, new char[][]{{9,10},{13,13},{32,32}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__LAYOUT__char_class___range__9_10_range__13_13_range__32_32_, tmp);
	}
    protected static final void _init_prod__LAYOUT__Comment_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(3428, 0, "Comment", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__LAYOUT__Comment_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__LAYOUT__char_class___range__9_10_range__13_13_range__32_32_(builder);
      
        _init_prod__LAYOUT__Comment_(builder);
      
    }
  }
	
  protected static class DecimalIntegerLiteral {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__DecimalIntegerLiteral__conditional__lit_0__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3488, 0, prod__lit_0__char_class___range__48_48_, new char[] {48}, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{48,57},{65,90},{95,95},{97,122}})});
      builder.addAlternative(ObjectRascalRascal.prod__DecimalIntegerLiteral__conditional__lit_0__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_, tmp);
	}
    protected static final void _init_prod__DecimalIntegerLiteral__char_class___range__49_57_conditional__iter_star__char_class___range__48_57__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[2];
      
      tmp[1] = new ListStackNode(3492, 1, regular__iter_star__char_class___range__48_57, new CharStackNode(3494, 0, new char[][]{{48,57}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{48,57},{65,90},{95,95},{97,122}})});
      tmp[0] = new CharStackNode(3490, 0, new char[][]{{49,57}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__DecimalIntegerLiteral__char_class___range__49_57_conditional__iter_star__char_class___range__48_57__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__DecimalIntegerLiteral__conditional__lit_0__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_(builder);
      
        _init_prod__DecimalIntegerLiteral__char_class___range__49_57_conditional__iter_star__char_class___range__48_57__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_(builder);
      
    }
  }
	
  protected static class StringTemplate {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__While_StringTemplate__lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_condition_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_body_StringMiddle_layouts_LAYOUTLIST_postStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[17];
      
      tmp[16] = new LiteralStackNode(3536, 16, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[15] = new NonTerminalStackNode(3534, 15, "layouts_LAYOUTLIST", null, null);
      tmp[14] = new SeparatedListStackNode(3528, 14, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode(3530, 0, "Statement", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3532, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[13] = new NonTerminalStackNode(3526, 13, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new NonTerminalStackNode(3524, 12, "StringMiddle", null, null);
      tmp[11] = new NonTerminalStackNode(3522, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new SeparatedListStackNode(3516, 10, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode(3518, 0, "Statement", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3520, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[9] = new NonTerminalStackNode(3514, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(3512, 8, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      tmp[7] = new NonTerminalStackNode(3510, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(3508, 6, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[5] = new NonTerminalStackNode(3506, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(3504, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(3502, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(3500, 2, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[1] = new NonTerminalStackNode(3498, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(3496, 0, prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new char[] {119,104,105,108,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__While_StringTemplate__lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_condition_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_body_StringMiddle_layouts_LAYOUTLIST_postStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__IfThenElse_StringTemplate__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStatsThen_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_thenString_StringMiddle_layouts_LAYOUTLIST_postStatsThen_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStatsElse_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_elseString_StringMiddle_layouts_LAYOUTLIST_postStatsElse_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[29];
      
      tmp[28] = new LiteralStackNode(3618, 28, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[27] = new NonTerminalStackNode(3616, 27, "layouts_LAYOUTLIST", null, null);
      tmp[26] = new SeparatedListStackNode(3610, 26, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode(3612, 0, "Statement", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3614, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[25] = new NonTerminalStackNode(3608, 25, "layouts_LAYOUTLIST", null, null);
      tmp[24] = new NonTerminalStackNode(3606, 24, "StringMiddle", null, null);
      tmp[23] = new NonTerminalStackNode(3604, 23, "layouts_LAYOUTLIST", null, null);
      tmp[22] = new SeparatedListStackNode(3598, 22, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode(3600, 0, "Statement", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3602, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[21] = new NonTerminalStackNode(3596, 21, "layouts_LAYOUTLIST", null, null);
      tmp[20] = new LiteralStackNode(3594, 20, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      tmp[19] = new NonTerminalStackNode(3592, 19, "layouts_LAYOUTLIST", null, null);
      tmp[18] = new LiteralStackNode(3590, 18, prod__lit_else__char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new char[] {101,108,115,101}, null, null);
      tmp[17] = new NonTerminalStackNode(3588, 17, "layouts_LAYOUTLIST", null, null);
      tmp[16] = new LiteralStackNode(3586, 16, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[15] = new NonTerminalStackNode(3584, 15, "layouts_LAYOUTLIST", null, null);
      tmp[14] = new SeparatedListStackNode(3578, 14, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode(3580, 0, "Statement", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3582, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[13] = new NonTerminalStackNode(3576, 13, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new NonTerminalStackNode(3574, 12, "StringMiddle", null, null);
      tmp[11] = new NonTerminalStackNode(3572, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new SeparatedListStackNode(3566, 10, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode(3568, 0, "Statement", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3570, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[9] = new NonTerminalStackNode(3564, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(3562, 8, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      tmp[7] = new NonTerminalStackNode(3560, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(3558, 6, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[5] = new NonTerminalStackNode(3556, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(3546, 4, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(3548, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3550, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(3552, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(3554, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[3] = new NonTerminalStackNode(3544, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(3542, 2, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[1] = new NonTerminalStackNode(3540, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(3538, 0, prod__lit_if__char_class___range__105_105_char_class___range__102_102_, new char[] {105,102}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__IfThenElse_StringTemplate__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStatsThen_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_thenString_StringMiddle_layouts_LAYOUTLIST_postStatsThen_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStatsElse_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_elseString_StringMiddle_layouts_LAYOUTLIST_postStatsElse_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__DoWhile_StringTemplate__lit_do_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_body_StringMiddle_layouts_LAYOUTLIST_postStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_condition_Expression_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[19];
      
      tmp[18] = new LiteralStackNode(3714, 18, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[17] = new NonTerminalStackNode(3712, 17, "layouts_LAYOUTLIST", null, null);
      tmp[16] = new NonTerminalStackNode(3710, 16, "Expression", null, null);
      tmp[15] = new NonTerminalStackNode(3708, 15, "layouts_LAYOUTLIST", null, null);
      tmp[14] = new LiteralStackNode(3706, 14, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[13] = new NonTerminalStackNode(3704, 13, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new LiteralStackNode(3702, 12, prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new char[] {119,104,105,108,101}, null, null);
      tmp[11] = new NonTerminalStackNode(3700, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode(3698, 10, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[9] = new NonTerminalStackNode(3696, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new SeparatedListStackNode(3690, 8, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode(3692, 0, "Statement", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3694, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[7] = new NonTerminalStackNode(3688, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(3686, 6, "StringMiddle", null, null);
      tmp[5] = new NonTerminalStackNode(3684, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(3678, 4, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode(3680, 0, "Statement", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3682, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode(3676, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(3674, 2, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      tmp[1] = new NonTerminalStackNode(3672, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(3670, 0, prod__lit_do__char_class___range__100_100_char_class___range__111_111_, new char[] {100,111}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__DoWhile_StringTemplate__lit_do_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_body_StringMiddle_layouts_LAYOUTLIST_postStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_condition_Expression_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__For_StringTemplate__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_body_StringMiddle_layouts_LAYOUTLIST_postStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[17];
      
      tmp[16] = new LiteralStackNode(3668, 16, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[15] = new NonTerminalStackNode(3666, 15, "layouts_LAYOUTLIST", null, null);
      tmp[14] = new SeparatedListStackNode(3660, 14, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode(3662, 0, "Statement", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3664, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[13] = new NonTerminalStackNode(3658, 13, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new NonTerminalStackNode(3656, 12, "StringMiddle", null, null);
      tmp[11] = new NonTerminalStackNode(3654, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new SeparatedListStackNode(3648, 10, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode(3650, 0, "Statement", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3652, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[9] = new NonTerminalStackNode(3646, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(3644, 8, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      tmp[7] = new NonTerminalStackNode(3642, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(3640, 6, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[5] = new NonTerminalStackNode(3638, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(3628, 4, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(3630, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3632, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(3634, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(3636, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[3] = new NonTerminalStackNode(3626, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(3624, 2, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[1] = new NonTerminalStackNode(3622, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(3620, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new char[] {102,111,114}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__For_StringTemplate__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_body_StringMiddle_layouts_LAYOUTLIST_postStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__IfThen_StringTemplate__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_body_StringMiddle_layouts_LAYOUTLIST_postStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[17];
      
      tmp[16] = new LiteralStackNode(3764, 16, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[15] = new NonTerminalStackNode(3762, 15, "layouts_LAYOUTLIST", null, null);
      tmp[14] = new SeparatedListStackNode(3756, 14, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode(3758, 0, "Statement", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3760, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[13] = new NonTerminalStackNode(3754, 13, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new NonTerminalStackNode(3752, 12, "StringMiddle", null, null);
      tmp[11] = new NonTerminalStackNode(3750, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new SeparatedListStackNode(3744, 10, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode(3746, 0, "Statement", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3748, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[9] = new NonTerminalStackNode(3742, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(3740, 8, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      tmp[7] = new NonTerminalStackNode(3738, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(3736, 6, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[5] = new NonTerminalStackNode(3734, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(3724, 4, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(3726, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3728, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(3730, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(3732, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[3] = new NonTerminalStackNode(3722, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(3720, 2, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[1] = new NonTerminalStackNode(3718, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(3716, 0, prod__lit_if__char_class___range__105_105_char_class___range__102_102_, new char[] {105,102}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__IfThen_StringTemplate__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_body_StringMiddle_layouts_LAYOUTLIST_postStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__While_StringTemplate__lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_condition_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_body_StringMiddle_layouts_LAYOUTLIST_postStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__IfThenElse_StringTemplate__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStatsThen_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_thenString_StringMiddle_layouts_LAYOUTLIST_postStatsThen_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStatsElse_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_elseString_StringMiddle_layouts_LAYOUTLIST_postStatsElse_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__DoWhile_StringTemplate__lit_do_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_body_StringMiddle_layouts_LAYOUTLIST_postStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_condition_Expression_layouts_LAYOUTLIST_lit___41_(builder);
      
        _init_prod__For_StringTemplate__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_body_StringMiddle_layouts_LAYOUTLIST_postStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__IfThen_StringTemplate__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_preStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_body_StringMiddle_layouts_LAYOUTLIST_postStats_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
    }
  }
	
  protected static class PathPart {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__NonInterpolated_PathPart__pathChars_PathChars_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(3782, 0, "PathChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NonInterpolated_PathPart__pathChars_PathChars_, tmp);
	}
    protected static final void _init_prod__Interpolated_PathPart__pre_PrePathChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_PathTail_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(3792, 4, "PathTail", null, null);
      tmp[3] = new NonTerminalStackNode(3790, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(3788, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(3786, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(3784, 0, "PrePathChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Interpolated_PathPart__pre_PrePathChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_PathTail_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__NonInterpolated_PathPart__pathChars_PathChars_(builder);
      
        _init_prod__Interpolated_PathPart__pre_PrePathChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_PathTail_(builder);
      
    }
  }
	
  protected static class RegExp {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__RegExp__char_class___range__92_92_char_class___range__47_47_range__60_60_range__62_62_range__92_92_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[2];
      
      tmp[1] = new CharStackNode(3838, 1, new char[][]{{47,47},{60,60},{62,62},{92,92}}, null, null);
      tmp[0] = new CharStackNode(3836, 0, new char[][]{{92,92}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RegExp__char_class___range__92_92_char_class___range__47_47_range__60_60_range__62_62_range__92_92_, tmp);
	}
    protected static final void _init_prod__RegExp__lit___60_Name_lit___58_iter_star__NamedRegExp_lit___62_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(3850, 4, prod__lit___62__char_class___range__62_62_, new char[] {62}, null, null);
      tmp[3] = new ListStackNode(3846, 3, regular__iter_star__NamedRegExp, new NonTerminalStackNode(3848, 0, "NamedRegExp", null, null), false, null, null);
      tmp[2] = new LiteralStackNode(3844, 2, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[1] = new NonTerminalStackNode(3842, 1, "Name", null, null);
      tmp[0] = new LiteralStackNode(3840, 0, prod__lit___60__char_class___range__60_60_, new char[] {60}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RegExp__lit___60_Name_lit___58_iter_star__NamedRegExp_lit___62_, tmp);
	}
    protected static final void _init_prod__RegExp__char_class___range__60_60_expression_Expression_char_class___range__62_62__tag__category___77_101_116_97_86_97_114_105_97_98_108_101(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode(3856, 2, new char[][]{{62,62}}, null, null);
      tmp[1] = new NonTerminalStackNode(3854, 1, "Expression", null, null);
      tmp[0] = new CharStackNode(3852, 0, new char[][]{{60,60}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RegExp__char_class___range__60_60_expression_Expression_char_class___range__62_62__tag__category___77_101_116_97_86_97_114_105_97_98_108_101, tmp);
	}
    protected static final void _init_prod__RegExp__char_class___range__0_46_range__48_59_range__61_61_range__63_91_range__93_65535_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode(3858, 0, new char[][]{{0,46},{48,59},{61,61},{63,91},{93,65535}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RegExp__char_class___range__0_46_range__48_59_range__61_61_range__63_91_range__93_65535_, tmp);
	}
    protected static final void _init_prod__RegExp__lit___60_Name_lit___62_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(3864, 2, prod__lit___62__char_class___range__62_62_, new char[] {62}, null, null);
      tmp[1] = new NonTerminalStackNode(3862, 1, "Name", null, null);
      tmp[0] = new LiteralStackNode(3860, 0, prod__lit___60__char_class___range__60_60_, new char[] {60}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RegExp__lit___60_Name_lit___62_, tmp);
	}
    protected static final void _init_prod__RegExp__Backslash_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(3866, 0, "Backslash", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RegExp__Backslash_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__RegExp__char_class___range__92_92_char_class___range__47_47_range__60_60_range__62_62_range__92_92_(builder);
      
        _init_prod__RegExp__lit___60_Name_lit___58_iter_star__NamedRegExp_lit___62_(builder);
      
        _init_prod__RegExp__char_class___range__60_60_expression_Expression_char_class___range__62_62__tag__category___77_101_116_97_86_97_114_105_97_98_108_101(builder);
      
        _init_prod__RegExp__char_class___range__0_46_range__48_59_range__61_61_range__63_91_range__93_65535_(builder);
      
        _init_prod__RegExp__lit___60_Name_lit___62_(builder);
      
        _init_prod__RegExp__Backslash_(builder);
      
    }
  }
	
  protected static class MidStringChars {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__MidStringChars__char_class___range__62_62_iter_star__StringCharacter_char_class___range__60_60__tag__category___67_111_110_115_116_97_110_116(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode(3900, 2, new char[][]{{60,60}}, null, null);
      tmp[1] = new ListStackNode(3896, 1, regular__iter_star__StringCharacter, new NonTerminalStackNode(3898, 0, "StringCharacter", null, null), false, null, null);
      tmp[0] = new CharStackNode(3894, 0, new char[][]{{62,62}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__MidStringChars__char_class___range__62_62_iter_star__StringCharacter_char_class___range__60_60__tag__category___67_111_110_115_116_97_110_116, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__MidStringChars__char_class___range__62_62_iter_star__StringCharacter_char_class___range__60_60__tag__category___67_111_110_115_116_97_110_116(builder);
      
    }
  }
	
  protected static class RegExpModifier {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__RegExpModifier__iter_star__char_class___range__100_100_range__105_105_range__109_109_range__115_115_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new ListStackNode(3910, 0, regular__iter_star__char_class___range__100_100_range__105_105_range__109_109_range__115_115, new CharStackNode(3912, 0, new char[][]{{100,100},{105,105},{109,109},{115,115}}, null, null), false, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RegExpModifier__iter_star__char_class___range__100_100_range__105_105_range__109_109_range__115_115_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__RegExpModifier__iter_star__char_class___range__100_100_range__105_105_range__109_109_range__115_115_(builder);
      
    }
  }
	
  protected static class layouts_$BACKTICKS {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__layouts_$BACKTICKS__(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new EpsilonStackNode(3924, 0);
      builder.addAlternative(ObjectRascalRascal.prod__layouts_$BACKTICKS__, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__layouts_$BACKTICKS__(builder);
      
    }
  }
	
  protected static class Assoc {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Associative_Assoc__lit_assoc_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3926, 0, prod__lit_assoc__char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__111_111_char_class___range__99_99_, new char[] {97,115,115,111,99}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Associative_Assoc__lit_assoc_, tmp);
	}
    protected static final void _init_prod__Left_Assoc__lit_left_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3928, 0, prod__lit_left__char_class___range__108_108_char_class___range__101_101_char_class___range__102_102_char_class___range__116_116_, new char[] {108,101,102,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Left_Assoc__lit_left_, tmp);
	}
    protected static final void _init_prod__NonAssociative_Assoc__lit_non_assoc_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3930, 0, prod__lit_non_assoc__char_class___range__110_110_char_class___range__111_111_char_class___range__110_110_char_class___range__45_45_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__111_111_char_class___range__99_99_, new char[] {110,111,110,45,97,115,115,111,99}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NonAssociative_Assoc__lit_non_assoc_, tmp);
	}
    protected static final void _init_prod__Right_Assoc__lit_right_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(3932, 0, prod__lit_right__char_class___range__114_114_char_class___range__105_105_char_class___range__103_103_char_class___range__104_104_char_class___range__116_116_, new char[] {114,105,103,104,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Right_Assoc__lit_right_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Associative_Assoc__lit_assoc_(builder);
      
        _init_prod__Left_Assoc__lit_left_(builder);
      
        _init_prod__NonAssociative_Assoc__lit_non_assoc_(builder);
      
        _init_prod__Right_Assoc__lit_right_(builder);
      
    }
  }
	
  protected static class Replacement {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Unconditional_Replacement__replacementExpression_Expression_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(3934, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Unconditional_Replacement__replacementExpression_Expression_, tmp);
	}
    protected static final void _init_prod__Conditional_Replacement__replacementExpression_Expression_layouts_LAYOUTLIST_lit_when_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new SeparatedListStackNode(3944, 4, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(3946, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(3948, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(3950, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(3952, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[3] = new NonTerminalStackNode(3942, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(3940, 2, prod__lit_when__char_class___range__119_119_char_class___range__104_104_char_class___range__101_101_char_class___range__110_110_, new char[] {119,104,101,110}, null, null);
      tmp[1] = new NonTerminalStackNode(3938, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(3936, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Conditional_Replacement__replacementExpression_Expression_layouts_LAYOUTLIST_lit_when_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Unconditional_Replacement__replacementExpression_Expression_(builder);
      
        _init_prod__Conditional_Replacement__replacementExpression_Expression_layouts_LAYOUTLIST_lit_when_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class DataTarget {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Empty_DataTarget__(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new EpsilonStackNode(4002, 0);
      builder.addAlternative(ObjectRascalRascal.prod__Empty_DataTarget__, tmp);
	}
    protected static final void _init_prod__Labeled_DataTarget__label_Name_layouts_LAYOUTLIST_lit___58_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(4008, 2, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[1] = new NonTerminalStackNode(4006, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(4004, 0, "Name", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Labeled_DataTarget__label_Name_layouts_LAYOUTLIST_lit___58_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Empty_DataTarget__(builder);
      
        _init_prod__Labeled_DataTarget__label_Name_layouts_LAYOUTLIST_lit___58_(builder);
      
    }
  }
	
  protected static class layouts_$default$ {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__layouts_$default$__(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new EpsilonStackNode(4010, 0);
      builder.addAlternative(ObjectRascalRascal.prod__layouts_$default$__, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__layouts_$default$__(builder);
      
    }
  }
	
  protected static class RealLiteral {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__RealLiteral__conditional__lit___46__not_precede__char_class___range__46_46_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new OptionalStackNode(4018, 2, regular__opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102, new CharStackNode(4020, 0, new char[][]{{68,68},{70,70},{100,100},{102,102}}, null, null), null, null);
      tmp[1] = new ListStackNode(4014, 1, regular__iter__char_class___range__48_57, new CharStackNode(4016, 0, new char[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new LiteralStackNode(4012, 0, prod__lit___46__char_class___range__46_46_, new char[] {46}, new IEnterFilter[] {new CharPrecedeRestriction(new char[][]{{46,46}})}, null);
      builder.addAlternative(ObjectRascalRascal.prod__RealLiteral__conditional__lit___46__not_precede__char_class___range__46_46_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_, tmp);
	}
    protected static final void _init_prod__RealLiteral__iter__char_class___range__48_57_lit___46_iter_star__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[0] = new ListStackNode(4022, 0, regular__iter__char_class___range__48_57, new CharStackNode(4024, 0, new char[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode(4026, 1, prod__lit___46__char_class___range__46_46_, new char[] {46}, null, null);
      tmp[2] = new ListStackNode(4028, 2, regular__iter_star__char_class___range__48_57, new CharStackNode(4030, 0, new char[][]{{48,57}}, null, null), false, null, null);
      tmp[3] = new CharStackNode(4032, 3, new char[][]{{69,69},{101,101}}, null, null);
      tmp[4] = new OptionalStackNode(4034, 4, regular__opt__char_class___range__43_43_range__45_45, new CharStackNode(4036, 0, new char[][]{{43,43},{45,45}}, null, null), null, null);
      tmp[5] = new ListStackNode(4038, 5, regular__iter__char_class___range__48_57, new CharStackNode(4040, 0, new char[][]{{48,57}}, null, null), true, null, null);
      tmp[6] = new OptionalStackNode(4042, 6, regular__opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102, new CharStackNode(4044, 0, new char[][]{{68,68},{70,70},{100,100},{102,102}}, null, null), null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RealLiteral__iter__char_class___range__48_57_lit___46_iter_star__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_, tmp);
	}
    protected static final void _init_prod__RealLiteral__iter__char_class___range__48_57_conditional__lit___46__not_follow__lit___46_iter_star__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[4];
      
      tmp[3] = new OptionalStackNode(4076, 3, regular__opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102, new CharStackNode(4078, 0, new char[][]{{68,68},{70,70},{100,100},{102,102}}, null, null), null, null);
      tmp[2] = new ListStackNode(4072, 2, regular__iter_star__char_class___range__48_57, new CharStackNode(4074, 0, new char[][]{{48,57}}, null, null), false, null, null);
      tmp[1] = new LiteralStackNode(4070, 1, prod__lit___46__char_class___range__46_46_, new char[] {46}, null, new ICompletionFilter[] {new StringFollowRestriction(new char[] {46})});
      tmp[0] = new ListStackNode(4066, 0, regular__iter__char_class___range__48_57, new CharStackNode(4068, 0, new char[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RealLiteral__iter__char_class___range__48_57_conditional__lit___46__not_follow__lit___46_iter_star__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_, tmp);
	}
    protected static final void _init_prod__RealLiteral__conditional__lit___46__not_precede__char_class___range__46_46_iter__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[6];
      
      tmp[5] = new OptionalStackNode(4062, 5, regular__opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102, new CharStackNode(4064, 0, new char[][]{{68,68},{70,70},{100,100},{102,102}}, null, null), null, null);
      tmp[4] = new ListStackNode(4058, 4, regular__iter__char_class___range__48_57, new CharStackNode(4060, 0, new char[][]{{48,57}}, null, null), true, null, null);
      tmp[3] = new OptionalStackNode(4054, 3, regular__opt__char_class___range__43_43_range__45_45, new CharStackNode(4056, 0, new char[][]{{43,43},{45,45}}, null, null), null, null);
      tmp[2] = new CharStackNode(4052, 2, new char[][]{{69,69},{101,101}}, null, null);
      tmp[1] = new ListStackNode(4048, 1, regular__iter__char_class___range__48_57, new CharStackNode(4050, 0, new char[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new LiteralStackNode(4046, 0, prod__lit___46__char_class___range__46_46_, new char[] {46}, new IEnterFilter[] {new CharPrecedeRestriction(new char[][]{{46,46}})}, null);
      builder.addAlternative(ObjectRascalRascal.prod__RealLiteral__conditional__lit___46__not_precede__char_class___range__46_46_iter__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_, tmp);
	}
    protected static final void _init_prod__RealLiteral__iter__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new OptionalStackNode(4094, 4, regular__opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102, new CharStackNode(4096, 0, new char[][]{{68,68},{70,70},{100,100},{102,102}}, null, null), null, null);
      tmp[3] = new ListStackNode(4090, 3, regular__iter__char_class___range__48_57, new CharStackNode(4092, 0, new char[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new OptionalStackNode(4086, 2, regular__opt__char_class___range__43_43_range__45_45, new CharStackNode(4088, 0, new char[][]{{43,43},{45,45}}, null, null), null, null);
      tmp[1] = new CharStackNode(4084, 1, new char[][]{{69,69},{101,101}}, null, null);
      tmp[0] = new ListStackNode(4080, 0, regular__iter__char_class___range__48_57, new CharStackNode(4082, 0, new char[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RealLiteral__iter__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_, tmp);
	}
    protected static final void _init_prod__RealLiteral__iter__char_class___range__48_57_char_class___range__68_68_range__70_70_range__100_100_range__102_102_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[2];
      
      tmp[1] = new CharStackNode(4102, 1, new char[][]{{68,68},{70,70},{100,100},{102,102}}, null, null);
      tmp[0] = new ListStackNode(4098, 0, regular__iter__char_class___range__48_57, new CharStackNode(4100, 0, new char[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RealLiteral__iter__char_class___range__48_57_char_class___range__68_68_range__70_70_range__100_100_range__102_102_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__RealLiteral__conditional__lit___46__not_precede__char_class___range__46_46_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_(builder);
      
        _init_prod__RealLiteral__iter__char_class___range__48_57_lit___46_iter_star__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_(builder);
      
        _init_prod__RealLiteral__iter__char_class___range__48_57_conditional__lit___46__not_follow__lit___46_iter_star__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_(builder);
      
        _init_prod__RealLiteral__conditional__lit___46__not_precede__char_class___range__46_46_iter__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_(builder);
      
        _init_prod__RealLiteral__iter__char_class___range__48_57_char_class___range__69_69_range__101_101_opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_opt__char_class___range__68_68_range__70_70_range__100_100_range__102_102_(builder);
      
        _init_prod__RealLiteral__iter__char_class___range__48_57_char_class___range__68_68_range__70_70_range__100_100_range__102_102_(builder);
      
    }
  }
	
  protected static class layouts_LAYOUTLIST {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__layouts_LAYOUTLIST__conditional__iter_star__LAYOUT__not_follow__char_class___range__9_10_range__13_13_range__32_32_not_follow__lit___47_47_not_follow__lit___47_42_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new ListStackNode(4142, 0, regular__iter_star__LAYOUT, new NonTerminalStackNode(4144, 0, "LAYOUT", null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{9,10},{13,13},{32,32}}), new StringFollowRestriction(new char[] {47,47}), new StringFollowRestriction(new char[] {47,42})});
      builder.addAlternative(ObjectRascalRascal.prod__layouts_LAYOUTLIST__conditional__iter_star__LAYOUT__not_follow__char_class___range__9_10_range__13_13_range__32_32_not_follow__lit___47_47_not_follow__lit___47_42_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__layouts_LAYOUTLIST__conditional__iter_star__LAYOUT__not_follow__char_class___range__9_10_range__13_13_range__32_32_not_follow__lit___47_47_not_follow__lit___47_42_(builder);
      
    }
  }
	
  protected static class StringCharacter {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__StringCharacter__OctalEscapeSequence_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(4154, 0, "OctalEscapeSequence", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__StringCharacter__OctalEscapeSequence_, tmp);
	}
    protected static final void _init_prod__StringCharacter__lit___92_char_class___range__34_34_range__39_39_range__60_60_range__62_62_range__92_92_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[2];
      
      tmp[1] = new CharStackNode(4158, 1, new char[][]{{34,34},{39,39},{60,60},{62,62},{92,92},{98,98},{102,102},{110,110},{114,114},{116,116}}, null, null);
      tmp[0] = new LiteralStackNode(4156, 0, prod__lit___92__char_class___range__92_92_, new char[] {92}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__StringCharacter__lit___92_char_class___range__34_34_range__39_39_range__60_60_range__62_62_range__92_92_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116_, tmp);
	}
    protected static final void _init_prod__StringCharacter__UnicodeEscape_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(4160, 0, "UnicodeEscape", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__StringCharacter__UnicodeEscape_, tmp);
	}
    protected static final void _init_prod__StringCharacter__char_class___range__0_33_range__35_38_range__40_59_range__61_61_range__63_91_range__93_65535_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode(4162, 0, new char[][]{{0,33},{35,38},{40,59},{61,61},{63,91},{93,65535}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__StringCharacter__char_class___range__0_33_range__35_38_range__40_59_range__61_61_range__63_91_range__93_65535_, tmp);
	}
    protected static final void _init_prod__StringCharacter__char_class___range__10_10_iter_star__char_class___range__9_9_range__32_32_char_class___range__39_39_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode(4170, 2, new char[][]{{39,39}}, null, null);
      tmp[1] = new ListStackNode(4166, 1, regular__iter_star__char_class___range__9_9_range__32_32, new CharStackNode(4168, 0, new char[][]{{9,9},{32,32}}, null, null), false, null, null);
      tmp[0] = new CharStackNode(4164, 0, new char[][]{{10,10}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__StringCharacter__char_class___range__10_10_iter_star__char_class___range__9_9_range__32_32_char_class___range__39_39_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__StringCharacter__OctalEscapeSequence_(builder);
      
        _init_prod__StringCharacter__lit___92_char_class___range__34_34_range__39_39_range__60_60_range__62_62_range__92_92_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116_(builder);
      
        _init_prod__StringCharacter__UnicodeEscape_(builder);
      
        _init_prod__StringCharacter__char_class___range__0_33_range__35_38_range__40_59_range__61_61_range__63_91_range__93_65535_(builder);
      
        _init_prod__StringCharacter__char_class___range__10_10_iter_star__char_class___range__9_9_range__32_32_char_class___range__39_39_(builder);
      
    }
  }
	
  protected static class JustTime {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__JustTime__lit___36_84_TimePartNoTZ_opt__TimeZonePart_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new OptionalStackNode(4176, 2, regular__opt__TimeZonePart, new NonTerminalStackNode(4178, 0, "TimeZonePart", null, null), null, null);
      tmp[1] = new NonTerminalStackNode(4174, 1, "TimePartNoTZ", null, null);
      tmp[0] = new LiteralStackNode(4172, 0, prod__lit___36_84__char_class___range__36_36_char_class___range__84_84_, new char[] {36,84}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__JustTime__lit___36_84_TimePartNoTZ_opt__TimeZonePart_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__JustTime__lit___36_84_TimePartNoTZ_opt__TimeZonePart_(builder);
      
    }
  }
	
  protected static class Rest {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Rest__conditional__iter_star__char_class___range__0_65535__not_follow__char_class___range__0_65535_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new ListStackNode(4190, 0, regular__iter_star__char_class___range__0_65535, new CharStackNode(4192, 0, new char[][]{{0,65535}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{0,65535}})});
      builder.addAlternative(ObjectRascalRascal.prod__Rest__conditional__iter_star__char_class___range__0_65535__not_follow__char_class___range__0_65535_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Rest__conditional__iter_star__char_class___range__0_65535__not_follow__char_class___range__0_65535_(builder);
      
    }
  }
	
  protected static class Range {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__FromTo_Range__start_Char_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_end_Char_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(4202, 4, "Char", null, null);
      tmp[3] = new NonTerminalStackNode(4200, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(4198, 2, prod__lit____char_class___range__45_45_, new char[] {45}, null, null);
      tmp[1] = new NonTerminalStackNode(4196, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(4194, 0, "Char", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__FromTo_Range__start_Char_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_end_Char_, tmp);
	}
    protected static final void _init_prod__Character_Range__character_Char_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(4204, 0, "Char", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Character_Range__character_Char_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__FromTo_Range__start_Char_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_end_Char_(builder);
      
        _init_prod__Character_Range__character_Char_(builder);
      
    }
  }
	
  protected static class LocationLiteral {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_LocationLiteral__protocolPart_ProtocolPart_layouts_LAYOUTLIST_pathPart_PathPart_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(4210, 2, "PathPart", null, null);
      tmp[1] = new NonTerminalStackNode(4208, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(4206, 0, "ProtocolPart", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_LocationLiteral__protocolPart_ProtocolPart_layouts_LAYOUTLIST_pathPart_PathPart_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_LocationLiteral__protocolPart_ProtocolPart_layouts_LAYOUTLIST_pathPart_PathPart_(builder);
      
    }
  }
	
  protected static class ShellCommand {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__ListDeclarations_ShellCommand__lit_declarations_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(4212, 0, prod__lit_declarations__char_class___range__100_100_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_, new char[] {100,101,99,108,97,114,97,116,105,111,110,115}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__ListDeclarations_ShellCommand__lit_declarations_, tmp);
	}
    protected static final void _init_prod__Test_ShellCommand__lit_test_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(4214, 0, prod__lit_test__char_class___range__116_116_char_class___range__101_101_char_class___range__115_115_char_class___range__116_116_, new char[] {116,101,115,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Test_ShellCommand__lit_test_, tmp);
	}
    protected static final void _init_prod__ListModules_ShellCommand__lit_modules_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(4216, 0, prod__lit_modules__char_class___range__109_109_char_class___range__111_111_char_class___range__100_100_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_char_class___range__115_115_, new char[] {109,111,100,117,108,101,115}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__ListModules_ShellCommand__lit_modules_, tmp);
	}
    protected static final void _init_prod__SetOption_ShellCommand__lit_set_layouts_LAYOUTLIST_name_QualifiedName_layouts_LAYOUTLIST_expression_Expression_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(4226, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(4224, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4222, 2, "QualifiedName", null, null);
      tmp[1] = new NonTerminalStackNode(4220, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4218, 0, prod__lit_set__char_class___range__115_115_char_class___range__101_101_char_class___range__116_116_, new char[] {115,101,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__SetOption_ShellCommand__lit_set_layouts_LAYOUTLIST_name_QualifiedName_layouts_LAYOUTLIST_expression_Expression_, tmp);
	}
    protected static final void _init_prod__Edit_ShellCommand__lit_edit_layouts_LAYOUTLIST_name_QualifiedName_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(4232, 2, "QualifiedName", null, null);
      tmp[1] = new NonTerminalStackNode(4230, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4228, 0, prod__lit_edit__char_class___range__101_101_char_class___range__100_100_char_class___range__105_105_char_class___range__116_116_, new char[] {101,100,105,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Edit_ShellCommand__lit_edit_layouts_LAYOUTLIST_name_QualifiedName_, tmp);
	}
    protected static final void _init_prod__History_ShellCommand__lit_history_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(4234, 0, prod__lit_history__char_class___range__104_104_char_class___range__105_105_char_class___range__115_115_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_char_class___range__121_121_, new char[] {104,105,115,116,111,114,121}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__History_ShellCommand__lit_history_, tmp);
	}
    protected static final void _init_prod__Quit_ShellCommand__lit_quit_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(4236, 0, prod__lit_quit__char_class___range__113_113_char_class___range__117_117_char_class___range__105_105_char_class___range__116_116_, new char[] {113,117,105,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Quit_ShellCommand__lit_quit_, tmp);
	}
    protected static final void _init_prod__Undeclare_ShellCommand__lit_undeclare_layouts_LAYOUTLIST_name_QualifiedName_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(4242, 2, "QualifiedName", null, null);
      tmp[1] = new NonTerminalStackNode(4240, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4238, 0, prod__lit_undeclare__char_class___range__117_117_char_class___range__110_110_char_class___range__100_100_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__101_101_, new char[] {117,110,100,101,99,108,97,114,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Undeclare_ShellCommand__lit_undeclare_layouts_LAYOUTLIST_name_QualifiedName_, tmp);
	}
    protected static final void _init_prod__Help_ShellCommand__lit_help_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(4244, 0, prod__lit_help__char_class___range__104_104_char_class___range__101_101_char_class___range__108_108_char_class___range__112_112_, new char[] {104,101,108,112}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Help_ShellCommand__lit_help_, tmp);
	}
    protected static final void _init_prod__Unimport_ShellCommand__lit_unimport_layouts_LAYOUTLIST_name_QualifiedName_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(4250, 2, "QualifiedName", null, null);
      tmp[1] = new NonTerminalStackNode(4248, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4246, 0, prod__lit_unimport__char_class___range__117_117_char_class___range__110_110_char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_, new char[] {117,110,105,109,112,111,114,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Unimport_ShellCommand__lit_unimport_layouts_LAYOUTLIST_name_QualifiedName_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__ListDeclarations_ShellCommand__lit_declarations_(builder);
      
        _init_prod__Test_ShellCommand__lit_test_(builder);
      
        _init_prod__ListModules_ShellCommand__lit_modules_(builder);
      
        _init_prod__SetOption_ShellCommand__lit_set_layouts_LAYOUTLIST_name_QualifiedName_layouts_LAYOUTLIST_expression_Expression_(builder);
      
        _init_prod__Edit_ShellCommand__lit_edit_layouts_LAYOUTLIST_name_QualifiedName_(builder);
      
        _init_prod__History_ShellCommand__lit_history_(builder);
      
        _init_prod__Quit_ShellCommand__lit_quit_(builder);
      
        _init_prod__Undeclare_ShellCommand__lit_undeclare_layouts_LAYOUTLIST_name_QualifiedName_(builder);
      
        _init_prod__Help_ShellCommand__lit_help_(builder);
      
        _init_prod__Unimport_ShellCommand__lit_unimport_layouts_LAYOUTLIST_name_QualifiedName_(builder);
      
    }
  }
	
  protected static class StringMiddle {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Mid_StringMiddle__mid_MidStringChars_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(4256, 0, "MidStringChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Mid_StringMiddle__mid_MidStringChars_, tmp);
	}
    protected static final void _init_prod__Interpolated_StringMiddle__mid_MidStringChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_StringMiddle_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(4266, 4, "StringMiddle", null, null);
      tmp[3] = new NonTerminalStackNode(4264, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4262, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(4260, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(4258, 0, "MidStringChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Interpolated_StringMiddle__mid_MidStringChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_StringMiddle_, tmp);
	}
    protected static final void _init_prod__Template_StringMiddle__mid_MidStringChars_layouts_LAYOUTLIST_template_StringTemplate_layouts_LAYOUTLIST_tail_StringMiddle_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(4276, 4, "StringMiddle", null, null);
      tmp[3] = new NonTerminalStackNode(4274, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4272, 2, "StringTemplate", null, null);
      tmp[1] = new NonTerminalStackNode(4270, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(4268, 0, "MidStringChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Template_StringMiddle__mid_MidStringChars_layouts_LAYOUTLIST_template_StringTemplate_layouts_LAYOUTLIST_tail_StringMiddle_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Mid_StringMiddle__mid_MidStringChars_(builder);
      
        _init_prod__Interpolated_StringMiddle__mid_MidStringChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_StringMiddle_(builder);
      
        _init_prod__Template_StringMiddle__mid_MidStringChars_layouts_LAYOUTLIST_template_StringTemplate_layouts_LAYOUTLIST_tail_StringMiddle_(builder);
      
    }
  }
	
  protected static class URLChars {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__URLChars__iter_star__char_class___range__0_8_range__11_12_range__14_31_range__33_59_range__61_123_range__125_65535_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new ListStackNode(4252, 0, regular__iter_star__char_class___range__0_8_range__11_12_range__14_31_range__33_59_range__61_123_range__125_65535, new CharStackNode(4254, 0, new char[][]{{0,8},{11,12},{14,31},{33,59},{61,123},{125,65535}}, null, null), false, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__URLChars__iter_star__char_class___range__0_8_range__11_12_range__14_31_range__33_59_range__61_123_range__125_65535_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__URLChars__iter_star__char_class___range__0_8_range__11_12_range__14_31_range__33_59_range__61_123_range__125_65535_(builder);
      
    }
  }
	
  protected static class QualifiedName {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_QualifiedName__conditional__names_iter_seps__Name__layouts_LAYOUTLIST_lit___58_58_layouts_LAYOUTLIST__not_follow__lit___58_58_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode(4278, 0, regular__iter_seps__Name__layouts_LAYOUTLIST_lit___58_58_layouts_LAYOUTLIST, new NonTerminalStackNode(4280, 0, "Name", null, null), new AbstractStackNode[]{new NonTerminalStackNode(4282, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(4284, 2, prod__lit___58_58__char_class___range__58_58_char_class___range__58_58_, new char[] {58,58}, null, null), new NonTerminalStackNode(4286, 3, "layouts_LAYOUTLIST", null, null)}, true, null, new ICompletionFilter[] {new StringFollowRestriction(new char[] {58,58})});
      builder.addAlternative(ObjectRascalRascal.prod__Default_QualifiedName__conditional__names_iter_seps__Name__layouts_LAYOUTLIST_lit___58_58_layouts_LAYOUTLIST__not_follow__lit___58_58_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_QualifiedName__conditional__names_iter_seps__Name__layouts_LAYOUTLIST_lit___58_58_layouts_LAYOUTLIST__not_follow__lit___58_58_(builder);
      
    }
  }
	
  protected static class TimeZonePart {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__TimeZonePart__char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[6];
      
      tmp[5] = new CharStackNode(4298, 5, new char[][]{{48,57}}, null, null);
      tmp[4] = new CharStackNode(4296, 4, new char[][]{{48,53}}, null, null);
      tmp[3] = new LiteralStackNode(4294, 3, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[2] = new CharStackNode(4292, 2, new char[][]{{48,57}}, null, null);
      tmp[1] = new CharStackNode(4290, 1, new char[][]{{48,49}}, null, null);
      tmp[0] = new CharStackNode(4288, 0, new char[][]{{43,43},{45,45}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__TimeZonePart__char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_, tmp);
	}
    protected static final void _init_prod__TimeZonePart__char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode(4308, 4, new char[][]{{48,57}}, null, null);
      tmp[3] = new CharStackNode(4306, 3, new char[][]{{48,53}}, null, null);
      tmp[2] = new CharStackNode(4304, 2, new char[][]{{48,57}}, null, null);
      tmp[1] = new CharStackNode(4302, 1, new char[][]{{48,49}}, null, null);
      tmp[0] = new CharStackNode(4300, 0, new char[][]{{43,43},{45,45}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__TimeZonePart__char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_, tmp);
	}
    protected static final void _init_prod__TimeZonePart__char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode(4314, 2, new char[][]{{48,57}}, null, null);
      tmp[1] = new CharStackNode(4312, 1, new char[][]{{48,49}}, null, null);
      tmp[0] = new CharStackNode(4310, 0, new char[][]{{43,43},{45,45}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__TimeZonePart__char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_, tmp);
	}
    protected static final void _init_prod__TimeZonePart__lit_Z_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(4316, 0, prod__lit_Z__char_class___range__90_90_, new char[] {90}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__TimeZonePart__lit_Z_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__TimeZonePart__char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_lit___58_char_class___range__48_53_char_class___range__48_57_(builder);
      
        _init_prod__TimeZonePart__char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_char_class___range__48_53_char_class___range__48_57_(builder);
      
        _init_prod__TimeZonePart__char_class___range__43_43_range__45_45_char_class___range__48_49_char_class___range__48_57_(builder);
      
        _init_prod__TimeZonePart__lit_Z_(builder);
      
    }
  }
	
  protected static class PreStringChars {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__PreStringChars__char_class___range__34_34_iter_star__StringCharacter_char_class___range__60_60__tag__category___67_111_110_115_116_97_110_116(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode(4332, 2, new char[][]{{60,60}}, null, null);
      tmp[1] = new ListStackNode(4328, 1, regular__iter_star__StringCharacter, new NonTerminalStackNode(4330, 0, "StringCharacter", null, null), false, null, null);
      tmp[0] = new CharStackNode(4326, 0, new char[][]{{34,34}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__PreStringChars__char_class___range__34_34_iter_star__StringCharacter_char_class___range__60_60__tag__category___67_111_110_115_116_97_110_116, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__PreStringChars__char_class___range__34_34_iter_star__StringCharacter_char_class___range__60_60__tag__category___67_111_110_115_116_97_110_116(builder);
      
    }
  }
	
  protected static class Visit {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__GivenStrategy_Visit__strategy_Strategy_layouts_LAYOUTLIST_lit_visit_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_subject_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_cases_iter_seps__Case__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[15];
      
      tmp[14] = new LiteralStackNode(4406, 14, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[13] = new NonTerminalStackNode(4404, 13, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new SeparatedListStackNode(4398, 12, regular__iter_seps__Case__layouts_LAYOUTLIST, new NonTerminalStackNode(4400, 0, "Case", null, null), new AbstractStackNode[]{new NonTerminalStackNode(4402, 1, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[11] = new NonTerminalStackNode(4396, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode(4394, 10, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      tmp[9] = new NonTerminalStackNode(4392, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(4390, 8, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[7] = new NonTerminalStackNode(4388, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(4386, 6, "Expression", null, null);
      tmp[5] = new NonTerminalStackNode(4384, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(4382, 4, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[3] = new NonTerminalStackNode(4380, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(4378, 2, prod__lit_visit__char_class___range__118_118_char_class___range__105_105_char_class___range__115_115_char_class___range__105_105_char_class___range__116_116_, new char[] {118,105,115,105,116}, null, null);
      tmp[1] = new NonTerminalStackNode(4376, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(4374, 0, "Strategy", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__GivenStrategy_Visit__strategy_Strategy_layouts_LAYOUTLIST_lit_visit_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_subject_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_cases_iter_seps__Case__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__DefaultStrategy_Visit__lit_visit_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_subject_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_cases_iter_seps__Case__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[13];
      
      tmp[12] = new LiteralStackNode(4436, 12, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[11] = new NonTerminalStackNode(4434, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new SeparatedListStackNode(4428, 10, regular__iter_seps__Case__layouts_LAYOUTLIST, new NonTerminalStackNode(4430, 0, "Case", null, null), new AbstractStackNode[]{new NonTerminalStackNode(4432, 1, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[9] = new NonTerminalStackNode(4426, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(4424, 8, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      tmp[7] = new NonTerminalStackNode(4422, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(4420, 6, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[5] = new NonTerminalStackNode(4418, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(4416, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(4414, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(4412, 2, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[1] = new NonTerminalStackNode(4410, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4408, 0, prod__lit_visit__char_class___range__118_118_char_class___range__105_105_char_class___range__115_115_char_class___range__105_105_char_class___range__116_116_, new char[] {118,105,115,105,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__DefaultStrategy_Visit__lit_visit_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_subject_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_cases_iter_seps__Case__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__GivenStrategy_Visit__strategy_Strategy_layouts_LAYOUTLIST_lit_visit_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_subject_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_cases_iter_seps__Case__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__DefaultStrategy_Visit__lit_visit_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_subject_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_cases_iter_seps__Case__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
    }
  }
	
  protected static class Command {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Declaration_Command__declaration_Declaration_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(4360, 0, "Declaration", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Declaration_Command__declaration_Declaration_, tmp);
	}
    protected static final void _init_prod__Statement_Command__statement_Statement_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(4362, 0, "Statement", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Statement_Command__statement_Statement_, tmp);
	}
    protected static final void _init_prod__Expression_Command__expression_Expression_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(4364, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Expression_Command__expression_Expression_, tmp);
	}
    protected static final void _init_prod__Import_Command__imported_Import_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(4366, 0, "Import", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Import_Command__imported_Import_, tmp);
	}
    protected static final void _init_prod__Shell_Command__lit___58_layouts_LAYOUTLIST_command_ShellCommand_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(4372, 2, "ShellCommand", null, null);
      tmp[1] = new NonTerminalStackNode(4370, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4368, 0, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Shell_Command__lit___58_layouts_LAYOUTLIST_command_ShellCommand_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Declaration_Command__declaration_Declaration_(builder);
      
        _init_prod__Statement_Command__statement_Statement_(builder);
      
        _init_prod__Expression_Command__expression_Expression_(builder);
      
        _init_prod__Import_Command__imported_Import_(builder);
      
        _init_prod__Shell_Command__lit___58_layouts_LAYOUTLIST_command_ShellCommand_(builder);
      
    }
  }
	
  protected static class ProtocolTail {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Post_ProtocolTail__post_PostProtocolChars_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(4448, 0, "PostProtocolChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Post_ProtocolTail__post_PostProtocolChars_, tmp);
	}
    protected static final void _init_prod__Mid_ProtocolTail__mid_MidProtocolChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_ProtocolTail_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(4458, 4, "ProtocolTail", null, null);
      tmp[3] = new NonTerminalStackNode(4456, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4454, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(4452, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(4450, 0, "MidProtocolChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Mid_ProtocolTail__mid_MidProtocolChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_ProtocolTail_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Post_ProtocolTail__post_PostProtocolChars_(builder);
      
        _init_prod__Mid_ProtocolTail__mid_MidProtocolChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_ProtocolTail_(builder);
      
    }
  }
	
  protected static class NamedBackslash {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__NamedBackslash__conditional__char_class___range__92_92__not_follow__char_class___range__60_60_range__62_62_range__92_92_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode(4494, 0, new char[][]{{92,92}}, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{60,60},{62,62},{92,92}})});
      builder.addAlternative(ObjectRascalRascal.prod__NamedBackslash__conditional__char_class___range__92_92__not_follow__char_class___range__60_60_range__62_62_range__92_92_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__NamedBackslash__conditional__char_class___range__92_92__not_follow__char_class___range__60_60_range__62_62_range__92_92_(builder);
      
    }
  }
	
  protected static class Visibility {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Private_Visibility__lit_private_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(4496, 0, prod__lit_private__char_class___range__112_112_char_class___range__114_114_char_class___range__105_105_char_class___range__118_118_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_, new char[] {112,114,105,118,97,116,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Private_Visibility__lit_private_, tmp);
	}
    protected static final void _init_prod__Default_Visibility__(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new EpsilonStackNode(4498, 0);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Visibility__, tmp);
	}
    protected static final void _init_prod__Public_Visibility__lit_public_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(4500, 0, prod__lit_public__char_class___range__112_112_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__105_105_char_class___range__99_99_, new char[] {112,117,98,108,105,99}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Public_Visibility__lit_public_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Private_Visibility__lit_private_(builder);
      
        _init_prod__Default_Visibility__(builder);
      
        _init_prod__Public_Visibility__lit_public_(builder);
      
    }
  }
	
  protected static class PostPathChars {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__PostPathChars__lit___62_URLChars_lit___124_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(4506, 2, prod__lit___124__char_class___range__124_124_, new char[] {124}, null, null);
      tmp[1] = new NonTerminalStackNode(4504, 1, "URLChars", null, null);
      tmp[0] = new LiteralStackNode(4502, 0, prod__lit___62__char_class___range__62_62_, new char[] {62}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__PostPathChars__lit___62_URLChars_lit___124_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__PostPathChars__lit___62_URLChars_lit___124_(builder);
      
    }
  }
	
  protected static class StringLiteral {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Interpolated_StringLiteral__pre_PreStringChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_StringTail_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(4516, 4, "StringTail", null, null);
      tmp[3] = new NonTerminalStackNode(4514, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4512, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(4510, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(4508, 0, "PreStringChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Interpolated_StringLiteral__pre_PreStringChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_StringTail_, tmp);
	}
    protected static final void _init_prod__Template_StringLiteral__pre_PreStringChars_layouts_LAYOUTLIST_template_StringTemplate_layouts_LAYOUTLIST_tail_StringTail_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(4526, 4, "StringTail", null, null);
      tmp[3] = new NonTerminalStackNode(4524, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4522, 2, "StringTemplate", null, null);
      tmp[1] = new NonTerminalStackNode(4520, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(4518, 0, "PreStringChars", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Template_StringLiteral__pre_PreStringChars_layouts_LAYOUTLIST_template_StringTemplate_layouts_LAYOUTLIST_tail_StringTail_, tmp);
	}
    protected static final void _init_prod__NonInterpolated_StringLiteral__constant_StringConstant_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(4528, 0, "StringConstant", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NonInterpolated_StringLiteral__constant_StringConstant_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Interpolated_StringLiteral__pre_PreStringChars_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_tail_StringTail_(builder);
      
        _init_prod__Template_StringLiteral__pre_PreStringChars_layouts_LAYOUTLIST_template_StringTemplate_layouts_LAYOUTLIST_tail_StringTail_(builder);
      
        _init_prod__NonInterpolated_StringLiteral__constant_StringConstant_(builder);
      
    }
  }
	
  protected static class Renamings {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_Renamings__lit_renaming_layouts_LAYOUTLIST_renamings_iter_seps__Renaming__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new SeparatedListStackNode(4572, 2, regular__iter_seps__Renaming__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(4574, 0, "Renaming", null, null), new AbstractStackNode[]{new NonTerminalStackNode(4576, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(4578, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(4580, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[1] = new NonTerminalStackNode(4570, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4568, 0, prod__lit_renaming__char_class___range__114_114_char_class___range__101_101_char_class___range__110_110_char_class___range__97_97_char_class___range__109_109_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_, new char[] {114,101,110,97,109,105,110,103}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Renamings__lit_renaming_layouts_LAYOUTLIST_renamings_iter_seps__Renaming__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_Renamings__lit_renaming_layouts_LAYOUTLIST_renamings_iter_seps__Renaming__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class layouts_$QUOTES {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__layouts_$QUOTES__conditional__iter_star__char_class___range__9_10_range__13_13_range__32_32__not_follow__char_class___range__9_10_range__13_13_range__32_32_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new ListStackNode(4586, 0, regular__iter_star__char_class___range__9_10_range__13_13_range__32_32, new CharStackNode(4588, 0, new char[][]{{9,10},{13,13},{32,32}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{9,10},{13,13},{32,32}})});
      builder.addAlternative(ObjectRascalRascal.prod__layouts_$QUOTES__conditional__iter_star__char_class___range__9_10_range__13_13_range__32_32__not_follow__char_class___range__9_10_range__13_13_range__32_32_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__layouts_$QUOTES__conditional__iter_star__char_class___range__9_10_range__13_13_range__32_32__not_follow__char_class___range__9_10_range__13_13_range__32_32_(builder);
      
    }
  }
	
  protected static class Statement {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Expression_Statement__expression_Expression_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(4628, 2, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[1] = new NonTerminalStackNode(4626, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(4624, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Expression_Statement__expression_Expression_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__Filter_Statement__lit_filter_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[0] = new LiteralStackNode(4630, 0, prod__lit_filter__char_class___range__102_102_char_class___range__105_105_char_class___range__108_108_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_, new char[] {102,105,108,116,101,114}, null, null);
      tmp[1] = new NonTerminalStackNode(4632, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(4634, 2, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Filter_Statement__lit_filter_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__TryFinally_Statement__lit_try_layouts_LAYOUTLIST_body_Statement_layouts_LAYOUTLIST_handlers_iter_seps__Catch__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_finallyBody_Statement_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[9];
      
      tmp[8] = new NonTerminalStackNode(4656, 8, "Statement", null, null);
      tmp[7] = new NonTerminalStackNode(4654, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(4652, 6, prod__lit_finally__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_, new char[] {102,105,110,97,108,108,121}, null, null);
      tmp[5] = new NonTerminalStackNode(4650, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(4644, 4, regular__iter_seps__Catch__layouts_LAYOUTLIST, new NonTerminalStackNode(4646, 0, "Catch", null, null), new AbstractStackNode[]{new NonTerminalStackNode(4648, 1, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[3] = new NonTerminalStackNode(4642, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4640, 2, "Statement", null, null);
      tmp[1] = new NonTerminalStackNode(4638, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4636, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new char[] {116,114,121}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__TryFinally_Statement__lit_try_layouts_LAYOUTLIST_body_Statement_layouts_LAYOUTLIST_handlers_iter_seps__Catch__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_finallyBody_Statement_, tmp);
	}
    protected static final void _init_prod__Insert_Statement__lit_insert_layouts_LAYOUTLIST_dataTarget_DataTarget_layouts_LAYOUTLIST_statement_Statement__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(4784, 4, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode(4782, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4780, 2, "DataTarget", null, null);
      tmp[1] = new NonTerminalStackNode(4778, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4776, 0, prod__lit_insert__char_class___range__105_105_char_class___range__110_110_char_class___range__115_115_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_, new char[] {105,110,115,101,114,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Insert_Statement__lit_insert_layouts_LAYOUTLIST_dataTarget_DataTarget_layouts_LAYOUTLIST_statement_Statement__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__Try_Statement__lit_try_layouts_LAYOUTLIST_body_Statement_layouts_LAYOUTLIST_handlers_iter_seps__Catch__layouts_LAYOUTLIST__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new SeparatedListStackNode(4666, 4, regular__iter_seps__Catch__layouts_LAYOUTLIST, new NonTerminalStackNode(4668, 0, "Catch", null, null), new AbstractStackNode[]{new NonTerminalStackNode(4670, 1, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[3] = new NonTerminalStackNode(4664, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4662, 2, "Statement", null, null);
      tmp[1] = new NonTerminalStackNode(4660, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4658, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new char[] {116,114,121}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Try_Statement__lit_try_layouts_LAYOUTLIST_body_Statement_layouts_LAYOUTLIST_handlers_iter_seps__Catch__layouts_LAYOUTLIST__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__Visit_Statement__label_Label_layouts_LAYOUTLIST_visit_Visit_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[0] = new NonTerminalStackNode(4674, 0, "Label", null, null);
      tmp[1] = new NonTerminalStackNode(4676, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4678, 2, "Visit", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Visit_Statement__label_Label_layouts_LAYOUTLIST_visit_Visit_, tmp);
	}
    protected static final void _init_prod__EmptyStatement_Statement__lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(4672, 0, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__EmptyStatement_Statement__lit___59_, tmp);
	}
    protected static final void _init_prod__Break_Statement__lit_break_layouts_LAYOUTLIST_target_Target_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(4688, 4, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[3] = new NonTerminalStackNode(4686, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4684, 2, "Target", null, null);
      tmp[1] = new NonTerminalStackNode(4682, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4680, 0, prod__lit_break__char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_, new char[] {98,114,101,97,107}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Break_Statement__lit_break_layouts_LAYOUTLIST_target_Target_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__Assignment_Statement__assignable_Assignable_layouts_LAYOUTLIST_operator_Assignment_layouts_LAYOUTLIST_statement_Statement_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(4698, 4, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode(4696, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4694, 2, "Assignment", null, null);
      tmp[1] = new NonTerminalStackNode(4692, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(4690, 0, "Assignable", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Assignment_Statement__assignable_Assignable_layouts_LAYOUTLIST_operator_Assignment_layouts_LAYOUTLIST_statement_Statement_, tmp);
	}
    protected static final void _init_prod__For_Statement__label_Label_layouts_LAYOUTLIST_lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_body_Statement_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[11];
      
      tmp[10] = new NonTerminalStackNode(4728, 10, "Statement", null, null);
      tmp[9] = new NonTerminalStackNode(4726, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(4724, 8, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[7] = new NonTerminalStackNode(4722, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new SeparatedListStackNode(4712, 6, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(4714, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(4716, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(4718, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(4720, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[5] = new NonTerminalStackNode(4710, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(4708, 4, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[3] = new NonTerminalStackNode(4706, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(4704, 2, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new char[] {102,111,114}, null, null);
      tmp[1] = new NonTerminalStackNode(4702, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(4700, 0, "Label", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__For_Statement__label_Label_layouts_LAYOUTLIST_lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_body_Statement_, tmp);
	}
    protected static final void _init_prod__GlobalDirective_Statement__lit_global_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_names_iter_seps__QualifiedName__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(4750, 6, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[5] = new NonTerminalStackNode(4748, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(4738, 4, regular__iter_seps__QualifiedName__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(4740, 0, "QualifiedName", null, null), new AbstractStackNode[]{new NonTerminalStackNode(4742, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(4744, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(4746, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[3] = new NonTerminalStackNode(4736, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4734, 2, "Type", null, null);
      tmp[1] = new NonTerminalStackNode(4732, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4730, 0, prod__lit_global__char_class___range__103_103_char_class___range__108_108_char_class___range__111_111_char_class___range__98_98_char_class___range__97_97_char_class___range__108_108_, new char[] {103,108,111,98,97,108}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__GlobalDirective_Statement__lit_global_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_names_iter_seps__QualifiedName__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__AssertWithMessage_Statement__lit_assert_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_message_Expression_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[9];
      
      tmp[8] = new LiteralStackNode(4768, 8, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[7] = new NonTerminalStackNode(4766, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(4764, 6, "Expression", null, null);
      tmp[5] = new NonTerminalStackNode(4762, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(4760, 4, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[3] = new NonTerminalStackNode(4758, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4756, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(4754, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4752, 0, prod__lit_assert__char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_, new char[] {97,115,115,101,114,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__AssertWithMessage_Statement__lit_assert_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_message_Expression_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__While_Statement__label_Label_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_body_Statement_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[11];
      
      tmp[10] = new NonTerminalStackNode(4830, 10, "Statement", null, null);
      tmp[9] = new NonTerminalStackNode(4828, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(4826, 8, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[7] = new NonTerminalStackNode(4824, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new SeparatedListStackNode(4814, 6, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(4816, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(4818, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(4820, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(4822, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[5] = new NonTerminalStackNode(4812, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(4810, 4, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[3] = new NonTerminalStackNode(4808, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(4806, 2, prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new char[] {119,104,105,108,101}, null, null);
      tmp[1] = new NonTerminalStackNode(4804, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(4802, 0, "Label", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__While_Statement__label_Label_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_body_Statement_, tmp);
	}
    protected static final void _init_prod__Assert_Statement__lit_assert_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(4840, 4, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[3] = new NonTerminalStackNode(4838, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4836, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(4834, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4832, 0, prod__lit_assert__char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_, new char[] {97,115,115,101,114,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Assert_Statement__lit_assert_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__FunctionDeclaration_Statement__functionDeclaration_FunctionDeclaration_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(5046, 0, "FunctionDeclaration", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__FunctionDeclaration_Statement__functionDeclaration_FunctionDeclaration_, tmp);
	}
    protected static final void _init_prod__Return_Statement__lit_return_layouts_LAYOUTLIST_statement_Statement__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(4774, 2, "Statement", null, null);
      tmp[1] = new NonTerminalStackNode(4772, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4770, 0, prod__lit_return__char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_, new char[] {114,101,116,117,114,110}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Return_Statement__lit_return_layouts_LAYOUTLIST_statement_Statement__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__Continue_Statement__lit_continue_layouts_LAYOUTLIST_target_Target_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(4850, 4, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[3] = new NonTerminalStackNode(4848, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4846, 2, "Target", null, null);
      tmp[1] = new NonTerminalStackNode(4844, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4842, 0, prod__lit_continue__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_, new char[] {99,111,110,116,105,110,117,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Continue_Statement__lit_continue_layouts_LAYOUTLIST_target_Target_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__Fail_Statement__lit_fail_layouts_LAYOUTLIST_target_Target_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(4890, 4, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[3] = new NonTerminalStackNode(4888, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4886, 2, "Target", null, null);
      tmp[1] = new NonTerminalStackNode(4884, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4882, 0, prod__lit_fail__char_class___range__102_102_char_class___range__97_97_char_class___range__105_105_char_class___range__108_108_, new char[] {102,97,105,108}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Fail_Statement__lit_fail_layouts_LAYOUTLIST_target_Target_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__Append_Statement__lit_append_layouts_LAYOUTLIST_dataTarget_DataTarget_layouts_LAYOUTLIST_statement_Statement__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(4794, 4, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode(4792, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(4790, 2, "DataTarget", null, null);
      tmp[1] = new NonTerminalStackNode(4788, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4786, 0, prod__lit_append__char_class___range__97_97_char_class___range__112_112_char_class___range__112_112_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_, new char[] {97,112,112,101,110,100}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Append_Statement__lit_append_layouts_LAYOUTLIST_dataTarget_DataTarget_layouts_LAYOUTLIST_statement_Statement__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__IfThen_Statement__label_Label_layouts_LAYOUTLIST_lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_thenStatement_Statement_layouts_LAYOUTLIST_conditional__empty__not_follow__lit_else_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[13];
      
      tmp[12] = new EmptyStackNode(4958, 12, regular__empty, null, new ICompletionFilter[] {new StringFollowRestriction(new char[] {101,108,115,101})});
      tmp[11] = new NonTerminalStackNode(4956, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new NonTerminalStackNode(4954, 10, "Statement", null, null);
      tmp[9] = new NonTerminalStackNode(4952, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(4950, 8, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[7] = new NonTerminalStackNode(4948, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new SeparatedListStackNode(4938, 6, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(4940, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(4942, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(4944, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(4946, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[5] = new NonTerminalStackNode(4936, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(4934, 4, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[3] = new NonTerminalStackNode(4932, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(4930, 2, prod__lit_if__char_class___range__105_105_char_class___range__102_102_, new char[] {105,102}, null, null);
      tmp[1] = new NonTerminalStackNode(4928, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(4926, 0, "Label", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__IfThen_Statement__label_Label_layouts_LAYOUTLIST_lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_thenStatement_Statement_layouts_LAYOUTLIST_conditional__empty__not_follow__lit_else_, tmp);
	}
    protected static final void _init_prod__Switch_Statement__label_Label_layouts_LAYOUTLIST_lit_switch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_cases_iter_seps__Case__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[15];
      
      tmp[14] = new LiteralStackNode(4924, 14, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[13] = new NonTerminalStackNode(4922, 13, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new SeparatedListStackNode(4916, 12, regular__iter_seps__Case__layouts_LAYOUTLIST, new NonTerminalStackNode(4918, 0, "Case", null, null), new AbstractStackNode[]{new NonTerminalStackNode(4920, 1, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[11] = new NonTerminalStackNode(4914, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode(4912, 10, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      tmp[9] = new NonTerminalStackNode(4910, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(4908, 8, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[7] = new NonTerminalStackNode(4906, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(4904, 6, "Expression", null, null);
      tmp[5] = new NonTerminalStackNode(4902, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(4900, 4, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[3] = new NonTerminalStackNode(4898, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(4896, 2, prod__lit_switch__char_class___range__115_115_char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new char[] {115,119,105,116,99,104}, null, null);
      tmp[1] = new NonTerminalStackNode(4894, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(4892, 0, "Label", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Switch_Statement__label_Label_layouts_LAYOUTLIST_lit_switch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_cases_iter_seps__Case__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__Solve_Statement__lit_solve_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_variables_iter_seps__QualifiedName__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_bound_Bound_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_body_Statement_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[11];
      
      tmp[0] = new LiteralStackNode(4852, 0, prod__lit_solve__char_class___range__115_115_char_class___range__111_111_char_class___range__108_108_char_class___range__118_118_char_class___range__101_101_, new char[] {115,111,108,118,101}, null, null);
      tmp[1] = new NonTerminalStackNode(4854, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(4856, 2, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[3] = new NonTerminalStackNode(4858, 3, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(4860, 4, regular__iter_seps__QualifiedName__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(4862, 0, "QualifiedName", null, null), new AbstractStackNode[]{new NonTerminalStackNode(4864, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(4866, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(4868, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[5] = new NonTerminalStackNode(4870, 5, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(4872, 6, "Bound", null, null);
      tmp[7] = new NonTerminalStackNode(4874, 7, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(4876, 8, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[9] = new NonTerminalStackNode(4878, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new NonTerminalStackNode(4880, 10, "Statement", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Solve_Statement__lit_solve_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_variables_iter_seps__QualifiedName__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_bound_Bound_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_body_Statement_, tmp);
	}
    protected static final void _init_prod__VariableDeclaration_Statement__declaration_LocalVariableDeclaration_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(5052, 2, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[1] = new NonTerminalStackNode(5050, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5048, 0, "LocalVariableDeclaration", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__VariableDeclaration_Statement__declaration_LocalVariableDeclaration_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__NonEmptyBlock_Statement__label_Label_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_statements_iter_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(4976, 6, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[5] = new NonTerminalStackNode(4974, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(4968, 4, regular__iter_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode(4970, 0, "Statement", null, null), new AbstractStackNode[]{new NonTerminalStackNode(4972, 1, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[3] = new NonTerminalStackNode(4966, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(4964, 2, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      tmp[1] = new NonTerminalStackNode(4962, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(4960, 0, "Label", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__NonEmptyBlock_Statement__label_Label_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_statements_iter_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__DoWhile_Statement__label_Label_layouts_LAYOUTLIST_lit_do_layouts_LAYOUTLIST_body_Statement_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_condition_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[15];
      
      tmp[14] = new LiteralStackNode(5006, 14, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[13] = new NonTerminalStackNode(5004, 13, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new LiteralStackNode(5002, 12, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[11] = new NonTerminalStackNode(5000, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new NonTerminalStackNode(4998, 10, "Expression", null, null);
      tmp[9] = new NonTerminalStackNode(4996, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(4994, 8, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[7] = new NonTerminalStackNode(4992, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new LiteralStackNode(4990, 6, prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new char[] {119,104,105,108,101}, null, null);
      tmp[5] = new NonTerminalStackNode(4988, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(4986, 4, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode(4984, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(4982, 2, prod__lit_do__char_class___range__100_100_char_class___range__111_111_, new char[] {100,111}, null, null);
      tmp[1] = new NonTerminalStackNode(4980, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(4978, 0, "Label", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__DoWhile_Statement__label_Label_layouts_LAYOUTLIST_lit_do_layouts_LAYOUTLIST_body_Statement_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_condition_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__IfThenElse_Statement__label_Label_layouts_LAYOUTLIST_lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_thenStatement_Statement_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_elseStatement_Statement_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[15];
      
      tmp[14] = new NonTerminalStackNode(5044, 14, "Statement", null, null);
      tmp[13] = new NonTerminalStackNode(5042, 13, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new LiteralStackNode(5040, 12, prod__lit_else__char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new char[] {101,108,115,101}, null, null);
      tmp[11] = new NonTerminalStackNode(5038, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new NonTerminalStackNode(5036, 10, "Statement", null, null);
      tmp[9] = new NonTerminalStackNode(5034, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(5032, 8, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[7] = new NonTerminalStackNode(5030, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new SeparatedListStackNode(5020, 6, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(5022, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5024, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(5026, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(5028, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[5] = new NonTerminalStackNode(5018, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(5016, 4, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[3] = new NonTerminalStackNode(5014, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(5012, 2, prod__lit_if__char_class___range__105_105_char_class___range__102_102_, new char[] {105,102}, null, null);
      tmp[1] = new NonTerminalStackNode(5010, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5008, 0, "Label", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__IfThenElse_Statement__label_Label_layouts_LAYOUTLIST_lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_thenStatement_Statement_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_elseStatement_Statement_, tmp);
	}
    protected static final void _init_prod__Throw_Statement__lit_throw_layouts_LAYOUTLIST_statement_Statement__assoc__non_assoc(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(4800, 2, "Statement", null, null);
      tmp[1] = new NonTerminalStackNode(4798, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(4796, 0, prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_, new char[] {116,104,114,111,119}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Throw_Statement__lit_throw_layouts_LAYOUTLIST_statement_Statement__assoc__non_assoc, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Expression_Statement__expression_Expression_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__Filter_Statement__lit_filter_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__TryFinally_Statement__lit_try_layouts_LAYOUTLIST_body_Statement_layouts_LAYOUTLIST_handlers_iter_seps__Catch__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_finallyBody_Statement_(builder);
      
        _init_prod__Insert_Statement__lit_insert_layouts_LAYOUTLIST_dataTarget_DataTarget_layouts_LAYOUTLIST_statement_Statement__assoc__non_assoc(builder);
      
        _init_prod__Try_Statement__lit_try_layouts_LAYOUTLIST_body_Statement_layouts_LAYOUTLIST_handlers_iter_seps__Catch__layouts_LAYOUTLIST__assoc__non_assoc(builder);
      
        _init_prod__Visit_Statement__label_Label_layouts_LAYOUTLIST_visit_Visit_(builder);
      
        _init_prod__EmptyStatement_Statement__lit___59_(builder);
      
        _init_prod__Break_Statement__lit_break_layouts_LAYOUTLIST_target_Target_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__Assignment_Statement__assignable_Assignable_layouts_LAYOUTLIST_operator_Assignment_layouts_LAYOUTLIST_statement_Statement_(builder);
      
        _init_prod__For_Statement__label_Label_layouts_LAYOUTLIST_lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_body_Statement_(builder);
      
        _init_prod__GlobalDirective_Statement__lit_global_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_names_iter_seps__QualifiedName__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__AssertWithMessage_Statement__lit_assert_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_message_Expression_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__While_Statement__label_Label_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_body_Statement_(builder);
      
        _init_prod__Assert_Statement__lit_assert_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__FunctionDeclaration_Statement__functionDeclaration_FunctionDeclaration_(builder);
      
        _init_prod__Return_Statement__lit_return_layouts_LAYOUTLIST_statement_Statement__assoc__non_assoc(builder);
      
        _init_prod__Continue_Statement__lit_continue_layouts_LAYOUTLIST_target_Target_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__Fail_Statement__lit_fail_layouts_LAYOUTLIST_target_Target_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__Append_Statement__lit_append_layouts_LAYOUTLIST_dataTarget_DataTarget_layouts_LAYOUTLIST_statement_Statement__assoc__non_assoc(builder);
      
        _init_prod__IfThen_Statement__label_Label_layouts_LAYOUTLIST_lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_thenStatement_Statement_layouts_LAYOUTLIST_conditional__empty__not_follow__lit_else_(builder);
      
        _init_prod__Switch_Statement__label_Label_layouts_LAYOUTLIST_lit_switch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_cases_iter_seps__Case__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__Solve_Statement__lit_solve_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_variables_iter_seps__QualifiedName__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_bound_Bound_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_body_Statement_(builder);
      
        _init_prod__VariableDeclaration_Statement__declaration_LocalVariableDeclaration_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__NonEmptyBlock_Statement__label_Label_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_statements_iter_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__DoWhile_Statement__label_Label_layouts_LAYOUTLIST_lit_do_layouts_LAYOUTLIST_body_Statement_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_condition_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__IfThenElse_Statement__label_Label_layouts_LAYOUTLIST_lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_conditions_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_thenStatement_Statement_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_elseStatement_Statement_(builder);
      
        _init_prod__Throw_Statement__lit_throw_layouts_LAYOUTLIST_statement_Statement__assoc__non_assoc(builder);
      
    }
  }
	
  protected static class FunctionType {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__TypeArguments_FunctionType__type_Type_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__TypeArg__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(5136, 6, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[5] = new NonTerminalStackNode(5134, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(5124, 4, regular__iter_star_seps__TypeArg__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(5126, 0, "TypeArg", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5128, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(5130, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(5132, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode(5122, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(5120, 2, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[1] = new NonTerminalStackNode(5118, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5116, 0, "Type", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__TypeArguments_FunctionType__type_Type_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__TypeArg__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__TypeArguments_FunctionType__type_Type_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__TypeArg__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(builder);
      
    }
  }
	
  protected static class Case {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__PatternWithAction_Case__lit_case_layouts_LAYOUTLIST_patternWithAction_PatternWithAction__tag__Foldable(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(5160, 2, "PatternWithAction", null, null);
      tmp[1] = new NonTerminalStackNode(5158, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5156, 0, prod__lit_case__char_class___range__99_99_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_, new char[] {99,97,115,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__PatternWithAction_Case__lit_case_layouts_LAYOUTLIST_patternWithAction_PatternWithAction__tag__Foldable, tmp);
	}
    protected static final void _init_prod__Default_Case__lit_default_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_statement_Statement__tag__Foldable(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(5170, 4, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode(5168, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(5166, 2, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[1] = new NonTerminalStackNode(5164, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5162, 0, prod__lit_default__char_class___range__100_100_char_class___range__101_101_char_class___range__102_102_char_class___range__97_97_char_class___range__117_117_char_class___range__108_108_char_class___range__116_116_, new char[] {100,101,102,97,117,108,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Case__lit_default_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_statement_Statement__tag__Foldable, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__PatternWithAction_Case__lit_case_layouts_LAYOUTLIST_patternWithAction_PatternWithAction__tag__Foldable(builder);
      
        _init_prod__Default_Case__lit_default_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_statement_Statement__tag__Foldable(builder);
      
    }
  }
	
  protected static class Bound {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Empty_Bound__(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new EpsilonStackNode(5172, 0);
      builder.addAlternative(ObjectRascalRascal.prod__Empty_Bound__, tmp);
	}
    protected static final void _init_prod__Default_Bound__lit___59_layouts_LAYOUTLIST_expression_Expression_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(5178, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(5176, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5174, 0, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Bound__lit___59_layouts_LAYOUTLIST_expression_Expression_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Empty_Bound__(builder);
      
        _init_prod__Default_Bound__lit___59_layouts_LAYOUTLIST_expression_Expression_(builder);
      
    }
  }
	
  protected static class Type {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Function_Type__function_FunctionType_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(5380, 0, "FunctionType", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Function_Type__function_FunctionType_, tmp);
	}
    protected static final void _init_prod__Bracket_Type__lit___40_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_lit___41__bracket(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(5390, 4, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[3] = new NonTerminalStackNode(5388, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(5386, 2, "Type", null, null);
      tmp[1] = new NonTerminalStackNode(5384, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5382, 0, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Bracket_Type__lit___40_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_lit___41__bracket, tmp);
	}
    protected static final void _init_prod__Basic_Type__basic_BasicType_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(5392, 0, "BasicType", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Basic_Type__basic_BasicType_, tmp);
	}
    protected static final void _init_prod__Symbol_Type__symbol_Sym_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(5394, 0, "Sym", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Symbol_Type__symbol_Sym_, tmp);
	}
    protected static final void _init_prod__Variable_Type__typeVar_TypeVar_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(5396, 0, "TypeVar", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Variable_Type__typeVar_TypeVar_, tmp);
	}
    protected static final void _init_prod__User_Type__conditional__user_UserType__delete__HeaderKeyword_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(5398, 0, "UserType", null, new ICompletionFilter[] {new StringMatchRestriction(new char[] {108,101,120,105,99,97,108}), new StringMatchRestriction(new char[] {105,109,112,111,114,116}), new StringMatchRestriction(new char[] {115,116,97,114,116}), new StringMatchRestriction(new char[] {115,121,110,116,97,120}), new StringMatchRestriction(new char[] {107,101,121,119,111,114,100}), new StringMatchRestriction(new char[] {101,120,116,101,110,100}), new StringMatchRestriction(new char[] {108,97,121,111,117,116})});
      builder.addAlternative(ObjectRascalRascal.prod__User_Type__conditional__user_UserType__delete__HeaderKeyword_, tmp);
	}
    protected static final void _init_prod__Selector_Type__selector_DataTypeSelector_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(5400, 0, "DataTypeSelector", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Selector_Type__selector_DataTypeSelector_, tmp);
	}
    protected static final void _init_prod__Structured_Type__structured_StructuredType_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(5402, 0, "StructuredType", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Structured_Type__structured_StructuredType_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Function_Type__function_FunctionType_(builder);
      
        _init_prod__Bracket_Type__lit___40_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_lit___41__bracket(builder);
      
        _init_prod__Basic_Type__basic_BasicType_(builder);
      
        _init_prod__Symbol_Type__symbol_Sym_(builder);
      
        _init_prod__Variable_Type__typeVar_TypeVar_(builder);
      
        _init_prod__User_Type__conditional__user_UserType__delete__HeaderKeyword_(builder);
      
        _init_prod__Selector_Type__selector_DataTypeSelector_(builder);
      
        _init_prod__Structured_Type__structured_StructuredType_(builder);
      
    }
  }
	
  protected static class Declaration {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Rule_Declaration__tags_Tags_layouts_LAYOUTLIST_lit_rule_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_patternAction_PatternWithAction_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[9];
      
      tmp[8] = new LiteralStackNode(5204, 8, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[7] = new NonTerminalStackNode(5202, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(5200, 6, "PatternWithAction", null, null);
      tmp[5] = new NonTerminalStackNode(5198, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(5196, 4, "Name", null, null);
      tmp[3] = new NonTerminalStackNode(5194, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(5192, 2, prod__lit_rule__char_class___range__114_114_char_class___range__117_117_char_class___range__108_108_char_class___range__101_101_, new char[] {114,117,108,101}, null, null);
      tmp[1] = new NonTerminalStackNode(5190, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5188, 0, "Tags", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Rule_Declaration__tags_Tags_layouts_LAYOUTLIST_lit_rule_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_patternAction_PatternWithAction_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__Alias_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_alias_layouts_LAYOUTLIST_user_UserType_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_base_Type_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[13];
      
      tmp[12] = new LiteralStackNode(5230, 12, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[11] = new NonTerminalStackNode(5228, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new NonTerminalStackNode(5226, 10, "Type", null, null);
      tmp[9] = new NonTerminalStackNode(5224, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(5222, 8, prod__lit___61__char_class___range__61_61_, new char[] {61}, null, null);
      tmp[7] = new NonTerminalStackNode(5220, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(5218, 6, "UserType", null, null);
      tmp[5] = new NonTerminalStackNode(5216, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(5214, 4, prod__lit_alias__char_class___range__97_97_char_class___range__108_108_char_class___range__105_105_char_class___range__97_97_char_class___range__115_115_, new char[] {97,108,105,97,115}, null, null);
      tmp[3] = new NonTerminalStackNode(5212, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(5210, 2, "Visibility", null, null);
      tmp[1] = new NonTerminalStackNode(5208, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5206, 0, "Tags", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Alias_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_alias_layouts_LAYOUTLIST_user_UserType_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_base_Type_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__DataAbstract_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_data_layouts_LAYOUTLIST_user_UserType_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[9];
      
      tmp[8] = new LiteralStackNode(5248, 8, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[7] = new NonTerminalStackNode(5246, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(5244, 6, "UserType", null, null);
      tmp[5] = new NonTerminalStackNode(5242, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(5240, 4, prod__lit_data__char_class___range__100_100_char_class___range__97_97_char_class___range__116_116_char_class___range__97_97_, new char[] {100,97,116,97}, null, null);
      tmp[3] = new NonTerminalStackNode(5238, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(5236, 2, "Visibility", null, null);
      tmp[1] = new NonTerminalStackNode(5234, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5232, 0, "Tags", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__DataAbstract_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_data_layouts_LAYOUTLIST_user_UserType_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__Variable_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_variables_iter_seps__Variable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[9];
      
      tmp[8] = new LiteralStackNode(5274, 8, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[7] = new NonTerminalStackNode(5272, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new SeparatedListStackNode(5262, 6, regular__iter_seps__Variable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(5264, 0, "Variable", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5266, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(5268, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(5270, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[5] = new NonTerminalStackNode(5260, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(5258, 4, "Type", null, null);
      tmp[3] = new NonTerminalStackNode(5256, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(5254, 2, "Visibility", null, null);
      tmp[1] = new NonTerminalStackNode(5252, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5250, 0, "Tags", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Variable_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_variables_iter_seps__Variable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__Annotation_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_anno_layouts_LAYOUTLIST_annoType_Type_layouts_LAYOUTLIST_onType_Type_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[15];
      
      tmp[14] = new LiteralStackNode(5304, 14, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[13] = new NonTerminalStackNode(5302, 13, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new NonTerminalStackNode(5300, 12, "Name", null, null);
      tmp[11] = new NonTerminalStackNode(5298, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode(5296, 10, prod__lit___64__char_class___range__64_64_, new char[] {64}, null, null);
      tmp[9] = new NonTerminalStackNode(5294, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode(5292, 8, "Type", null, null);
      tmp[7] = new NonTerminalStackNode(5290, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(5288, 6, "Type", null, null);
      tmp[5] = new NonTerminalStackNode(5286, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(5284, 4, prod__lit_anno__char_class___range__97_97_char_class___range__110_110_char_class___range__110_110_char_class___range__111_111_, new char[] {97,110,110,111}, null, null);
      tmp[3] = new NonTerminalStackNode(5282, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(5280, 2, "Visibility", null, null);
      tmp[1] = new NonTerminalStackNode(5278, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5276, 0, "Tags", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Annotation_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_anno_layouts_LAYOUTLIST_annoType_Type_layouts_LAYOUTLIST_onType_Type_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__Function_Declaration__functionDeclaration_FunctionDeclaration_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(5306, 0, "FunctionDeclaration", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Function_Declaration__functionDeclaration_FunctionDeclaration_, tmp);
	}
    protected static final void _init_prod__Data_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_data_layouts_LAYOUTLIST_user_UserType_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_variants_iter_seps__Variant__layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59__tag__Foldable(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[13];
      
      tmp[12] = new LiteralStackNode(5340, 12, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[11] = new NonTerminalStackNode(5338, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new SeparatedListStackNode(5328, 10, regular__iter_seps__Variant__layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST, new NonTerminalStackNode(5330, 0, "Variant", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5332, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(5334, 2, prod__lit___124__char_class___range__124_124_, new char[] {124}, null, null), new NonTerminalStackNode(5336, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[9] = new NonTerminalStackNode(5326, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(5324, 8, prod__lit___61__char_class___range__61_61_, new char[] {61}, null, null);
      tmp[7] = new NonTerminalStackNode(5322, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(5320, 6, "UserType", null, null);
      tmp[5] = new NonTerminalStackNode(5318, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(5316, 4, prod__lit_data__char_class___range__100_100_char_class___range__97_97_char_class___range__116_116_char_class___range__97_97_, new char[] {100,97,116,97}, null, null);
      tmp[3] = new NonTerminalStackNode(5314, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(5312, 2, "Visibility", null, null);
      tmp[1] = new NonTerminalStackNode(5310, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5308, 0, "Tags", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Data_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_data_layouts_LAYOUTLIST_user_UserType_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_variants_iter_seps__Variant__layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59__tag__Foldable, tmp);
	}
    protected static final void _init_prod__Tag_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_tag_layouts_LAYOUTLIST_kind_Kind_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit_on_layouts_LAYOUTLIST_types_iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[15];
      
      tmp[14] = new LiteralStackNode(5378, 14, prod__lit___59__char_class___range__59_59_, new char[] {59}, null, null);
      tmp[13] = new NonTerminalStackNode(5376, 13, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new SeparatedListStackNode(5366, 12, regular__iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(5368, 0, "Type", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5370, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(5372, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(5374, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[11] = new NonTerminalStackNode(5364, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode(5362, 10, prod__lit_on__char_class___range__111_111_char_class___range__110_110_, new char[] {111,110}, null, null);
      tmp[9] = new NonTerminalStackNode(5360, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode(5358, 8, "Name", null, null);
      tmp[7] = new NonTerminalStackNode(5356, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(5354, 6, "Kind", null, null);
      tmp[5] = new NonTerminalStackNode(5352, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(5350, 4, prod__lit_tag__char_class___range__116_116_char_class___range__97_97_char_class___range__103_103_, new char[] {116,97,103}, null, null);
      tmp[3] = new NonTerminalStackNode(5348, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(5346, 2, "Visibility", null, null);
      tmp[1] = new NonTerminalStackNode(5344, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5342, 0, "Tags", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Tag_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_tag_layouts_LAYOUTLIST_kind_Kind_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit_on_layouts_LAYOUTLIST_types_iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Rule_Declaration__tags_Tags_layouts_LAYOUTLIST_lit_rule_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_patternAction_PatternWithAction_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__Alias_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_alias_layouts_LAYOUTLIST_user_UserType_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_base_Type_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__DataAbstract_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_data_layouts_LAYOUTLIST_user_UserType_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__Variable_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_variables_iter_seps__Variable__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__Annotation_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_anno_layouts_LAYOUTLIST_annoType_Type_layouts_LAYOUTLIST_onType_Type_layouts_LAYOUTLIST_lit___64_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__Function_Declaration__functionDeclaration_FunctionDeclaration_(builder);
      
        _init_prod__Data_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_data_layouts_LAYOUTLIST_user_UserType_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_variants_iter_seps__Variant__layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59__tag__Foldable(builder);
      
        _init_prod__Tag_Declaration__tags_Tags_layouts_LAYOUTLIST_visibility_Visibility_layouts_LAYOUTLIST_lit_tag_layouts_LAYOUTLIST_kind_Kind_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit_on_layouts_LAYOUTLIST_types_iter_seps__Type__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_(builder);
      
    }
  }
	
  protected static class Class {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Complement_Class__lit___33_layouts_LAYOUTLIST_charClass_Class_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(5436, 2, "Class", null, null);
      tmp[1] = new NonTerminalStackNode(5434, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5432, 0, prod__lit___33__char_class___range__33_33_, new char[] {33}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Complement_Class__lit___33_layouts_LAYOUTLIST_charClass_Class_, tmp);
	}
    protected static final void _init_prod__Bracket_Class__lit___40_layouts_LAYOUTLIST_charclass_Class_layouts_LAYOUTLIST_lit___41__bracket(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(5480, 4, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[3] = new NonTerminalStackNode(5478, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(5476, 2, "Class", null, null);
      tmp[1] = new NonTerminalStackNode(5474, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5472, 0, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Bracket_Class__lit___40_layouts_LAYOUTLIST_charclass_Class_layouts_LAYOUTLIST_lit___41__bracket, tmp);
	}
    protected static final void _init_prod__Intersection_Class__lhs_Class_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_rhs_Class__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(5470, 4, "Class", null, null);
      tmp[3] = new NonTerminalStackNode(5468, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(5466, 2, prod__lit___38_38__char_class___range__38_38_char_class___range__38_38_, new char[] {38,38}, null, null);
      tmp[1] = new NonTerminalStackNode(5464, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5462, 0, "Class", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Intersection_Class__lhs_Class_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_rhs_Class__assoc__left, tmp);
	}
    protected static final void _init_prod__Difference_Class__lhs_Class_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_rhs_Class__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(5460, 4, "Class", null, null);
      tmp[3] = new NonTerminalStackNode(5458, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(5456, 2, prod__lit____char_class___range__45_45_, new char[] {45}, null, null);
      tmp[1] = new NonTerminalStackNode(5454, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5452, 0, "Class", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Difference_Class__lhs_Class_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_rhs_Class__assoc__left, tmp);
	}
    protected static final void _init_prod__SimpleCharclass_Class__lit___91_layouts_LAYOUTLIST_ranges_iter_star_seps__Range__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(5450, 4, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      tmp[3] = new NonTerminalStackNode(5448, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode(5442, 2, regular__iter_star_seps__Range__layouts_LAYOUTLIST, new NonTerminalStackNode(5444, 0, "Range", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5446, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[1] = new NonTerminalStackNode(5440, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5438, 0, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__SimpleCharclass_Class__lit___91_layouts_LAYOUTLIST_ranges_iter_star_seps__Range__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__Union_Class__lhs_Class_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_rhs_Class__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(5490, 4, "Class", null, null);
      tmp[3] = new NonTerminalStackNode(5488, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(5486, 2, prod__lit___124_124__char_class___range__124_124_char_class___range__124_124_, new char[] {124,124}, null, null);
      tmp[1] = new NonTerminalStackNode(5484, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5482, 0, "Class", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Union_Class__lhs_Class_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_rhs_Class__assoc__left, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Complement_Class__lit___33_layouts_LAYOUTLIST_charClass_Class_(builder);
      
        _init_prod__Bracket_Class__lit___40_layouts_LAYOUTLIST_charclass_Class_layouts_LAYOUTLIST_lit___41__bracket(builder);
      
        _init_prod__Intersection_Class__lhs_Class_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_rhs_Class__assoc__left(builder);
      
        _init_prod__Difference_Class__lhs_Class_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_rhs_Class__assoc__left(builder);
      
        _init_prod__SimpleCharclass_Class__lit___91_layouts_LAYOUTLIST_ranges_iter_star_seps__Range__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__Union_Class__lhs_Class_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_rhs_Class__assoc__left(builder);
      
    }
  }
	
  protected static class Mapping__Expression {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_Mapping__Expression__from_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_to_Expression_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(5504, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode(5502, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(5500, 2, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[1] = new NonTerminalStackNode(5498, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5496, 0, "Expression", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Mapping__Expression__from_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_to_Expression_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_Mapping__Expression__from_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_to_Expression_(builder);
      
    }
  }
	
  protected static class Comprehension {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__List_Comprehension__lit___91_layouts_LAYOUTLIST_results_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[9];
      
      tmp[8] = new LiteralStackNode(5548, 8, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      tmp[7] = new NonTerminalStackNode(5546, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new SeparatedListStackNode(5536, 6, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(5538, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5540, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(5542, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(5544, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[5] = new NonTerminalStackNode(5534, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(5532, 4, prod__lit___124__char_class___range__124_124_, new char[] {124}, null, null);
      tmp[3] = new NonTerminalStackNode(5530, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode(5520, 2, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(5522, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5524, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(5526, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(5528, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[1] = new NonTerminalStackNode(5518, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5516, 0, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__List_Comprehension__lit___91_layouts_LAYOUTLIST_results_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__Map_Comprehension__lit___40_layouts_LAYOUTLIST_from_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_to_Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[13];
      
      tmp[12] = new LiteralStackNode(5582, 12, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[11] = new NonTerminalStackNode(5580, 11, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new SeparatedListStackNode(5570, 10, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(5572, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5574, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(5576, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(5578, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[9] = new NonTerminalStackNode(5568, 9, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode(5566, 8, prod__lit___124__char_class___range__124_124_, new char[] {124}, null, null);
      tmp[7] = new NonTerminalStackNode(5564, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new NonTerminalStackNode(5562, 6, "Expression", null, null);
      tmp[5] = new NonTerminalStackNode(5560, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(5558, 4, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[3] = new NonTerminalStackNode(5556, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(5554, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode(5552, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5550, 0, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Map_Comprehension__lit___40_layouts_LAYOUTLIST_from_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_to_Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__Set_Comprehension__lit___123_layouts_LAYOUTLIST_results_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[9];
      
      tmp[8] = new LiteralStackNode(5616, 8, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[7] = new NonTerminalStackNode(5614, 7, "layouts_LAYOUTLIST", null, null);
      tmp[6] = new SeparatedListStackNode(5604, 6, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(5606, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5608, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(5610, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(5612, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[5] = new NonTerminalStackNode(5602, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(5600, 4, prod__lit___124__char_class___range__124_124_, new char[] {124}, null, null);
      tmp[3] = new NonTerminalStackNode(5598, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode(5588, 2, regular__iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(5590, 0, "Expression", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5592, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(5594, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(5596, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[1] = new NonTerminalStackNode(5586, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5584, 0, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Set_Comprehension__lit___123_layouts_LAYOUTLIST_results_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__List_Comprehension__lit___91_layouts_LAYOUTLIST_results_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__Map_Comprehension__lit___40_layouts_LAYOUTLIST_from_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_to_Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(builder);
      
        _init_prod__Set_Comprehension__lit___123_layouts_LAYOUTLIST_results_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_generators_iter_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
    }
  }
	
  protected static class FunctionModifiers {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__List_FunctionModifiers__modifiers_iter_star_seps__FunctionModifier__layouts_LAYOUTLIST_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode(5510, 0, regular__iter_star_seps__FunctionModifier__layouts_LAYOUTLIST, new NonTerminalStackNode(5512, 0, "FunctionModifier", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5514, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__List_FunctionModifiers__modifiers_iter_star_seps__FunctionModifier__layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__List_FunctionModifiers__modifiers_iter_star_seps__FunctionModifier__layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class ProdModifier {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Associativity_ProdModifier__associativity_Assoc_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(5618, 0, "Assoc", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Associativity_ProdModifier__associativity_Assoc_, tmp);
	}
    protected static final void _init_prod__Tag_ProdModifier__tag_Tag_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(5620, 0, "Tag", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Tag_ProdModifier__tag_Tag_, tmp);
	}
    protected static final void _init_prod__Bracket_ProdModifier__lit_bracket_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(5622, 0, prod__lit_bracket__char_class___range__98_98_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__107_107_char_class___range__101_101_char_class___range__116_116_, new char[] {98,114,97,99,107,101,116}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Bracket_ProdModifier__lit_bracket_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Associativity_ProdModifier__associativity_Assoc_(builder);
      
        _init_prod__Tag_ProdModifier__tag_Tag_(builder);
      
        _init_prod__Bracket_ProdModifier__lit_bracket_(builder);
      
    }
  }
	
  protected static class BooleanLiteral {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__BooleanLiteral__lit_true_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(5632, 0, prod__lit_true__char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__101_101_, new char[] {116,114,117,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__BooleanLiteral__lit_true_, tmp);
	}
    protected static final void _init_prod__BooleanLiteral__lit_false_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(5634, 0, prod__lit_false__char_class___range__102_102_char_class___range__97_97_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new char[] {102,97,108,115,101}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__BooleanLiteral__lit_false_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__BooleanLiteral__lit_true_(builder);
      
        _init_prod__BooleanLiteral__lit_false_(builder);
      
    }
  }
	
  protected static class Toplevel {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__GivenVisibility_Toplevel__declaration_Declaration_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(5630, 0, "Declaration", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__GivenVisibility_Toplevel__declaration_Declaration_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__GivenVisibility_Toplevel__declaration_Declaration_(builder);
      
    }
  }
	
  protected static class TypeVar {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Free_TypeVar__lit___38_layouts_LAYOUTLIST_name_Name_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(5642, 2, "Name", null, null);
      tmp[1] = new NonTerminalStackNode(5640, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5638, 0, prod__lit___38__char_class___range__38_38_, new char[] {38}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Free_TypeVar__lit___38_layouts_LAYOUTLIST_name_Name_, tmp);
	}
    protected static final void _init_prod__Bounded_TypeVar__lit___38_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___60_58_layouts_LAYOUTLIST_bound_Type_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new NonTerminalStackNode(5656, 6, "Type", null, null);
      tmp[5] = new NonTerminalStackNode(5654, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(5652, 4, prod__lit___60_58__char_class___range__60_60_char_class___range__58_58_, new char[] {60,58}, null, null);
      tmp[3] = new NonTerminalStackNode(5650, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(5648, 2, "Name", null, null);
      tmp[1] = new NonTerminalStackNode(5646, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5644, 0, prod__lit___38__char_class___range__38_38_, new char[] {38}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Bounded_TypeVar__lit___38_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___60_58_layouts_LAYOUTLIST_bound_Type_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Free_TypeVar__lit___38_layouts_LAYOUTLIST_name_Name_(builder);
      
        _init_prod__Bounded_TypeVar__lit___38_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___60_58_layouts_LAYOUTLIST_bound_Type_(builder);
      
    }
  }
	
  protected static class RationalLiteral {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__RationalLiteral__char_class___range__49_57_iter_star__char_class___range__48_57_char_class___range__114_114_char_class___range__48_57_conditional__iter_star__char_class___range__48_57__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new ListStackNode(5688, 4, regular__iter_star__char_class___range__48_57, new CharStackNode(5690, 0, new char[][]{{48,57}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{48,57},{65,90},{95,95},{97,122}})});
      tmp[3] = new CharStackNode(5686, 3, new char[][]{{48,57}}, null, null);
      tmp[2] = new CharStackNode(5684, 2, new char[][]{{114,114}}, null, null);
      tmp[1] = new ListStackNode(5680, 1, regular__iter_star__char_class___range__48_57, new CharStackNode(5682, 0, new char[][]{{48,57}}, null, null), false, null, null);
      tmp[0] = new CharStackNode(5678, 0, new char[][]{{49,57}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RationalLiteral__char_class___range__49_57_iter_star__char_class___range__48_57_char_class___range__114_114_char_class___range__48_57_conditional__iter_star__char_class___range__48_57__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_, tmp);
	}
    protected static final void _init_prod__RationalLiteral__char_class___range__48_57_iter_star__char_class___range__48_57_char_class___range__114_114_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode(5698, 2, new char[][]{{114,114}}, null, null);
      tmp[1] = new ListStackNode(5694, 1, regular__iter_star__char_class___range__48_57, new CharStackNode(5696, 0, new char[][]{{48,57}}, null, null), false, null, null);
      tmp[0] = new CharStackNode(5692, 0, new char[][]{{48,57}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__RationalLiteral__char_class___range__48_57_iter_star__char_class___range__48_57_char_class___range__114_114_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__RationalLiteral__char_class___range__49_57_iter_star__char_class___range__48_57_char_class___range__114_114_char_class___range__48_57_conditional__iter_star__char_class___range__48_57__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_(builder);
      
        _init_prod__RationalLiteral__char_class___range__48_57_iter_star__char_class___range__48_57_char_class___range__114_114_(builder);
      
    }
  }
	
  protected static class UnicodeEscape {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__UnicodeEscape__lit___92_iter__char_class___range__117_117_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[6];
      
      tmp[5] = new CharStackNode(5712, 5, new char[][]{{48,57},{65,70},{97,102}}, null, null);
      tmp[4] = new CharStackNode(5710, 4, new char[][]{{48,57},{65,70},{97,102}}, null, null);
      tmp[3] = new CharStackNode(5708, 3, new char[][]{{48,57},{65,70},{97,102}}, null, null);
      tmp[2] = new CharStackNode(5706, 2, new char[][]{{48,57},{65,70},{97,102}}, null, null);
      tmp[1] = new ListStackNode(5702, 1, regular__iter__char_class___range__117_117, new CharStackNode(5704, 0, new char[][]{{117,117}}, null, null), true, null, null);
      tmp[0] = new LiteralStackNode(5700, 0, prod__lit___92__char_class___range__92_92_, new char[] {92}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__UnicodeEscape__lit___92_iter__char_class___range__117_117_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__UnicodeEscape__lit___92_iter__char_class___range__117_117_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_char_class___range__48_57_range__65_70_range__97_102_(builder);
      
    }
  }
	
  protected static class Prod {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__AssociativityGroup_Prod__associativity_Assoc_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_group_Prod_layouts_LAYOUTLIST_lit___41__tag__Foldable(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(5740, 6, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[5] = new NonTerminalStackNode(5738, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode(5736, 4, "Prod", null, null);
      tmp[3] = new NonTerminalStackNode(5734, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(5732, 2, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[1] = new NonTerminalStackNode(5730, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5728, 0, "Assoc", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__AssociativityGroup_Prod__associativity_Assoc_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_group_Prod_layouts_LAYOUTLIST_lit___41__tag__Foldable, tmp);
	}
    protected static final void _init_prod__Reference_Prod__lit___58_layouts_LAYOUTLIST_referenced_Name_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(5746, 2, "Name", null, null);
      tmp[1] = new NonTerminalStackNode(5744, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5742, 0, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Reference_Prod__lit___58_layouts_LAYOUTLIST_referenced_Name_, tmp);
	}
    protected static final void _init_prod__Labeled_Prod__modifiers_iter_star_seps__ProdModifier__layouts_LAYOUTLIST_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_args_iter_star_seps__Sym__layouts_LAYOUTLIST_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new SeparatedListStackNode(5764, 6, regular__iter_star_seps__Sym__layouts_LAYOUTLIST, new NonTerminalStackNode(5766, 0, "Sym", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5768, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[5] = new NonTerminalStackNode(5762, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(5760, 4, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[3] = new NonTerminalStackNode(5758, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(5756, 2, "Name", null, null);
      tmp[1] = new NonTerminalStackNode(5754, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new SeparatedListStackNode(5748, 0, regular__iter_star_seps__ProdModifier__layouts_LAYOUTLIST, new NonTerminalStackNode(5750, 0, "ProdModifier", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5752, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Labeled_Prod__modifiers_iter_star_seps__ProdModifier__layouts_LAYOUTLIST_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_args_iter_star_seps__Sym__layouts_LAYOUTLIST_, tmp);
	}
    protected static final void _init_prod__Others_Prod__lit___46_46_46_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode(5770, 0, prod__lit___46_46_46__char_class___range__46_46_char_class___range__46_46_char_class___range__46_46_, new char[] {46,46,46}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Others_Prod__lit___46_46_46_, tmp);
	}
    protected static final void _init_prod__First_Prod__lhs_Prod_layouts_LAYOUTLIST_conditional__lit___62__not_follow__lit___62_layouts_LAYOUTLIST_rhs_Prod__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(5804, 4, "Prod", null, null);
      tmp[3] = new NonTerminalStackNode(5802, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(5800, 2, prod__lit___62__char_class___range__62_62_, new char[] {62}, null, new ICompletionFilter[] {new StringFollowRestriction(new char[] {62})});
      tmp[1] = new NonTerminalStackNode(5798, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5796, 0, "Prod", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__First_Prod__lhs_Prod_layouts_LAYOUTLIST_conditional__lit___62__not_follow__lit___62_layouts_LAYOUTLIST_rhs_Prod__assoc__left, tmp);
	}
    protected static final void _init_prod__Unlabeled_Prod__modifiers_iter_star_seps__ProdModifier__layouts_LAYOUTLIST_layouts_LAYOUTLIST_args_iter_star_seps__Sym__layouts_LAYOUTLIST_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new SeparatedListStackNode(5780, 2, regular__iter_star_seps__Sym__layouts_LAYOUTLIST, new NonTerminalStackNode(5782, 0, "Sym", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5784, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[1] = new NonTerminalStackNode(5778, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new SeparatedListStackNode(5772, 0, regular__iter_star_seps__ProdModifier__layouts_LAYOUTLIST, new NonTerminalStackNode(5774, 0, "ProdModifier", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5776, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Unlabeled_Prod__modifiers_iter_star_seps__ProdModifier__layouts_LAYOUTLIST_layouts_LAYOUTLIST_args_iter_star_seps__Sym__layouts_LAYOUTLIST_, tmp);
	}
    protected static final void _init_prod__All_Prod__lhs_Prod_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_rhs_Prod__assoc__left(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(5794, 4, "Prod", null, null);
      tmp[3] = new NonTerminalStackNode(5792, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(5790, 2, prod__lit___124__char_class___range__124_124_, new char[] {124}, null, null);
      tmp[1] = new NonTerminalStackNode(5788, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5786, 0, "Prod", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__All_Prod__lhs_Prod_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_rhs_Prod__assoc__left, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__AssociativityGroup_Prod__associativity_Assoc_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_group_Prod_layouts_LAYOUTLIST_lit___41__tag__Foldable(builder);
      
        _init_prod__Reference_Prod__lit___58_layouts_LAYOUTLIST_referenced_Name_(builder);
      
        _init_prod__Labeled_Prod__modifiers_iter_star_seps__ProdModifier__layouts_LAYOUTLIST_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_args_iter_star_seps__Sym__layouts_LAYOUTLIST_(builder);
      
        _init_prod__Others_Prod__lit___46_46_46_(builder);
      
        _init_prod__First_Prod__lhs_Prod_layouts_LAYOUTLIST_conditional__lit___62__not_follow__lit___62_layouts_LAYOUTLIST_rhs_Prod__assoc__left(builder);
      
        _init_prod__Unlabeled_Prod__modifiers_iter_star_seps__ProdModifier__layouts_LAYOUTLIST_layouts_LAYOUTLIST_args_iter_star_seps__Sym__layouts_LAYOUTLIST_(builder);
      
        _init_prod__All_Prod__lhs_Prod_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_rhs_Prod__assoc__left(builder);
      
    }
  }
	
  protected static class OctalIntegerLiteral {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__OctalIntegerLiteral__char_class___range__48_48_conditional__iter__char_class___range__48_55__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[2];
      
      tmp[1] = new ListStackNode(5812, 1, regular__iter__char_class___range__48_55, new CharStackNode(5814, 0, new char[][]{{48,55}}, null, null), true, null, new ICompletionFilter[] {new CharFollowRestriction(new char[][]{{48,57},{65,90},{95,95},{97,122}})});
      tmp[0] = new CharStackNode(5810, 0, new char[][]{{48,48}}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__OctalIntegerLiteral__char_class___range__48_48_conditional__iter__char_class___range__48_55__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__OctalIntegerLiteral__char_class___range__48_48_conditional__iter__char_class___range__48_55__not_follow__char_class___range__48_57_range__65_90_range__95_95_range__97_122_(builder);
      
    }
  }
	
  protected static class Pattern {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Map_Pattern__lit___40_layouts_LAYOUTLIST_mappings_iter_star_seps__Mapping__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(5848, 4, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[3] = new NonTerminalStackNode(5846, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode(5836, 2, regular__iter_star_seps__Mapping__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(5838, 0, "Mapping__Pattern", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5840, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(5842, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(5844, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[1] = new NonTerminalStackNode(5834, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5832, 0, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Map_Pattern__lit___40_layouts_LAYOUTLIST_mappings_iter_star_seps__Mapping__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__List_Pattern__lit___91_layouts_LAYOUTLIST_elements_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(5866, 4, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      tmp[3] = new NonTerminalStackNode(5864, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode(5854, 2, regular__iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(5856, 0, "Pattern", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5858, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(5860, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(5862, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[1] = new NonTerminalStackNode(5852, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5850, 0, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__List_Pattern__lit___91_layouts_LAYOUTLIST_elements_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__ReifiedType_Pattern__basicType_BasicType_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(5888, 6, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[5] = new NonTerminalStackNode(5886, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(5876, 4, regular__iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(5878, 0, "Pattern", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5880, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(5882, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(5884, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode(5874, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(5872, 2, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[1] = new NonTerminalStackNode(5870, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5868, 0, "BasicType", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__ReifiedType_Pattern__basicType_BasicType_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__QualifiedName_Pattern__qualifiedName_QualifiedName_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(5898, 0, "QualifiedName", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__QualifiedName_Pattern__qualifiedName_QualifiedName_, tmp);
	}
    protected static final void _init_prod__SplicePlus_Pattern__lit___43_layouts_LAYOUTLIST_argument_Pattern_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(5896, 2, "Pattern", null, null);
      tmp[1] = new NonTerminalStackNode(5894, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5892, 0, prod__lit___43__char_class___range__43_43_, new char[] {43}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__SplicePlus_Pattern__lit___43_layouts_LAYOUTLIST_argument_Pattern_, tmp);
	}
    protected static final void _init_prod__AsType_Pattern__lit___91_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_lit___93_layouts_LAYOUTLIST_argument_Pattern_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new NonTerminalStackNode(5994, 6, "Pattern", null, null);
      tmp[5] = new NonTerminalStackNode(5992, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(5990, 4, prod__lit___93__char_class___range__93_93_, new char[] {93}, null, null);
      tmp[3] = new NonTerminalStackNode(5988, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(5986, 2, "Type", null, null);
      tmp[1] = new NonTerminalStackNode(5984, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5982, 0, prod__lit___91__char_class___range__91_91_, new char[] {91}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__AsType_Pattern__lit___91_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_lit___93_layouts_LAYOUTLIST_argument_Pattern_, tmp);
	}
    protected static final void _init_prod__Negative_Pattern__lit___layouts_LAYOUTLIST_argument_Pattern_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(5904, 2, "Pattern", null, null);
      tmp[1] = new NonTerminalStackNode(5902, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5900, 0, prod__lit____char_class___range__45_45_, new char[] {45}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Negative_Pattern__lit___layouts_LAYOUTLIST_argument_Pattern_, tmp);
	}
    protected static final void _init_prod__Descendant_Pattern__lit___47_layouts_LAYOUTLIST_pattern_Pattern_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(6000, 2, "Pattern", null, null);
      tmp[1] = new NonTerminalStackNode(5998, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5996, 0, prod__lit___47__char_class___range__47_47_, new char[] {47}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Descendant_Pattern__lit___47_layouts_LAYOUTLIST_pattern_Pattern_, tmp);
	}
    protected static final void _init_prod__MultiVariable_Pattern__qualifiedName_QualifiedName_layouts_LAYOUTLIST_lit___42_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode(5928, 2, prod__lit___42__char_class___range__42_42_, new char[] {42}, null, null);
      tmp[1] = new NonTerminalStackNode(5926, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5924, 0, "QualifiedName", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__MultiVariable_Pattern__qualifiedName_QualifiedName_layouts_LAYOUTLIST_lit___42_, tmp);
	}
    protected static final void _init_prod__TypedVariable_Pattern__type_Type_layouts_LAYOUTLIST_name_Name_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(5934, 2, "Name", null, null);
      tmp[1] = new NonTerminalStackNode(5932, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5930, 0, "Type", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__TypedVariable_Pattern__type_Type_layouts_LAYOUTLIST_name_Name_, tmp);
	}
    protected static final void _init_prod__Set_Pattern__lit___123_layouts_LAYOUTLIST_elements_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(5952, 4, prod__lit___125__char_class___range__125_125_, new char[] {125}, null, null);
      tmp[3] = new NonTerminalStackNode(5950, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode(5940, 2, regular__iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(5942, 0, "Pattern", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5944, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(5946, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(5948, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[1] = new NonTerminalStackNode(5938, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5936, 0, prod__lit___123__char_class___range__123_123_, new char[] {123}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Set_Pattern__lit___123_layouts_LAYOUTLIST_elements_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__Splice_Pattern__lit___42_layouts_LAYOUTLIST_argument_Pattern_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(5980, 2, "Pattern", null, null);
      tmp[1] = new NonTerminalStackNode(5978, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5976, 0, prod__lit___42__char_class___range__42_42_, new char[] {42}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Splice_Pattern__lit___42_layouts_LAYOUTLIST_argument_Pattern_, tmp);
	}
    protected static final void _init_prod__Literal_Pattern__literal_Literal_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode(5890, 0, "Literal", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Literal_Pattern__literal_Literal_, tmp);
	}
    protected static final void _init_prod__Tuple_Pattern__lit___60_layouts_LAYOUTLIST_elements_iter_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___62_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new LiteralStackNode(5922, 4, prod__lit___62__char_class___range__62_62_, new char[] {62}, null, null);
      tmp[3] = new NonTerminalStackNode(5920, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode(5910, 2, regular__iter_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(5912, 0, "Pattern", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5914, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(5916, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(5918, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[1] = new NonTerminalStackNode(5908, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(5906, 0, prod__lit___60__char_class___range__60_60_, new char[] {60}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Tuple_Pattern__lit___60_layouts_LAYOUTLIST_elements_iter_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___62_, tmp);
	}
    protected static final void _init_prod__Anti_Pattern__lit___33_layouts_LAYOUTLIST_pattern_Pattern_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(6016, 2, "Pattern", null, null);
      tmp[1] = new NonTerminalStackNode(6014, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(6012, 0, prod__lit___33__char_class___range__33_33_, new char[] {33}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Anti_Pattern__lit___33_layouts_LAYOUTLIST_pattern_Pattern_, tmp);
	}
    protected static final void _init_prod__TypedVariableBecomes_Pattern__type_Type_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_pattern_Pattern_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new NonTerminalStackNode(6030, 6, "Pattern", null, null);
      tmp[5] = new NonTerminalStackNode(6028, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(6026, 4, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[3] = new NonTerminalStackNode(6024, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(6022, 2, "Name", null, null);
      tmp[1] = new NonTerminalStackNode(6020, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(6018, 0, "Type", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__TypedVariableBecomes_Pattern__type_Type_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_pattern_Pattern_, tmp);
	}
    protected static final void _init_prod__VariableBecomes_Pattern__name_Name_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_pattern_Pattern_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(6010, 4, "Pattern", null, null);
      tmp[3] = new NonTerminalStackNode(6008, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(6006, 2, prod__lit___58__char_class___range__58_58_, new char[] {58}, null, null);
      tmp[1] = new NonTerminalStackNode(6004, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(6002, 0, "Name", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__VariableBecomes_Pattern__name_Name_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_pattern_Pattern_, tmp);
	}
    protected static final void _init_prod__CallOrTree_Pattern__expression_Pattern_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new LiteralStackNode(5974, 6, prod__lit___41__char_class___range__41_41_, new char[] {41}, null, null);
      tmp[5] = new NonTerminalStackNode(5972, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new SeparatedListStackNode(5962, 4, regular__iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode(5964, 0, "Pattern", null, null), new AbstractStackNode[]{new NonTerminalStackNode(5966, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode(5968, 2, prod__lit___44__char_class___range__44_44_, new char[] {44}, null, null), new NonTerminalStackNode(5970, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode(5960, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode(5958, 2, prod__lit___40__char_class___range__40_40_, new char[] {40}, null, null);
      tmp[1] = new NonTerminalStackNode(5956, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode(5954, 0, "Pattern", null, null);
      builder.addAlternative(ObjectRascalRascal.prod__CallOrTree_Pattern__expression_Pattern_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Map_Pattern__lit___40_layouts_LAYOUTLIST_mappings_iter_star_seps__Mapping__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(builder);
      
        _init_prod__List_Pattern__lit___91_layouts_LAYOUTLIST_elements_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__ReifiedType_Pattern__basicType_BasicType_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(builder);
      
        _init_prod__QualifiedName_Pattern__qualifiedName_QualifiedName_(builder);
      
        _init_prod__SplicePlus_Pattern__lit___43_layouts_LAYOUTLIST_argument_Pattern_(builder);
      
        _init_prod__AsType_Pattern__lit___91_layouts_LAYOUTLIST_type_Type_layouts_LAYOUTLIST_lit___93_layouts_LAYOUTLIST_argument_Pattern_(builder);
      
        _init_prod__Negative_Pattern__lit___layouts_LAYOUTLIST_argument_Pattern_(builder);
      
        _init_prod__Descendant_Pattern__lit___47_layouts_LAYOUTLIST_pattern_Pattern_(builder);
      
        _init_prod__MultiVariable_Pattern__qualifiedName_QualifiedName_layouts_LAYOUTLIST_lit___42_(builder);
      
        _init_prod__TypedVariable_Pattern__type_Type_layouts_LAYOUTLIST_name_Name_(builder);
      
        _init_prod__Set_Pattern__lit___123_layouts_LAYOUTLIST_elements_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__Splice_Pattern__lit___42_layouts_LAYOUTLIST_argument_Pattern_(builder);
      
        _init_prod__Literal_Pattern__literal_Literal_(builder);
      
        _init_prod__Tuple_Pattern__lit___60_layouts_LAYOUTLIST_elements_iter_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___62_(builder);
      
        _init_prod__Anti_Pattern__lit___33_layouts_LAYOUTLIST_pattern_Pattern_(builder);
      
        _init_prod__TypedVariableBecomes_Pattern__type_Type_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_pattern_Pattern_(builder);
      
        _init_prod__VariableBecomes_Pattern__name_Name_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_pattern_Pattern_(builder);
      
        _init_prod__CallOrTree_Pattern__expression_Pattern_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_arguments_iter_star_seps__Pattern__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(builder);
      
    }
  }
	
  protected static class DateAndTime {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__DateAndTime__lit___36_DatePart_lit_T_TimePartNoTZ_opt__TimeZonePart_(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new OptionalStackNode(6062, 4, regular__opt__TimeZonePart, new NonTerminalStackNode(6064, 0, "TimeZonePart", null, null), null, null);
      tmp[3] = new NonTerminalStackNode(6060, 3, "TimePartNoTZ", null, null);
      tmp[2] = new LiteralStackNode(6058, 2, prod__lit_T__char_class___range__84_84_, new char[] {84}, null, null);
      tmp[1] = new NonTerminalStackNode(6056, 1, "DatePart", null, null);
      tmp[0] = new LiteralStackNode(6054, 0, prod__lit___36__char_class___range__36_36_, new char[] {36}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__DateAndTime__lit___36_DatePart_lit_T_TimePartNoTZ_opt__TimeZonePart_, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__DateAndTime__lit___36_DatePart_lit_T_TimePartNoTZ_opt__TimeZonePart_(builder);
      
    }
  }
	
  protected static class Tag {
    public final static AbstractStackNode[] EXPECTS;
    static{
      ExpectBuilder builder = new ExpectBuilder(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Default_Tag__lit___64_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_contents_TagString__tag__Folded_tag__category___67_111_109_109_101_110_116(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode(6092, 4, "TagString", null, null);
      tmp[3] = new NonTerminalStackNode(6090, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(6088, 2, "Name", null, null);
      tmp[1] = new NonTerminalStackNode(6086, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(6084, 0, prod__lit___64__char_class___range__64_64_, new char[] {64}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Default_Tag__lit___64_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_contents_TagString__tag__Folded_tag__category___67_111_109_109_101_110_116, tmp);
	}
    protected static final void _init_prod__Expression_Tag__lit___64_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_expression_Expression__tag__Folded_tag__category___67_111_109_109_101_110_116(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[7];
      
      tmp[6] = new NonTerminalStackNode(6106, 6, "Expression", null, null);
      tmp[5] = new NonTerminalStackNode(6104, 5, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode(6102, 4, prod__lit___61__char_class___range__61_61_, new char[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode(6100, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode(6098, 2, "Name", null, null);
      tmp[1] = new NonTerminalStackNode(6096, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(6094, 0, prod__lit___64__char_class___range__64_64_, new char[] {64}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Expression_Tag__lit___64_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_expression_Expression__tag__Folded_tag__category___67_111_109_109_101_110_116, tmp);
	}
    protected static final void _init_prod__Empty_Tag__lit___64_layouts_LAYOUTLIST_name_Name__tag__Folded_tag__category___67_111_109_109_101_110_116(ExpectBuilder builder) {
      AbstractStackNode[] tmp = new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode(6112, 2, "Name", null, null);
      tmp[1] = new NonTerminalStackNode(6110, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode(6108, 0, prod__lit___64__char_class___range__64_64_, new char[] {64}, null, null);
      builder.addAlternative(ObjectRascalRascal.prod__Empty_Tag__lit___64_layouts_LAYOUTLIST_name_Name__tag__Folded_tag__category___67_111_109_109_101_110_116, tmp);
	}
    public static void init(ExpectBuilder builder){
      
      
        _init_prod__Default_Tag__lit___64_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_contents_TagString__tag__Folded_tag__category___67_111_109_109_101_110_116(builder);
      
        _init_prod__Expression_Tag__lit___64_layouts_LAYOUTLIST_name_Name_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_expression_Expression__tag__Folded_tag__category___67_111_109_109_101_110_116(builder);
      
        _init_prod__Empty_Tag__lit___64_layouts_LAYOUTLIST_name_Name__tag__Folded_tag__category___67_111_109_109_101_110_116(builder);
      
    }
  }
	
  public ObjectRascalRascal() {
    super();
  }

  // Parse methods    
  
  public AbstractStackNode[] Literal() {
    return Literal.EXPECTS;
  }
  public AbstractStackNode[] Module() {
    return Module.EXPECTS;
  }
  public AbstractStackNode[] PreProtocolChars() {
    return PreProtocolChars.EXPECTS;
  }
  public AbstractStackNode[] TypeArg() {
    return TypeArg.EXPECTS;
  }
  public AbstractStackNode[] Variable() {
    return Variable.EXPECTS;
  }
  public AbstractStackNode[] Renaming() {
    return Renaming.EXPECTS;
  }
  public AbstractStackNode[] Catch() {
    return Catch.EXPECTS;
  }
  public AbstractStackNode[] Signature() {
    return Signature.EXPECTS;
  }
  public AbstractStackNode[] Sym() {
    return Sym.EXPECTS;
  }
  public AbstractStackNode[] NonterminalLabel() {
    return NonterminalLabel.EXPECTS;
  }
  public AbstractStackNode[] Header() {
    return Header.EXPECTS;
  }
  public AbstractStackNode[] Commands() {
    return Commands.EXPECTS;
  }
  public AbstractStackNode[] ImportedModule() {
    return ImportedModule.EXPECTS;
  }
  public AbstractStackNode[] Expression() {
    return Expression.EXPECTS;
  }
  public AbstractStackNode[] TagString() {
    return TagString.EXPECTS;
  }
  public AbstractStackNode[] Nonterminal() {
    return Nonterminal.EXPECTS;
  }
  public AbstractStackNode[] PreModule() {
    return PreModule.EXPECTS;
  }
  public AbstractStackNode[] ProtocolPart() {
    return ProtocolPart.EXPECTS;
  }
  public AbstractStackNode[] Comment() {
    return Comment.EXPECTS;
  }
  public AbstractStackNode[] Label() {
    return Label.EXPECTS;
  }
  public AbstractStackNode[] Field() {
    return Field.EXPECTS;
  }
  public AbstractStackNode[] FunctionModifier() {
    return FunctionModifier.EXPECTS;
  }
  public AbstractStackNode[] Assignment() {
    return Assignment.EXPECTS;
  }
  public AbstractStackNode[] ProtocolChars() {
    return ProtocolChars.EXPECTS;
  }
  public AbstractStackNode[] Assignable() {
    return Assignable.EXPECTS;
  }
  public AbstractStackNode[] HeaderKeyword() {
    return HeaderKeyword.EXPECTS;
  }
  public AbstractStackNode[] Parameters() {
    return Parameters.EXPECTS;
  }
  public AbstractStackNode[] DatePart() {
    return DatePart.EXPECTS;
  }
  public AbstractStackNode[] Mapping__Pattern() {
    return Mapping__Pattern.EXPECTS;
  }
  public AbstractStackNode[] LocalVariableDeclaration() {
    return LocalVariableDeclaration.EXPECTS;
  }
  public AbstractStackNode[] StringConstant() {
    return StringConstant.EXPECTS;
  }
  public AbstractStackNode[] start__Module() {
    return start__Module.EXPECTS;
  }
  public AbstractStackNode[] DataTypeSelector() {
    return DataTypeSelector.EXPECTS;
  }
  public AbstractStackNode[] StringTail() {
    return StringTail.EXPECTS;
  }
  public AbstractStackNode[] PatternWithAction() {
    return PatternWithAction.EXPECTS;
  }
  public AbstractStackNode[] PathTail() {
    return PathTail.EXPECTS;
  }
  public AbstractStackNode[] MidProtocolChars() {
    return MidProtocolChars.EXPECTS;
  }
  public AbstractStackNode[] JustDate() {
    return JustDate.EXPECTS;
  }
  public AbstractStackNode[] CaseInsensitiveStringConstant() {
    return CaseInsensitiveStringConstant.EXPECTS;
  }
  public AbstractStackNode[] start__Commands() {
    return start__Commands.EXPECTS;
  }
  public AbstractStackNode[] Backslash() {
    return Backslash.EXPECTS;
  }
  public AbstractStackNode[] Tags() {
    return Tags.EXPECTS;
  }
  public AbstractStackNode[] Formals() {
    return Formals.EXPECTS;
  }
  public AbstractStackNode[] Start() {
    return Start.EXPECTS;
  }
  public AbstractStackNode[] Name() {
    return Name.EXPECTS;
  }
  public AbstractStackNode[] TimePartNoTZ() {
    return TimePartNoTZ.EXPECTS;
  }
  public AbstractStackNode[] StructuredType() {
    return StructuredType.EXPECTS;
  }
  public AbstractStackNode[] Declarator() {
    return Declarator.EXPECTS;
  }
  public AbstractStackNode[] start__PreModule() {
    return start__PreModule.EXPECTS;
  }
  public AbstractStackNode[] Variant() {
    return Variant.EXPECTS;
  }
  public AbstractStackNode[] FunctionDeclaration() {
    return FunctionDeclaration.EXPECTS;
  }
  public AbstractStackNode[] BasicType() {
    return BasicType.EXPECTS;
  }
  public AbstractStackNode[] DateTimeLiteral() {
    return DateTimeLiteral.EXPECTS;
  }
  public AbstractStackNode[] PathChars() {
    return PathChars.EXPECTS;
  }
  public AbstractStackNode[] ModuleActuals() {
    return ModuleActuals.EXPECTS;
  }
  public AbstractStackNode[] PostStringChars() {
    return PostStringChars.EXPECTS;
  }
  public AbstractStackNode[] HexIntegerLiteral() {
    return HexIntegerLiteral.EXPECTS;
  }
  public AbstractStackNode[] OctalEscapeSequence() {
    return OctalEscapeSequence.EXPECTS;
  }
  public AbstractStackNode[] RegExpLiteral() {
    return RegExpLiteral.EXPECTS;
  }
  public AbstractStackNode[] NamedRegExp() {
    return NamedRegExp.EXPECTS;
  }
  public AbstractStackNode[] ModuleParameters() {
    return ModuleParameters.EXPECTS;
  }
  public AbstractStackNode[] RascalKeywords() {
    return RascalKeywords.EXPECTS;
  }
  public AbstractStackNode[] Strategy() {
    return Strategy.EXPECTS;
  }
  public AbstractStackNode[] Char() {
    return Char.EXPECTS;
  }
  public AbstractStackNode[] PrePathChars() {
    return PrePathChars.EXPECTS;
  }
  public AbstractStackNode[] MidPathChars() {
    return MidPathChars.EXPECTS;
  }
  public AbstractStackNode[] PostProtocolChars() {
    return PostProtocolChars.EXPECTS;
  }
  public AbstractStackNode[] SyntaxDefinition() {
    return SyntaxDefinition.EXPECTS;
  }
  public AbstractStackNode[] Kind() {
    return Kind.EXPECTS;
  }
  public AbstractStackNode[] Target() {
    return Target.EXPECTS;
  }
  public AbstractStackNode[] IntegerLiteral() {
    return IntegerLiteral.EXPECTS;
  }
  public AbstractStackNode[] start__Command() {
    return start__Command.EXPECTS;
  }
  public AbstractStackNode[] FunctionBody() {
    return FunctionBody.EXPECTS;
  }
  public AbstractStackNode[] UserType() {
    return UserType.EXPECTS;
  }
  public AbstractStackNode[] Import() {
    return Import.EXPECTS;
  }
  public AbstractStackNode[] LAYOUT() {
    return LAYOUT.EXPECTS;
  }
  public AbstractStackNode[] Body() {
    return Body.EXPECTS;
  }
  public AbstractStackNode[] DecimalIntegerLiteral() {
    return DecimalIntegerLiteral.EXPECTS;
  }
  public AbstractStackNode[] StringTemplate() {
    return StringTemplate.EXPECTS;
  }
  public AbstractStackNode[] PathPart() {
    return PathPart.EXPECTS;
  }
  public AbstractStackNode[] RegExp() {
    return RegExp.EXPECTS;
  }
  public AbstractStackNode[] MidStringChars() {
    return MidStringChars.EXPECTS;
  }
  public AbstractStackNode[] RegExpModifier() {
    return RegExpModifier.EXPECTS;
  }
  public AbstractStackNode[] layouts_$BACKTICKS() {
    return layouts_$BACKTICKS.EXPECTS;
  }
  public AbstractStackNode[] Assoc() {
    return Assoc.EXPECTS;
  }
  public AbstractStackNode[] Replacement() {
    return Replacement.EXPECTS;
  }
  public AbstractStackNode[] DataTarget() {
    return DataTarget.EXPECTS;
  }
  public AbstractStackNode[] layouts_$default$() {
    return layouts_$default$.EXPECTS;
  }
  public AbstractStackNode[] RealLiteral() {
    return RealLiteral.EXPECTS;
  }
  public AbstractStackNode[] layouts_LAYOUTLIST() {
    return layouts_LAYOUTLIST.EXPECTS;
  }
  public AbstractStackNode[] StringCharacter() {
    return StringCharacter.EXPECTS;
  }
  public AbstractStackNode[] JustTime() {
    return JustTime.EXPECTS;
  }
  public AbstractStackNode[] Rest() {
    return Rest.EXPECTS;
  }
  public AbstractStackNode[] Range() {
    return Range.EXPECTS;
  }
  public AbstractStackNode[] LocationLiteral() {
    return LocationLiteral.EXPECTS;
  }
  public AbstractStackNode[] ShellCommand() {
    return ShellCommand.EXPECTS;
  }
  public AbstractStackNode[] URLChars() {
    return URLChars.EXPECTS;
  }
  public AbstractStackNode[] StringMiddle() {
    return StringMiddle.EXPECTS;
  }
  public AbstractStackNode[] QualifiedName() {
    return QualifiedName.EXPECTS;
  }
  public AbstractStackNode[] TimeZonePart() {
    return TimeZonePart.EXPECTS;
  }
  public AbstractStackNode[] PreStringChars() {
    return PreStringChars.EXPECTS;
  }
  public AbstractStackNode[] Command() {
    return Command.EXPECTS;
  }
  public AbstractStackNode[] Visit() {
    return Visit.EXPECTS;
  }
  public AbstractStackNode[] ProtocolTail() {
    return ProtocolTail.EXPECTS;
  }
  public AbstractStackNode[] NamedBackslash() {
    return NamedBackslash.EXPECTS;
  }
  public AbstractStackNode[] Visibility() {
    return Visibility.EXPECTS;
  }
  public AbstractStackNode[] PostPathChars() {
    return PostPathChars.EXPECTS;
  }
  public AbstractStackNode[] StringLiteral() {
    return StringLiteral.EXPECTS;
  }
  public AbstractStackNode[] Renamings() {
    return Renamings.EXPECTS;
  }
  public AbstractStackNode[] layouts_$QUOTES() {
    return layouts_$QUOTES.EXPECTS;
  }
  public AbstractStackNode[] Statement() {
    return Statement.EXPECTS;
  }
  public AbstractStackNode[] FunctionType() {
    return FunctionType.EXPECTS;
  }
  public AbstractStackNode[] Case() {
    return Case.EXPECTS;
  }
  public AbstractStackNode[] Bound() {
    return Bound.EXPECTS;
  }
  public AbstractStackNode[] Declaration() {
    return Declaration.EXPECTS;
  }
  public AbstractStackNode[] Type() {
    return Type.EXPECTS;
  }
  public AbstractStackNode[] Class() {
    return Class.EXPECTS;
  }
  public AbstractStackNode[] Mapping__Expression() {
    return Mapping__Expression.EXPECTS;
  }
  public AbstractStackNode[] FunctionModifiers() {
    return FunctionModifiers.EXPECTS;
  }
  public AbstractStackNode[] Comprehension() {
    return Comprehension.EXPECTS;
  }
  public AbstractStackNode[] ProdModifier() {
    return ProdModifier.EXPECTS;
  }
  public AbstractStackNode[] Toplevel() {
    return Toplevel.EXPECTS;
  }
  public AbstractStackNode[] BooleanLiteral() {
    return BooleanLiteral.EXPECTS;
  }
  public AbstractStackNode[] TypeVar() {
    return TypeVar.EXPECTS;
  }
  public AbstractStackNode[] RationalLiteral() {
    return RationalLiteral.EXPECTS;
  }
  public AbstractStackNode[] UnicodeEscape() {
    return UnicodeEscape.EXPECTS;
  }
  public AbstractStackNode[] Prod() {
    return Prod.EXPECTS;
  }
  public AbstractStackNode[] OctalIntegerLiteral() {
    return OctalIntegerLiteral.EXPECTS;
  }
  public AbstractStackNode[] Pattern() {
    return Pattern.EXPECTS;
  }
  public AbstractStackNode[] DateAndTime() {
    return DateAndTime.EXPECTS;
  }
  public AbstractStackNode[] Tag() {
    return Tag.EXPECTS;
  }
}