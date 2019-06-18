package Fichi;

import ua.nic.Cursova.model.*;

import java.util.ArrayList;
import java.util.List;

public class HelpCode {
    public static List<String[]> helpCode(){
        String s;
        String s1;
        List<String[]> retList = new ArrayList();
        String[] ret = new String[2];
        ret[0] = "";
        ret[1] = "";
        ret[0] += HospitalsEntity.class.getDeclaredFields()[0].getName();
        s = HospitalsEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < HospitalsEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + HospitalsEntity.class.getDeclaredFields()[i].getName();
        s1 = HospitalsEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += CorpusEntity.class.getDeclaredFields()[0].getName();
        s = CorpusEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < CorpusEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + CorpusEntity.class.getDeclaredFields()[i].getName();
        s1 = CorpusEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += MedicalinstitutionsEntity.class.getDeclaredFields()[0].getName();
        s = MedicalinstitutionsEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < MedicalinstitutionsEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + MedicalinstitutionsEntity.class.getDeclaredFields()[i].getName();
        s1 = MedicalinstitutionsEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += DepartmentEntity.class.getDeclaredFields()[0].getName();
        s = DepartmentEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < DepartmentEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + DepartmentEntity.class.getDeclaredFields()[i].getName();
        s1 = DepartmentEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += NaukzvannyaEntity.class.getDeclaredFields()[0].getName();
        s = NaukzvannyaEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < NaukzvannyaEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + NaukzvannyaEntity.class.getDeclaredFields()[i].getName();
        s1 = NaukzvannyaEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += HinegologsEntity.class.getDeclaredFields()[0].getName();
        s = HinegologsEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < HinegologsEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + HinegologsEntity.class.getDeclaredFields()[i].getName();
        s1 = HinegologsEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += NevropatologsEntity.class.getDeclaredFields()[0].getName();
        s = NevropatologsEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < NevropatologsEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + NevropatologsEntity.class.getDeclaredFields()[i].getName();
        s1 = NevropatologsEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += OttolaringologsEntity.class.getDeclaredFields()[0].getName();
        s = OttolaringologsEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < OttolaringologsEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + OttolaringologsEntity.class.getDeclaredFields()[i].getName();
        s1 = OttolaringologsEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += PolikliniksEntity.class.getDeclaredFields()[0].getName();
        s = PolikliniksEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < PolikliniksEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + PolikliniksEntity.class.getDeclaredFields()[i].getName();
        s1 = PolikliniksEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += PostsEntity.class.getDeclaredFields()[0].getName();
        s = PostsEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < PostsEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + PostsEntity.class.getDeclaredFields()[i].getName();
        s1 = PostsEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += DogtorsEntity.class.getDeclaredFields()[0].getName();
        s = DogtorsEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < DogtorsEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + DogtorsEntity.class.getDeclaredFields()[i].getName();
        s1 = DogtorsEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += PatientsEntity.class.getDeclaredFields()[0].getName();
        s = PatientsEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < PatientsEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + PatientsEntity.class.getDeclaredFields()[i].getName();
        s1 = PatientsEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += ProfileslabaratoryEntity.class.getDeclaredFields()[0].getName();
        s = ProfileslabaratoryEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < ProfileslabaratoryEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + ProfileslabaratoryEntity.class.getDeclaredFields()[i].getName();
        s1 = ProfileslabaratoryEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += LabaratoryEntity.class.getDeclaredFields()[0].getName();
        s = LabaratoryEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < LabaratoryEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + LabaratoryEntity.class.getDeclaredFields()[i].getName();
        s1 = LabaratoryEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += RentgenologsEntity.class.getDeclaredFields()[0].getName();
        s = RentgenologsEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < RentgenologsEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + RentgenologsEntity.class.getDeclaredFields()[i].getName();
        s1 = RentgenologsEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += StaffsEntity.class.getDeclaredFields()[0].getName();
        s = StaffsEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < StaffsEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + StaffsEntity.class.getDeclaredFields()[i].getName();
        s1 = StaffsEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += StomatologsEntity.class.getDeclaredFields()[0].getName();
        s = StomatologsEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < StomatologsEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + StomatologsEntity.class.getDeclaredFields()[i].getName();
        s1 = StomatologsEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += SurgeonsEntity.class.getDeclaredFields()[0].getName();
        s = SurgeonsEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < SurgeonsEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + SurgeonsEntity.class.getDeclaredFields()[i].getName();
        s1 = SurgeonsEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        ret[0] += TerapevtsEntity.class.getDeclaredFields()[0].getName();
        s = TerapevtsEntity.class.getDeclaredFields()[0].getType().getName().toLowerCase();
        if ("long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.long".equals(s)) {
            ret[1] += "number";
        } else if ("java.lang.byte".equals(s)) {
            ret[1] += "number";
        } else if ("java.sql.date".equals(s)) {
            ret[1] += "date";
        } else if ("java.lang.string".equals(s)) {
            ret[1] += "text";
        }

        for (int i = 1; i < TerapevtsEntity.class.getDeclaredFields().length; i++) {
            ret[0] += "\n" + TerapevtsEntity.class.getDeclaredFields()[i].getName();
        s1 = TerapevtsEntity.class.getDeclaredFields()[i].getType().getName().toLowerCase();
            if ("long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.long".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.lang.byte".equals(s1)) {
                ret[1] += "\n" + "number";
            } else if ("java.sql.date".equals(s1)) {
                ret[1] += "\n" + "date";
            } else if ("java.lang.string".equals(s1)) {
                ret[1] += "\n" + "text";
            }
        }
        retList.add(ret.clone());
        ret[0] = "";
        ret[1] = "";
        
        return retList;
    }
}
