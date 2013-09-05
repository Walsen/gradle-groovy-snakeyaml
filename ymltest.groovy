@Grab(group='org.yaml', module='snakeyaml', version='1.5')

def yaml = new Yaml()
def document = "\n- Hesperiidae\n- Papilionidae\n- Apatelodidae\n- Epiplemidae"
list = (List<String>) yaml.load(document)
println(list)
